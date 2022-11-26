import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Loading carregar = new Loading();
        carregar.LoadingObjects(sc);
        Add add = new Add();
        Storage storage = new Storage();
        Localizar locale = new Localizar();
        Delete deleter = new Delete();

        Boolean ligar = true;

        while (ligar) {
            System.out.println("Escolha o método:");
            System.out.println("Opções:");
            System.out.println("0 =  Desligar;");
            System.out.println("1 = Adicionar;");
            System.out.println("2 = Vizualizar produtos e componentes;");
            System.out.println("3 = Excluir Produto;");
            System.out.print("4 = Localizar o produto:\n\n");
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
                    break;

                case 3:
                    deleter.delete(sc);
                    break;

                case 4:
                    locale.locale(sc);
                    break;

            }
        }

    }
}
