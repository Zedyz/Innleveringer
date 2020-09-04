import java.util.Scanner;

public class SteinSaksPapir2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String resultatMelding = "Datamaskin er %s. Du er %s. %s";
        String uavgjort = "Uavgjort";
        String vinner = "Du vant!";
        String taper = "Du tapte!";

        System.out.println("Saks (0), Stein (1) eller Papir (2)? ");

        int brukerInput = input.nextInt();
        int tilfeldigTall = (int)(Math.random() * 3);
        System.out.println(brukerInput);
        System.out.println(tilfeldigTall);

        boolean kjør = brukerInput < 0 ? false : brukerInput > 2 ? false : true;

        if (kjør) {

            String brukerVåpen = brukerInput == 0 ? "saks" : brukerInput == 1 ? "stein" : "papir";
            String maskinVåpen = tilfeldigTall == 0 ? "saks" : tilfeldigTall == 1 ? "stein" : "papir";
            String resultat =
                    brukerInput == tilfeldigTall ? uavgjort :
                    brukerInput == tilfeldigTall - 1 ? taper :
                    brukerInput == tilfeldigTall + 2 ? taper :
                    vinner;

            System.out.printf(resultatMelding, maskinVåpen, brukerVåpen, resultat);

        } else
            System.out.println("Ugyldig tall, kun 0, 1 eller 2 aksepteres.");
    }
}