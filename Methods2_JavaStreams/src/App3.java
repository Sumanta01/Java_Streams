import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class App3 {
    //findAny()
    //findFirst()
    public static void main(String[] args) {

        //findAny()
        List<String>list=Arrays.asList("one","two","three","one","two");
        Optional<String>ans= list.stream().findAny();
        System.out.println(ans);//any element present in the stream
        System.out.println(ans.get());

        //findFirst()
        Optional<String>ans2=list.stream().findFirst();
        System.out.println(ans2);
        System.out.println(ans2.get());

        //filtering elements based on condition using findAny() and findFirst()
        Optional<String>ans3=list.stream().filter(i->i.startsWith("t")).findAny();
        System.out.println(ans3);
        System.out.println(ans3.get());




    }
    
}
