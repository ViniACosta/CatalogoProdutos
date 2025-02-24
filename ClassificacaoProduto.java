package CatalogoProdutos;

import java.util.Scanner;

public class ClassificacaoProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String produto1 = "Teclado";
        String produto2 = "Mouse";
        String produto3 = "Monitor";
        double preco = 0;

        System.out.println("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        if (produto1.equalsIgnoreCase(nomeProduto) || produto2.equalsIgnoreCase(nomeProduto)
                || produto3.equalsIgnoreCase(nomeProduto)) {
            System.out.println("Produto já existente, quer alterar o preço? (sim/não): ");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("sim")) {
                System.out.println("Insira um novo preço: ");
                preco = scanner.nextDouble();
            } else {
                System.out.println("Preço não atualizado!");
                scanner.close();
                return;
            }
        } else {
            System.out.println("Insira o preço do produto: ");
            preco = scanner.nextDouble();
        }

        if (preco < 50) {
            System.out.println("Categoria: Barato");
        } else if (preco >= 50 && preco <= 100) {
            System.out.println("Categoria: Moderado");
        } else {
            System.out.println("Categoria: Caro");
        }

        System.out.println("Produto: " + nomeProduto + ", Preço: " + preco);
        scanner.close();
    }
}