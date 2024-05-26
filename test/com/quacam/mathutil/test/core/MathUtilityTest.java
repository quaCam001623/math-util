/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.quacam.mathutil.test.core;

import com.quacam.mathutil.core.MathUtil;
import java.text.NumberFormat;
import org.junit.Assert;
import org.junit.Test;



/**
 *
 * @author NGUYEN LAN
 */
public class MathUtilityTest {
    //đây là class sẽ sd các hàm của thư viện/framework JUnit
    //để kiểm thử/kiểm tra code chính - hàm tính Giai Thừa bên
    //class core.MathUtil
    //viết code để test code chính bên kia!!!
    
    //hàm dưới đây là tình huống test hàm chạy thành công, trả về ngon
    //ta sẽ xài hàm kiểu well - đưa 5!, 6!,  hok chơi đưa -5!, 30!
    
    //@Test JUnit sẽ phối hợp với JVM để chạy hàm này
    //@Test phía hậu trường chính là public static void main()
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        int n = 0;//test thử tình huống tử tế đầu vào, mày phải chạu đúng
        long expected = 1;//hy vọng 0!=1
        //long actual = ; //gọi hàm cần test bên core/app chính/core chính
        long actual = MathUtil.getFactorial(n);
        
        //so sánh ex vs. act dùng framework
        Assert.assertEquals(expected, actual);
        //hàm giúp so sánh 2 giá trị nào đó giống nhau k
        //nếu giống nhau -> thấy màu xanh đèn đường, code ngon ít nhất cho case đang tesst
        //nếu không giống nhau -> thấy màu đỏ
        //                        hàm ý ex vs.act ko giống nhau
        
        
        //gộp thêm vài case thành công/đưa đầu vào ngon!!!hàm phải tính ngon
        Assert.assertEquals(1, MathUtil.getFactorial(1)); //tui mún 1! == 1
        Assert.assertEquals(2, MathUtil.getFactorial(2)); //tui mún 2! == 4
        Assert.assertEquals(6, MathUtil.getFactorial(3)); //tui mún 3! == 6
        Assert.assertEquals(24, MathUtil.getFactorial(4)); //tui mún 4! == 24
        Assert.assertEquals(120, MathUtil.getFactorial(5)); 
        Assert.assertEquals(120, MathUtil.getFactorial(6)); 
        
    }
    
   
    
    //hàm getF() ta thiết kế có 2 tình huống xử lí
    //1. đưa data tử tế trong[0..20] -> tính được n! đúng - done
    //2. đưa data vào cà chớn, âm, >20; THIẾT KẾ CỦA HÀM LÀ NÉM RA NGOẠI LỆ
    //T KÌ VỌNG NGOẠI LỆ XUẤT HIỆN KHI N < 0 || N > 20
    //rất mong ngoại lệ xuất hiện với n cà chớn này
    
    //nếu hàm nhận vào n<0 hoặc n>20 và hàm ném ra ngoại lệ
    //HÀM CHẠY ĐÚNG NHƯ THIẾT KẾ -> XANH PHẢI XUẤT HIỆN
    
    //nếu hàm nhận vào n<0 hoặc n>20 và hàm k ném ra ngoại lệ
    //sure, HÀM CHẠY SAI THIẾT KẾ, SAI KÌ VỌNG, MÀU ĐỎ
    
    //Test case: 
    //Input: -5
    //Expected: IllegalArgument Exception xuất hiện
    //tình huống bất thường, ngoại lệ, ngoài dự tính 
    //là những thứ k thể đo lường so sánh theo kiểu value
    //mà chỉ có thể do lường = cách chúng có xuất hiện hay ko?
    //assertEquals() ko dùng để so sánh 2 ngoại lệ
    //      equals() là bàng nhau hay ko trên value!!!
    
    //MÀU ĐỎ, DO HÀM ĐÚNG LÀ CÓ NÉM NGOẠI LỆ THẬT SỰ
    //        NHƯNG KO PHẢI LÀ NGOẠI LỆ NHƯ KÌ VỌNG - THỰC SỰ KÌ VỌNG SAI
    //        KO PHẢI HÀM NÉM SAI
//    @Test(expected = NumberFormatException.class)
//    public void testGetFactorialGivenWrongArgumentThrowsException(){
//        MathUtil.getFactorial(-5); //hàm @Test chạy, hay hàm getF() chạy
//                                     //sẽ ném về ngoại lệ NumberFormat...
//    
//    }
    
    //CÁCH 1
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException(){
        MathUtil.getFactorial(-5); //hàm @Test chạy, hay hàm getF() chạy
                                     //sẽ ném về ngoại lệ NumberFormat...
    
    }
    
    //CÁCH KHÁC ĐỂ BẮT NGOẠI LỆ XUẤT HIỆN, viết tự nhiên hơn!!!
    //xài lambda
    //Test case: hàm ném ngoại lệ nếu nhận vào 21
    
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVersion(){
        //hàm cần 2 tham số
        //tham số 1: loại ngoại lệ muốn so sánh
        //tham số 2: đoạn code chạy văng ra ngoại runnable
        
        Assert.assertThrows(IllegalArgumentException.class, 
                () -> MathUtil.getFactorial(-5)
        );
    
    }
    
    
    //Bắt ngoại lệm xem hàm có ném ngoại lệ hay ko khi n cà chớn, 
    //có ném, tức là hàm chạy đúng thiết kế -> xanh
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch(){
        
        //chủ động kiểm soát ngoại lệ
        try {
            MathUtil.getFactorial(-5);
        } catch (Exception e) {
            //bắt try-catch là JUnit ra màu xanh do đã chủ động kiểm soát ngoại lệ
            //nhưng ko chắc ngoại lệ mk cần có xh hay ko?
            //có đoạn code kiểm soát đúng ngoại lệ IllegalArgumentException xh
            
            Assert.assertEquals("Invalid argument. N must be between 0..20", 
                    e.getMessage());
        }
    }
}
