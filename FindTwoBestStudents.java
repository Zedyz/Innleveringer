import java.util.Scanner;

public class FindTwoBestStudents {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String studentFirstnameWinner = "", studentLastnameWinner = "", studentFirstnameSecond = "", studentLastnameSecond = "";
        String firstName, lastName, oneOrTwoStudents;
        String firstPlaceText = "Første plass: %s %s med score: %s";
        String secondPlaceText = "Andre plass: %s %s med score: %s";
        String inputText = "Oppgi studentens score og navn: ";

        int studentCount, studentScore, studentScoreFirst = 0, studentScoreSecond = 0;

        System.out.print("Oppgi antall studenter: ");

        studentCount = input.nextInt();

        for (int i = 0; i < studentCount; i++)  {
            System.out.print(inputText);

            studentScore = input.nextInt();
            firstName = input.next();
            lastName = input.next();

            if (studentScore > studentScoreFirst)  {
                studentScoreFirst = studentScore;
                studentFirstnameWinner = firstName;
                studentLastnameWinner = lastName;

            }

            if (studentScore > studentScoreSecond && studentScore < studentScoreFirst || i == 0 && studentCount > 1) {
                studentScoreSecond = studentScore;
                studentFirstnameSecond = firstName;
                studentLastnameSecond = lastName;

            }
        }

        oneOrTwoStudents = studentCount == 1? "Kun 1 student? " : "Topp to studenter: ";

        System.out.println(oneOrTwoStudents);

        if (studentCount > 1)
            System.out.printf("\n" + firstPlaceText, studentFirstnameWinner, studentLastnameWinner, studentScoreFirst + "\n");

        else
            System.out.print("\nTopp student er da " + studentFirstnameWinner + " " + studentLastnameWinner + " med score: " + studentScoreFirst);

        if (studentCount > 1)
            System.out.printf(secondPlaceText, studentFirstnameSecond, studentLastnameSecond, studentScoreSecond);

    }
}
