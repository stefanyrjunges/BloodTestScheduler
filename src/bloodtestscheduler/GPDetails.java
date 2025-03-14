/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

public class GPDetails {

    private String gpName, clinicName, clinicAddress;

    public GPDetails(String gpName, String clinicName, String clinicAddress) {
        this.gpName = gpName;
        this.clinicName = clinicName;
        this.clinicAddress = clinicAddress;
    }

    public void setGpName(String gpName) {
        this.gpName = gpName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    public void setClinicAddress(String clinicAddress) {
        this.clinicAddress = clinicAddress;
    }

    public String getGpName() {
        return gpName;
    }

    public String getClinicName() {
        return clinicName;
    }

    public String getClinicAddress() {
        return clinicAddress;
    }
    
}
