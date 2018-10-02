using System.Linq;

namespace CodeWars.Kata
{
	public static class Mumbling
	{
		public static string Mumble(string content)
		{
			var words = content.ToCharArray()
				.Select((character, index) =>
					$"{char.ToUpper(character)}{new string(character, index).ToLower()}");
			return string.Join("-", words);
		}
	}
}