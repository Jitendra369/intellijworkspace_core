package lambdaexpression.basic;

@FunctionalInterface
public interface Operator<T> {
    T process(T a, T b);
}
