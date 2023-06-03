package control_wrk_2;

import java.text.ParseException;

public class PackAnimal extends Animal {
    String type;
    
    public PackAnimal(String name, String birthDay, String type) throws Exception {
        this.name = name;
        try {
            this.birthDay = Animal.parseDate(birthDay);
        } catch (ParseException e) {
            throw new Exception("Формат даты некорректен");
        }
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pack a: " + this.name + " " + this.type + " brth_d " + this.dateToString();
    }
}
