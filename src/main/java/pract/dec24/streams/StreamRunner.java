package pract.dec24.streams;

import static pract.dec24.streams.Streams2.*;
import static pract.dec24.streams.Streams3.*;

public class StreamRunner {
    public static void main(String[] args) {
        // Streams1 Methods
        Streams1.filterNamesStartingWith("D");
        Streams1.findTop3Descending();
        Streams1.findSumOfDivisibles(3);
        Streams1.groupNamesByStartingLetter();
        Streams1.filterAndLowercaseLongNames();
        Streams1.filterAndConvertToStrings();
        Streams1.sortAndPickTop2Names();
        Streams1.sortAndSkipFirst3();
        Streams1.findMaxValue();
        Streams1.findAverageOfEvenNumbers();
        Streams1.groupEmployeesByDepartment();

        // Streams2 Methods
        Streams2.flattenNestedList();
        Streams2.extractUniqueWords();
        Streams2.calculateSumOfSquaresOfEvens();
        Streams2.calculateProductOfNumbersGreaterThan5();

        // Word Count Methods
        String str = "my name is hamid and hamid is a qa engineer hamid likes java";
        wordCountUsingMap(str);
        wordCountUsingStreams(str);

        // String Decoding Methods
        decodeMultiCharCount("abba1stuv2dcba3fghij4", "abbastuvstuvdcbadcbadcbafghijfghijfghijfghij");
        decodeMultiCharCount("a1s2d3f4", "assdddffff");
        decodeSingleCharCount("a1s2d3f4", "assdddffff");

        // Additional Methods from Streams3
        charCountStreamNew();
        sumAllNum();
    }
}
