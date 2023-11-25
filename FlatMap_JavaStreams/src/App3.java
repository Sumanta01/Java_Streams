import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    String name;
    int id;
    char grade;

    public Student(String name,int id,char grade){
        this.name=name;
        this.id=id;
        this.grade=grade;
    }
}

public class App3 {
    public static void main(String[] args) {

        List<Student>St1=Arrays.asList(
            new Student("Sumanta",1,'A'),
            new Student("Soam",2,'B'),
            new Student("David",3,'C')

        );
        List<Student>St2=Arrays.asList(
            new Student("Selena",4,'B'),
            new Student("Charliee",5,'B'),
            new Student("Camella",6,'C')

        );
        List<Student>St3=Arrays.asList(
            new Student("John",7,'C'),
            new Student("Jadeja",8,'B'),
            new Student("Shami",9,'C')

        );
        
        List<List<Student>>listSt=Arrays.asList(St1,St2,St3);
        List<String>ans= listSt.stream().flatMap(i->i.stream()).map(i->i.name).collect(Collectors.toList());
        System.out.println(ans);
        
        

    }
    
}
