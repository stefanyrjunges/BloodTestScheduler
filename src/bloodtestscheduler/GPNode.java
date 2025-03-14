package bloodtestscheduler;

import java.util.ArrayList;

public class GPNode {
    String gpName;
    ArrayList<Patient> assignedPatients;
    GPNode next;

    public GPNode(String gpName) {
        this.gpName = gpName;
        this.assignedPatients = new ArrayList<>();
        this.next = null;
    }

    public void addPatient(Patient p) {
        assignedPatients.add(p);
    }

    public String getGPName() {
        return gpName;
    }

    public ArrayList<Patient> getPatients() {
        return assignedPatients;
    }
    
    
}
