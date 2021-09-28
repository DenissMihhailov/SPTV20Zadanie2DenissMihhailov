/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv20zadanie2denissmihhailov;

import java.util.Scanner;

/**
 *
 * @author Deniss
 */
public class SPTV20Zadanie2DenissMihhailov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.format("Напишите любое трехзначное число:");
        int number= scanner.nextInt();
        int number100= (int)number/100;
        int number10= (int)(number/10)%10;
        int number1= (int)number%10;
        int summa= (int)number100+number10+number1;
        System.out.println("Сумма цифр этого числа= "+summa);
    }
    
}
