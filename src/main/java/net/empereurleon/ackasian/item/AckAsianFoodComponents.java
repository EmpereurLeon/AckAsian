package net.empereurleon.ackasian.item;

import net.minecraft.component.type.FoodComponent;

public class AckAsianFoodComponents {
    public static final FoodComponent BANH_MI = new FoodComponent.Builder()
            .nutrition(8)
            .saturationModifier(1.2f)
            .build();
    public static final FoodComponent SAMOSA = new FoodComponent.Builder()
            .nutrition(3)
            .saturationModifier(0.2f)
            .build();
    public static final FoodComponent SPRING_ROLLS = new FoodComponent.Builder()
            .nutrition(3)
            .saturationModifier(0.4f)
            .build();
    public static final FoodComponent BO_BUN = new FoodComponent.Builder()
            .nutrition(10)
            .saturationModifier(1.2f)
            .build();
    public static final FoodComponent COCONUT_CHICKEN_CURRY = new FoodComponent.Builder()
            .nutrition(10)
            .saturationModifier(1.2f)
            .build();
    public static final FoodComponent FRIED_RICE = new FoodComponent.Builder()
            .nutrition(0)
            .saturationModifier(0.0f)
            .build();
    public static final FoodComponent PAD_THAI = new FoodComponent.Builder()
            .nutrition(10)
            .saturationModifier(1.2f)
            .build();
    public static final FoodComponent BOWL_OF_UNCOOKED_RICE = createStew(2).build();
    public static final FoodComponent BOWL_OF_UNCOOKED_RICE_NOODLES = createStew(2).build();
    public static final FoodComponent BOWL_OF_COOKED_RICE = createStew(6).build();
    public static final FoodComponent BOWL_OF_COOKED_RICE_NOODLES = createStew(6).build();
    public static final FoodComponent BOWL_OF_UNCOOKED_NOODLES = createStew(2).build();
    public static final FoodComponent BOWL_OF_COOKED_NOODLES = createStew(6).build();

    private static FoodComponent.Builder createStew(int nutrition) {
        return new FoodComponent.Builder().nutrition(nutrition).saturationModifier(0.6F);
    }
}
