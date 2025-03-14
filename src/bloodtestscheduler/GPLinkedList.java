package bloodtestscheduler;

/**
 * @author Stefany Junges
 * 14/03/2025
 */

public class GPLinkedList implements GPInterface {
    
    private GPNode head; 
    
    @Override
    public boolean isEmpty() {
        return head == null;
    }

    //Adding a new GP to the list
    @Override
    public void addGP(String gpName) {
        GPNode newGP = new GPNode(gpName);
        if (head == null) {
            head = newGP;
        } else {
            GPNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newGP;
        }
    }

    //Finding a GP in the list
    @Override
    public GPNode findGP(String gpName) {
        GPNode temp = head;
        while (temp != null) {
            if (temp.getGPName().equalsIgnoreCase(gpName)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    //Assign a patient to a GP
    @Override
    public void assignPatient(String gpName, Patient patient) {
        GPNode gp = findGP(gpName);
        if (gp != null) {
            gp.addPatient(patient);
        }
    }

    //Display all GPs and their assigned patients
    @Override
    public String displayGPs() {
        StringBuilder gpInfo = new StringBuilder();
        GPNode temp = head;

        while (temp != null) {
            gpInfo.append("GP: ").append(temp.getGPName())
                  .append(" | Patients:\n")
                  .append(temp.getPatients())
                  .append("\n");
            temp = temp.next;
        }

        return gpInfo.toString();
    }
}
  
