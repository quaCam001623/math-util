/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.quacam.mathutil.core;

/**
 *
 * @author NGUYEN LAN
 */
public class MathUtil {
    
    //trong class này cung cấp cho ai đó nhiều hàm xử lí toán học
    //clone class Math của JDK
    //hàm thư viện xài chung cho ai đó mà k cần lưu lại các trạng thái/giá trị
    //chọn thiết kế là hàm static
    
    //hàm tính giai thừa!!!
    //n! = 1.2.3.4...n
    //ko có giai thừa cho số âm
    //0! = 1! = 1 quy ước
    //giai thừa hàm đồ thị dốc đứng, tăng nhanh về giá trị
    //20 giai thừa là 18 con số 0, vừa kịp đủ cho kiểu long của Java
    //21 giai thừa tràn kiểu long
    // bài này quy ước tính n! trong khoảng 0..20
    
//    public static long getFactorial(int n){
//        if(n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid argument. N must be between 0..20");
//        
//        if(n == 0 || n == 1)
//            return 1; // kết thúc luôn nếu nhận giá trị đặc biệt
//        
//        long product = 1; //tích nhân dồn, thuật toán con heo đất, ốc bưu nhồi thịt
//        for (int i = 2; i <= n; i++) {
//            product *= i;
//        }
//        return product;
//    }
    
    //Học về đệ quy 
    //Là hiện tượng gọi lại chính mình với 1 quy mô khác
    //VD: con búp bê Nga, giống nhau và lồng trong nhau
    //búp bê to, nhỏ hơn, nhỏ nhỏ hơn, nhỏ hơn nữa... đến điểm dừng
    
    public static long getFactorial(int n){
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("n must be between 0..20 .Plz");
        
        if(n == 0 || n == 1)
            return 1; 
        
        return n * getFactorial(n-1); //công thức đệ quy
       
        
    }
    
    
}
