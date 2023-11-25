import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class App {
    // Non terminal methods
    // distinct(), limit()
    // terminal methods
    // collect(), forEach(), reduce()
    public static void main(String[] args) throws Exception {
        //distinct ()
        List<String>vehicle=Arrays.asList("car","bus","car","truck","bus","bike","jcb","bike");
        List<String>ans=vehicle.stream().distinct().collect(Collectors.toList());
        System.out.println(ans);
        vehicle.stream().distinct().forEach(System.out::println);

        //count()
        long count=vehicle.stream().distinct().count();
        System.out.println(count);

        //limit()
        List<String>res=vehicle.stream().limit(3).collect(Collectors.toList());
        System.out.println(res);
        vehicle.stream().limit(3).forEach(System.out::println);
        



    }
}
