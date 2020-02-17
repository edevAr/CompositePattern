public class Main {
    public static void main(String[] args){
        Person CEO = new Employee("Pedro", "CEO", 3000);
        Person headSales = new Employee("Roberto", "Head Sales", 2000);
        Person headMarketing = new Employee("Marco", "Head Marketing", 2000);

        Person marketing = new Employee("Laura", "Marketing", 1000);

        Person salesExecutive = new Employee("Bob", "Sales", 1000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive);
        headMarketing.add(marketing);

        System.out.println(CEO);

        for (Person headEmployee : CEO.getSubordinates()){
            System.out.println(headEmployee);
            for (Person employee : headEmployee.getSubordinates()){
                System.out.println(employee);
            }
        }
    }
}
