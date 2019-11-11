namespace CodeWars.Kata
{
    public static class RGBHex
    {
        public static string Hex(int r, int g, int b) =>
            ColorValueToHex(r) + ColorValueToHex(g) + ColorValueToHex(b);

        private static string ColorValueToHex(int value) =>
            value > 255 ? "FF" : (value <= 0 ? "00" : value.ToString("X").PadLeft(2, '0'));
    }
}