package lotr;

import kick.NobleStrategy;

public class Knight extends Noble {

    public Knight() {
        super(2, 12, new NobleStrategy());
    }  
}
