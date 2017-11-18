import java.util.Random;

public class Hobbit extends Character{
    private KickBehavior weapon = new Ring();
    public Hobbit(){
        power = 0;
        hp = 3;
    }

    @Override
    public void kick(Character c) {
        Random rand = new Random();
        if(rand.nextInt(5) == 0){
            System.out.println("\nHobbit uses the Ring of Power to kill his enemy!");
            weapon.kick(this, c);
        }
        else {
            toCry();
        }
        if (!c.isAlive()){
            c.death();
        }
    }

    private void toCry(){
        System.out.println("\nHobbit starts crying while trying to hit his enemy");

    }
}
