namespace LEDInterpreter
{
    public class Program
    {
        static void Main(string[] args)
        {
            Interpreter interpreter = new Interpreter(args[0], args[1]);
            interpreter.Interpret();
        }
    }
}
