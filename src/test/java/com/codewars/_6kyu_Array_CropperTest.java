package com.codewars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class _6kyu_Array_CropperTest {
    
    @Test
    public void test() {
        int[][][] example = {
                {{0, 1, 0, 0},
                 {0, 0, 1, 0},
                 {1, 1, 1, 0},
                 {0, 0, 0, 0}},
                {{0, 1, 0},
                 {0, 0, 1},
                 {1, 1, 1}},
                {{0, 0, 0, 0},
                 {0, 0, 1, 0},
                 {0, 1, 1, 0},
                 {0, 0, 0, 0}},
                {{0, 1},
                 {1, 1}}
        };
        int[][] res = _6kyu_Array_Cropper.getCroppedFieldAsArray(example[0]);
        assertEquals(example[1], res);
//        res =_6kyu_Array_Cropper.getCroppedFieldAsArray(example[2]);
//        assertEquals(example[3], res);
    }
    
}