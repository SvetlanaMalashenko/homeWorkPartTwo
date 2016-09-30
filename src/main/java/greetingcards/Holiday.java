package greetingcards;

/**
 * Created by svetlana on 21.08.16
 */
public class Holiday extends Card{

    public Holiday(String name) {
        super(name);
    }

    @Override
    void greeting() {
        System.out.println("Happy new Year! " + name);
    }
}
