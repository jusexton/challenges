using System.Collections.Generic;
using System.Linq;

namespace CarRenting
{
    public static class RentalRecordOptimizer
    {
        public static List<RentalRecord> CalculateMostEfficientRecords(
            List<RentalRecord> rentals)
        {
            var efficientRentals = new List<RentalRecord>();
            foreach (var rental in rentals.OrderBy(x => x.TotalDays()))
            {
                // Cant have any overlapping days.
                // The car cant be in two places at once.
                if (efficientRentals.Any(x => x.Overlapping(rental)))
                {
                    continue;
                }
                efficientRentals.Add(rental);
            }
            return efficientRentals;
        }
    }
}