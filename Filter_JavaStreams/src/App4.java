import java.util.ArrayList;
import java.util.List;

class Product{
    int id ;
    String name;
    double price;

    public Product(int id,String name,double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
}


public class App4 {
    public static void main(String[] args) {

        List<Product>itemList=new ArrayList<>();
        itemList.add(new Product(1,"Laptop",45000));
        itemList.add(new Product(2,"Mobile",25000));
        itemList.add(new Product(3,"TV",35000));
        itemList.add(new Product(4,"AC",55000));
        itemList.add(new Product(5,"Fridge",65000));
        itemList.add(new Product(6,"Washing Machine",15000));
        itemList.add(new Product(7,"Oven",85000));
        itemList.add(new Product(8,"Mixer",95000));


        itemList.stream().filter(i->i.price>50000).forEach(i->System.out.println(i.name+":-"+i.price));



        
    }
}
