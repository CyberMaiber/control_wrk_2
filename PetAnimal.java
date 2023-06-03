package control_wrk_2;

import java.text.ParseException;

public class PetAnimal extends Animal {
    String type;
    // @Override
    // Animal creater(Animal anml) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'creater'");
    // }
    public PetAnimal(String name,String birthDay,String type) throws Exception {
        this.name = name;
        try {
            this.birthDay = Animal.parseDate(birthDay);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        this.type = type;
    }
    
    public addPet (String name,String birthDay,String type) {
        
    }
    
     


  

    
}