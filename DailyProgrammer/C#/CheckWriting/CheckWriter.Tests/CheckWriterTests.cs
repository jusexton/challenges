using System;
using Xunit;

namespace CheckWriter.Tests
{
    public class CheckWriterTests
    {
        private void Execute(decimal value, string expected, Func<CheckWriter, decimal, string> writer)
        {
            var actual = writer(new CheckWriter(), value);
            Assert.Equal(actual, expected);
        }

        private void CheckValues(Func<CheckWriter, decimal, string> writer)
        {
            Execute(1.1m, "one dollars and ten cents", writer);
            Execute(1.01m, "one dollars and one cents", writer);
            Execute(400120m, "four hundred thousand one hundred twenty dollars", writer);
            Execute(100m, "one hundred dollars", writer);
            Execute(150m, "one hundred fifty dollars", writer);
            Execute(500m, "five hundred dollars", writer);
            Execute(1000m, "one thousand dollars", writer);
            Execute(10000m, "ten thousand dollars", writer);
            Execute(100000m, "one hundred thousand dollars", writer);
            Execute(1000000m, "one million dollars", writer);
            Execute(100000000m, "one hundred million dollars", writer);
            Execute(1000000000m, "one billion dollars", writer);
            Execute(100000000000m, "one hundred billion dollars", writer);
        }

        [Fact]
        public void CheckBuildNumberTextOf()
        {
            CheckValues((writer, v) => writer.BuildNumberTextOf(v));
        }
    }
}
