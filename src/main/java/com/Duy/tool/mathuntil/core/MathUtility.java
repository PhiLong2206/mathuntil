package com.Duy.tool.mathuntil.core;

public class MathUtility {
    // CKASS NÀY CHỨA CÁC HÀM STATIC, LÀ NHỮNG HÀM TIỆN ÍCH DÙNG CHUNG CHO MỌI NƠI
    // ĐÂY LÀ HAM MÔ PHỎNG THƯ VIỆN TOÁN HỌC MATH, CỦA JDK
    // HÀM MÁY TÍNH
    // N! = 1, 2, 3, ..... N
    // KHÔNG CÓ GIAI THỪA SỐ ÂM
    // 0! =1;
    // 20! VỪA ĐỦ KIỂU LONG, TỨC LÀ 21! VƯỢT KIỂU LONG
    public static long getFactorial(int n) {
        // đem code chinh ra sửa gọi là refactor
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0 and 20");
        } // bạn đưa invalid data, tớ ném ra ngoại lệ, hàm không được chạy thành công ta value trở về
        if (n == 0 || n == 1) {
            return 1;
        }

//        long result = 1; // thuật toán dồn con heo đất
//        for (int i = 1; i <= n;i++){
//            result *= i; // nhân dồn vào từng cháu i
//        }
//        return result;
//    }


//    public static long getFactorial(int n){
//        // đem code chinh ra sửa gọi là refactor
//        if (n<0 || n>20){
//            throw new IllegalArgumentException("n must be between 0 and 20");
//        } // bạn đưa invalid data, tớ ném ra ngoại lệ, hàm không được chạy thành công ta value trở về
//        if (n==0){
//            return 1;
//        }
//        long result = 1; // thuật toán dồn con heo đất
//        for (int i = 1; i <= n;i++){
//            result *= i; // nhân dồn vào từng cháu i
//        }
//        return result;
//    }
        //ĐỆ QUY - RECURSION - GỌI LÀ CHÍNH MÌNH VỚI QUY MÔ NHỎ HƠN
        return n * getFactorial(n - 1);
    }
//    ĐEM LÊN SEVER MÀ RA MÀU XANH
}
