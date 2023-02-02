package javaeight.function_mulinterface;

interface I{
    default void m1(){
        System.out.println("m1 method of interface I");
    }
}

interface  J{
    default void m1(){
        System.out.println("m1 method of interface J");
    }
}
public class Test implements I, J{
    public static void main(String[] args) {
        Test test = new Test();
       test.m1();
    }

    @Override
    public void m1() {
        I.super.m1();
    }

//    this is the class m1() method
//     it override the interface default method

}
