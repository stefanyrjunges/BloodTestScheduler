package bloodtestscheduler;

import java.util.ArrayList;

/**
 * @author Stefany Junges
 * 14/03/2025
 */

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

    //Looping through GPs assigned patients
    public String getPatients() {
        StringBuilder sb = new StringBuilder();
        
        if (assignedPatients.isEmpty()){
            return "";   
        } else {
            for (Patient p : assignedPatients){
                sb.append("Name: ")
                  .append(p.getName())
                  .append(" || Age: ")
                  .append(p.getAge())
                  .append("\n");
            }
            
            return sb.toString();
        }
    }
  
}
