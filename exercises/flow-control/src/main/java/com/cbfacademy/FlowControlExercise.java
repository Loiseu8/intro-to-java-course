package com.cbfacademy;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        // TODO - Implement this method such that
        //  it creates a list where for each element of the input list ${numbers}
        //  - if the ${element} is divisible by 3, it adds “Fizz” to the list
        //  - if the ${element} is divisible by 5, it adds “Buzz” to the list
        //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list
        //  - it adds the element to the list in any other case
        //  - it returns the constructed list
        throw new RuntimeException("Not implemented");
    }

    public String whichMonth(Integer number) {
        // TODO - Implement this method such that
        //  - it returns the month corresponding to the input ${number}
        //  - if the ${number} is invalid, the method should return "Invalid month number"
        throw new RuntimeException("Not implemented");
    }

    // Implement this method such that
    //  it creates a list where for each element of the input list ${numbers}
    //  - if the ${element} is divisible by 3, it adds “Fizz” to the list
    //  - if the ${element} is divisible by 5, it adds “Buzz” to the list
    //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list
    //  - it adds the element to the list in any other case
    //  - it returns the constructed list

    public List<String> fizzBuzz(List<Integer> numbers) {
        List<String> result = new ArrayList<>();

        for (Integer number : numbers) {

            if (number % 15 == 0) {
                result.add("FizzBuzz");

            } else if (number % 3 == 0) {
                result.add("Fizz");

            } else if (number % 5 == 0) {
                result.add("Buzz");

            } else {
                result.add(number.toString());
            }
        }

        return result;
    }
}
        // Implement this method such that
        //  - it returns the output corresponding to the input ${number}
        //  - if the ${number} is invalid, the method should return "Invalid output number"

        public String whichMonth (Integer number){
            String month;
            switch (number) {
                case 1:
                    month = "January";
                    break;
                case 2:
                    month = "February";
                    break;
                case 3:
                    month = "March";
                    break;
                case 4:
                    month = "April";
                    break;
                case 5:
                    month = "May";
                    break;
                case 6:
                    month = "June";
                    break;
                case 7:
                    month = "July";
                    break;
                case 8:
                    month = "August";
                    break;
                case 9:
                    month = "September";
                    break;
                case 10:
                    month = "October";
                    break;
                case 11:
                    month = "November";
                    break;
                case 12:
                    month = "December";
                    break;
                default:
                    month = "Invalid month number";
                    break;
            }
            return month;
        }
>>>>>>> 68f709d (Practiced using switch-case statements)

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        //Implement this method such that
        //  - creates and initialises a list of 100 numbers - from 1 to 100
        //  - determines the sum of all the even numbers in the list
        //  - determines the sum of all the odd numbers in the list
        //  - returns a map with two entries:


    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // TODO - Implement this method such that

            List<Integer> numbers = new ArrayList<>();
            for (int i = 1; i <= 100; i++) {
                numbers.add(i);
            }

            int sumOfEvens = 0;
            int sumOfOdds = 0;

            for (Integer number : numbers) {
                if (number % 2 == 0) {
                    sumOfEvens += number;
                } else {
                    sumOfOdds += number;
                }
            }

            Map<String, Integer> result = new HashMap<>();
            result.put("SumOfEvens", sumOfEvens);
            result.put("SumOfOdds", sumOfOdds);

            return result;
        }




public List<Integer> reverse(ArrayList<Integer> numbers) {
    Collections.reverse(numbers);
    return numbers;
}

//Implement this method such that
>>>>>>> 68f709d (Practiced using switch-case statements)
        //  - it takes an array list of integers
        //  - it returns the list in reverse order



    public String getName() {
        return "Flow Control Exercises";
    }
<<<<<<< HEAD
}
=======
>>>>>>> 68f709d (Practiced using switch-case statements)

public void main() {
}
