package hippodrome;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Hippodrome {
    private static List<Horse> horses = null;
    static Hippodrome game;
    
    public List<Horse> getHorses() {
        return horses;
    }
    
    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }
    
    public void run() throws Exception {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }
    
    public void move() {
        
        horses.get(0).move();
        horses.get(1).move();
        horses.get(2).move();
        
    }
    
    public void print() {
        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).print();
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println("");
        }
    }
    
    public Horse getWinner() {
        return horses.stream().max(Comparator.comparingDouble(Horse::getDistance)).get();
    }
    
    public void printWinner() {
        
        System.out.println("Winner is " + getWinner().getName() + "!");
    }
    
    public static void main (String[] args) throws Exception {
        
        game = new Hippodrome(new ArrayList<Horse>());
        game.getHorses().add(new Horse("One", 3, 0));
        game.getHorses().add(new Horse("Two", 3, 0));
        game.getHorses().add(new Horse("Three", 3, 0));
        game.run();
        game.printWinner();
    }
}
