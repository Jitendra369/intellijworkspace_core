package javaeight.methodrefrence.threading;

import com.innerclass.Print;

public class Test {
    public static void main(String[] args) {
        Printing printing = new Printing();
        Runnable runnable = printing::print;
        runnable.run();
//        Thread thread = new Thread(new Printing()::print);
//        thread.start();
    }
}
