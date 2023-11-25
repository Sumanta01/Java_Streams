import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class App3 {
    public static void main(String[] args) {
        //reduce()
        List<String>name=Arrays.asList("S","E","E","K","1","9","9");
        Optional<String>res= name.stream().reduce((i,j)->{ return i+j ;});
        System.out.println(res.get());
        Optional<String>res2=name.stream().reduce((i,j)->{return j+i ;});
        System.out.println(res2.get());
        

    }
}
