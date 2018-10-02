using System.Text.RegularExpressions;

namespace CodeWars.Kata
{
	public class FileNameExtraction
	{
		private static readonly Regex Regex = new Regex(@"^\d+_(?<fileName>[\w | -]+\.\w+)\.\w+$");

		public static string ExtractFileName(string dirtyFileName) =>
			Regex.Match(dirtyFileName).Groups["fileName"].Value;
	}
}