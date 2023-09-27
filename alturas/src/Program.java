import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = scan.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa: ");
            System.out.print("Nome: ");
            nomes[i] = scan.next();
            System.out.print("Idade: ");
            idades[i] = scan.nextInt();
            System.out.print("Altura: ");
            alturas[i] = scan.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma +=alturas[i];
        }

        double  mediaAlturas = soma / n;

        System.out.println();
        System.out.printf("Altura média: %.2f%n", mediaAlturas);

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                count += 1;
            }
        }

        double percent = count * 100.0 / n;

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);

        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }
    }
}
