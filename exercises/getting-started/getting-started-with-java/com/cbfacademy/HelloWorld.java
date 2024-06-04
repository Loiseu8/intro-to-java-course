package com.cbfacademy;

public class HelloWorld {
    public static void main(String... args) {
        System.out.println("Hello World!");
          // Write a program that creates: an array of 8 integer elements:
         
          int[] numbers = {26, 24, 20, 10, 18, 100, 33, 68};
          float[] elements = {0.3f, 1.64f, 8.4f, 4.6f, 9.60f, 6.3f, 5.589f, 2.14f, 10.4f, 4.7f, 6.96f, 10.3f};
          double[] figures = {5.67d, 6.9, 11.98, 5.5, 0.0743,};
          boolean[] x = {true, false, false, false, true, false};

System.out.println(numbers[4]);
System.out.println(elements[4]);
System.out.println(figures[4]);
System.out.println(x[4]);





 Object[][] matrix = {
    {26, 24, 20, 10, 18, 100, 33, 68},
    {0.3f, 1.64f, 8.4f, 4.6f, 9.60f, 6.3f, 5.589f, 2.14f, 10.4f, 4.7f, 6.96f, 10.3f},
    {5.67d, 6.9, 11.98, 5.5, 0.0743,},
    {true, false, false, false, true, false} 

};

Object[] array1 = matrix[0];
Object[] array2 = matrix[1];
Object[] array3 = matrix[2];
Object[] array4 = matrix[3];

System.out.println(array4.length);


    }
}