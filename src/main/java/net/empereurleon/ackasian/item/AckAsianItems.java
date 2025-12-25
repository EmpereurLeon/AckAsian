package net.empereurleon.ackasian.item;
import net.empereurleon.ackasian.AckAsian;
import net.empereurleon.ackasian.block.AckAsianBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

import static net.minecraft.item.Items.BOWL;

public class AckAsianItems {
    public static final Item BANH_MI = register("banh_mi", Item::new, new Item.Settings().food(AckAsianFoodComponents.BANH_MI));
    public static final Item RICE_SEEDS = register("rice_seeds", settings -> new BlockItem(AckAsianBlocks.RICE_CROP, settings), new Item.Settings().useItemPrefixedTranslationKey());
    public static final Item RICE = register("rice", Item::new, new Item.Settings());
    public static final Item RICE_NOODLES = register("rice_noodles", Item::new, new Item.Settings());
    public static final Item BOWL_OF_UNCOOKED_RICE_NOODLES = register("bowl_of_uncooked_rice_noodles", Item::new, new Item.Settings().food(AckAsianFoodComponents.BOWL_OF_UNCOOKED_RICE_NOODLES, AckAsianConsumableComponents.BOWL_OF_UNCOOKED_RICE_NOODLES).useRemainder(BOWL));
    public static final Item BOWL_OF_COOKED_RICE_NOODLES = register("bowl_of_cooked_rice_noodles", Item::new, new Item.Settings().food(AckAsianFoodComponents.BOWL_OF_COOKED_RICE_NOODLES).useRemainder(BOWL));
    public static final Item BOWL_OF_UNCOOKED_RICE = register("bowl_of_uncooked_rice", Item::new, new Item.Settings().food(AckAsianFoodComponents.BOWL_OF_UNCOOKED_RICE, AckAsianConsumableComponents.BOWL_OF_UNCOOKED_RICE).useRemainder(BOWL));
    public static final Item BOWL_OF_COOKED_RICE = register("bowl_of_cooked_rice", Item::new, new Item.Settings().food(AckAsianFoodComponents.BOWL_OF_COOKED_RICE).useRemainder(BOWL));
    public static final Item FLOUR = register("flour", Item::new, new Item.Settings());
    public static final Item DOUGH = register("dough", Item::new, new Item.Settings());
    public static final Item NOODLES = register("noodles", Item::new, new Item.Settings());
    public static final Item BOWL_OF_UNCOOKED_NOODLES = register("bowl_of_uncooked_noodles", Item::new, new Item.Settings().food(AckAsianFoodComponents.BOWL_OF_UNCOOKED_NOODLES, AckAsianConsumableComponents.BOWL_OF_UNCOOKED_NOODLES).useRemainder(BOWL));
    public static final Item BOWL_OF_COOKED_NOODLES = register("bowl_of_cooked_noodles", Item::new, new Item.Settings().food(AckAsianFoodComponents.BOWL_OF_COOKED_NOODLES).useRemainder(BOWL));
    public static final Item SAMOSA = register("samosa", Item::new, new Item.Settings().food(AckAsianFoodComponents.SAMOSA));
    public static final Item SPRING_ROLLS = register("spring_rolls", Item::new, new Item.Settings().food(AckAsianFoodComponents.SPRING_ROLLS));
    public static final Item BO_BUN = register("bo_bun", Item::new, new Item.Settings().food(AckAsianFoodComponents.BO_BUN, AckAsianConsumableComponents.BO_BUN).useRemainder(BOWL));
    public static final Item COCONUT_CHICKEN_CURRY = register("coconut_chicken_curry", Item::new, new Item.Settings().food(AckAsianFoodComponents.COCONUT_CHICKEN_CURRY, AckAsianConsumableComponents.COCONUT_CHICKEN_CURRY).useRemainder(BOWL));
    public static final Item FRIED_RICE = register("fried_rice", Item::new, new Item.Settings().food(AckAsianFoodComponents.FRIED_RICE, AckAsianConsumableComponents.FRIED_RICE).useRemainder(BOWL));
    public static final Item PAD_THAI = register("pad_thai", Item::new, new Item.Settings().food(AckAsianFoodComponents.PAD_THAI, AckAsianConsumableComponents.PAD_THAI).useRemainder(BOWL));

    public static Item register(String name, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AckAsian.MOD_ID, name));
        return Items.register(itemKey, factory, settings);
    }

    public static void registerItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
           entries.add(BANH_MI);
           entries.add(RICE);
           entries.add(RICE_NOODLES);
           entries.add(BOWL_OF_UNCOOKED_RICE_NOODLES);
           entries.add(BOWL_OF_COOKED_RICE_NOODLES);
           entries.add(BOWL_OF_UNCOOKED_RICE);
           entries.add(BOWL_OF_COOKED_RICE);
           entries.add(FLOUR);
           entries.add(DOUGH);
           entries.add(NOODLES);
           entries.add(BOWL_OF_UNCOOKED_NOODLES);
           entries.add(BOWL_OF_COOKED_NOODLES);
           entries.add(SAMOSA);
           entries.add(SPRING_ROLLS);
           entries.add(BO_BUN);
           entries.add(COCONUT_CHICKEN_CURRY);
           entries.add(FRIED_RICE);
           entries.add(PAD_THAI);
        });
    }
}
