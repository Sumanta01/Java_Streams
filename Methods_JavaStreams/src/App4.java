import java.util.List;
import java.util.Arrays;

public class App4 {
    public static void main(String[] args) {
        //toArray()

        List<String>name=Arrays.asList("Rocky","Sam","David","Smith","Rohan");
        Object ans[]= name.stream().toArray();
        System.out.println(ans);
        for(Object i: ans){
            System.out.println(i);
        }
    }
}
