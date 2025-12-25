package net.empereurleon.ackasian.block;

import net.empereurleon.ackasian.block.custom.RiceCropBlock;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class AckAsianBlocks {
    public static final Block RICE_CROP = registerBlockOnly(
            "rice_crop",
            RiceCropBlock::new,
            AbstractBlock.Settings.create()
                    .nonOpaque()
                    .noCollision()
                    .ticksRandomly()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.CROP)
                    .pistonBehavior(PistonBehavior.DESTROY)
    );

    private static Block register(String name, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        final Identifier identifier = Identifier.of("ackasian", name);
        final RegistryKey<Block> blockKey = RegistryKey.of(RegistryKeys.BLOCK, identifier);

        final Block block = Blocks.register(blockKey, factory, settings);
        Items.register(block);
        return block;
    }

    private static Block registerBlockOnly(String name, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        final Identifier identifier = Identifier.of("ackasian", name);
        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, identifier);

        return Blocks.register(registryKey, factory, settings);
    }

    public static void registerAckAsianBlocks() {
    }
}