
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.remoteworkspacetest.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.remoteworkspacetest.item.CoolItemItem;
import net.mcreator.remoteworkspacetest.RemoteWorkspaceTestMod;

public class RemoteWorkspaceTestModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RemoteWorkspaceTestMod.MODID);
	public static final RegistryObject<Item> COOL_BLOCK = block(RemoteWorkspaceTestModBlocks.COOL_BLOCK);
	public static final RegistryObject<Item> COOL_ITEM = REGISTRY.register("cool_item", () -> new CoolItemItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
