import java.util.Scanner;
import java.util.ArrayList;

public class Add {

    public void Adicionar(Scanner sc) {
        ArrayList<Produto> list = new ArrayList<Produto>();

        char controle = 's';

        do {
            System.out.println("O produto é para qual área?");
            System.out.println("Escolha a área:");
            System.out.println("Opções:");
            System.out.println("1 = Laboratório");
            int area = sc.nextInt();
            if (area == 1) {
                Lab p = new Lab();
                System.out.println("Digite o produto: ");
                String pd = sc.next();
                p.setProduto(pd);
                System.out.println("Digite o modelo: ");
                String m = sc.next();
                p.setModelo(m);
                System.out.println("Digite a fabrica: ");
                String f = sc.next();
                p.setFabricante(f);
                System.out.println("Quanto tempo de garantia: ");
                int g = sc.nextInt();
                p.setGarantia(g);
                list.add(p);
            }
            System.out.println("Deseja cadastrar outro produto?");
            controle = sc.next().charAt(0);

        } while (controle == 's');
        for (Produto i : list) {
            System.out.printf(i.toString());
        }
    }
}
