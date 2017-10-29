package com.gokul;

import java.util.Scanner;

/**
 * Created by root on 29/10/17.
 */
public class TestRoman {
    public static void main(String[] args) {
        int a=1;
        Scanner scanner = new Scanner(System.in);
        while (a > 0) {
            System.out.println("Enter any number less than 5000");
            int input = scanner.nextInt();
            System.out.println("The Roman Number for "+input+" is "+ getRoman(input));
            System.out.println("Enter 1 to continue 0 to exit");
            a=scanner.nextInt();
        }

    }
    public  static String getRoman(int input){
        String [] roman1={"","I","II","III","IV","V","VI","VII","VIII","IX","X",
                             "X","XX","XXX","XL","L","LX","LXX","LXXX","XC","C",
                             "C","CC","CCC","CD","D","DC","DCC","DCCC","CM","M",
                             "M","MM","MMM","MMMM"};
        String result="";
        if(input<=10){
            return roman1[input];
        }
        if(input>10 &&input<=100) {
            int left = input / 10;
            int right = input % 10;
            result = roman1[10 + left] + getRoman(right);
            return result;
        }
        if(input > 100 && input <1000) {
            int left = input / 100;
            int right = input % 100;
            result = roman1[20 + left] + getRoman(right);
            return result;
        }
        if (input>=1000 && input<5000){
             int left=input / 1000;
            int right=input%1000;
            result=roman1[30+left]+getRoman(right);
            return result;
        }
        return null;

    }
}
