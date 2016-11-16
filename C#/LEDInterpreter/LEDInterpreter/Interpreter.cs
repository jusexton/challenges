using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text.RegularExpressions;

namespace LEDInterpreter
{
    public class Interpreter
    {
        public Interpreter()
        {
            Labels = new List<Label>();
            Registers = new List<Register>();
        }
        public Interpreter(string inputFile, string outputFile)
        {
            InputFile = inputFile;
            OutputFile = outputFile;
            Labels = new List<Label>();
            Registers = new List<Register>();
        }

        public string InputFile { get; set; }
        public List<Label> Labels { get; private set; }
        public string OutputFile { get; set; }
        public List<Register> Registers { get; private set; }

        public static readonly string[] patterns = new string[6]
        {
            @"^ld (?<register>[a-z]),(?<value>[0-9]+)$",
            @"^out (?<register>[a-z])$",
            @"^rlc (?<register>[a-z])$",
            @"^rrc (?<register>[a-z])$",
            @"^(?<label>[a-zA-Z_]+) (?<register>[a-z]):$",
            @"^djnz (?<label>[a-zA-Z_]+?)$"
        };

        public void BitRotateRegister(char register, bool left = false)
        {
            Register reg = Registers.Find(x => x.Name.Equals(register));
            if (reg == null)
            {
                throw new RegisterException(string.Format("Register '{0}' Doesnt Exist", register));
            }
            reg.BitRotate(left);
        }

        public void ExecuteDecrement(string name, ref int index)
        {
            Label label = Labels.Find(x => x.Name.Equals(name));
            if (label == null)
            {
                throw new LabelException(string.Format("Label '{0}' Doesnt Exist", name));
            }

            Register register = Registers[label.RegisterIndex];
            if (register.Value > 0)
            {
                register.Value--;
                index = label.LineNumber - 1;
            }
        }

        public void Interpret()
        {
            string[] lines = File.ReadAllLines(InputFile);

            for (int index = 0; index < lines.Count(); index++)
            {
                bool executed = false;
                for (int i = 0; i < patterns.Count(); i++)
                {
                    Regex pattern = new Regex(patterns[i]);
                    Match match = pattern.Match(lines[index].TrimStart());

                    if (match.Success)
                    {
                        switch (i)
                        {
                            case 0:
                                LoadRegister(char.Parse(match.Groups["register"].Value), byte.Parse(match.Groups["value"].Value));
                                break;
                            case 1:
                                OutputRegisterValue(char.Parse(match.Groups["register"].Value));
                                break;
                            case 2:
                                BitRotateRegister(char.Parse(match.Groups["register"].Value), true);
                                break;
                            case 3:
                                BitRotateRegister(char.Parse(match.Groups["register"].Value));
                                break;
                            case 4:
                                LoadLabel(match.Groups["label"].Value, char.Parse(match.Groups["register"].Value), index);
                                break;
                            case 5:
                                ExecuteDecrement(match.Groups["label"].Value, ref index);
                                break;
                        }
                        executed = true;
                        break;
                    }
                }

                if (!executed)
                {
                    throw new SyntaxException(string.Format("Unable To Parse Line: {0}", index));
                }
            } 
        }  

        public void LoadLabel(string name, char register, int lineNumber)
        {
            Label label = Labels.Find(x => x.Name.Equals(name));
            if (label != null)
            {
                throw new LabelException("Label Already Exists On Line: " + label.LineNumber + 1);
            }

            int regIndex = Registers.FindIndex(x => x.Name.Equals(register));
            Labels.Add(new Label(name, regIndex, lineNumber + 1));
        }

        public void LoadRegister(char register, byte value)
        {
            Register reg = Registers.Find(x => x.Name.Equals(register));
            if (reg != null)
            {
                reg.Value = value;
                return;
            }
            Registers.Add(new Register(register, value));
        }

        public void OutputRegisterValue(char register)
        {
            Register reg = Registers.Find(x => x.Name.Equals(register));
            if (reg == null)
            {
                throw new RegisterException(string.Format("Register '{0}' Doesnt Exist", register));
            }

            string binary = Convert.ToString(reg.Value, 2).PadLeft(8, '0');
            binary.Replace("0", ".").Replace("1", "*");
            File.AppendAllText(OutputFile, binary + Environment.NewLine);
        }
    }
}
