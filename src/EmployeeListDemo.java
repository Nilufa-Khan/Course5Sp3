import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeListDemo
{
    public static void main(String[] args) {

        Set<Employee> list = new TreeSet<>();

        list.add(new Employee("Aarman", 12));
        list.add(new Employee("Chetna", 13));
        list.add(new Employee("Vaibhav", 14));
        list.add(new Employee("Shilpi", 1));
        list.add(new Employee("Swagata", 19));
        list.add(new Employee("Falguni", 17));
        for(Employee ele : list){
            System.out.println("ele = " + ele);
        }
        System.out.println("-------------------------------");
        TreeSet<Employee> employeeSet = new TreeSet<>();

         employeeSet.addAll(list);
        for(Employee emp : employeeSet){
            System.out.println("emp = " + emp);
        }


    }
}
