import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App4 {
    //Concatneating
    public static void main(String[] args) {
        
        //Concat ()

        List<String>bird=Arrays.asList( "Parrot","Crow", "Pigeon","Sparrow", "Eagle");
        List<String>animal=Arrays.asList("Lion","Tiger","Elephant","Monkey","Giraffe");
        
        Stream<String>st1=bird.stream();
        Stream<String>st2=animal.stream();

        List<String>res=Stream.concat(st1, st2).collect(Collectors.toList());
        System.out.println(res);

        for(String i:res){
            System.out.println(i);
        }


        

        

        
        
        
    }
    
}
