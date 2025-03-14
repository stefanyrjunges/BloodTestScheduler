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
        if (isEmpty()) {
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

    //Assigning a patient to a GP
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
        //Start at the head
        GPNode temp = head;

        //Go through all elements until element is null
        while (temp != null) {
            gpInfo.append("--GP-- ")
                  .append("\n")
                  .append("Doctor's name: ")
                  .append(temp.getGPName())
                  .append(" | Patients:\n")
                  .append(temp.getPatients())
                  .append("\n");
            
            //Go to next element
            temp = temp.next;
        }

        return gpInfo.toString();
    }
}
  
