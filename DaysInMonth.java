import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {

        int year = 0;
        int days = 0;
        String month = "";
        String result = "The month of %s has %d days.";
        String error1 = "The year does not exist.";
        String error2 = "The month of %s does not exist, or is misspelled.";

        Scanner input = new Scanner(System.in);

        System.out.println("Year?");

        try {
            year = input.nextInt();

        }   catch (Exception e) {
            System.out.printf(error1);
            System.exit(1);

        }

        if (year >= 0 && year <= 9999)    {

            System.out.println("Month?(3 chars)");

            input.nextLine();

            month = input.nextLine().toLowerCase();

            if (month.length() == 3)    {
                switch (month)  {
                    case "jan":
                        days = 31;

                        break;
                    case "feb":
                        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
                            days = 29;

                        else
                            days = 28;

                        break;
                    case "mar":
                        days = 31;

                        break;
                    case "apr":
                        days = 30;

                        break;
                    case "may":
                        days = 31;

                        break;
                    case "jun":
                        days = 30;

                        break;
                    case "jul":
                        days = 31;

                        break;
                    case "aug":
                        days = 31;

                        break;
                    case "sep":
                        days = 30;

                        break;
                    case "oct":
                        days = 31;

                        break;
                    case "nov":
                        days = 30;

                        break;
                    case "dec":
                        days = 31;

                        break;
                    default:
                        System.out.printf(error2, month);
                        System.exit(1);

                }

            }   else    {
                System.out.printf(error2, month);
                System.exit(1);

            }

        }   else    {
            System.out.println("Year does not exist.");
            System.exit(1);

        }

        System.out.printf(result, month, days);

    }
}
