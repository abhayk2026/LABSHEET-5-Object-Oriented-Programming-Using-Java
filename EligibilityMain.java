class Medicine {
    private String medicineName;
    private int ageLimit;

    Medicine(String medicineName, int ageLimit) {
        this.medicineName = medicineName;
        this.ageLimit = ageLimit;
    }

    String checkEligibility(int patientAge) {
        String result; // Local variable stores the decision.
        if (patientAge >= ageLimit) {
            result = "Eligible";
        } else {
            result = "Not Eligible";
        }
        return result;
    }

    String getMedicineName() {
        return medicineName;
    }
}

public class EligibilityMain {
    public static void main(String[] args) {
        Medicine medicine = new Medicine("Example Medicine", 18);
        System.out.println("Age 20: " + medicine.checkEligibility(20));
        System.out.println("Age 15: " + medicine.checkEligibility(15));
    }
}
