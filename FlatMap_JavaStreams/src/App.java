import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
       
        //map()
        List<Integer>list=Arrays.asList(1,2,3,4,5,6,7);
        List<Integer>ans=list.stream().map(i->i+10).collect(Collectors.toList());
        System.out.println(ans);
        //list.stream().map(i->i+10).forEach(System.out::println);

        //flatMap()
        List<Integer>col1=Arrays.asList(1,2,3);
        List<Integer>col2=Arrays.asList(4,5,6);
        List<Integer>col3=Arrays.asList(7,8,9);
        List<List<Integer>>res=Arrays.asList(col1,col2,col3);
        //System.out.println(res);
       List<Integer>sol= res.stream().flatMap(i->i.stream()).map(i->i+10).collect(Collectors.toList());
       System.out.println(sol);




    
    }
}
