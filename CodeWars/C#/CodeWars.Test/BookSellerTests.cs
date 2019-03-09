using System.Collections.Generic;
using CodeWars.Kata;
using Xunit;

namespace CodeWars.Test
{
    public class BookSellerTests
    {
        [Theory]
        [InlineData(
            new string[] { "ABC 10", "BDF 10", "ARY 10" },
            new string[] { "A", "B" },
            "(A : 20) - (B : 10)")]
        public void ShouldReturnSummationOfEachRequestedCategory(IEnumerable<string> labels,
             IEnumerable<string> requests, string expected)
        {
            Assert.Equal(expected, BookSeller.BookSummary(labels, requests));
        }
    }
}