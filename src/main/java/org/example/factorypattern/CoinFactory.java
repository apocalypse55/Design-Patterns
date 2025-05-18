package org.example.factorypattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CoinFactory {

    private CoinFactory() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static Coin createCoin(CoinType type) {
        return type.getCoinSupplier().get();
    }

    public static void main(String[] args) {
        log.info("The alchemist begins his work...");
        Coin copperCoin = CoinFactory.createCoin(CoinType.COPPER);
        log.info(copperCoin.getDescription());
        Coin goldCoin = CoinFactory.createCoin(CoinType.GOLD);
        log.info(goldCoin.getDescription());
    }
}