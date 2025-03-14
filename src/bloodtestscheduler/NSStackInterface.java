package bloodtestscheduler;

/**
 * @author Stefany Junges
 * 14/03/2025
 */

public interface NSStackInterface {
    
    //Creating the abstract methods
    public void pushNoShow(Patient patient);
    public String displayStack();
    public Object popNoShow();
    public void emptyStack();
    public boolean isEmpty();
    
}
