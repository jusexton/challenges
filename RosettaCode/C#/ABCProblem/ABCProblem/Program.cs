using System;
using System.Collections.Generic;
using System.Linq;

namespace ABCProblem
{
    internal class Program
    {
        private static readonly List<Block> Blocks = new List<Block>
        {
            new Block("B", "O"),
            new Block("X", "K"),
            new Block("D", "Q"),
            new Block("C", "P"),
            new Block("N", "A"),
            new Block("G", "T"),
            new Block("R", "E"),
            new Block("T", "G"),
            new Block("Q", "D"),
            new Block("F", "S"),
            new Block("J", "W"),
            new Block("H", "U"),
            new Block("V", "I"),
            new Block("A", "N"),
            new Block("O", "B"),
            new Block("E", "R"),
            new Block("F", "S"),
            new Block("L", "Y"),
            new Block("P", "C"),
            new Block("Z", "M")
        };

        private static void Main(string[] args)
        {
            var maker = new WordMaker(Blocks);
            string[] testWords = {"A", "BARK", "BOOK", "TREAT", "COMMON", "SQUAD", "CONFUSE"};
            foreach (var testWord in testWords)
            {
                Console.WriteLine(maker.IsPossible(testWord));
            }
        }

        private class WordMaker
        {
            public WordMaker(IEnumerable<Block> blocks)
            {
                Blocks = blocks;
            }

            public IEnumerable<Block> Blocks { get; }

            public bool IsPossible(string word)
            {
                ResetStates();

                foreach (var character in word)
                {
                    var strCharacter = character.ToString();
                    var block = Blocks.FirstOrDefault(b => b.Contains(strCharacter) && b.Used == false);
                    if (block != null)
                    {
                        block.Used = true;
                    }
                    else
                    {
                        return false;
                    }
                }
                return true;
            }

            private void ResetStates()
            {
                foreach (var block in Blocks)
                {
                    if (!block.Used) continue;
                    block.Used = false;
                }
            }
        }

        private class Block
        {
            public Block(string faceOne, string faceTwo)
            {
                Faces = new Tuple<string, string>(faceOne, faceTwo);
            }

            public Tuple<string, string> Faces { get; }
            public bool Used { get; set; }

            public bool Contains(string value)
            {
                return Faces.Item1 == value || Faces.Item2 == value;
            }
        }
    }
}