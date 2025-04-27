package model;

import enums.BreadRollType;

public class DeluxeBurger extends Hamburger{
    private Drink drink;
    private Cips cips;

    public DeluxeBurger(Drink drink, Cips cips) {
        super("Deluxe Burger", "Double", 19.10, BreadRollType.DOUBLE_BURGER);
        this.drink = drink;
        this.cips = cips;
    }

    @Override
    public void addAddition(String name, double price) {
        System.out.println("\n Deluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void itemizeHamburger() {
        StringBuilder builder = new StringBuilder();
        builder.append("DRINK: "+ drink.getDrinkType() + "\n");
        builder.append("CIPS: " + cips.getCipsType() + "\n");
        System.out.println(builder);
        super.itemizeHamburger();
    }

}
