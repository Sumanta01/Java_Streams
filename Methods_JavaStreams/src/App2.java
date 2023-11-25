import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class App2 {
    public static void main(String[] args) {
        
        //count()
        List<Integer>number=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        long ans=number.stream().filter(i->i%2==0).count();
        System.out.println(ans);
        // List<Integer>ans1=number.stream().filter(i->i%2==0).collect(Collectors.toList());
        // System.out.println(ans1);

        //min()
        Optional<Integer>min =number.stream().min((i,j)->{return i.compareTo(j);});
        System.out.println(min.get());

        //max()
       Optional<Integer>max= number.stream().max((i,j)->{return i.compareTo(j);});
       System.out.println(max.get());




    }
}
