using System;
using System.Linq;

namespace DotProduct
{
    internal class Program
    {
        private static void Main(string[] args)
        {
            var vectorOne = new double[] { 5, 4 };
            var vectorTwo = new double[] { 5, 3 };
            Console.WriteLine(CalculateDotProduct(vectorOne, vectorTwo));
        }

        private static double CalculateDotProduct(double[] vectorOne, double[] vectorTwo)
        {
            if (vectorOne.Length != vectorTwo.Length)
            {
                throw new InvalidOperationException("vectors must be in same dimension.");
            }

            return vectorOne.Zip(vectorTwo, (vOne, vTwo) => vOne * vTwo)
                .Aggregate((product, next) => next + product);
        }
    }
}
