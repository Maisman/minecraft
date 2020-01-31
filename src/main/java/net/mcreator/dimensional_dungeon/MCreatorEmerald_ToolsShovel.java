package net.mcreator.dimensional_dungeon;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import java.util.Set;
import java.util.HashMap;

@Elementsdimensional_dungeon.ModElement.Tag
public class MCreatorEmerald_ToolsShovel extends Elementsdimensional_dungeon.ModElement {
	@GameRegistry.ObjectHolder("dimensional_dungeon:emerald_toolsshovel")
	public static final Item block = null;

	public MCreatorEmerald_ToolsShovel(Elementsdimensional_dungeon instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("EMERALD_TOOLSSHOVEL", 2, 250, 6f, -2f, 14)) {
			{
				this.attackSpeed = -3f;
			}

			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 2);
				return ret.keySet();
			}
		}.setUnlocalizedName("emerald_toolsshovel").setRegistryName("emerald_toolsshovel").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("dimensional_dungeon:emerald_toolsshovel", "inventory"));
	}
}
