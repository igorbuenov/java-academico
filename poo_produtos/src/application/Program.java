package application;
import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Adicionar produto
        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity: ");
        product.quantity = sc.nextInt();


        System.out.println();
        System.out.println("Product data: " + product);

        // Atualizar quantidade
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        // Remover quantidade
        System.out.println();
        System.out.print("Enter the number of products to be removed in stock: ");
        int removeQuantity = sc.nextInt();
        product.removeProducts(removeQuantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        sc.close();

    }
}
