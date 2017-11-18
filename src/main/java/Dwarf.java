import java.util.Random;

public class Dwarf extends Character{
    private KickBehavior weapon = new Axe();
    private static final int MAX_POWER = 5;
    private static final int MIN_POWER = 1;
    private static final int MAX_HP = 30;
    private static final int MIN_HP = 15;
    private Random rand = new Random();

    public Dwarf(){
        hp = rand.nextInt(MAX_HP - MIN_HP) + MIN_HP;
    }

    @Override
    public void kick(Character c) {
        String phrase[] = new String[]{"\n'This mighty axe will break your skull!'",
                "\n'Aaaarrrr'", "\n'Moria will be reborn!'"};
        System.out.println(phrase[new Random().nextInt(3)]);
        power = rand.nextInt(MAX_POWER - MIN_POWER) + MIN_POWER;
        weapon.kick(this, c);
        if (!c.isAlive()){
            c.death();
        }
    }
}

