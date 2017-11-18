public class Main {
        public static void main(String[] args){
        CharacterFactory cf = new CharacterFactory();
        GameManager g = new GameManager();
        Character c1 = cf.createCharacter();
        Character c2 = cf.createCharacter();
        while(c1.getClass().getSimpleName().equals(c2.getClass().getSimpleName())){
            c2 = cf.createCharacter();
        }
        g.fight(c1, c2);
    }
}
