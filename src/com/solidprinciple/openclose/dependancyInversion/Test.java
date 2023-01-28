package com.solidprinciple.openclose.dependancyInversion;

public class Test {
    public static void main(String[] args) {
        MacBook macBook = new MacBook(new WiredKeyBoard(), new WiredMouse());

//        here we get error, becase it is wiredkey, as we have mention it
//        MacBook macBook1 = new MacBook(new WireLessKwyB(), new WiredMouse());

//         but if we use interface we can user wiredlesskeyboard
//        see in window case

        Window window = new Window(new WiredKeyBoard(), new WiredMouse());
        Window window1 = new Window(new WireLessKwyB(), new WiredMouse());  // this is the difference


    }
}
