import java.util.Random;

public class Knight extends Character{
    private KickBehavior weapon = new Sword();
    private static final int MAX_POWER = 12;
    private static final int MIN_POWER = 2;
    private static final int MAX_HP = 21;
    private static final int MIN_HP = 2;
    private Random rand = new Random();

    public Knight(){
        hp = rand.nextInt(MAX_HP - MIN_HP) + MIN_HP;
    }

    @Override
    public void kick(Character c) {
        String phrase[] = new String[]{"\n'My sword can cut you in half!'", "\n'I never miss'", "\n'Never surrender!'",
                "\n'For the king!'"};
        System.out.println(phrase[new Random().nextInt(4)]);
        power = rand.nextInt(MAX_POWER - MIN_POWER) + MIN_POWER;
        weapon.kick(this, c);
        if (!c.isAlive()){
            c.death();
        }
    }
}
