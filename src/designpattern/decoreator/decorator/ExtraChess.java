package designpattern.decoreator.decorator;

import designpattern.decoreator.BasePizza;

public class ExtraChess extends ToppingDecorator {

    BasePizza basePizza;

    public ExtraChess(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 10 ;
    }
}
