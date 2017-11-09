namespace CarRenting
{
    public class RentalRecord
    {
        public int StartDay { get; set; }
        public int EndDay { get; set; }

        public RentalRecord(int startDay, int endDay)
        {
            StartDay = startDay;
            EndDay = endDay;
        }

        public int TotalDays()
        {
            return EndDay - StartDay;
        }

        public bool Overlapping(RentalRecord rentalRecord)
        {
            return StartDay <= rentalRecord.EndDay &&
                rentalRecord.StartDay <= EndDay;
        }
    }
}