class Medicine {
    String medicineName;
    String batchNo;
    double price;

    Medicine(String medicineName, String batchNo, double price) {
        this.medicineName = medicineName;
        this.batchNo = batchNo;
        this.price = price;
    }

    void displayMedicine() {
        System.out.println("Medicine: " + medicineName + ", Batch: " + batchNo
                + ", Price: Rs. " + price);
    }
}

public class MedicineMain {
    public static void main(String[] args) {
        Medicine first = new Medicine("Paracetamol", "PCM101", 25.50);
        Medicine second = new Medicine("Cetirizine", "CTZ202", 18.00);
        first.displayMedicine();
        second.displayMedicine();
    }
}
