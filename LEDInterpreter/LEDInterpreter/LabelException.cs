using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LEDInterpreter
{
    public class LabelException : Exception
    {
        public LabelException() : base() { }
        public LabelException(string message) : base(message) { }
        public LabelException(string message, Exception innerException) : base(message, innerException) { }
    }
}
