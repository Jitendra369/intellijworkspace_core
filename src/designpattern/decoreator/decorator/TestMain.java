package designpattern.decoreator.decorator;

import designpattern.decoreator.BasePizza;
import designpattern.decoreator.FarmHouse;
import designpattern.decoreator.Margarita;

public class TestMain {
    public static void main(String[] args) {
        FarmHouse farmHouse = new FarmHouse();
        System.out.println(farmHouse.cost());

        Mushroom mushroom = new Mushroom(new Margarita());
        System.out.println(mushroom.cost());
        System.out.println(" Name of the class "+mushroom.basePizza.getClass().getName());

        BasePizza mushroom1 = new Mushroom(new ExtraChess(new Margarita()));
        System.out.println(mushroom1.cost()+" name of the class "+ mushroom1.getClass().getName());
    }
}
