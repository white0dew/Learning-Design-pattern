package com.whitedew.memento;

/**
 * @Author whitedew
 * @Date 2021/6/21 23:55
 */
public class CareTaker {

    private SavaLoadMemento savaLoadMemento;

    public SavaLoadMemento loadGame() {
        try {
            if (savaLoadMemento != null)
                return savaLoadMemento;
            else
                throw new Exception();
        } catch (Exception ignored) {
            System.out.println("The saveFile is missed!");
        }
        return new SavaLoadMemento(100, 50, 10, 5);
    }

    public void saveGame(SavaLoadMemento memento) {
        this.savaLoadMemento = memento;
    }
}
