package com._20180114interview;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class FactorialTest {
    @Parameterized.Parameter(0)
    public int n;

    @Parameterized.Parameters
    public static List<Integer[]> data(){
        return Arrays.asList(new Integer[][]{{8}, {16}, {32}, {64}, {128}, {256}, {512}, {1024}});
    }

    @org.junit.Test
    public void testFactorialWithSampleData() throws Exception{
        String expected = Factorial.calcFactorialUsingBigInteger(n);
        String actual = Factorial.calcFactorialUsingMyInteger(n);
        Assert.assertEquals(String.format("Test case for n=%02d was failed.", n), expected, actual);
    }
}
