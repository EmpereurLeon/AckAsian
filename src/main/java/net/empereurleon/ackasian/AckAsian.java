package net.empereurleon.ackasian;

import net.empereurleon.ackasian.block.AckAsianBlocks;
import net.empereurleon.ackasian.item.AckAsianItemGroups;
import net.empereurleon.ackasian.item.AckAsianItems;
import net.empereurleon.ackasian.util.AckAsianLootTableModifiers;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AckAsian implements ModInitializer {
	public static final String MOD_ID = "ackasian";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		AckAsianItemGroups.registerItemGroups();
		AckAsianItems.registerItems();
		AckAsianBlocks.registerAckAsianBlocks();
		AckAsianLootTableModifiers.modifyLootTables();
	}
}