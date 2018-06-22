using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Linq;

namespace DucciSequence
{
	public static class DucciSequence
	{
		public static IEnumerable<long> Transform(IEnumerable<long> sequence)
		{
			var sequenceArray = sequence.ToArray();
			for (var i = 0; i < sequenceArray.Length - 1; i++)
			{
				yield return Math.Abs(sequenceArray[i + 1] - sequenceArray[i]);
			}

			yield return Math.Abs(sequenceArray[sequenceArray.Length - 1] - sequenceArray[0]);
		}

		public static DucciResult Perform(IEnumerable<long> sequence)
		{
			var known = new HashSet<IEnumerable<long>>();
			var sequenceArray = sequence.ToArray();
			while (!known.ContainsEnumerable(sequenceArray) && !sequenceArray.AllZeroes())
			{
				known.Add(sequenceArray);
				sequenceArray = Transform(sequenceArray).ToArray();
			}

			// Add the most recently generated transformation.
			// The loop will break before being able to add it.
			known.Add(sequenceArray);
			return new DucciResult {Sequences = known};
		}

		private static bool AllZeroes(this IEnumerable<long> enumerable) =>
			enumerable.All(value => value == 0);

		private static bool ContainsEnumerable<T>(this IEnumerable<IEnumerable<T>> set, IEnumerable<T> enumerable)
		{
			var sequence = enumerable.ToImmutableArray();
			return set.Any(value => value.SequenceEqual(sequence));
		}
	}
}