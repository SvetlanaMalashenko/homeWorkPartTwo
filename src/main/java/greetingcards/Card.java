package greetingcards;

/**
 * Created by svetlana on 21.08.16
 */
public abstract class Card {
    String name;

   public Card(String name) {
       this.name = name;
   }

    abstract void greeting();
}
