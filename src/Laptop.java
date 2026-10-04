public class Laptop {
    String name;
    int Price;

    Laptop(String n ,int P){
        name = n;
        Price = P;
    }

    public static void main(String[] args) {
        Laptop lap1 = new Laptop( "Lenovo",50000) ;

        System.out.println("Laptop Name: " + lap1.name);
        System.out.println("Laptop Price: " + lap1.Price);
    }
}