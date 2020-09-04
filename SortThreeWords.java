import java.util.Scanner;

public class SortThreeWords {

    public static void main(String[] args) {

        int compare1, compare2, compare3;
        String word1, word2, word3, tempWord1, tempWord2, tempWord3;
        String askText = "Skriv inn %s: ";
        String result = "Tre ord i alfabetisk ordre er: %s %s %s.";

        Scanner input = new Scanner(System.in);

        System.out.printf(askText, "første ord");

        word1 = input.nextLine();

        System.out.printf(askText, "andre ord");

        word2 = input.nextLine();

        System.out.printf(askText, "tredje ord");

        word3 = input.nextLine();

        compare1 = word2.substring(0,1).compareToIgnoreCase(word1.substring(0,1));

        if (compare1 < 0)   {
            tempWord1 = word2;
            word2 = word1;
            word1 = tempWord1;

        }

        compare2 = word2.substring(0,1).compareToIgnoreCase(word3.substring(0,1));

        if (compare2 > 0)   {
            tempWord2 = word3;
            word3 = word2;
            word2 = tempWord2;

        }

        compare3 = word2.substring(0,1).compareToIgnoreCase(word1.substring(0,1));

        if (compare3 < 0)   {
            tempWord3 = word1;
            word1 = word2;
            word2 = tempWord3;

        }

        System.out.printf(result, word1, word2, word3);

    }
}
