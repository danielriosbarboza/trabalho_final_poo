import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Add add = new Add();

        Boolean ligar = true;

        while (ligar) {
            System.out.println("Escolha o método:");
            System.out.println("Opções:");
            System.out.println("1 = Adicionar");
            System.out.println("Digite 0 para parar.");
            System.out.println("__________________________");
            System.out.println("Opção: ");
            int metodo = sc.nextInt();

            switch (metodo) {
                case 0:
                    ligar = false;
                    System.out.println("Desligando...");
                    break;

                case 1:
                    add.Adicionar(sc);
                    break;

            }
        }

    }
}
