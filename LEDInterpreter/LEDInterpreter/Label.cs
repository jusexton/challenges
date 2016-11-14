namespace LEDInterpreter
{
    // Represents a label reference.
    public class Label
    {
        public Label(string name, int registerIndex, int lineNumber)
        {
            Name = name;
            RegisterIndex = registerIndex;
            LineNumber = lineNumber;
        }

        public string Name { get; set; }
        public int RegisterIndex { get; set; }
        public int LineNumber { get; set; }
    }
}
