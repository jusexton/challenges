using System.Collections.Generic;
using System.Linq;

namespace KolakoskiSequence
{
    public static class ExtensionMethods
    {
        public static T ElementAtOrDefault<T>(this IEnumerable<T> list, int index, T @default)
            => index >= 0 && index < list.Count() ? list.ElementAt(index) : @default;
    }
}