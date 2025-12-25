package net.empereurleon.ackasian.item;

import net.empereurleon.ackasian.AckAsian;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class AckAsianItemGroups {
    public static final ItemGroup ACK_ASIAN_ITEMS_GROUPS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AckAsian.MOD_ID, "ack_asian_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(AckAsianItems.BANH_MI))
                    .displayName(Text.translatable("itemgroup.ackasian.ack_asian_items"))
                    .entries((displayContext, entries) -> {

                        entries.add(AckAsianItems.BANH_MI);
                        entries.add(AckAsianItems.RICE_SEEDS);
                        entries.add(AckAsianItems.RICE);
                        entries.add(AckAsianItems.RICE_NOODLES);
                        entries.add(AckAsianItems.BOWL_OF_UNCOOKED_RICE_NOODLES);
                        entries.add(AckAsianItems.BOWL_OF_COOKED_RICE_NOODLES);
                        entries.add(AckAsianItems.BOWL_OF_UNCOOKED_RICE);
                        entries.add(AckAsianItems.BOWL_OF_COOKED_RICE);
                        entries.add(AckAsianItems.FLOUR);
                        entries.add(AckAsianItems.DOUGH);
                        entries.add(AckAsianItems.NOODLES);
                        entries.add(AckAsianItems.BOWL_OF_UNCOOKED_NOODLES);
                        entries.add(AckAsianItems.BOWL_OF_COOKED_NOODLES);
                        entries.add(AckAsianItems.SAMOSA);
                        entries.add(AckAsianItems.SPRING_ROLLS);
                        entries.add(AckAsianItems.BO_BUN);
                        entries.add(AckAsianItems.COCONUT_CHICKEN_CURRY);
                        entries.add(AckAsianItems.FRIED_RICE);
                        entries.add(AckAsianItems.PAD_THAI);

                    }).build());

    public static void registerItemGroups() {
    }
}
