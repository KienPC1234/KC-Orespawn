
package net.kiencoredev.kcorespawn.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TrextoothItem extends Item {
	public TrextoothItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.RARE));
	}
}
