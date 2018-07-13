using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using Newtonsoft.Json;

namespace SalesCommissions
{
	public static class Program
	{
		private const decimal SalesComissionRate = .062m;

		private static void Main(string[] args) =>
			new SalesComissionCalculator(SalesComissionRate)
				.CalculateComissions(
					JsonConvert.DeserializeObject<IEnumerable<EmployeeRecord>>(File.ReadAllText(args[0])))
				.ToList()
				.ForEach(result =>
					Console.WriteLine($"Employee Name: {result.EmployeeName}, Comission: {result.ComissionTotal:C}"));
	}
}