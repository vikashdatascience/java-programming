public class experimnet {

    String brand = "Dell";
    int ram = 8;
    int price = 55000;

    void display() {
        System.out.println("Brand : " + brand);
        System.out.println("RAM : " + ram + " GB");
        System.out.println("Price : Rs." + price);
    }

    public static void main(String[] args) {

        Laptop obj = new Laptop();

        obj.display();
    }
}