package bloodtestscheduler;

/**
 * @author Stefany Junges
 * 14/03/2025
 */

import java.util.ArrayList;

public class NoShowStack implements NSStackInterface {
    private ArrayList<Patient> noShowStack;

    public NoShowStack() {
        noShowStack = new ArrayList<>();
    }

    //Function to add a no-show patient to the stack
    @Override
    public void pushNoShow(Patient patient) {
        if (noShowStack.size() >= 5) {
            noShowStack.remove(0);
        }
        noShowStack.add(patient);
    }

    @Override
    public ArrayList<Patient> getNoShows() {
        return new ArrayList<>(noShowStack);
    }
    
    @Override
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
    
    @Override
    public Patient pop(){
        if (!(noShowStack.isEmpty())){
            return noShowStack.remove(0);
        }
        
        return null;
    }
    
    @Override
    public void emptyStack() {
        while (!noShowStack.isEmpty()) {
            pop();
        }
}
}
