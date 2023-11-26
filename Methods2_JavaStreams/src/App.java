import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Sorted ()
public class App {
    public static void main(String[] args) throws Exception {

        //sorted()
        List<Integer>num=Arrays.asList(21,2,34,16,65,45,56,9,13);

       // num.stream().sorted().forEach(System.out::println);
        List<Integer>ans= num.stream().sorted().collect(Collectors.toList());
        System.out.println(ans); // by default asc order
    
       
        List<Integer>ans2=num.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(ans2); // desc order
        //num.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //String

        List<String>name=Arrays.asList("rocky","sam","david","smith","rohan","rocky");
        List<String>ans3=name.stream().sorted().collect(Collectors.toList());
        //name.stream().sorted().forEach(System.out::println);
        System.out.println(ans3); // by default asc order

        List<String>ans4=name.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(ans4); // desc order
        
        //name.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);





     
    }
}
