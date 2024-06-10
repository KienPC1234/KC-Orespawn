
package net.kiencoredev.kcorespawn.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MothScaleItem extends Item {
	public MothScaleItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
