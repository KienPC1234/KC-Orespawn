
package net.kiencoredev.kcorespawn.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NightmareScaleItem extends Item {
	public NightmareScaleItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON));
	}
}
