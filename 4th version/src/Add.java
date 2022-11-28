import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Add {

    Loading loading = new Loading();

    ArrayList<Lab> listP = new ArrayList<Lab>();

    public void Adicionar(Scanner sc) throws IOException {

        char controle = 's';

        do {
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
            int nc = sc.nextInt();
            for (int x = 0; x < nc; x++) {
                p.setLocationComp(x);
                System.out.print("\nDigite o nome do componentes: ");
                String c = sc.next();
                p.setLocationComp(x);
                p.setComp(c);

            }
            listP.add(p);
            for (Lab i : listP) {
                System.out.printf(i.toString());
                int num = 1;
                String location = String.valueOf(num);
                Path path = Path.of("E:/Documentos/Workspace - Java/java-in-vscode/Trabalho Final POO/Produtos/"
                        + location + ".txt");
                String way = "E:/Documentos/Workspace - Java/java-in-vscode/Trabalho Final POO/Produtos/" + location
                        + ".txt";
                for (int c = 0; c < 100; c++) {
                    if (Files.notExists(path)) {
                        FileWriter writer = new FileWriter(way, true);
                        try {
                            writer.write(i.toString());
                        } catch (Exception erro) {

                        }
                        for (int y = 0; y < nc; y++) {
                            p.setLocationComp(y);
                            System.out.println("    Componente" + (y + 1) + ":" + p.getComp());
                            try {
                                writer.write("  Componenete " + (y + 1) + ": " + p.getComp() + "\n");

                            } catch (Exception erro) {

                            }
                        }
                        writer.close();
                        loading.LoadingObjects(sc);
                        break;
                    } else {
                        location = String.valueOf(c + 1);
                        path = Path.of("E:/Documentos/Workspace - Java/java-in-vscode/Trabalho Final POO/Produtos/"
                                + location + ".txt");
                        way = "E:/Documentos/Workspace - Java/java-in-vscode/Trabalho Final POO/Produtos/" + location
                                + ".txt";
                    }

                }
            }
            System.out.println("Deseja cadastrar outro produto?");
            controle = sc.next().charAt(0);

        } while (controle == 's');
    }

}
