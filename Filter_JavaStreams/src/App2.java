import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App2 {
    public static void main(String[] args) {
        List<String>name=Arrays.asList("Sumanta","Soam","David","Selena","Charliee","Camella");

        List<String>res=new ArrayList<>();

        res=name.stream().filter(i->i.length()>4 && i.length()<7).collect(Collectors.toList());
        System.out.println(res);
        
        name.stream().filter(i->i.length()>4 && i.length()<7).forEach(System.out::println);

    }
    
}
