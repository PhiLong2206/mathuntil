package com.Duy.tool;


import com.Duy.tool.mathuntil.core.MathUtility;

// Press Shift twice to open the Search Everywhere dialog and type show whitespaces,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        testFactorialGivenRightArgument0RunWell();
        testFactorialGivenRightArgument1RunWell();
        testFactorialGivenRightArgumentRunWell();
    }
    public static void testFactorialGivenRightArgumentRunWell() {
        System.out.println("2! expected: 2:  + actual: " + MathUtility.getFactorial(2));
        System.out.println("3! expected: 6:  + actual: " + MathUtility.getFactorial(2));
        System.out.println("4! expected: 24:  + actual: " + MathUtility.getFactorial(2));
        System.out.println("5! expected: 120:  + actual: " + MathUtility.getFactorial(2));
    }
    //test ham vua go
    //can co test case
    //testcase 1: check/verify the GETFACTORIAL() METHOD WITH n = 0;
    //STEPs: Given n = 0;
    //       Call GETFACTORIAL( n = 0 )
    //EXPECTED VALUE: HOPE TO SEE 1 AS THE RESULT OF 0!
    //STATIC: CHO RUN!!
    public static void testFactorialGivenRightArgument0RunWell() {
        int n = 0;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);
        System.out.println("0! expected: " + expected + "actual: " + actual);

    }

    //test ham vua go
    //can co test case
    //testcase 2: check/verify the GETFACTORIAL() METHOD WITH n = 0;
    //STEPs: Given n = 1;
    //       Call GETFACTORIAL( n = 0 )
    //EXPECTED VALUE: HOPE TO SEE 1 AS THE RESULT OF 0!
    //STATIC: CHO RUN!!
    public static void testFactorialGivenRightArgument1RunWell() {
        int n = 1;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);
        System.out.println("1! expected: " + expected + "actual: " + actual);
    }
}

//TDD: TEST DRIVEN DEVELOPMENT
//VIẾT CODE CHÍNH VÀ VIẾT TEST CASE SONG SONG VỚI NHAU
//CỨ VIẾT ĐƯỢC CODE NÀO, THÌ CÓ NGAY TEST CASE CHO NÓ
//TEST CASE DUNG ĐỂ TEST HÀM (KO NHẦM VỚI TEST APP - TEST MÀN HÌNH UI V NHẬP
//LIỆU...), CHỈ DÀNH CHO CHÍNH DÂN DEV (DÂN QA/QC KO DÍNH VÀO CODE CỦA PROJECT)

//NHỜ TDD, TDD ĐÓNG GÓP 1 PHẦN GIÚP TA TỰ ĐỘNG HÓA QUÁ TRÌNH BUILD, CHECK BUG, ĐÓNG GÓI NẾU CODE ỔN,
//DELOY LÊN STAGING SERVER (SERVER ĐỂ TEST APP)
//CODE ---> CHECK VAR CODE (UNIT TEST, TDD)
//                          OKE TH ĐÓNG GÓI APP
//                          ĐƯA APP LÊN SERVER
//QUY TRÌNH NÀY LÀ CI/CD

//CV CÓ 1 MỤC:
//Technical Skills
//JUnit
//TDD
//CI/CD
//Maven