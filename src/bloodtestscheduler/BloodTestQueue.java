package bloodtestscheduler;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Stefany Junges
 * 14/03/2025
 */

public class BloodTestQueue implements PQInterface {
    //Using an arraylist to implement the queue
    private ArrayList<Patient> queue;
    
    public BloodTestQueue(){
        queue = new ArrayList<>();
    }
    
    @Override
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    
    //Adding a patient to the queue
    @Override
    public void enqueue(int priorityLvl, Patient patient){
        queue.add(patient);
        //Sorting the queue to maintain priority
        sortQueue();
    }
    
    //Removing a patient from the queue
    @Override
    public Patient dequeue(){
        if (!isEmpty()){
            System.out.println("Removed" + queue.get(0));
            return queue.remove(0);
        }
        
        return null;
    }
    
    //Getting next patient from the queue
    @Override
    public Patient getNextPatient(){
        if (!isEmpty()){
            Patient next = queue.get(0);
            return next;
        }
        
        return null;
    }
    
    //Sorting the queue based on the comparisons
    @Override
    public void sortQueue(){
        Collections.sort(queue, new ComparePatients());
    }
    
    @Override
    public String printQueue(){
       StringBuilder queueDetails = new StringBuilder();
    
       if (isEmpty()) return "";
       
       for (Patient patient : queue){
            String wardStatus = patient.isHospitalWard() ? "Yes" : "No";
            queueDetails.append("--NEW PATIENT--")
                        .append("\nFull name: " + patient.getName())
                        .append("\nAge: " + patient.getAge())
                        .append("\nAddress: " + patient.getAddress())
                        .append("\nPhone number: " + patient.getPhoneNo())
                        .append("\nPriority: " + patient.getPriorityLvl())
                        .append("\nIs patient in hospital ward? " + wardStatus)
                        .append("\n\n");
        }
    
        return queueDetails.toString(); 
    }
    
    //Recursive function to search patient
    public Patient searchPatient(String name, int index) { 
        //Base case (reaching queue size)
        if (index >= queue.size()) {
            return null;
        }

        if (queue.get(index).getName().equalsIgnoreCase(name)) {
            return queue.get(index);
        }

        //If patient was not found, go to next index
        return searchPatient(name, index + 1);
    }
    
}
