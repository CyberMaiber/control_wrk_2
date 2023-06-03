package control_wrk_2;

import java.io.IOException;

public class Counter implements AutoCloseable {

    private int counter;
    private boolean isOpen;

    public int getCounter() {
        return counter;
    }

    public int addAnimal(String name, String birthDay, String type, Seed seed)
            throws CloseCounterException, AddingErrorCounterException {
        Boolean isSuccess = false;
        String strMessage = "";
        if (!isOpen) {
            throw new CloseCounterException("Счетчик закрыт.");
        }
        try {
            seed.addPet(name, birthDay, type);
            isSuccess = true;
        } catch (Exception e) {
            strMessage = e.getMessage();
        }
        try {
            seed.addPack(name, birthDay, type);
            isSuccess = true;
        } catch (Exception e) {
            strMessage = strMessage + " " + e.getMessage();
        }
           
        if (isSuccess) {
            counter++;
        } else {
            throw new AddingErrorCounterException("Новое животное не добавлено. " + strMessage);
        }
        return counter;
    }

    public Counter() {
        isOpen = true;
    }

    public Counter(int counter) {
        this.counter = counter;
        isOpen = true;
    }

    @Override
    public void close() {
        isOpen = false;
    }
}

class CloseCounterException extends IOException {
    public CloseCounterException(String message) {
        super(message);
    }
}

class AddingErrorCounterException extends IOException {
    public AddingErrorCounterException(String message) {
        super(message);
    }
}