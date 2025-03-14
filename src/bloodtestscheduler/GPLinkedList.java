/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

public class GPLinkedList implements GPInterface {
    
    private GPNode head; 
    
    @Override
    public boolean isEmpty() {
        return head == null;
    }

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

    @Override
    public void assignPatient(String gpName, Patient patient) {
        GPNode gp = findGP(gpName);
        if (gp != null) {
            gp.addPatient(patient);
        }
    }

    @Override
    public String displayGPs() {
        StringBuilder gpInfo = new StringBuilder();
        GPNode temp = head;

        while (temp != null) {
            gpInfo.append("GP: ").append(temp.getGPName())
                  .append(" | Patients: ").append(temp.getPatients().size())
                  .append("\n");
            temp = temp.next;
        }

        return gpInfo.toString(); // Set text in JTextArea
    }
}
  
