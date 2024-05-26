/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.quacam.mathutil.main;

import com.quacam.mathutil.core.MathUtil;

/**
 *
 * @author NGUYEN LAN
 */
public class Main {
    public static void main(String[] args) {
        
        //thử nghiệm coi hàm tính giai thừa có chạy đứng như thiết kế ko
        //ta phải đưa các tính huống sử dụng trong thực tế
        // ví dụ: -5 coi tính đc hok
        //         0 , 20, 21
        // TEST CASE: MỘT tình huống hàm/app/màn hình/tính năng được đưa vào sd
        //giả lập hành vi của ai đó!!!
        
        // TEST CASE: Là một tình huống sử dụng app mà nó bao hàm bao gồm:
        // INPUT: DATA ĐẦU VÀO CỤ THỂ NÀO ĐÓ
        // OUTPUT: ỨNG VỚI XỬ LÍ CỦA HÀM/APP
        // KÌ VỌNG: MONG HÀM TRẢ VỀ VALUE NÀO ĐÓ ỨNG VỚI INPUT Ở TRÊN
        //SO SÁNH ĐỂ XEM KẾT QUẢ CÓ NHƯ KÌ VỌNG HAY KO
        
        long expected = 120; // tao kì vọng hàm ói về 120 nếu tính 5!
        int n = 5;           // input
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = " + expected + " expected");
        System.out.println("5! = " + actual + " actual");
        System.out.println(1*2*3*4*5);
        
        
    }
}
