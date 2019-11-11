using System.Collections.Generic;

namespace CodeWars.Kata
{
    public static class Parentheses
    {
        public static bool ValidParentheses(string str)
        {
            if (string.IsNullOrEmpty(str))
            {
                return true;
            }

            var stack = new Stack<char>();
            foreach (var c in str)
            {
                var isRecognizedOpenBrace = c == '{' || c == '(' || c == '[';
                if (isRecognizedOpenBrace)
                {
                    stack.Push(c);
                    continue;
                }

                var last = stack.Peek();
                if (c == '}' && last == '{' || c == ')' && last == '(' || c == ']' && last == '[')
                {
                    stack.Pop();
                }
                else
                {
                    return false;
                }
            }

            return stack.Count == 0;
        }
    }
}