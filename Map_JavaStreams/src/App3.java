import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App3 {
    public static void main(String[] args) {
        List<Integer>number=Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer>ans=new ArrayList<>();
        //without streams
        /*for(int i:number){
            ans.add(i*3);
        }
        System.out.println(ans); */
        //with streams
        ans=number.stream().map(i->i*3).collect(Collectors.toList());
        System.out.println(ans);
        //Or
        number.stream().map(i->i*3).forEach(System.out::println);


    }
    
}
