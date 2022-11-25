import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Add add = new Add();
        Storage storage = new Storage();
        Delete deleter = new Delete();

        Boolean ligar = true;

        while (ligar) {
            System.out.println("Escolha o método:");
            System.out.println("Opções:");
            System.out.println("0 =  Desligar;");
            System.out.println("1 = Adicionar;");
            System.out.print("2 = Vizualizar produtos e componentes; \n\n");
            System.out.print("Opção: ");
            int metodo = sc.nextInt();
            System.out.println("\n+++++++++++++++++++++++++++++++++++\n");

            switch (metodo) {
                case 0:
                    ligar = false;
                    System.out.println("Desligando...");
                    break;

                case 1:
                    add.Adicionar(sc);
                    break;

                case 2:
                    storage.Objects(sc);

                case 3:
                    deleter.delete(sc);

            }
        }

    }
}
