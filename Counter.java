package control_wrk_2;

import java.io.IOException;

public class Counter implements AutoCloseable{

    private int counter;
    private boolean isOpen;

    public int getCounter() {
        return counter;
    }

    public int add() throws CloseCounterException{
        if (!isOpen){
            throw new CloseCounterException("Счетчик закрыт.");
        }
        return ++counter;
    }

    public Counter(){
        isOpen = true;
    }
    public Counter(int counter){
        this.counter = counter;
        isOpen = true;
    }

    public void closeCounter(){
        isOpen = false;
    }

    @Override
    public void close() {
        closeCounter();
    }
}

class CloseCounterException extends IOException{
    public CloseCounterException(String message) {
        super(message);
    }
}