/// <summary>
/// Inspired by r/dailyprogrammer
/// https://www.reddit.com/r/dailyprogrammer/comments/5as91q/20161102_challenge_290_intermediate_blinking_leds/
/// Difficulty: Intermediate
/// </summary>
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
