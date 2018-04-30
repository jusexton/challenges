using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text.RegularExpressions;

namespace PacketAssembler
{
    public static class Program
    {
        private static readonly string[] Files =
        {
            "packets-one.txt", "packets-two.txt"
        };

        public static void Main()
        {
            foreach (var file in Files)
            {
                var packets = PacketReader.Read(file);
                Console.WriteLine(string.Join("\n", packets));
            }
        }

        private static class PacketReader
        {
            public static IEnumerable<Packet> Read(string path)
            {
                var regex = new Regex(
                    @"(?<id>\d+)\s+(?<index>\d+)\s+(?<count>\d+)\s(?<message>.+)?");

                var packets = new List<Packet>();
                foreach (Match match in regex.Matches(File.ReadAllText(path)))
                {
                    packets.Add(new Packet
                    {
                        Id = Convert.ToInt32(match.Groups["id"].Value),
                        Index = Convert.ToInt32(match.Groups["index"].Value),
                        Count = Convert.ToInt32(match.Groups["count"].Value),
                        Message = match.Groups["message"].Value
                    });
                }

                return packets.GroupBy(packet => packet.Id)
                    .Select(group => group.OrderBy(packet => packet.Index))
                    .SelectMany(packet => packet);
            }
        }

        private class Packet
        {
            public int Id { get; set; }
            public int Index { get; set; }
            public int Count { get; set; }
            public string Message { get; set; }

            public override string ToString()
            {
                return $"{Id} {Index} {Count} {Message}";
            }
        }
    }
}
