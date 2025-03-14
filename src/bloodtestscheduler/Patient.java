package bloodtestscheduler;

/**
 * @author Stefany Junges
 * 14/03/2025
 */

public class Patient {

    private String name, address, phoneNo, priorityLvl;
    private int age;
    private boolean hospitalWard;

    public Patient(String name, String address, String phoneNo, String priorityLvl, int age, boolean hospitalWard) {
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.age = age;
        this.priorityLvl = priorityLvl;
        this.hospitalWard = hospitalWard;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setPriorityLvl(String priorityLvl) {
        this.priorityLvl = priorityLvl;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHospitalWard(boolean hospitalWard) {
        this.hospitalWard = hospitalWard;
    }
    
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getPriorityLvl() {
        return priorityLvl;
    }

    public int getAge() {
        return age;
    }

    public boolean isHospitalWard() {
        return hospitalWard;
    }
     
}
