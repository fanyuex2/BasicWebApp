package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an "
                    + "English poet, playwright, and actor, widely regarded as the greatest "
                    + "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contentEquals("hello")) {
            return "hey hello";
        }
        if (query.toLowerCase().contains("your name")) {
            return "fxqc";
        }
        if (query.toLowerCase().contains("which of the following number is the largest")) {
            String[] parts = query.split(":");
            String[] numbers = parts[1].split(",");
            int max = Integer.parseInt(numbers[0].substring(1));
            for (String num : numbers) {
                max = Integer.max(max, Integer.parseInt(num.substring(1)));
            }
            return Integer.toString(max);
        }
        
        if (query.toLowerCase().contains("primes")) {
            String[] parts = query.split(":");
            String[] numbers = parts[1].split(",");
            for (String num : numbers) {
                int test = Integer.parseInt(num.substring(1));
                Boolean prime = true;
                for (int i = 2; i <= test-1; i++) {
                    if (test % i == 0)
                        prime = false;
                }
                if (prime)
                    return Integer.toString(test);
            }
        }
        if (query.toLowerCase().contains("banana")) {
            return "yellow";
        }
        if (query.toLowerCase().contains("Eiffel")) {
            return "paris";
        }
        return "";
    }
}
