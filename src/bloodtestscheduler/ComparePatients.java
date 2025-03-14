package bloodtestscheduler;
import java.util.*;

/**
 * @author Stefany Junges
 * 14/03/2025
 */

public class ComparePatients implements Comparator<Patient> {
    
    //Function to compare different priority levels, age and hospital ward
    @Override
    public int compare(Patient p1, Patient p2) {
        //Converting the priority level to numerical value
        int priorityComparison = getPriorityValue(p1.getPriorityLvl()) - getPriorityValue(p2.getPriorityLvl());

        if (priorityComparison != 0) {
            //Multiplying by -1 so higher patient comes first
            return -priorityComparison;
        }

        //Higher priority for older patients
        if (p1.getAge() != p2.getAge()) {
            return p2.getAge() - p1.getAge();
        }

        //Higher priority for patients in hospital ward
        return Boolean.compare(p2.isHospitalWard(), p1.isHospitalWard());
    }

    //Give numerical values to different priority levels
    private int getPriorityValue(String priority) {
        return switch (priority.toLowerCase()) {
            case "urgent" -> 3;
            case "medium" -> 2;
            default -> 1;
        };
    }
    
}
