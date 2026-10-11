class Pharmacy {
    // Default/package-private members have no access keyword.
    String medicineName;
    double price;

    Pharmacy() {
        medicineName = "Amoxicillin";
        price = 42.0;
    }

    void displayMedicine() {
        System.out.println("Medicine: " + medicineName + ", Price: Rs. " + price);
    }
}

public class DefaultAccessMain {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();
        System.out.println(pharmacy.medicineName);
        System.out.println(pharmacy.price);
        pharmacy.displayMedicine();
    }
}
