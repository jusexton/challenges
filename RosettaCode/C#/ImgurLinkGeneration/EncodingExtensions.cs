using System;
using System.IO;
using System.Text;

namespace ImgurLinkGeneration
{
    public static class EncodingExtensions
    {
        private static readonly string Base62Characters
            = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        public static string ToBase62(this long number)
        {
            string result = string.Empty;

            do
            {
                result = string.Format("{0}{1}", Base62Characters[(int)(number % 62)], result);
                number /= 62;
            } while (number > 0);

            return result;
        }
    }
}