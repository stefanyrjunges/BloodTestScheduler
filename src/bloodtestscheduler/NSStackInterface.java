/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author Stefany Junges
 */
public interface NSStackInterface {
    
    public void pushNoShow(Patient patient);
    public Object getNoShows();
    public String displayStack();
    public Object pop();
    public void emptyStack();
    
}
