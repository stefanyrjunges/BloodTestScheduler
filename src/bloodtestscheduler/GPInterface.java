package bloodtestscheduler;

/**
 * @author Stefany Junges
 * 14/03/2025
 */

public interface GPInterface {
    
    //Creating the abstract methods
    public void addGP(String gpName);
    public Object findGP(String gpName);
    public void assignPatient(String gpName, Patient patient);
    public String displayGPs();
    public boolean isEmpty();
    
}
