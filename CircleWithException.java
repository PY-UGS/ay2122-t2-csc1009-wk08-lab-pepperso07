package Wk8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CircleWithException {
    private double radius;

    public CircleWithException(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        //RETURNS RADIUS
        return radius;
    }

    public void setRadius(double radius){
        //SETS RADIUS
        this.radius = radius;
    }

    public double getArea(){
        return (Math.PI * Math.pow(radius, 2));
    }

    public double getDiameter(){
        return (2 * radius);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        try{
            //USER INPUT
            System.out.print("Enter a radius for circle: ");
            double input = sc.nextDouble();

            //IF NUMBER NEGATIVE, THROW EXCEPTION
            if (input < 0)
                throw new IllegalArgumentException("Input must be a positive number!!");

            //IF VALID
            CircleWithException cwe = new CircleWithException(input);
            System.out.println("The radius is " + cwe.getRadius());
            System.out.println("The diameter is " + cwe.getDiameter());

            //IF AREA IS BIGGER THAN 1000
            if (cwe.getArea() > 1000)
                throw new Exception("Area is bigger than 1000");
            else
                System.out.println("The area is " + cwe.getArea());

        } catch (InputMismatchException e) {
            //this exception is thrown if the input is not a number 
            System.out.println("Input must be a number!!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
