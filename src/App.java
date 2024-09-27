import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite algo: ");

        String algo = s.nextLine();

        int n = 0;

        for (int i = 0; i < algo.length(); i++) {
            char letra = algo.charAt(i);

            if (letra == 'a' || letra == 'A') {
                n++;
            }
        }
        if (n > 0) {
            System.out.println("A letra 'A' ou 'a' ocorre " + n + " vezes");
        }
        else {
            System.out.println("Nenhuma letra 'a' ou 'A' foi encontrada");
        }
        s.close();
    }
}
