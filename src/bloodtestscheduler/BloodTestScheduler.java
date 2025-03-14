/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author stefa
 */
public class BloodTestScheduler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BloodTestQueue bd = new BloodTestQueue();
        bd.dequeue();
        BloodTestSchedulerGUI b = new BloodTestSchedulerGUI();
        b.setVisible(true);
    }
    
}
