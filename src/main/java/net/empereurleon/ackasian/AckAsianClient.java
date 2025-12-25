package net.empereurleon.ackasian;

import net.empereurleon.ackasian.block.AckAsianBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.render.BlockRenderLayer;

@Environment(EnvType.CLIENT)
public class AckAsianClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.putBlock(AckAsianBlocks.RICE_CROP, BlockRenderLayer.CUTOUT);
    }
}
