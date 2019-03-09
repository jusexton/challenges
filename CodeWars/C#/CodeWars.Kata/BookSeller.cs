using System;
using System.Collections.Generic;
using System.Linq;

namespace CodeWars.Kata
{
    public static class BookSeller
    {
        public static string BookSummary(IEnumerable<String> bookStockLabels,
             IEnumerable<String> categoryRequests)
        {
            if (bookStockLabels.Count() == 0 || categoryRequests.Count() == 0)
            {
                return "";
            }

            Dictionary<string, int> categorySummations =
                bookStockLabels.Select(label => new Book(label))
                    .GroupBy(book => book.Category, book => book.Quantity)
                    .ToDictionary(g => g.Key, g => g.Sum());

            return string.Join(" - ", categoryRequests.Select(category =>
            {
                var count = categorySummations.GetValueOrDefault(category, 0);
                return $"({category} : {count})";
            }));
        }

        public class Book
        {
            public string Category { get; private set; }
            public string Code { get; private set; }
            public int Quantity { get; private set; }

            public Book(string label)
            {
                var codeAndQuantity = label.Split(" ");

                Category = codeAndQuantity[0].Substring(0, 1);
                Code = codeAndQuantity[0].Substring(1);
                Quantity = Convert.ToInt32(codeAndQuantity[1]);
            }
        }
    }
}