package com.cbfacademy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

    public class FizzBuzzTest {
        @Test
        public void testFizzBuzz() {
            FizzBuzz fizzBuzz = new FizzBuzz();
            assertEquals("1", fizzBuzz.get(1));
        }

        @Test
        public void testMultipleOf3() {
            FizzBuzz fizzBuzz = new FizzBuzz();
            assertEquals("Fizz", fizzBuzz.get(3));
        }

        @Test
        public void testMultipleOf5() {
            FizzBuzz fizzBuzz = new FizzBuzz();
            assertEquals("Buzz", fizzBuzz.get(5));
        }

        @Test
        public void testMultipleOf15() {
            FizzBuzz fizzBuzz = new FizzBuzz();
            assertEquals("FizzBuzz", fizzBuzz.get(15));
        }

    }


