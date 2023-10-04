package kick;

import lotr.Character;

public class ElfStrategy implements KickStrategy {

    @Override
    public void kick(Character character, Character opponent) {
        if (opponent.getPower() >= character.getPower()){
            character.setPower(character.getPower() - 1);
        }
        else{
            opponent.setHp(0);
        }
    }
    
}
