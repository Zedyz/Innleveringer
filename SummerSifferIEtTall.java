import java.util.Scanner;

public class SummerSifferIEtTall {

    public static void main(String[] args)  {

        int tall, sum;

        Scanner input = new Scanner(System.in);

        System.out.print("Oppgi et tall mellom 0 og 999: ");

        tall = input.nextInt();

        sum = (tall % 10 + ((tall/10) % 10) + ((tall/100) % 10));

        System.out.println("Summen av siffer i " + tall + " er: " + sum);
    }
}
