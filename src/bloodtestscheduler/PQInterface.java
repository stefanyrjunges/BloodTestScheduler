package bloodtestscheduler;

/**
 * @author Stefany Junges
 * 14/03/2025
 */

public interface PQInterface {
    
    //Creating the abstract methods
    public void enqueue(int priorityLvl, Patient patient);
    public Object dequeue();
    public Patient getNextPatient();
    public boolean isEmpty();
    public void sortQueue();
    public String printQueue();
    
}
