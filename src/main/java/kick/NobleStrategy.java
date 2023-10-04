package kick;

import java.util.Random;

import lotr.Character;

public class NobleStrategy implements KickStrategy {
    private static Random random = new Random();
    @Override
    public void kick(Character character, Character opponent) {
        opponent.setHp(opponent.getHp() - random.nextInt(character.getPower()+1));
    }    
}
