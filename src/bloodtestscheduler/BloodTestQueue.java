/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Stefany Junges
 */

public class BloodTestQueue implements PQInterface {
    
    private ArrayList<Patient> queue;
    private int priorityLvl;
    
    public BloodTestQueue(){
        queue = new ArrayList<>();
    }
    
    @Override
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    
    @Override
    public void enqueue(int priorityLvl, Patient patient){
        queue.add(patient);
        sortQueue();
    }
    
    @Override
    public Patient dequeue(){
        if (!queue.isEmpty()){
            System.out.println("Removed" + queue.get(0));
            return queue.remove(0);
        }
        
        return null;
    }
    
    @Override
    public Patient getNextPatient(){
        if (!queue.isEmpty()){
            Patient next = queue.get(0);
            return next;
        }
        
        return null;
    }
    
    @Override
    public void sortQueue(){
        Collections.sort(queue, new ComparePatients());
    }
    
    @Override
    public String printQueue(){
       StringBuilder queueDetails = new StringBuilder();  // Use StringBuilder to efficiently build the output
    
        for (Patient patient : queue){
            String wardStatus = patient.isHospitalWard() ? "Yes" : "No";
            queueDetails.append("-NEW PATIENT-")
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
    
    public Patient searchPatient(String name, int index) { 
        //Base case
        if (index >= queue.size()) {
            return null;
        }

        if (queue.get(index).getName().equalsIgnoreCase(name)) {
            return queue.get(index);
        }

        return searchPatient(name, index + 1);
    }
    
}
