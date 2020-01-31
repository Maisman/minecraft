package net.mcreator.dimensional_dungeon;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

@Elementsdimensional_dungeon.ModElement.Tag
public class MCreatorGELB extends Elementsdimensional_dungeon.ModElement {
	@GameRegistry.ObjectHolder("dimensional_dungeon:gelb")
	public static final Block block = null;

	public MCreatorGELB(Elementsdimensional_dungeon instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom());
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("dimensional_dungeon:gelb", "inventory"));
	}

	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK);
			setRegistryName("gelb");
			setUnlocalizedName("gelb");
			setSoundType(SoundType.GROUND);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(MCreatorNewWeapons.tab);
		}
	}
}
