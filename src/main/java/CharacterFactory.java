import java.util.Random;

public class CharacterFactory {
    public Character createCharacter(){
        Character heroes[] = new Character[]{new Hobbit(), new Elf(), new Knight(), new Dwarf(), new King()};
        int rand = new Random().nextInt(5);
        return heroes[rand];
    }
}
