using CodeWars.Kata;
using Xunit;

namespace CodeWars.Test
{
    public class BookSellerTests
    {
        [Theory]
        [InlineData(
            new string[] {"ABC 10", "BDF 10", "ARY 10"},
            new string[] {"A", "B"},
            "(A : 20) - (B : 10)")]
        public void ShouldReturnSummationOfEachRequestedCategory(string[] labels, string[] requests, string expected)
        {
            Assert.Equal(expected, BookSeller.BookSummary(labels, requests));
        }

        [Fact]
        public void ShouldReturnEmptyStringWhenBothLabelsAreEmpty()
        {
            var emptyLabels = new string[] { };
            var emptyRequests = new string[] { };
            var requests = new[] {"A"};
            var labels = new[] {"ABC 10"};

            Assert.Equal(string.Empty, BookSeller.BookSummary(labels, emptyRequests));
            Assert.Equal(string.Empty, BookSeller.BookSummary(emptyLabels, requests));
            Assert.Equal(string.Empty, BookSeller.BookSummary(emptyLabels, emptyRequests));
        }
    }
}