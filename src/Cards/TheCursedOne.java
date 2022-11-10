package Cards;

import fileio.CardInput;

import java.util.ArrayList;

public class TheCursedOne extends Card {
    public TheCursedOne(int mana, int attackDamage, int health, String description, ArrayList<String> colors, String name) {
        super(mana, attackDamage, health, description, colors, name);
    }

    public TheCursedOne(CardInput card)
    {
        super(card.getMana(), card.getAttackDamage(), card.getHealth(), card.getDescription(), card.getColors(),
                card.getName());
    }

    /**
     * swap between life and attack on a enemy minion
     */
    public void shapeshift() {

    }
}