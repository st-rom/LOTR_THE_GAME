public class Ring implements KickBehavior {
    public void kick(Character c1, Character c2){
        c2.setHP(c2.getHP());
    }
}
