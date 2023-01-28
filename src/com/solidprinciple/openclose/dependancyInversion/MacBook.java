package com.solidprinciple.openclose.dependancyInversion;

public class MacBook {
    private WiredKeyBoard wiredKeyBoard;
    private WiredMouse wiredMouse;

    public MacBook(WiredKeyBoard wiredKeyBoard, WiredMouse wiredMouse) {
        this.wiredKeyBoard = wiredKeyBoard;
        this.wiredMouse = wiredMouse;
    }

    public MacBook() {
    }

    public WiredKeyBoard getWiredKeyBoard() {
        return wiredKeyBoard;
    }

    public WiredMouse getWiredMouse() {
        return wiredMouse;
    }
}


