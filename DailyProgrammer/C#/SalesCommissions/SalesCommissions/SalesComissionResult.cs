using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;

namespace SalesCommissions
{
	public class SalesComissionResult
	{
		private readonly Dictionary<string, decimal> _productComissions;

		public SalesComissionResult()
		{
			_productComissions = new Dictionary<string, decimal>();
		}

		public string EmployeeName { get; set; }

		public ReadOnlyDictionary<string, decimal> ProductComissions =>
			new ReadOnlyDictionary<string, decimal>(_productComissions);

		public decimal ComissionTotal { get; private set; }

		public void AddProductComission(string productName, decimal comission)
		{
			_productComissions[productName] = comission;
			ComissionTotal = _productComissions.Values.Sum();
		}
	}
}