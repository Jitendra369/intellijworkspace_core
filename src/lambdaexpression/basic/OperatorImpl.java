package lambdaexpression.basic;

public class OperatorImpl implements Operator<Integer>{

    @Override
    public Integer process(Integer a, Integer b) {
        return a+b;
    }
}
