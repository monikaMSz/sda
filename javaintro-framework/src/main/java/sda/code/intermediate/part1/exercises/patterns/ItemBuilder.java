package sda.code.intermediate.part1.exercises.patterns;

import sda.code.intermediate.part1.exercises.data.Item;

/**
 * @see ProductBuilder
 */
public class ItemBuilder extends ProductBuilder<ItemBuilder, Item> {
    private Double weight;

    public ItemBuilder withWeight(Double weight) {
        this.weight=weight;
        return this;
    }

    @Override
    protected void validate() {
        super.validate();
        if(weight==null|| weight<0.0){
            throw new InvalidBuilderState("Weight must be set and cannot be less than zero");
        }
    }

    @Override
    public Item build() {
        prepare();
        validate();
        return new Item(name,price,weight);
    }

}
