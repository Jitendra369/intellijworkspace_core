package javaeight.methodrefrence.threading;


public class Printing {

//    if method is instance,then wehave to use object : <method-name>
    public void print()  {
        for (int i = 0; i < 10; i++) {
            System.out.println("thread is running" + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
