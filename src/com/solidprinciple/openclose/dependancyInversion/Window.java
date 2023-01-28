package com.solidprinciple.openclose.dependancyInversion;

public class Window {
    private final KeyBoard keyBoard;
    private final Mouse mouse;



    public Window(KeyBoard keyBoard, Mouse mouse) {
        this.keyBoard = keyBoard;
        this.mouse = mouse;
    }

    public KeyBoard getKeyBoard() {
        return keyBoard;
    }

    public Mouse getMouse() {
        return mouse;
    }
}
