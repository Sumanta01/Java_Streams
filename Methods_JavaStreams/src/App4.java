import java.util.List;
import java.util.Arrays;

public class App4 {
    public static void main(String[] args) {
        //toArray()

        List<String>name=Arrays.asList("Rocky","Sam","David","Smith","Rohan");
        Object ans[]= name.stream().toArray();
        System.out.println(Arrays.toString(ans)); //using toString() method to print the objcets 
        for(Object i: ans){
            System.out.println(i);
        }
        
    }
}
