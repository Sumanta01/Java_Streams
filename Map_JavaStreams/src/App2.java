import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App2 {
    public static void main(String[] args) {
        List<String>vehicle=Arrays.asList("car","bus","truck","bike","train","jcb","aeroplane");
        List<Integer>ans=new ArrayList<>();
        //without streams
       /*  for(String str:vehicle){
            ans.add(str.length());
        }
        System.out.println(ans);  */


        // with streams
        ans=vehicle.stream().map(i->i.length()).collect(Collectors.toList());
        System.out.println(ans);
        //Or
        vehicle.stream().map(i->i.length()).forEach(System.out::println);
    }
    
}
