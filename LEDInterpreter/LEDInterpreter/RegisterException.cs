using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LEDInterpreter
{
    public class RegisterException : Exception
    {
        public RegisterException() : base() { }
        public RegisterException(string message) : base(message) { }
        public RegisterException(string message, Exception innerException) : base(message, innerException) { }
    }
}
