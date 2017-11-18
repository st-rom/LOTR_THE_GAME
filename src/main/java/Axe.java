public class Axe implements KickBehavior{
    public void kick(Character c1, Character c2){
        c2.setHP(c1.getPower() + 4);
    }
}
