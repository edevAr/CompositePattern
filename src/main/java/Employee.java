import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<Employee>();
    }
    public void add(Employee employee){
        subordinates.add(employee);
    }
    public void remove(Employee e){
        subordinates.remove(e);
    }
    public List<Employee> getSubordinates(){
        return subordinates;
    }
    public String toString(){
        return ("Employe: [ Name: "+name+ " dept : "+dept+ ", salary: "+ salary+"]");
    }
}
