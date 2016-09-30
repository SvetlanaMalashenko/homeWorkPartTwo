package greetingcards;

/**
 * Created by svetlana on 21.08.16
 */
public class TestCard {
    public static void main(String[] args) {

        Holiday holidayCard = new Holiday("Kate");
        Valentine valentineCard = new Valentine("Mari");
        Birthday birthdayCard = new Birthday("Liza");

        holidayCard.greeting();
        valentineCard.greeting();
        birthdayCard.greeting();
    }
}
