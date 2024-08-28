import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Vetor vetor = new Vetor(10);
        int menu;

        do {
            System.out.println("------Menu dos noivos------");
            System.out.println("1. Presentear ");
            System.out.println("2. Tomar presente");
            System.out.println("3. Exibir presentes");
            System.out.println("4 - Sair");

            menu = ler.nextInt();
            ler.nextLine(); 

            if (menu == 1) {
                System.out.print("Digite o presente que deseja adicionar: ");
                String stringAdicionar = ler.nextLine();
                vetor.adicionar(stringAdicionar);
                vetor.exibir();

            } else if (menu == 2) {
                System.out.print("Digite o presente que deseja remover: ");
                String stringRemover = ler.nextLine();
                vetor.remover(stringRemover);

            } else if (menu == 3) {
                vetor.exibir();

            } else if (menu != 4) {
                System.out.println("Opção inválida, tente novamente.");
            }

        } while (menu != 4);

        System.out.println("Encerrando...");
    }
}