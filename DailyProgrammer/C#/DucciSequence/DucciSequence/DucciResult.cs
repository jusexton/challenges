using System.Collections.Generic;

namespace DucciSequence
{
	public class DucciResult
	{
		public HashSet<IEnumerable<long>> Sequences { get; set; }

		public int Steps => Sequences.Count;

		// TODO: Potentially store whether the ducci sequence zeroed out or was a repeating pattern.
	}
}