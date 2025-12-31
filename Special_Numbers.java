import java.util.*;

class Special_Numbers {
    public static Scanner sv = new Scanner(System.in);

    public static boolean isPallindrome(int num) {
        if (num < 0)
            return false;
        int n = num;
        int r = 0;
        while (num > 0) {
            int a = 0;
            a += num;
            System.out.println(a);
            int m = num % 10;
            num = num / 10;
            r = r * 10 + m;
        }
        return r == n;
    }

    public static boolean isSpy(int n) {
        if (n < 0)
            return false;
        if (n == 0)
            return true; // A sum of 0 and product of 0 are equal

        int sum = 0;
        int pro = 1;

        while (n > 0) {
            int m = n % 10;
            sum += m;
            pro *= m;
            n /= 10;
        }
        return sum == pro;
    }

    public static boolean isArmstrong(long num) {
        if (num < 0)
            return false;
        long o_n = num;
        long s_o_p = 0;
        String s = Long.toString(num);
        int t_d = s.length();

        if (num == 0) {
            return true;
        }

        long temp_num = num;
        while (temp_num > 0) {
            int digit = (int) (temp_num % 10);
            s_o_p += (long) Math.pow(digit, t_d);
            temp_num = temp_num / 10;
        }
        return o_n == s_o_p;
    }

    public static boolean isPronic(int n) {
        if (n < 0)
            return false;
        for (int i = 0; i * (i + 1) <= n; i++) {
            if (i * (i + 1) == n) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPerfect(int num) {
        if (num <= 1)
            return false;
        int sum = 1; 
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i * i != num) {
                    sum += num / i;
                }
            }
        }
        return sum == num;
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        if (num <= 3)
            return true;
        if (num % 2 == 0 || num % 3 == 0)
            return false;
        for (int i = 5; i * i <= num; i = i + 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isUgly(int n) {
        if (n <= 0)
            return false;
        while (n % 2 == 0) n /= 2;
        while (n % 3 == 0) n /= 3;
        while (n % 5 == 0) n /= 5;
        return n == 1;
    }

    public static long calculateFactorial(int n) {
        if (n < 0)
            return -1;
        if (n == 0)
            return 1;
        long pro = 1;
        for (long i = 1; i <= n; i++) {
            pro = pro * i;
        }
        return pro;
    }

    public static double calculateMedian(double[] array) {
        if (array == null || array.length == 0) {
            return 0.0;
        }
        Arrays.sort(array);
        int n = array.length;
        if (n % 2 != 0) {
            int pos = (n + 1) / 2 - 1;
            return array[pos];
        } else {
            int pos1 = n / 2 - 1;
            int pos2 = n / 2;
            return (array[pos1] + array[pos2]) / 2.0;
        }
    }

    private static int getIntInput() {
        while (true) {
            try {
                return sv.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a whole number.");
                sv.next(); // Clear the invalid input
                System.out.print("Enter again: ");
            }
        }
    }

    private static long getLongInput() {
        while (true) {
            try {
                return sv.nextLong();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a whole number.");
                sv.next(); // Clear the invalid input
                System.out.print("Enter again: ");
            }
        }
    }

    private static double getDoubleInput() {
        while (true) {
            try {
                return sv.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sv.next(); // Clear the invalid input
                System.out.print("Enter again: ");
            }
        }
    }

    private static void Pallindrome() {
        System.out.print("Enter any number : ");
        int num = getIntInput();
        if (isPallindrome(num)) {
            System.out.println(num + " is a pallindrome number.");
        } else {
            System.out.println(num + " is not a pallindrome number.");
        }
    }

    private static void Spy() {
        System.out.print("Enter any number : ");
        int n = getIntInput();
        if (isSpy(n)) {
            System.out.println(n + " is a spy number.");
        } else {
            System.out.println(n + " is not a spy number.");
        }
    }
    
    private static void Armstrong() {
        System.out.print("Enter any number : ");
        long num = getLongInput();
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong Number.");
        } else {
            System.out.println(num + " is not an Armstrong Number.");
        }
    }

    private static void Pronic() {
        System.out.print("Enter any number : ");
        int n = getIntInput();
        if (isPronic(n)) {
            System.out.println(n + " is a Pronic Number.");
        } else {
            System.out.println(n + " is not a Pronic Number.");
        }
    }

    private static void Perfect() {
        System.out.print("Enter any Number : ");
        int num = getIntInput();
        if (isPerfect(num)) {
            System.out.println(num + " is a Perfect Number.");
        } else {
            System.out.println(num + " is not a Perfect Number.");
        }
    }
    
    private static void Happy() {
        System.out.print("Enter any number : ");
        int num = getIntInput();
        Set<Integer> seen = new HashSet<>();
        int n = num;

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }

        if (n == 1) {
            System.out.println(num + " is a Happy Number.");
        } else {
            System.out.println(num + " is not a Happy Number.");
        }
    }

    private static void Prime() {
        System.out.print("Enter any number : ");
        int num = getIntInput();
        if (isPrime(num))
            System.out.println(num + " is a Prime Number.");
        else
            System.out.println(num + " is not a Prime Number.");
    }

    private static void Ugly() {
        System.out.print("Enter any number : ");
        int n = getIntInput();
        if (isUgly(n)) {
            System.out.println(n + " is an Ugly Number.");
        } else {
            System.out.println(n + " is not an Ugly Number.");
        }
    }

    private static void Factorial() {
        System.out.print("Enter the number of which you want factorial : ");
        int n = getIntInput();
        long result = calculateFactorial(n);
        if (result == -1) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial of " + n + " is " + result);
        }
    }

    private static void Fibonacci() {
        System.out.print("Enter the number of terms for Fibonacci sequence: ");
        int n = getIntInput();
        if (n <= 0) {
            System.out.println("Number of terms must be positive.");
            return;
        }
        long a = 0, b = 1;
        System.out.print("Fibonacci Sequence: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + (i == n ? "" : ", "));
            long next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    private static double[] getDoubleArray(int n) {
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value number " + (i + 1) + " : ");
            array[i] = getDoubleInput();
        }
        return array;
    }

    private static void Mean_Median() {
        System.out.println("\n==============================");
        System.out.println("Mean and Median Calculation");
        System.out.println("1. Mean");
        System.out.println("2. Median");
        System.out.println("3. Both Mean and Median");
        System.out.println("==============================\n");

        System.out.print("Enter your choice : ");
        int ch = getIntInput();
        int n;

        switch (ch) {
            case 1: // Mean
                System.out.print("Enter the number of observations : ");
                n = getIntInput();
                if (n <= 0) {
                    System.out.println("Number of values must be positive.");
                    return;
                }

                double[] arrayMean = getDoubleArray(n);
                double sum = 0;
                for (double val : arrayMean) {
                    sum += val;
                }
                double mean = sum / n;
                System.out.println("Mean: " + mean);
                break;

            case 2: // Median
                System.out.print("Enter the number of values to be entered : ");
                n = getIntInput();
                if (n <= 0) {
                    System.out.println("Number of values must be positive.");
                    return;
                }

                double[] arrayMedian = getDoubleArray(n);
                Arrays.sort(arrayMedian);
                System.out.println("Data in ascending order:\n" + Arrays.toString(arrayMedian));
                double median = calculateMedian(arrayMedian);
                System.out.println("The median is " + median);
                break;

            case 3: // Both
                System.out.print("Enter the number of values to be entered : ");
                n = getIntInput();
                if (n <= 0) {
                    System.out.println("Number of values must be positive.");
                    return;
                }

                double[] arrayBoth = getDoubleArray(n);
                double sumBoth = 0;
                for (double val : arrayBoth) {
                    sumBoth += val;
                }
                double meanBoth = sumBoth / n;
                System.out.println("The mean of given data is " + meanBoth);

                Arrays.sort(arrayBoth);
                System.out.println("Data in ascending order:\n" + Arrays.toString(arrayBoth));
                double medianBoth = calculateMedian(arrayBoth);
                System.out.println("The median is " + medianBoth);
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }

    private static void Exit() {
        System.out.println("Thank you for using the Special Numbers Program.");
        System.out.println("Exiting...");
        sv.close();
    }

    private static void Display_Menu() {
        System.out.println("\n==============================");
        System.out.println("\n1. Pallindrome (12321)");
        System.out.println("2. Spy Number (1124 : 1+1+2+4 = 1*1*2*4 )");
        System.out.println("3. Armstrong Number (153 : 1^3 + 5^3 + 3^3 = 153 )");
        System.out.println("4. Pronic Number (42 : 6*7 = 42) ");
        System.out.println("5. Perfect Number (28) ");
        System.out.println("6. Happy Number (19 : 1^2 + 9^2 = 82 -> 8^2 + 2^2 = 68 -> ... -> 1)");
        System.out.println("7. Prime Number (7) ");
        System.out.println("8. Factorial ");
        System.out.println("9. Mean and Median");
        System.out.println("10. Fibonacci Sequence");
        System.out.println("11. Ugly Number");
        System.out.println("12. Exit\n");
        System.out.println("==============================");

        System.out.print("Enter your choice : ");
    }

    public static void main(String[] args) {
        while (true) {
            Display_Menu();
            int ch = getIntInput();
            switch (ch) {
                case 1:
                    Pallindrome();
                    break;
                case 2:
                    Spy();
                    break;
                case 3:
                    Armstrong();
                    break;
                case 4:
                    Pronic();
                    break;
                case 5:
                    Perfect();
                    break;
                case 6:
                    Happy();
                    break;
                case 7:
                    Prime();
                    break;
                case 8:
                    Factorial();
                    break;
                case 9:
                    Mean_Median();
                    break;
                case 10:
                    Fibonacci();
                    break;
                case 11:
                    Ugly();
                    break;
                case 12:
                    Exit();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}