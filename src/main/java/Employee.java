import java.util.ArrayList;
import java.util.List;

public class Employee extends Person{
    public Employee(String name, String dept, int salary) {
        super(name, dept, salary);
    }

    @Override
    public void add(Person employee) {
        super.add(employee);
    }

    @Override
    public void remove(Employee e) {
        super.remove(e);
    }

    @Override
    public List<Person> getSubordinates() {
        return super.getSubordinates();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
