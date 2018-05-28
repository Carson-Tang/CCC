package CCC;
import java.io.*;
import java.util.*;
/*
 * CCC '02 J1 - 0123456789
 * Carson Tang
 */
public class CCC_02_J1{
    public static void main (String [] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.print(" * * *\n" +
                    "*     *\n" +
                    "*     *\n" +
                    "*     *\n");
            System.out.println("");
            System.out.print("*     *\n" +
                    "*     *\n" +
                    "*     *\n" +
                    " * * *\n");
        } else if (n==1) {
            System.out.print("      *\n" +
                    "      *\n" +
                    "      *\n");
            System.out.println("");
            System.out.print("      *\n" +
                    "      *\n" +
                    "      *\n");
        } else if (n==2) {
            System.out.print(" * * *\n" +
                    "      *\n" +
                    "      *\n" +
                    "      *\n" +
                    " * * *\n" +
                    "*      \n" +
                    "*      \n" +
                    "*      \n" +
                    " * * *\n");
        } else if (n==3) {
            System.out.print(" * * *\n" +
                    "      *\n" +
                    "      *\n" +
                    "      *\n" +
                    " * * *\n" +
                    "      *\n" +
                    "      *\n" +
                    "      *\n" +
                    " * * *\n");
        } else if (n==4) {
            System.out.print("      \n" +
                    "*     *\n" +
                    "*     *\n" +
                    "*     *\n" +
                    " * * *\n" +
                    "      *\n" +
                    "      *\n" +
                    "      *\n" +
                    "      \n");
        }  else if (n==5) {
            System.out.print(" * * *\n" +
                    "*\n" +
                    "*\n" +
                    "*\n" +
                    " * * *\n" +
                    "      *\n" +
                    "      *\n" +
                    "      *\n" +
                    " * * *\n");
        } else if (n==6) {
            System.out.print(" * * *\n" +
                    "*      \n" +
                    "*      \n" +
                    "*      \n" +
                    " * * *\n" +
                    "*     *\n" +
                    "*     *\n" +
                    "*     *\n" +
                    " * * *\n");
        } else if (n==7) {
            System.out.print(" * * *\n" +
                    "      *\n" +
                    "      *\n" +
                    "      *\n" +
                    "      \n" +
                    "      *\n" +
                    "      *\n" +
                    "      *\n" +
                    "      \n");
        } else if (n==8) {
            System.out.print(" * * *\n" +
                    "*     *\n" +
                    "*     *\n" +
                    "*     *\n" +
                    " * * *\n" +
                    "*     *\n" +
                    "*     *\n" +
                    "*     *\n" +
                    " * * *\n");
        } else if (n==9) {
            System.out.print(" * * *\n" +
                    "*     *\n" +
                    "*     *\n" +
                    "*     *\n" +
                    " * * *\n" +
                    "      *\n" +
                    "      *\n" +
                    "      *\n" +
                    " * * *\n");
        }
    }
}