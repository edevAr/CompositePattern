public class Main {
    public static void main(String[] args){
        Employee CEO = new Employee("Pedro", "CEO", 3000);
        Employee headSales = new Employee("Roberto", "Head Sales", 2000);
        Employee headMarketing = new Employee("Marco", "Head Marketing", 2000);

        Employee marketing = new Employee("Laura", "Marketing", 1000);

        Employee salesExecutive = new Employee("Bob", "Sales", 1000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive);
        headMarketing.add(marketing);

        System.out.println(CEO);

        for (Employee headEmployee : CEO.getSubordinates()){
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubordinates()){
                System.out.println(employee);
            }
        }
    }
}
