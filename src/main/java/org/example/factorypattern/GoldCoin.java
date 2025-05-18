package org.example.factorypattern;

public class GoldCoin implements Coin{

    static final String description = "This is a Gold Coin";
    @Override
    public String getDescription() {
        return description;
    }
}