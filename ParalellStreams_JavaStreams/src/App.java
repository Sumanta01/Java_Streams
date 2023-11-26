import java.util.Arrays;
import java.util.List;

class Student{
    String name;
    int marks;
    public Student(String name,int marks){
        this.name=name;
        this.marks=marks;
    }

    public String getName(String name){
        return this.name;
    }

    public int getMarks(int marks){
        return this.marks;
    }

   
}


public class App {
    public static void main(String[] args) throws Exception {

        List<Student>st1=Arrays.asList(
            new Student("Rocky", 90),
            new Student("Sam", 80),
            new Student("David", 70),
            new Student("Smith", 60),
            new Student("Rohan", 50),
            new Student("Reek", 90),
            new Student("Samel", 80)

        );
        
        // using Stream Sequential

        st1.stream().filter(i->i.getMarks(0)>=70).limit(2).forEach(j->System.out.println(j.getName(null)+" "+j.getMarks(0)));

        // using Stream Parallel
        st1.parallelStream().filter(i->i.getMarks(0)>=70).limit(2).forEach(j->System.out.println(j.getName(null)+" "+j.getMarks(0)));

        // convert Stream() --> ParalellStream()

         st1.stream().parallel().filter(i->i.getMarks(0)>=70).limit(2).forEach(j->System.out.println(j.getName(null)+" "+j.getMarks(0)));


        
    }
}
