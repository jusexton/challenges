using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Threading.Tasks;
using Newtonsoft.Json;

namespace RecordSearch
{
	public static class Program
	{
		private static async Task Main()
		{
			var cities = (await LoadCitiesAsync("cities.json")).ToList();
			var index = cities.Select(city => city.Name).ToList().IndexOf("Dar Es Salaam");
			var cityName = cities.First(city => city.PopulationInMillions < 5000000).Name;
			var population = cities.First(city => city.Name.StartsWith("A")).Population;

			Console.WriteLine($"Index of the first city in the list whose name is Dar Es Salaam: {index}");
			Console.WriteLine($"The name of the first city whose population is less than 5 million: {cityName}");
			Console.WriteLine($"The population of the first city whose name starts with the letter A: {population}");
		}

		private static async Task<IEnumerable<City>> LoadCitiesAsync(string path) =>
			JsonConvert.DeserializeObject<IEnumerable<City>>(await File.ReadAllTextAsync(path));
	}
}