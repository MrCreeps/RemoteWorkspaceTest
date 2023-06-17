
package net.mcreator.remoteworkspacetest.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CoolItemItem extends Item {
	public CoolItemItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
