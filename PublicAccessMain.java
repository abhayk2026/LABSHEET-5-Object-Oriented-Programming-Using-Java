class Hospital {
    // Public members can be accessed directly from other classes.
    public String hospitalName;
    public String hospitalCode;

    public Hospital() {
        hospitalName = "City Care Hospital";
        hospitalCode = "CCH101";
    }

    public void displayHospital() {
        System.out.println("Hospital: " + hospitalName + ", Code: " + hospitalCode);
    }
}

public class PublicAccessMain {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        System.out.println(hospital.hospitalName);
        System.out.println(hospital.hospitalCode);
        hospital.displayHospital();
    }
}
