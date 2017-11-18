import java.util.Random;

public class King extends Character{
    private KickBehavior weapon = new Sword();
    private static final int MAX_POWER = 15;
    private static final int MIN_POWER = 5;
    private static final int MAX_HP = 15;
    private static final int MIN_HP = 5;
    private static Random rand = new Random();

    public King() {
        hp = rand.nextInt(MAX_HP - MIN_HP) + MIN_HP;
    }

    @Override
    public void kick(Character c) {
        String phrase[] = new String[]{"\n'My sword can cut you in half!'", "\n'This is your end'", "\n'Never surrender!'",
                "\n'For the throne!'"};
        System.out.println(phrase[new Random().nextInt(4)]);
        power = rand.nextInt(MAX_POWER - MIN_POWER) + MIN_POWER;
        weapon.kick(this, c);
        if (!c.isAlive()){
            c.death();
        }
    }
}
