/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

public interface PQInterface {
    
    public void enqueue(int priorityLvl, Patient patient);
    public Object dequeue();
    public Patient getNextPatient();
    public boolean isEmpty();
    public void sortQueue();
    public String printQueue();
    
}
