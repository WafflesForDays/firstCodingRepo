import java.util.Scanner;

public class dmojS3 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        //System.out.println("Enter grid");
        int[] line1result = {0, 0, 0};
        int[] line2result = {0, 0, 0};
        int[] line3result = {0, 0, 0};
        String line1Str = scan1.nextLine();
        String line2Str = scan1.nextLine();
        String line3Str = scan1.nextLine();
        //System.out.println("");

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        int num6 = 0;
        int num7 = 0;
        int num8 = 0;
        int num9 = 0;

        char[] line1 = line1Str.toCharArray();
        char[] line2 = line2Str.toCharArray();
        char[] line3 = line3Str.toCharArray();

        int index1 = 0;
        int index2 = 0;
        int index3 = 0;
        for (char i : line1) {
            if (i == ' ') {
                index1++;
            }
            else if (i == 'X') {
                line1result[index1] = 0;
            } else {
                line1result[index1] *= 10;
                line1result[index1] += Character.getNumericValue(i); 
            }
        }
        for (char i : line2) {
            if (i == ' ') {
                index2++;
            }
            else if (i == 'X') {
                line2result[index2] = 0;
            } else {
                line2result[index2] *= 10;
                line2result[index2] += Character.getNumericValue(i); 
            }
        }
        for (char i : line3) {
            if (i == ' ') {
                index3++;
            }
            else if (i == 'X') {
                line3result[index3] = 0;
            } else {
                line3result[index3] *= 10;
                line3result[index3] += Character.getNumericValue(i); 
            }
        }

        num1 = line1result[0];
        num2 = line1result[1];
        num3 = line1result[2];
        num4 = line2result[0];
        num5 = line2result[1];
        num6 = line2result[2];
        num7 = line3result[0];
        num8 = line3result[1];
        num9 = line3result[2];

        //Solve

        for (int i = 0;;i++) {
            if (num1 == 0) {
                if (num2 != 0 && num3 != 0) {
                    num1 = num2 - (num3 - num2);
                }
                else if (num4 != 0 && num7 != 0) {
                    num1 = num4 - (num7 - num4);
                }
            }
            if (num2 == 0) {
                if (num1 != 0 && num3 != 0) {
                    num2 = num1 + (num3 - num1) / 2;
                }
                else if (num5 != 0 && num8 != 0) {
                    num2 = num5 - (num8 - num5);
                }
            }
            if (num3 == 0) {
                if (num1 != 0 && num2 != 0) {
                    num3 = num2 + (num2 - num1);
                }
                else if (num6 != 0 && num9 != 0) {
                    num3 = num6 - (num9 - num6);
                }
            }
            if (num4 == 0) {
                if (num5 != 0 && num6 != 0) {
                    num4 = num5 - (num6 - num5);
                }
                else if (num1 != 0 && num7 != 0) {
                    num4 = num1 + (num7 - num1) / 2;
                }
            }
            if (num5 == 0) {
                if (num4 != 0 && num6 != 0) {
                    num5 = num4 + (num6 - num4) / 2;
                }
                else if (num2 != 0 && num8 != 0) {
                    num5 = num2 + (num8 - num2) / 2;
                }
            }
            if (num6 == 0) {
                if (num4 != 0 && num5 != 0) {
                    num6 = num5 + (num5 - num4);
                }
                else if (num3 != 0 && num9 != 0) {
                    num6 = num3 + (num9 - num3) / 2;
                }
            }
            if (num7 == 0) {
                if (num8 != 0 && num9 != 0) {
                    num7 = num8 - (num9 - num8);
                }
                else if (num1 != 0 && num4 != 0) {
                    num7 = num4 + (num4 - num1);
                }
            }
            if (num8 == 0) {
                if (num7 != 0 && num9 != 0) {
                    num8 = num7 + (num9 - num7) / 2;
                }
                else if (num2 != 0 && num5 != 0) {
                    num8 = num5 + (num5 - num2);
                }
            }
            if (num9 == 0) {
                if (num7 != 0 && num8 != 0) {
                    num9 = num8 + (num8 - num7);
                }
                else if (num3 != 0 && num6 != 0) {
                    num9 = num6 + (num6 - num3);
                }
            }
            if (num2 - num1 == num3 - num2 && num5 - num4 == num6 - num5 && num8 - num7 == num9 - num8 && num4 - num1 == num7 - num4 && num5 - num2 == num8 - num5 && num6 - num3 == num9 - num6 && i < 100) {
                break;
            }
            else if (i == 100) {
                System.out.println("This grid is unsolvable");
                break;
            } else {
                if (num5 == 0) {
                    num5 = 15;
                }
                else if (num1 == 0) {
                    if (num2 == 0 && num4 == 0) {
                        if (num3 % 2 == 0) {
                            num1 = 2;
                        } else {
                            num1 = 1;
                        }
                    }
                    else if (num3 == 0 && num7 == 0) {
                        if (num9 % 2 == 0) {
                            num1 = 2;
                        } else {
                            num1 = 1;
                        }
                    }
                }
                else if (num2 == 0) {
                    num2 = 10;
                }
                else if (num3 == 0) {
                    if (num2 == 0 && num6 == 0) {
                        if (num1 % 2 == 0) {
                            num3 = 12;
                        } else {
                            num3 = 11;
                        }
                    }
                    else if (num1 == 0 && num9 == 0) {
                        if (num7 % 2 == 0) {
                            num3 = 12;
                        } else {
                            num3 = 11;
                        }
                    }
                }
                else if (num4 == 0) {
                    num4 = 10;
                }
                else if (num6 == 0) {
                    num6 = 10;
                }
                else if (num7 == 0) {
                    if (num4 == 0 && num8 == 0) {
                        if (num1 % 2 == 0) {
                            num7 = 12;
                        } else {
                            num7 = 11;
                        }
                    }
                    else if (num1 == 0 && num9 == 0) {
                        if (num3 % 2 == 0) {
                            num7 = 12;
                        } else {
                            num7 = 11;
                        }
                    }
                }
                else if (num8 == 0) {
                    num8 = 10;
                }
                else if (num9 == 0) {
                    if (num6 == 0 && num8 == 0) {
                        if (num3 % 2 == 0) {
                            num9 = 36;
                        } else {
                            num9 = 35;
                        }
                    }
                    else if (num3 == 0 && num7 == 0) {
                        if (num1 % 2 == 0) {
                            num9 = 36;
                        } else {
                            num9 = 35;
                        }
                    }
                }
            }
        }

        //Debug

        System.out.println(num1 + " " + num2 + " " + num3);
        System.out.println(num4 + " " + num5 + " " + num6);
        System.out.println(num7 + " " + num8 + " " + num9);
         

        scan1.close();

    }
}
