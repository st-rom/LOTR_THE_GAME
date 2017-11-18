import java.util.Random;

public class Elf extends Character{
    private KickBehavior weapon = new Bow();
    public Elf(){
        power = 10;
        hp = 10;
    }

    @Override
    public void kick(Character c) {
        String phrase[] = new String[]{"\n'Fear my arrow!'", "\n'For Rivendell!'", "\n'Die you ugly creature!'"};
        System.out.println(phrase[new Random().nextInt(3)]);
        if (c.getPower() < this.getPower()){
            weapon = (c1, c2) -> c2.setHP(c2.getHP());
            weapon.kick(this, c);
        }
        else{
            c.setPower(1);
        }

        if (!c.isAlive()){
            c.death();
        }
    }
}
