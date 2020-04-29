package com.home.problems;
import java.util.ArrayList;
 
import java.math.*;

public class problem {

public static void main(String[] args) {

        
        long numbers[] = {0, 0, 0, 0};
        int count = 0;
        for (long i = 1; i < 999999999; i++) {
            if (proc(i)) {
                numbers[count] = i;
                count++;
            } else {
                count = 0;
            }
            if (count == 4) {
                System.out.println(numbers[0]);
                System.exit(1);
            }
            System.out.println("current i : "+i);
        }
    }

    public static boolean isprime(long num) {
        if (num == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean proc(long num) {
        long conc = num;
        int count = 0;
        int i = 2;
        String divisors = ";";
        while (i <= num / 2) {
            if (isprime(i)) {
                if (conc % i == 0 && divisors.contains(";" + i + ";")) {
                    conc = conc / i;
                    i = 2;
                } else if (conc % i == 0) {
                    conc = conc / i;
                    divisors = divisors + i + ";";
                    count++;
                    i = 2;
                } else {
                    i++;
                    if (count > 4) {
                        return false;
                    }
                }
            } else {
                i++;
            }
        }
        if (count == 4) {
            return true;
        } else {
            return false;
        }
    }

	}
