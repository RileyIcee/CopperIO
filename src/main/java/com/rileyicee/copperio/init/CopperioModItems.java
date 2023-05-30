
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.rileyicee.copperio.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import com.rileyicee.copperio.item.CopperswordItem;
import com.rileyicee.copperio.item.CopperpickItem;
import com.rileyicee.copperio.item.CopperArmorItem;
import com.rileyicee.copperio.CopperioMod;

public class CopperioModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CopperioMod.MODID);
	public static final RegistryObject<Item> COPPERPICK = REGISTRY.register("copperpick", () -> new CopperpickItem());
	public static final RegistryObject<Item> COPPER_ARMOR_HELMET = REGISTRY.register("copper_armor_helmet", () -> new CopperArmorItem.Helmet());
	public static final RegistryObject<Item> COPPER_ARMOR_CHESTPLATE = REGISTRY.register("copper_armor_chestplate", () -> new CopperArmorItem.Chestplate());
	public static final RegistryObject<Item> COPPER_ARMOR_LEGGINGS = REGISTRY.register("copper_armor_leggings", () -> new CopperArmorItem.Leggings());
	public static final RegistryObject<Item> COPPER_ARMOR_BOOTS = REGISTRY.register("copper_armor_boots", () -> new CopperArmorItem.Boots());
	public static final RegistryObject<Item> COPPERSWORD = REGISTRY.register("coppersword", () -> new CopperswordItem());
}
