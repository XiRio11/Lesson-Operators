/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson.pkg4.operators;

/**
 *
 * @author ximir
 */
public class Lesson4Operators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numberOne = 5;
         int numberTwo = 2;
         int result1;
         result1 = numberOne + numberTwo;
        int numberThree,numberFour,result2;
         numberThree=4;
         numberFour=5;
         result2=numberThree+numberFour;
       int result3;
         result3=numberOne*numberThree;
       int result4;
         result4=numberOne%numberFour;
       int result5;
          result5=numberThree/numberTwo;
       int age=18;
        System.out.println("Example 1 is "+result1+". Example 2 is "+result2+".");
        System.out.println("Multiplication is "+result3+". Division is "+result5);
        System.out.println("Modulus exmaple is "+result4);
        System.out.println("Comparison example is "+(age>=18)+". Example 2 is "+(result3==result5));
    }
    
}
