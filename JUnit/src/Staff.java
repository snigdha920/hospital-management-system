
public class Staff {
	String staff_id, staff_name, designation, gender;
    int salary;
    
    void createNewStaff(String staff_id, String staff_name, String designation, String gender, int salary) {

        this.staff_id = staff_id;
        
        if(!staff_id.matches("[A-Za-z0-9]+")){
            throw new IllegalArgumentException("Could not create Staff, staff_id does not match [A-Za-z0-9]+");
        }
        
        if(salary < 10000){
            throw new IllegalArgumentException("Could not create Staff, salary is below 10,000");
        }
        
        this.staff_name = staff_name;
        this.designation = designation;
        this.gender = gender;
        this.salary = salary;        
        
    }

    void printStaffInfo() {
        System.out.println(this.staff_id + "\t" + this.staff_name + "\t" + this.gender + "\t" + this.salary);
    }

}
