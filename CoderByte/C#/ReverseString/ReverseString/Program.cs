using System;
using System.Linq;

namespace ReverseString
{
	public static class Program
	{
		private static void Main()
		{
			Console.WriteLine(ReverseString("hello"));
		}

		private static string ReverseString(string str) => string.Join("", str.Reverse());

//		private static string ReverseString(string str)
//		{
//			var stringBuilder = new StringBuilder();
//			for (var i = str.Length - 1; i >= 0; i--)
//			{
//				stringBuilder.Append(str.ElementAt(i));
//			}
//
//			return stringBuilder.ToString();
//		}
	}
}