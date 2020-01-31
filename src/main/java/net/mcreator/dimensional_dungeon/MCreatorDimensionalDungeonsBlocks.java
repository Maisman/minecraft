package net.mcreator.dimensional_dungeon;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@Elementsdimensional_dungeon.ModElement.Tag
public class MCreatorDimensionalDungeonsBlocks extends Elementsdimensional_dungeon.ModElement {
	public MCreatorDimensionalDungeonsBlocks(Elementsdimensional_dungeon instance) {
		super(instance, 26);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabdimensionaldungeonsblocks") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(MCreatorDarkium.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
