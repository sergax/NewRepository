package Сodewars;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class CodeFromСodewarsTest {
    @Test
    void testOFTasks() throws Exception {
        assertEquals(10, CodeFromСodewars.BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 0, 1, 0))));
        assertEquals(3, CodeFromСodewars.BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 0, 1, 1))));
        assertEquals(7, CodeFromСodewars.BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 1, 1, 1))));

        assertEquals(CodeFromСodewars.Test.accum("Ser"),
                "S-Ee-Rrr");
        assertEquals(CodeFromСodewars.Test.accum("Aksen"),
                "A-Kk-Sss-Eeee-Nnnnn");

        assertEquals(31, CodeFromСodewars.ThinkingAndTesting.testAB(5, 30));
        assertEquals(47, CodeFromСodewars.ThinkingAndTesting.testAB(1, 47));
        assertEquals(6, CodeFromСodewars.ThinkingAndTesting.testAB(4, 2));

//        assertEquals("1 second", CodeFromСodewars.TimeFormatter.formatDuration(1));
//        assertEquals("1 hour, 1 minute and 2 seconds", CodeFromСodewars.TimeFormatter.formatDuration(3662));

        assertEquals(9, CodeFromСodewars.romanToInt("IX"));
    }
}