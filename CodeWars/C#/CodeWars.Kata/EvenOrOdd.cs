namespace CodeWars.Kata
{
    public static class EvenOrOdd
    {
        private const string EvenString = "Even";
        private const string OddString = "Odd";

        public static string EvenOdd(int value) => value % 2 == 0 ? EvenString : OddString;
    }
}