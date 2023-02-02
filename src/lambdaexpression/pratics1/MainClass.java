package lambdaexpression.pratics1;

public class MainClass {
    public static void main(String[] args) {
        Print print = ()-> System.out.println("hello world");
//        print.printMessage();

//        lambda with paramater
        CaluclateArea calArea = (numer1,number2)->{
            return numer1 * number2;
        };

//        System.out.println("area of square " +calArea.calArea(3, 5));

        Runnable runnable = ()-> {
            for (int i = 0; i < 10; i++) {
                System.out.println("getting values from loop "+ i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
