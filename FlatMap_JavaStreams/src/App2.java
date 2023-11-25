import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App2 {
    public static void main(String[] args) {
        List<String>team1=Arrays.asList("Surya","Shami","Jadeja");
        List<String>team2=Arrays.asList("Rohit","Virat","Siraj");
        List<String>team3=Arrays.asList("Gill","Shreyas","Bumrah");

        List<List<String>>teams=Arrays.asList(team1,team2,team3);
        System.out.println(teams);
        //without using flatMap()
        /* 
        for(List<String> i:teams){
            for(String j:i){
                System.out.println(j);
            }
        }  */

        //using flatMap()
       List<String>name= teams.stream().flatMap(i->i.stream()).map(i->i.toUpperCase()).collect(Collectors.toList());
       System.out.println(name);

    }
    
}
