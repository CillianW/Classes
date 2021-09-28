package com.weekThree;

import java.util.Scanner;

public class MethodExercises {

    static Scanner sc;

    public static void main(String[] args) {

        //Part 1
        System.out.print("Enter a number for x: ");
        sc = new Scanner(System.in);
        int firstX = sc.nextInt();

        System.out.print("Enter a number for y: ");
        sc = new Scanner(System.in);
        int firstY = sc.nextInt();

        System.out.println("The sum of x and y is " +  calculateSum(firstX, firstY));

        System.out.println("The product of x and y is " +  calculateProduct(firstX, firstY));

        System.out.println("The difference between y and x is " +  calculateDifference(firstX, firstY));

        System.out.println("The quotient of x and y is " +  calculateQuotient(firstX, firstY));


        //Part 2
        System.out.print("Enter length: ");
        sc = new Scanner(System.in);
        int l = sc.nextInt();

        System.out.print("Enter width: ");
        sc = new Scanner(System.in);
        int w = sc.nextInt();

        System.out.print("Enter height: ");
        sc = new Scanner(System.in);
        int h = sc.nextInt();

        System.out.println("The volume is " + calculateVolume(l,w,h));


        //Part 3
        carPark();

        //Part 4
        coordGeometry();

        //Part 5
        System.out.print("Enter a value for the adjacent: ");
        sc = new Scanner(System.in);
        double a = sc.nextDouble();

        System.out.print("Enter a value for the opposite: ");
        sc = new Scanner(System.in);
        double o = sc.nextDouble();

        System.out.println(calcHypotenuse(o,a));

        //Part 6
        System.out.print("Enter a base int: ");
        sc = new Scanner(System.in);
        int base = sc.nextInt();

        System.out.print("Enter an exponent (int): ");
        sc = new Scanner(System.in);
        int exp = sc.nextInt();

        System.out.println(intPower(base, exp));

        //Part 7
        System.out.print("Enter the number of numbers to add: ");
        sc = new Scanner(System.in);
        int numOfNums = sc.nextInt();

        System.out.println("The sum of the " + numOfNums + " values is " +
                sumTheValues(numOfNums));

        //Part 8
        System.out.print("Enter an int to square: ");
        sc = new Scanner(System.in);
        int intToSquare = sc.nextInt();

        System.out.println("Int squared = " + square(intToSquare));

        System.out.print("\nEnter an double to square: ");
        sc = new Scanner(System.in);
        double doubleToSquare = sc.nextDouble();

        System.out.println("Double squared = " + square(doubleToSquare));

        //Part 9
        System.out.print("Enter x: ");
        sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.print("Enter y: ");
        sc = new Scanner(System.in);
        int y = sc.nextInt();

        System.out.print("Enter z: ");
        sc = new Scanner(System.in);
        int z = sc.nextInt();

        MethodExercises me = new MethodExercises();

        System.out.println("x + y = " + me.addNumbers(x, y));

        System.out.println("Volume = " + MethodExercises.calculateVolume(x, y, z));

    }


    public static int calculateSum(int x, int y){
         return x + y;
    }

    public static int calculateProduct(int x, int y){
        return x * y;
    }

    public static int calculateDifference(int x, int y){
        return x - y;
    }

    public static int calculateQuotient(int x, int y){
        return x / y;
    }

    public static int calculateVolume(int l, int w, int h){
        return l * w * h;
    }

    public static void carPark(){
        System.out.print("How many cars are parked? ");
        sc = new Scanner(System.in);
        int numberOfCars = sc.nextInt();

        double parkTime;

        for(int i = 1; i <= numberOfCars; i++){
            System.out.print("How long was car #" + i + " parked for? ");
            sc = new Scanner(System.in);

            parkTime = sc.nextDouble();
            System.out.println("Car #" + i + " was parked for " + parkTime +
                    " hours, and charged €" + String.format("%.2f", calculateCharges(parkTime)) + "\n" );
        }
    }

    public static double calculateCharges(double parkTime){
        final int HOURLY_RATE = 3;

        if(parkTime <= 1){
            return 0.00;
        }
        else if(parkTime > 8){
            return 21.00;
        }
        else{
            return (Math.ceil(parkTime) - 1) * HOURLY_RATE;
        }

    }

    public static void coordGeometry(){
        System.out.print("Enter a value for x1: ");
        sc = new Scanner(System.in);
        double x1 = sc.nextDouble();

        System.out.print("Enter a value for y1: ");
        sc = new Scanner(System.in);
        double y1 = sc.nextDouble();

        System.out.print("Enter a value for x2: ");
        sc = new Scanner(System.in);
        double x2 = sc.nextDouble();

        System.out.print("Enter a value for y2: ");
        sc = new Scanner(System.in);
        double y2 = sc.nextDouble();

        System.out.println("Distance between points: " +
                calculateDistance(x1, y1, x2, y2));

        System.out.println("Coordinates of midpoint are " +
                calcMidpoint(x1, y1, x2, y2));

        System.out.println("The slope is: " + calcSlope(x1, y1, x2, y2));

    }

    public static double calculateDistance(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
    }

    public static String calcMidpoint(double x1, double y1, double x2, double y2){
        double midPointX = (x1+x2)/2;
        double midPointY = (y1+y2)/2;

        return "(" + midPointX + "," + midPointY + ")";
    }

    public static double calcSlope(double x1, double y1, double x2, double y2){
        if(x1 == x2){
            return 0.0;
        }
        return (y1-y2)/(x1-x2);
    }

    public static double calcHypotenuse(double o, double a){
        return Math.sqrt(Math.pow(o,2) + Math.pow(a,2));
    }

    public static int intPower(int base, int exp){
        int mathPowResult = (int)Math.pow(base,exp);

        int x = base;

        for(int i = 1; i < exp; i++){
            x = x * base;
        }

        if (mathPowResult != x) {
            System.out.println("Error");
        }
        return x;
    }

    public static int sumTheValues(int x){
        int total = 0;

        for(int i = 0; i < x; i++){
            System.out.print("Enter a value: ");
            sc = new Scanner(System.in);
            total = total + sc.nextInt();
        }

        return total;
    }

    public static int square(int x){
        return x * x;
    }

    public static double square(double x){
        return x * x;
    }

    public int addNumbers(int x, int y){
        return x + y;
    }
}
