package Workbench_1;
import java.util.Scanner;


public class Basic_calc {

    public static void main (String[] args) {
        //q4 Create a program that intakes two integers
        int x, y;
        //Read in first number
        Scanner first = new Scanner(System.in);
        System.out.println("Enter First Integer Value: ");
        //Use next.int
        x = first.nextInt();
        Scanner second = new Scanner(System.in);
        System.out.println("Enter Second Integer Value: ");
        y = second.nextInt();
        //Create operations
        int r1 = x + y;
        int r2 =  x - y;
        int r3 = x*y;
        int r4 = Math.round(x/y);
        //Format our inputs

        System.out.println("Possible Calculations:" );
        System.out.println("  (A)dd");
        System.out.println("  (S)ubtract");
        System.out.println("  (M)ultiplication");
        System.out.println("  (D)ivide");
        Scanner ring = new Scanner(System.in);
        System.out.println("Please Select an Option: ");
        String OP = ring.next();
        //Deending on the result, reform the oeration on the numbers sequentially
        if (OP.equals("A")) {
            System.out.print("The Sum is " + r1);
        }
        else if (OP.equals("S")){
            System.out.print("The Difference is " + r2);
        }
        else if (OP.equals("M")){
            System.out.print("The Product is " + r3);
        }
        else if (OP.equals("The Quotient is " + r4)) {
            System.out.print((r4));
        }



    }}