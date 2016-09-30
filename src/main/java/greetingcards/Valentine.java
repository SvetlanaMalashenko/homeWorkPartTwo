package greetingcards;

/**
 * Created by svetlana on 21.08.16
 */
public class Valentine extends Card {

    public Valentine(String name) {
        super(name);
    }

    @Override
    public void greeting() {
        System.out.println("Happy Valentine Day!!! " + name);
    }
}
