import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.event.SwingPropertyChangeSupport;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
       /* ArrayList<Integer>arrlist=new ArrayList<>();
        arrlist.add(43);
        arrlist.add(32);
        arrlist.add(12);
        arrlist.add(54);
        arrlist.add(65);
        System.out.println(arrlist);  */

      
        List<Integer>arrlist=Arrays.asList(21,25,43,65,34,68);
       
        List<Integer>res=new ArrayList<>();
        
        // without using Streams

         /* for(int i:arrlist){
            if(i%2==0){
                res.add(i);
            }
        }
        System.out.println(res);  */

        //Using Streams

        res=arrlist.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(res);

        // Using Stream for Each
        arrlist.stream().filter(i->i%2==0).forEach(n->System.out.println(n));
        arrlist.stream().filter(i->i%2==0).forEach(System.out::println);


        // arrlist.stream().filter(i->i%2==0).forEach(i->res.add(i));
        // System.out.println(res);

        







        

    }
}
