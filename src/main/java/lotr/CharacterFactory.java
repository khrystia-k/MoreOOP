package lotr;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.reflections.Reflections;
import lombok.SneakyThrows;
import lotr.Character;

public class CharacterFactory {
    @SneakyThrows
    public static  Character createCharacter(){
        Reflections reflections = new Reflections("lotr");
        Set<Class<? extends Character>> characters = (Set<Class<? extends Character>>) reflections.getSubTypesOf(Character.class);
        List<Class<? extends Character>> characterList = new ArrayList<>(characters);
        characterList.removeIf(characterClass -> characterClass.getName().equals("lotr.Noble"));
        int randomIndex = new Random().nextInt(characterList.size());
        Class<? extends Character> characterClass = characterList.get(randomIndex);
        return characterClass.getDeclaredConstructor().newInstance();
    }       
}


