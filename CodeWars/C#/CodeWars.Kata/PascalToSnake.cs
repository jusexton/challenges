using System.Text;

namespace CodeWars.Kata
{
	public class PascalToSnake
	{
		public static string ToSnakeCase(string content) 
		{
			var stringBuilder = new StringBuilder();
			
			var characters = content.ToCharArray();
			stringBuilder.Append(char.ToLower(characters[0]));
			for (var i = 1; i < characters.Length; i++)
			{
				var character = characters[i];
				if (char.IsUpper(character))
				{
					stringBuilder.Append("_");
					stringBuilder.Append(char.ToLower(character));
				}
				else
				{
					stringBuilder.Append(character);
				}
			}

			return stringBuilder.ToString();
		}
	}
}