
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.remoteworkspacetest.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.remoteworkspacetest.block.CoolBlockBlock;
import net.mcreator.remoteworkspacetest.RemoteWorkspaceTestMod;

public class RemoteWorkspaceTestModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RemoteWorkspaceTestMod.MODID);
	public static final RegistryObject<Block> COOL_BLOCK = REGISTRY.register("cool_block", () -> new CoolBlockBlock());
}
