package greetingcards;

/**
 * Created by svetlana on 21.08.16
 */
public class Birthday extends Card{

    public Birthday(String name) {
        super(name);
    }

    @Override
   public void greeting() {
        System.out.println("Happy Birthday! " + name);
    }
}
