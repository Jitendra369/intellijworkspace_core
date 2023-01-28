package generic.secondexample;

public class Test {
    public static void main(String[] args) {
        MyGenericClass<String> genClass = new MyGenericClass<>("what");
        genClass.displayObjectDetails();
    }
}
