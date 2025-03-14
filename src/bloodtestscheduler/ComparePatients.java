/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;
import java.util.*;
/**
 * @author Stefany Junges
 */
public class ComparePatients implements Comparator<Patient> {
    
    @Override
    public int compare(Patient p1, Patient p2) {
        // Higher priority comes first
        int priorityComparison = getPriorityValue(p1.getPriorityLvl()) - getPriorityValue(p2.getPriorityLvl());

        if (priorityComparison != 0) {
            return -priorityComparison; // Higher priority goes first
        }

        // Older patients go first
        if (p1.getAge() != p2.getAge()) {
            return p2.getAge() - p1.getAge();
        }

        // Patients from the hospital go first
        return Boolean.compare(p2.isHospitalWard(), p1.isHospitalWard());
    }

    private int getPriorityValue(String priority) {
        return switch (priority.toLowerCase()) {
            case "urgent" -> 3;
            case "medium" -> 2;
            default -> 1;
        };
    }
    
}
