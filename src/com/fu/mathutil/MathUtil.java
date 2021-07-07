package com.fu.mathutil;

/**
 *
 * @author ACER
 */
//Ta viết cái class để cung cấp tiện ích cho nơi khác xài
//Khi ta cung cấp tiện ích cho nơi khác xài
//Khi đó ta ko cần nhớ gì
//Cho riêng ta, hàm static giúp làm điều này
public class MathUtil {

    //n!=1*2*3*4*5*6*7*...*n
    //0!=1
    //Ko tính giai thừa cho số âm
    //20! là vừa khớp kiểu long, kiểu long tối đa 18 con số 0
    //21! lố kiểu long
    //nếu đưa vào âm hay 21! ta ko tính và trả về exception "Ko tính được"
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument: n must be between [0,20]!!");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long product = 1;
        for (int i = 2; i <= n; i++) {
            product = product * i;
        }
        return product;
    }
}
