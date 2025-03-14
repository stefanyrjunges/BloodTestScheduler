/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

import java.util.ArrayList;

public class NoShowStack {
    private ArrayList<Patient> noShowStack;

    public NoShowStack() {
        this.noShowStack = new ArrayList<>();
    }

    public void addNoShow(Patient p) {
        if (noShowStack.size() >= 5) {
            noShowStack.remove(0); // Remove oldest entry (First In)
        }
        noShowStack.add(p); // Add newest entry (Last In)
    }

    public ArrayList<Patient> getNoShows() {
        return new ArrayList<>(noShowStack);
    }
    
    public String displayStack() {
        StringBuilder sb = new StringBuilder();
        ArrayList<Patient> noShows = getNoShows();

        if (noShows.isEmpty()) {
            return "No no-show patients.";
        }

        for (Patient p : noShows) {
            sb.append("--NO SHOW PATIENT--")
              .append("\nFull name: ").append(p.getName())
              .append("\nAge: ").append(p.getAge())
              .append("\nAddress: ").append(p.getAddress())
              .append("\nPhone: ").append(p.getPhoneNo())
              .append("\nPriority: ").append(p.getPriorityLvl())
              .append("\nIs patient in hospital ward? ").append(p.isHospitalWard() ? "Yes" : "No")
              .append("\n\n");
        }

        return sb.toString();
    }
}
