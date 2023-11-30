import java.util.Scanner;

class mean {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        int[] nums = new int[10];
        String input = "";
        int num = 0;
        double mean = 0;
        System.out.println("Enter 10 values");

        for (int i = 0;i < 10;i++) {
            input = scan1.nextLine();
            num = Integer.parseInt(input);
            nums[i] = num;
        }
        for (int x : nums) {
            mean += nums[x];
        }
        mean /= nums.length;

        System.out.println("The average is " + mean);

        scan1.close();
    }
}