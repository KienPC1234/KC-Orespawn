
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.kiencoredev.kcorespawn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.kiencoredev.kcorespawn.item.VortexEyeItem;
import net.kiencoredev.kcorespawn.item.UraniumingotItem;
import net.kiencoredev.kcorespawn.item.UltimateSwordItem;
import net.kiencoredev.kcorespawn.item.TrextoothItem;
import net.kiencoredev.kcorespawn.item.NightmareScaleItem;
import net.kiencoredev.kcorespawn.item.MothScaleItem;
import net.kiencoredev.kcorespawn.item.KrakenToothItem;
import net.kiencoredev.kcorespawn.item.CaterKillerJawItem;
import net.kiencoredev.kcorespawn.item.AmethystItem;
import net.kiencoredev.kcorespawn.KcOrespawnMod;

public class KcOrespawnModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, KcOrespawnMod.MODID);
	public static final RegistryObject<Item> ULTIMATE_SWORD = REGISTRY.register("ultimate_sword", () -> new UltimateSwordItem());
	public static final RegistryObject<Item> URANIUMINGOT = REGISTRY.register("uraniumingot", () -> new UraniumingotItem());
	public static final RegistryObject<Item> TREXTOOTH = REGISTRY.register("trextooth", () -> new TrextoothItem());
	public static final RegistryObject<Item> AMETHYST = REGISTRY.register("amethyst", () -> new AmethystItem());
	public static final RegistryObject<Item> MOTH_SCALE = REGISTRY.register("moth_scale", () -> new MothScaleItem());
	public static final RegistryObject<Item> NIGHTMARE_SCALE = REGISTRY.register("nightmare_scale", () -> new NightmareScaleItem());
	public static final RegistryObject<Item> CATER_KILLER_JAW = REGISTRY.register("cater_killer_jaw", () -> new CaterKillerJawItem());
	public static final RegistryObject<Item> VORTEX_EYE = REGISTRY.register("vortex_eye", () -> new VortexEyeItem());
	public static final RegistryObject<Item> KRAKEN_TOOTH = REGISTRY.register("kraken_tooth", () -> new KrakenToothItem());
	// Start of user code block custom items
	// End of user code block custom items
}
