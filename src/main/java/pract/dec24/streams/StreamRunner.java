package pract.dec24.streams;

import static pract.dec24.streams.Streams2.*;

public class StreamRunner {
    public static void main(String[] args){
        Streams1.taskOne("D");
        Streams1.taskTwo();
        Streams1.taskThree(3);
        Streams1.taskFour();
        Streams1.taskOneOne();
        Streams1.taskOneTwo();
        Streams1.taskOneThree();
        Streams1.taskOneFour();
        Streams1.taskOneFive();
        Streams1.taskOneSix();
        Streams1.taskOneSeven();
        Streams2.taskOne();
        Streams2.taskTwo();
        Streams2.taskThree();
        Streams2.taskFour();

        String str = "my name is hamid and hamid is a qa engineer hamid likes java";

        wordCountMap(str);
        wordCountStream(str);
        makeWordNumMapMultipleChar("abba1stuv2dcba3fghij4", "abbastuvstuvdcbadcbadcbafghijfghijfghijfghij");
        makeWordNumMapMultipleChar("a1s2d3f4", "assdddffff");
        makeWordNumMapOneChar("a1s2d3f4", "assdddffff");
    }
}
