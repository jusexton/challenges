using System.Collections.Generic;

namespace CodeWars.Kata
{
	public class Parentheses
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
				if (c == '{' || c == '(' || c == '[')
				{
					stack.Push(c);
				}

				if (c == '}' || c == ')' || c == ']')
				{
					if (stack.Count == 0)
					{
						return false;
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
			}

			return stack.Count == 0;
		}
	}
}