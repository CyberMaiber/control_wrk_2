package control_wrk_2;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Seed ourSeed = new Seed();
        try (Counter counter1 = new Counter(ourSeed.count)){
            counter1.addAnimal("Barsik", "12.12.2018", "cat", ourSeed);
        } catch (CloseCounterException e) {
            System.out.println(e.getMessage());
        } catch (AddingErrorCounterException e) {
            System.out.println(e.getMessage());
        }
        ourSeed.printSeed();
    }

}