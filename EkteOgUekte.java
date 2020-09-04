import java.util.Scanner;

public class EkteOgUekte {

    public static void main (String[] args) {

        int teller, nevner;

        Scanner input = new Scanner(System.in);

        System.out.println("Oppgi teller: ");

        teller = input.nextInt();

        System.out.println("Oppgi nevner: ");

        nevner = input.nextInt();

        if (teller < nevner)
            System.out.println(teller + "/" + nevner + " er en ekte brøk.");

        else if (teller > nevner || teller == nevner)

            if (teller % nevner == 0)
                System.out.println(teller + "/" + nevner + " er en uekte brøk.\nDet kan reduseres til " + teller/nevner + ".");

            else if(teller % nevner != 0)
                System.out.println(teller + "/" + nevner + " er en uekte brøk.\nDet er et blandet tall " + teller/nevner + "+(" + teller%nevner + "/" + nevner + ").");
    }
}
