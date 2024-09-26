package com.cbfacademy;

    public class Year {
        public boolean isLeap(int year) {
            if (year % 400 == 0) return true;
            if (year % 100 == 0) return false;
            return year % 4 == 0;
        }
    }


