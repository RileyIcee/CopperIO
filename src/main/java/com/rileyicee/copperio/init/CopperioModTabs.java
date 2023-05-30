
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.rileyicee.copperio.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class CopperioModTabs {
	public static CreativeModeTab TAB_COPPER_IO_TAB;

	public static void load() {
		TAB_COPPER_IO_TAB = new CreativeModeTab("tabcopper_io_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.COPPER_INGOT);
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
