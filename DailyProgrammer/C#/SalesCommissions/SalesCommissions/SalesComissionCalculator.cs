using System;
using System.Collections.Generic;
using System.Linq;

namespace SalesCommissions
{
	public class SalesComissionCalculator
	{
		private readonly decimal _salesComissionRate;

		public SalesComissionCalculator(decimal salesComissionRate)
		{
			_salesComissionRate = salesComissionRate;
		}

		public SalesComissionResult CalculateComission(EmployeeRecord record)
		{
			var productNames = record.Expenses.Keys;

			if (!record.Revenue.Keys.SequenceEqual(productNames))
			{
				throw new ArgumentException("The same revenue keys are not contained within the exepense keys.",
					nameof(record));
			}

			var result = new SalesComissionResult
			{
				EmployeeName = record.EmployeeName
			};
			foreach (var name in productNames)
			{
				var profit = record.Revenue[name] - record.Expenses[name];

				var comission = 0m;
				if (profit > 0)
				{
					comission = profit * _salesComissionRate;
				}

				result.AddProductComission(name, comission);
			}

			return result;
		}

		public IEnumerable<SalesComissionResult> CalculateComissions(IEnumerable<EmployeeRecord> records) =>
			records.Select(CalculateComission);
	}
}