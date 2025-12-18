abstract class Vaccine {

    int age;
    String nationality;

    // Constructor to initialize variables
    Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    // Concrete method - First Dose
    void firstDose() {
        if (nationality.equalsIgnoreCase("Indian") && age >= 18) {
            System.out.println("User is eligible for First Dose");
            System.out.println("Amount to be paid: 250");
        } else {
            System.out.println("User is NOT eligible for First Dose");
        }
    }

    // Concrete method - Second Dose
    void secondDose(boolean firstDoseCompleted) {
        if (firstDoseCompleted) {
            System.out.println("User is eligible for Second Dose");
        } else {
            System.out.println("Complete First Dose before taking Second Dose");
        }
    }

    // Abstract method
    abstract void boosterDose();
}

// Implementation class
class VaccinationSuccessful extends Vaccine {

    VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    // Overriding abstract method
    @Override
    void boosterDose() {
        System.out.println("Booster Dose Successfully Completed");
    }
}

// Main class
public class Vaccination {

    public static void main(String[] args) {

        // Sample Input
        int age = 18;
        String nationality = "Indian";

        VaccinationSuccessful v = new VaccinationSuccessful(age, nationality);

        // Method calls
        v.firstDose();
        v.secondDose(true);
        v.boosterDose();
    }
}