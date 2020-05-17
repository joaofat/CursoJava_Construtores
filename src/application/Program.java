package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Product;

import static java.lang.System.*;

/*Sobrecarga: É um recurso que uma classe possui de oferecer mais de uma operação com o mesmo nome, porém com diferentes listas
* de parametros.
* É possivel criar um construtor padrão (sem parametros)*/

    public class Program {
            public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(in);

            out.println("Enter product data: ");
            out.print("Name: ");
            String name = sc.nextLine();
            out.print("Price: ");
            double price = sc.nextDouble();

            Product product = new Product(name, price);

            out.println();
            out.println("Product data: " + product);
            out.println();
            out.print("Enter the number of products to be added in stock: ");
            int quantity = sc.nextInt();
            product.addProducts(quantity);
            out.println();
            out.println("Updated data: " + product);
            out.println();
            out.print("Enter the number of products to be removed from stock: ");
            quantity = sc.nextInt();
            product.removeProducts(quantity);
            out.println();
            out.println("Updated data: " + product);
            sc.close();
    }
}