import java.util.Scanner;
import java.util.ArrayList;

class methodAssignment {
    /**
    *Adds three inputs
    *@param all three inputs are double values
    *@return sum of inputs as double
    */
    public static double sum(double num1, double num2, double num3) {
        double sum = num1 + num2 + num3;
        return sum;
    }
    /**
    *Calculates remainder of A/B
    *@param both inputs are integers
    *@return A % B as int
    */
    public static int remainder(int dividend, int divisor) {
        int remainder = dividend % divisor;
        return remainder;
    }
    /**
    *Tests if input is prime
    *@param input is integer
    *@return true if prime, false if composite
    */
    public static boolean prime(int num) {
        boolean prime = true;
        for (int i = 2;i < num;i++) {
            if (num % i == 0) {
                prime = false;
            }
        }
        return prime;
    }
    /**
    *Tests if B is a factor of A
    *@param inputs are integers
    *@return true if factor, false if not
    */
    public static boolean factor(int num1, int num2) {
        boolean factor = false;
        if (num1 % num2 == 0) {
            factor = true;
        }
        return factor;
    }
    /**
    *Gives a list of factors of input
    *@param input must be integer
    *@return ArrayList of factors
    */
    public static ArrayList<Integer> factorList(int num) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for (int i = 1;i <= num;i++) {
            if (num % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }
    /**
    *Reverses a given number
    *@param input must be int
    *@return int equal to input backwards
    */
    public static int reverse(int num) {
        int reversed = 0;
        while (num > 0) {
            reversed *= 10;
            reversed += num % 10;
            num /= 10;
        }
        return reversed;
    }
    /**
    *Checks if input is a palindrome
    *@param input must be String
    *@return true if input is palidrome, false if not
    */
    public static boolean palindrome(String wordString) {
        char[] word = wordString.toCharArray();
        char[] test = new char[word.length];
        for (int i = 0;i < word.length;i++) {
            test[i] = word[word.length - i - 1];
        }
        boolean palindrome = true;
        for (int j = 0;j < word.length;j++) {
            if (!(word[j] == test[j])) {
                palindrome = false;
            }
        }
        return palindrome;
    }
    /**
    *Calculates mean of given array
    *@param input must be integer array with size > 0
    *@return mean of all integers in array as double
    */
    public static double mean(int[] list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        double mean = sum / list.length;
        return mean;
    }
    /**
    *Calculates GCF of 2 inputs
    *@param both inputs are integers, num2 > num1
    *@return integer GCF of inputs
    */
    public static int gcf(int num1, int num2) {
        int GCF = 0;
        for (int i = 1;i < num2;i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                GCF = i;
            }
        }
        return GCF;
    }
    /**
    *Sorts given ArrayList least to greatest
    *@param input must be ArrayList
    *@return sorted ArrayList
    */
    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> nums) {
        boolean sorted = false;
        int swap = 0;
        while (!sorted) {
            sorted = true;
            for (int i = 1;i < nums.size();i++) {
                if (nums.get(i - 1) > nums.get(i)) {
                    sorted = false;
                    swap = nums.get(i);
                    nums.set(i, nums.get(i - 1));
                    nums.set(i - 1, swap);
                }
            }
        }
        return nums;
    }
    
    public static void main(String[] args) {
        //Test unit 1 method 1
        System.out.println(sum(1.1, 2.2, 3.5)); //Expected output: 6.8
        //Test unit 1 method 2
        System.out.println(remainder(5, 2)); //Expected output: 1
        //Test unit 2 method 1
        System.out.println(prime(13)); //Expected output: true
        System.out.println(prime(14)); //Expected output: false
        //Test unit 2 method 2
        System.out.println(factor(18, 9)); //Expected output: true
        //Test unit 3/4 method 1
        System.out.println(factorList(24)); //Expected output: Factors of 24
        //Test unit 3/4 method 2
        System.out.println(reverse(12345)); //Expected output: 54321
        //Test unit 3/4 method 3
        System.out.println(palindrome("tacocat")); //Expected output: true
        System.out.println(palindrome("tacodog")); //Expected output: false
        //Test unit 3/4 method 4
        int[] test = {1, 2, 3, 4, 5, 6, 7}; 
        System.out.println(mean(test)); //Expected output: 4
        //Test unit 3/4 method 5
        System.out.println(gcf(16, 24)); //Expected output: 8
        //Test bubble sort
        ArrayList<Integer> test2 = new ArrayList<Integer>();
        int random = 0; //I was too lazy to make my own ArrayList
        for (int i = 0; i < 10;i++) {
            random = (int)Math.ceil(Math.random() * 100);
            test2.add(random);
        }
        System.out.println("Original: " + test2);
        System.out.println("Sorted: " + bubbleSort(test2)); //Expected output: Sorted least to greatest
    }
}