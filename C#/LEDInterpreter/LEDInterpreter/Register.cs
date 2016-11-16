namespace LEDInterpreter
{
    // Represents an 8-bit register.
    public class Register
    {
        public Register(char name)
        {
            Name = name;
        }
        public Register(char name, byte value)
        {
            Name = name;
            Value = value;
        }

        public char Name { get; set; }
        public byte Value { get; set; } = 0;

        public void BitRotate(bool left=false)
        {
            if (left)
            {
                Value = (byte)(Value << 1 | Value >> 7);
            }
            else
            {
                Value = (byte)(Value >> 1 | Value << 7);
            }
        }
    }
}
