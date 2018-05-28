package CCC;
import java.io.*;
import java.util.*;
/*
 * CCC '08 J1 - Body Mass Index
 * Carson Tang
 */
public class CCC_08_J1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double height = sc.nextDouble();
        double bmi = weight / (height*height);
        if(bmi > 25){
            System.out.println("Overweight");
        } else if(bmi >= 18.5 && bmi<=25){
            System.out.println("Normal weight");
        } else if(bmi < 18.5){
            System.out.println("Underweight");
        }
    }
}