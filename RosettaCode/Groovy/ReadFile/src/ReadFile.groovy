/**
 * Inspired by rosettacode.org
 * http://rosettacode.org/wiki/Read_entire_file
 */

final filePath = "../data/file.txt"

// For small files
// println new File(filePath).text

new File(filePath).eachLine {
    line -> println "$line"
}


