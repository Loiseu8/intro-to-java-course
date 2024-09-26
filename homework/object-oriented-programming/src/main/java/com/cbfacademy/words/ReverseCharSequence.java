package com.cbfacademy.words;

    public class ReverseCharSequence implements CharSequence {
        private final String original;

        // Constructor that accepts a string
        public ReverseCharSequence(String original) {
            this.original = new StringBuilder(original).reverse().toString();
        }

        @Override
        public char charAt(int index) {
            return original.charAt(index);
        }

        @Override
        public int length() {
            return original.length();
        }

        @Override
        public CharSequence subSequence(int start, int end) {
            return original.substring(start, end);
        }

        @Override
        public String toString() {
            return original;
        }
    }


