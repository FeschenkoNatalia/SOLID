/**
 * Created by themzdht on 29.04.2017.
 */
public class Nurse extends Employee {
    public Nurse(long id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Nurse in action...");
    }

    private void checkVitalSigns() {
        System.out.println("Checking Vital signs...");
    }

    private void drawBlood() {
        System.out.println("Drawing blood");
    }

    private void cleanPatientArea() {
        System.out.println("Cleaning Patient Area");
    }


    @Override
    protected void performDuties() {
        checkVitalSigns();
        drawBlood();
        cleanPatientArea();

    }
}
