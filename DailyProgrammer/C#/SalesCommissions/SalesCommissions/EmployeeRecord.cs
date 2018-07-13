using System.Collections.Generic;

namespace SalesCommissions
{
	public class EmployeeRecord
	{
		public string EmployeeName { get; set; }
		public Dictionary<string, decimal> Expenses { get; set; }
		public Dictionary<string, decimal> Revenue { get; set; }
	}
}