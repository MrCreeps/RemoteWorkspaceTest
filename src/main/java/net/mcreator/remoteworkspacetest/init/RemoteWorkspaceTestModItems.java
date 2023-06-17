
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.remoteworkspacetest.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.remoteworkspacetest.item.CoolItemItem;
import net.mcreator.remoteworkspacetest.RemoteWorkspaceTestMod;

public class RemoteWorkspaceTestModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RemoteWorkspaceTestMod.MODID);
	public static final RegistryObject<Item> COOL_ITEM = REGISTRY.register("cool_item", () -> new CoolItemItem());
}
