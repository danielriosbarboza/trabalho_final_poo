import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Add {

    public void Adicionar(Scanner sc) throws IOException {
        ArrayList<Produto> list = new ArrayList<Produto>();

        char controle = 's';

        do {
            System.out.println("O produto é para qual área?");
            System.out.println("Opções:");
            System.out.println("1 = Laboratório");
            System.out.print("Escolha: ");
            int area = sc.nextInt();
            if (area == 1) {
                Lab p = new Lab();
                System.out.print("\nDigite o produto: ");
                String pd = sc.next();
                p.setProduto(pd);
                System.out.print("\nDigite o modelo: ");
                String m = sc.next();
                p.setModelo(m);
                System.out.print("\nDigite a fabrica: ");
                String f = sc.next();
                p.setFabricante(f);
                System.out.print("\nQuanto tempo de garantia: ");
                int g = sc.nextInt();
                p.setGarantia(g);
                System.out.print("\nQuantos componentes serão necessários: ");
                int c = sc.nextInt();
                String[] comp = new String[c];
                for (int x = 0; x < c; x++) {
                    System.out.print("\nDigite o nome do componentes: ");
                    comp[x] = sc.next();
                }
                list.add(p);
                Path way = Path.of("E:/Documentos/Workspace - Java/java-in-vscode/Interface Gráfica/Produtos/"
                        + p.getProduto() + ".txt");
                Files.createFile(way);

                for (Produto i : list) {
                    System.out.printf(i.toString());
                    try {
                        Files.writeString(way, i.toString());
                    } catch (Exception erro) {

                    }
                }
                for (int x = 0; x < c; x++) {
                    System.out.print("  Componente" + (x + 1) + ": ");
                    System.out.println(comp[x]);
                }

            }
            System.out.println("Deseja cadastrar outro produto?");
            controle = sc.next().charAt(0);

        } while (controle == 's');
    }
}
