package core.basesyntax.strategy.handlers;

import core.basesyntax.FruitTransaction;
import core.basesyntax.db.FruitStorage;

public class ReturnOperationHandlers implements OperationHandler {
    @Override
    public void handle(FruitTransaction transaction) {
        String fruit = transaction.getFruit();
        Integer quantity = transaction.getQuantity();
        Integer newQuantity = FruitStorage.storage.get(fruit) + quantity;
        FruitStorage.storage.put(fruit, newQuantity);
    }
}
