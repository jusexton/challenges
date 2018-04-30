using System.Collections.Generic;
using System.Linq;

namespace PancakeSorting
{
    public class PancakeSortResult
    {
        private readonly List<string> _swaps;

        public PancakeSortResult(IEnumerable<int> initial)
        {
            Initial = new List<int>(initial);
            _swaps = new List<string>();
        }

        private List<int> Initial { get; }

        // Stores the current state of pancakes.
        public void LogSwap(string pancakes)
        {
            _swaps.Add(pancakes);
        }

        public string BuildSortSummary()
        {
            var initial = string.Join(",", Initial);
            var swaps = _swaps.Aggregate((a, b) => $"{a} -> {b}");
            return $"{initial} -> {swaps}";
        }
    }
}