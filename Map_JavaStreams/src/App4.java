import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    int id;
    String name;
    double salary;

    public Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

}
public class App4 {
    public static void main(String[] args) {

        List<Employee>list=Arrays.asList(
            new Employee(1,"Sumanta",45000),
            new Employee(2,"Soam",25000),
            new Employee(3,"David",35000),
            new Employee(4,"Selena",55000),
            new Employee(5,"Charliee",65000),
            new Employee(6,"Camella",15000),
            new Employee(7,"John",85000)
        );
       
        list.stream().filter(i->i.salary>40000).map(i->i.salary).forEach(System.out::println);
        List<Double>ans=list.stream().filter(i->i.salary>40000).map(i->i.salary).collect(Collectors.toList());
        System.out.println(ans);
      
        

        
        

        
    }
    
}
