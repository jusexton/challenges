using System.Linq;
using System.Text.RegularExpressions;

namespace CodeWars.Kata
{
	public static class ValidIpAddress
	{
		private static readonly Regex Regex = new Regex(@"^([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$");
		
		public static bool IsValidIp(string ip)
		{
			var values = ip.Split(".");
			return values.Length == 4 && values.All(Regex.IsMatch);
		}
	}
}