namespace RecordSearch
{
	public class City
	{
		public string Name { get; set; }

		// Population in millions
		public decimal Population { get; set; }

		public decimal PopulationInMillions => Population * 1000000;
	}
}