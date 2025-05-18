package org.example.factorypattern;

public class CopperCoin implements Coin{

    static final String description = "This is a Copper Coin";
    @Override
    public String getDescription() {
        return description;
    }
}