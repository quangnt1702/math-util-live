/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author ACER
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long result = MathUtil.getFactorial(5);
        System.out.println("5! = 120; actual: " + result);
        System.out.println("6! = 720; actual: " + MathUtil.getFactorial(6));
        System.out.println("Hello");
//        MathUtil.getFactorial(-3);
    }
    
}
