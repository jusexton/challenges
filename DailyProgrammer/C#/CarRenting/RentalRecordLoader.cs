using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

namespace CarRenting
{
    public abstract class RentalRecordLoader
    {
        public static List<RentalRecord> Load(string path)
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

            var rentalList = new List<RentalRecord>();
            for (var i = 0; i < recordCount; i++)
            {
                rentalList.Add(new RentalRecord(startDays[i], endDays[i]));
            }

            return rentalList;
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