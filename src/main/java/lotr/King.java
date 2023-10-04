package lotr;

import kick.NobleStrategy;

public class King extends Noble {

    public King() {
        super(5, 15, new NobleStrategy());
    }  
}
