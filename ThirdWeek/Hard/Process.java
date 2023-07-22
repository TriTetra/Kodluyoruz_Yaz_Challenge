package ThirdWeek.Hard;

import java.util.Random;
import java.util.Scanner;

public class Process {
    private Scanner scanner;
    private Random random;
    public product product;
    public String productName;
    public Integer id;
    public Integer price;
    public Integer cost;

    public Process() {
        this.scanner = new Scanner(System.in);
        this.random = new Random();
    }

    public void enterInput() {
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0 -> {
                    System.out.print("Ürün adı girin: ");
                    productName = scanner.nextLine();
                }
                case 1 -> {
                    id = random.nextInt(4000) + 5000;
                    System.out.println("ID numaranız: "+id);
                }
                case 2 -> {
                    System.out.print("Fiyat girin: ");
                    price = scanner.nextInt();
                    scanner.nextLine();
                }
                case 3 -> {
                    System.out.print("Maliyet girin: ");
                    cost = scanner.nextInt();
                    scanner.nextLine();
                }
            }
        }
        // product nesnesini oluşturduk ve üye değişkenlerle başlatıldı
        product = new product(productName, id, price, cost);
    }

    public String checkPrice() {
        enterInput();
        int profit = product.getPrice() - product.getCost();
        int whenIs = product.getPrice() / profit;

        String word = null;
        if (product.getPrice() <= product.getCost()){
            word = "Kâr elde edemezsiniz";
        }else word = "Kâr elde edebilmeniz için "+product.getId()+" id numaralı "+product.getName()+" ürününden "+whenIs+" adet satmalısınız.";

        return word;
    }
}
