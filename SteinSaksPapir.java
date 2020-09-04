import java.util.Scanner;

public class SteinSaksPapir {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String maskinensVaapen;
        String brukersVaapen;
        String uavgjortTekst = "Datamaskin er %s. Du er %s. Uavgjort.";
        String vinnerTekst = "Datamaskin er %s. Du er %s. Du vant!";
        String taperTekst = "Datamaskin er %s. Du er %s. Du tapte!";

        int maskinensTall = (int)(Math.random() * 3);

        System.out.println("Saks (0), Stein (1) eller Papir (2)? ");

        int brukersTall = input.nextInt();

        if (brukersTall > 2 || brukersTall < 0) {
            System.out.println("Ugyldig tall, kun 0, 1 eller 2 aksepteres.");
            return;

        } else {
            brukersVaapen = brukersTall == 0 ? "saks" : brukersTall == 1 ? "stein" : "papir";
            maskinensVaapen = maskinensTall == 0 ? "saks" : maskinensTall == 1 ? "stein" : "papir";

        }

        if (brukersTall == maskinensTall) {
            System.out.printf(uavgjortTekst, maskinensVaapen, brukersVaapen);

        } else {
            switch (brukersVaapen) {
                case "saks":
                    if (maskinensVaapen == "papir")
                        System.out.printf(vinnerTekst, maskinensVaapen, brukersVaapen);

                    else if (maskinensVaapen == "stein")
                        System.out.printf(taperTekst, maskinensVaapen, brukersVaapen);

                    break;
                case "stein":
                    if (maskinensVaapen == "saks")
                        System.out.printf(vinnerTekst, maskinensVaapen, brukersVaapen);

                    else if (maskinensVaapen == "papir")
                        System.out.printf(taperTekst, maskinensVaapen, brukersVaapen);

                    break;
                case "papir":
                    if (maskinensVaapen == "stein")
                        System.out.printf(vinnerTekst, maskinensVaapen, brukersVaapen);

                    else if (maskinensVaapen == "saks")
                        System.out.printf(taperTekst, maskinensVaapen, brukersVaapen);

                    break;
            }
        }
    }
}