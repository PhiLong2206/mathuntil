package com.Duy.tool.mathuntil.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {

    //    tách data ra khỏi hàm test
//    dựng 1 mảng 2 chều là input, expected
//    sau đó nhồi vào fill vào câu lệnh so sánh
//    data này sẽ là nguồn dữ liệu để hàm so sánh gọi, nhiều lần như thế, do nhiều data
    public static Object[][] initTestData() {
        return new Object[][]{ {0,1},
                               {1, 1},
                               {2, 2},
                               {3,6},
                {4, 24},
                {5, 120},
                {6, 7200},
       };
    }
    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgumentRunWell(int n, long expected){
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}


