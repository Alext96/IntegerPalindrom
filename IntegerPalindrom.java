import java.util.Scanner;

public class IntegerPalindrom {

    public static void main(String args[]) {

        System.out.println("slå in ett nummer");
        int palindrom = new Scanner(System.in).nextInt();

        if (isPalindrom(palindrom)) {
            System.out.print("nummer " + palindrom + " är ett palindrom");
        } else {
            System.out.println("nummer " + palindrom + " är inte ett palindrom");
        }
    }
        public static boolean isPalindrom(int number){
            int palindrom = number;
            int reverse = 0;

            while (palindrom != 0) {
                int remainder = palindrom % 10;
                reverse = reverse * 10 + remainder;
                palindrom = palindrom / 10;
            }

            if(number == reverse)
            {
                return true;
        }
                return false;
        }

    }
