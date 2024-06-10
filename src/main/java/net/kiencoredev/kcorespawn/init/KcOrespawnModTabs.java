
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.kiencoredev.kcorespawn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.kiencoredev.kcorespawn.KcOrespawnMod;

public class KcOrespawnModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, KcOrespawnMod.MODID);
	public static final RegistryObject<CreativeModeTab> MOD_TAB = REGISTRY.register("mod_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.kc_orespawn.mod_tab")).icon(() -> new ItemStack(KcOrespawnModItems.ULTIMATE_SWORD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(KcOrespawnModItems.ULTIMATE_SWORD.get());
				tabData.accept(KcOrespawnModItems.URANIUMINGOT.get());
				tabData.accept(KcOrespawnModItems.TREXTOOTH.get());
				tabData.accept(KcOrespawnModItems.AMETHYST.get());
				tabData.accept(KcOrespawnModItems.MOTH_SCALE.get());
				tabData.accept(KcOrespawnModItems.NIGHTMARE_SCALE.get());
				tabData.accept(KcOrespawnModItems.CATER_KILLER_JAW.get());
				tabData.accept(KcOrespawnModItems.VORTEX_EYE.get());
				tabData.accept(KcOrespawnModItems.KRAKEN_TOOTH.get());
			}).withSearchBar().build());
}
