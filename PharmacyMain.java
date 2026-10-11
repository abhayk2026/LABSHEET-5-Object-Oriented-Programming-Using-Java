class Pharmacy {
    String pharmacyName;
    String location;
    static int pharmacyCount = 0; // Shared by every Pharmacy object.

    Pharmacy(String pharmacyName, String location) {
        this.pharmacyName = pharmacyName;
        this.location = location;
        pharmacyCount++;
    }

    void displayPharmacy() {
        System.out.println("Pharmacy: " + pharmacyName + ", Location: " + location);
    }

    static void displayPharmacyCount() {
        System.out.println("Total pharmacies: " + pharmacyCount);
    }
}

public class PharmacyMain {
    public static void main(String[] args) {
        Pharmacy one = new Pharmacy("Health Plus", "Delhi");
        Pharmacy two = new Pharmacy("Care Med", "Meerut");
        Pharmacy three = new Pharmacy("Life Pharmacy", "Noida");
        one.displayPharmacy();
        two.displayPharmacy();
        three.displayPharmacy();
        Pharmacy.displayPharmacyCount();
    }
}
