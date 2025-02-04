
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.floishadean.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.floishadean.FloisHadeanModMod;

public class FloisHadeanModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FloisHadeanModMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> HADEANTAB = REGISTRY.register("hadeantab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.flois_hadean_mod.hadeantab")).icon(() -> new ItemStack(FloisHadeanModModItems.HADEAN.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FloisHadeanModModItems.HADEAN.get());
				tabData.accept(FloisHadeanModModBlocks.BLACKSAND.get().asItem());
				tabData.accept(FloisHadeanModModBlocks.LAVACOBBLESTONE.get().asItem());
				tabData.accept(FloisHadeanModModBlocks.LAVAROCK.get().asItem());
				tabData.accept(FloisHadeanModModBlocks.MOLTEN_LAVACOBBLESTONE.get().asItem());
				tabData.accept(FloisHadeanModModBlocks.HADEANPORTALBLOCK.get().asItem());
				tabData.accept(FloisHadeanModModBlocks.METEORITICIRON.get().asItem());
				tabData.accept(FloisHadeanModModBlocks.ZIRCONORE.get().asItem());
				tabData.accept(FloisHadeanModModItems.ZIRCONITEM.get());
				tabData.accept(FloisHadeanModModBlocks.ZIRCONBLOCK.get().asItem());
				tabData.accept(FloisHadeanModModBlocks.LIGHT_ASH.get().asItem());
				tabData.accept(FloisHadeanModModBlocks.ASH.get().asItem());
				tabData.accept(FloisHadeanModModBlocks.DARK_ASH.get().asItem());
				tabData.accept(FloisHadeanModModBlocks.ARCHEANPORTALBLOCK.get().asItem());
				tabData.accept(FloisHadeanModModItems.ARCHEAN.get());
				tabData.accept(FloisHadeanModModBlocks.RIPPLEDBLACKSAND.get().asItem());
				tabData.accept(FloisHadeanModModBlocks.ARCHEAN_MICROBIALMAT.get().asItem());
				tabData.accept(FloisHadeanModModBlocks.STROMATOLITE.get().asItem());
				tabData.accept(FloisHadeanModModBlocks.PROTEROZOICPORTALBLOCK.get().asItem());
				tabData.accept(FloisHadeanModModItems.PROTEROZOIC.get());
				tabData.accept(FloisHadeanModModBlocks.IRONSAND.get().asItem());
				tabData.accept(FloisHadeanModModBlocks.RIPPLEDIRONSAND.get().asItem());
				tabData.accept(FloisHadeanModModBlocks.MICROBIALMATT.get().asItem());
				tabData.accept(FloisHadeanModModBlocks.TAWUIA.get().asItem());
				tabData.accept(FloisHadeanModModBlocks.ANCIENTMUD.get().asItem());
			}).build());
}
