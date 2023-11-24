import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App3 {
    public static void main(String[] args) {

        List<String>name=Arrays.asList("Rocky","Sam",null,"David",null,"Smith",null,"Rohan");
        //remove the null from collections
        List<String>res=new ArrayList<>();
        res=name.stream().filter(i->i!=null).collect(Collectors.toList());
        System.out.println(res);
        //remove the null from collections using method reference
        name.stream().filter(i->i!=null).forEach(System.out::println);

        
    }
    
}
