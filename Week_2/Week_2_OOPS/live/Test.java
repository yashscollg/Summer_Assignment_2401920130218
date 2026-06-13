package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {

    public static void main(String[] args) {

        // a. Create Veena object and call play()
        Veena v = new Veena();
        v.play();

        // b. Create Saxophone object and call play()
        Saxophone s = new Saxophone();
        s.play();

        // c. Use Playable reference
        Playable p;

        p = v;
        p.play();

        p = s;
        p.play();
    }
}