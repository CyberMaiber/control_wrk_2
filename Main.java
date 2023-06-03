package control_wrk_2;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Seed ourSeed = new Seed();
        try (Counter counter1 = new Counter(ourSeed.count)){ //сделано через .опу чтоб прикрутить try-with-resourses
            counter1.addAnimal("Barsik", "12.12.2018", "cat", ourSeed); //добавляем котика
            //counter1.addAnimal("Barsik", "1212.2018", "cat", ourSeed); //ошибка в дате
            //counter1.addAnimal("Barsik", "12.12.2018", "cat1", ourSeed); // ошибка в типе
            counter1.addAnimal("Ia", "12.12.2018", "donkey", ourSeed); //добавляем ослика
        } catch (CloseCounterException e) {
            System.out.println(e.getMessage());
        } catch (AddingErrorCounterException e) {
            System.out.println(e.getMessage());
        }
        ourSeed.printSeed(); //распечатываем зверинец
    }

}