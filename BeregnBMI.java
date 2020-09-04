import java.util.Scanner;

public class BeregnBMI {

    public static void main(String[] args)  {

        double vekt, høyde;

        Scanner input = new Scanner(System.in);

        System.out.println("Programmet beregner din BMI");
        System.out.print("Oppgi din vekt i kilogram: ");

        vekt = input.nextDouble();

        System.out.print("Oppgi din høyde i meter: ");

        høyde = input.nextDouble();

        final double BMI_FORMEL = (vekt/ Math.pow(høyde, 2));

        System.out.println("Din BMI er: " + BMI_FORMEL + " kg/m^2");

    }
}
