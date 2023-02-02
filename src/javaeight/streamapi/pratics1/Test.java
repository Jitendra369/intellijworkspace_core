package javaeight.streamapi.pratics1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1,"headfone",1000));
        productList.add(new Product(1,"mice",1500));
        productList.add(new Product(1,"speaker",1800));
        productList.add(new Product(1,"messager",1200));

        /*for (Product product : productList) {
            System.out.println(product);
        }*/

//        regular method to filter the object

/*
        List<Product> priceHook = new ArrayList<>();

        for (Product product: productList){
            if (product.getPrice()>1300){
                priceHook.add(product);
            }
        }
*/


//        printint the pricehook list
/*        System.out.println("produce below 1300");
        for (Product product: priceHook){
            System.out.println(product.getName());
        }*/

        //        cool way
        List<Product> collect = productList.stream().filter(product -> product.getPrice() > 1000).collect(Collectors.toList());
        collect.forEach(product -> System.out.println(product));
    }


}
