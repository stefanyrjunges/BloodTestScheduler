/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

/**
 * @author Stefany
 */
public interface GPInterface {
    
    public void addGP(String gpName);
    public Object findGP(String gpName);
    public void assignPatient(String gpName, Patient patient);
    public String displayGPs();
    public boolean isEmpty();
    
}
