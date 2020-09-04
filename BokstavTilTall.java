import java.util.Scanner;

public class BokstavTilTall {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String gyldigUtskrift = "Korresponderende tall for: %s er: %s";
        String ugyldigUtskrift = "%s har ikke et korresponderende tall.";

        System.out.println("Oppgi en bokstav: ");

        String bokstav = input.next();

        if (bokstav.length() == 1 && (bokstav.matches("[a-zA-Z]")))   {
            bokstav = bokstav.substring(0,1).toUpperCase();

            if (bokstav.matches("[A-C]"))
                System.out.printf(gyldigUtskrift, bokstav,"2");

            else if (bokstav.matches("[D-F]"))
                System.out.printf(gyldigUtskrift, bokstav,"3");

            else if (bokstav.matches("[G-I]"))
                System.out.printf(gyldigUtskrift, bokstav,"4");

            else if (bokstav.matches("[J-L]"))
                System.out.printf(gyldigUtskrift, bokstav,"5");

            else if (bokstav.matches("[M-O]"))
                System.out.printf(gyldigUtskrift, bokstav,"6");

            else if (bokstav.matches("[P-S]"))
                System.out.printf(gyldigUtskrift, bokstav,"7");

            else if (bokstav.matches("[T-V]"))
                System.out.printf(gyldigUtskrift, bokstav,"8");

            else if (bokstav.matches("[W-Z]"))
                System.out.printf(gyldigUtskrift, bokstav,"9");

        }   else    {
            System.out.printf(ugyldigUtskrift, bokstav);
            System.exit(0);

        }
    }
}
