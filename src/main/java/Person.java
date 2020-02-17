import java.util.ArrayList;
import java.util.List;

public abstract class Person {
    protected String name;
    protected String dept;
    protected int salary;
    protected List<Person> subordinates;

    public Person(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<Person>();
    }
    public void add(Person employee){
        subordinates.add(employee);
    }
    public void remove(Employee e){
        subordinates.remove(e);
    }
    public List<Person> getSubordinates(){
        return subordinates;
    }
    public String toString(){
        return ("Employe: [ Name: "+name+ " dept : "+dept+ ", salary: "+ salary+"]");
    }
}
