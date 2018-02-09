using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

namespace CarRenting
{
    public static class RentalRecordLoader
    {
        public static IEnumerable<RentalRecord> Load(string path)
        {
            int recordCount;
            int[] startDays;
            int[] endDays;
            using (var reader = new StreamReader(path))
            {
                recordCount = int.Parse(reader.ReadLine());
                startDays = ConvertStringToIntArray(reader.ReadLine());
                endDays = ConvertStringToIntArray(reader.ReadLine());
            }

            return startDays.Zip(endDays, (startDay, endDay)
                => new RentalRecord(startDay, endDay));
        }

        private static int[] ConvertStringToIntArray(
            string value, string delimeter = " ")
        {
            return value.Trim().Split(delimeter)
                    .Select(x => int.Parse(x))
                    .ToArray();
        }
    }
}