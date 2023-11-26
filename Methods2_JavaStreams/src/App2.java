import java.util.HashSet;
import java.util.Set;

public class App2 {

    // anyMatch()
    // allMatch()
    // noneMatch()
    public static void main(String[] args) {

        //anyMatch
        Set<String>fruits=new HashSet<>();
        fruits.add("One Apple");
        fruits.add("One Banana");
        fruits.add("Two Orange");
        fruits.add("Three Mango");
        fruits.add("Four Grapes");
        fruits.add("Three Watermelon");
        fruits.add("Two Watermelon");

        boolean res= fruits.stream().anyMatch(i->{return i.startsWith("One");});
         System.out.println(res);

        //allMatch
        boolean res2= fruits.stream().allMatch(i->{return i.startsWith("One");});
        System.out.println(res2);

        //noneMatch
        boolean res3=fruits.stream().noneMatch(i->{return i.startsWith("One");});
        System.out.println(res3);








        
    }
}
