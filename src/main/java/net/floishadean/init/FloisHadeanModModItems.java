
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.floishadean.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.floishadean.item.HadeanItem;
import net.floishadean.FloisHadeanModMod;

public class FloisHadeanModModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(FloisHadeanModMod.MODID);
	public static final DeferredItem<Item> HADEAN = REGISTRY.register("hadean", HadeanItem::new);
	public static final DeferredItem<Item> BLACKSAND = block(FloisHadeanModModBlocks.BLACKSAND);
	public static final DeferredItem<Item> LAVACOBBLESTONE = block(FloisHadeanModModBlocks.LAVACOBBLESTONE);
	public static final DeferredItem<Item> LAVAROCK = block(FloisHadeanModModBlocks.LAVAROCK);
	public static final DeferredItem<Item> MOLTEN_LAVACOBBLESTONE = block(FloisHadeanModModBlocks.MOLTEN_LAVACOBBLESTONE);
	public static final DeferredItem<Item> HADEANPORTALBLOCK = block(FloisHadeanModModBlocks.HADEANPORTALBLOCK);
	public static final DeferredItem<Item> METEORITICIRON = block(FloisHadeanModModBlocks.METEORITICIRON);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
