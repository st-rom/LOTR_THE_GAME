public class GameManager{
    public Character fight(Character c1, Character c2){
        System.out.println(c1.getClass().getSimpleName() + "(" + c1.getHP() + ")" + " is fighting against " +
                c2.getClass().getSimpleName() + "(" + c2.getHP() + ")");
        Character x1 = c1;
        Character x2 = c2;
        while (c1.isAlive() && c2.isAlive()){
            int before_hp = x2.getHP();
            x1.kick(x2);
            System.out.println(x1.getClass().getSimpleName() + "(" + x1.getHP() + ")" + " hits " +
                    x2.getClass().getSimpleName() + "(" + x2.getHP() + ")" + " and deals " + (before_hp - x2.getHP()) + " damage");
            if(x1 == c1){
                x1 = c2;
                x2 = c1;
            }
            else{
                x1 = c1;
                x2 = c2;
            }
        }
        if(!c1.isAlive()){
            System.out.println("\n" + c1.getClass().getSimpleName() + " was defeated!\n" + c2.getClass().getSimpleName() +
                    " won!");
            return c2;
        }
        else{
            System.out.println("\n" + c2.getClass().getSimpleName() + " was defeated!\n" + c1.getClass().getSimpleName() +
                    " won!");
            return c1;
        }
    }
}
