import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int freq;
        double x, y, media, pf;
        String disciplina, run;
        boolean cont = true;


        while (cont) {

            System.out.println("Digite a matéria para cadastrar: ");
            disciplina = sc.nextLine();

            System.out.println("Digite a primeira nota: ");
            x = sc.nextDouble();

            System.out.println("Digite a segunda nota: ");
            y = sc.nextDouble();

            System.out.println("Digite a frequencia:");
            freq = sc.nextInt();


            media = (x + y) / 2;

            if (freq < 75) {
                System.out.println("Reprovado por falta");
            } else if (media < 4) {
                System.out.println("Reprovado por nota");
            } else if (media >= 4 && media < 7) {
                pf = (5 - media * 0.6) / 4;
                System.out.println("Na Final, Precisando de: " + pf);
            } else if (media >= 7) {
                System.out.println("Aprovado com média: " + media + " na disciplina " + disciplina);
            }

            System.out.println("Deseja cadastrar outra matéria? (s/n): ");
            run = sc.next();
            sc.nextLine();

            cont = !run.equalsIgnoreCase("N");


        }
        sc.close();
    }
}