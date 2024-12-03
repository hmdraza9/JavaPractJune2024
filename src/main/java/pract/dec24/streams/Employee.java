package pract.deec24.streams;

public class Employee {

    public Employee(String name, String department){
        this.name = name;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
    String department;

    @Override
    public String toString(){
        return name+" "+department;
    }

}
