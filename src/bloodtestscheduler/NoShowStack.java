package bloodtestscheduler;

/**
 * @author Stefany Junges
 * 14/03/2025
 */

import java.util.ArrayList;

public class NoShowStack implements NSStackInterface {
    //Using an arraylist to implement the stack
    private ArrayList<Patient> noShowStack;

    public NoShowStack() {
        noShowStack = new ArrayList<>();
    }

    //Function to add a no-show patient to the stack
    @Override
    public void pushNoShow(Patient patient) {
        //Keeping the size to a max of 5
        if (noShowStack.size() >= 6) {
            noShowStack.remove(0);
        }
        noShowStack.add(patient);
    }
    
    //Displaying all the no-shows
    @Override
    public String displayStack() {
        StringBuilder sb = new StringBuilder();

        if (noShowStack.isEmpty()) {
            return "No patients to display.";
        }

        //Looping through the array
        for (Patient p : noShowStack) {
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
    
    //Removing patient from stack
    @Override
    public Patient pop(){
        if (!noShowStack.isEmpty()){
            return noShowStack.remove(0);
        }    
        return null;
    }
    
    //Clearing the stack
    @Override
    public void emptyStack() {
        while (!noShowStack.isEmpty()) {
            pop();
        }
    }
}