import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<String>vehicle=Arrays.asList("car","bus","truck","bike","train","jcb","aeroplane");
        List<String>ans=new ArrayList<>();

        // without streams
        /*for(String i:vehicle){
            System.out.println(i.toUpperCase());
        }  */
      
        //Or
         /*for(String i:vehicle){
            ans.add(i.toUpperCase());
        }
        System.out.println(ans);  */

        // with streams
         ans=vehicle.stream().map(i->i.toUpperCase()).collect(Collectors.toList());
        System.out.println(ans);
     
        // Or
        //vehicle.stream().map(i->i.toUpperCase()).forEach(System.out::println);
        //or
        vehicle.stream().map(i->i.toUpperCase()).forEach(i->System.out.println(i));



    }
}
