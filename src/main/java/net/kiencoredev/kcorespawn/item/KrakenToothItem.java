
package net.kiencoredev.kcorespawn.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class KrakenToothItem extends Item {
	public KrakenToothItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
