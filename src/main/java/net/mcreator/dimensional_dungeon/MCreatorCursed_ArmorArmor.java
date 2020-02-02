package net.mcreator.dimensional_dungeon;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@Elementsdimensional_dungeon.ModElement.Tag
public class MCreatorCursed_ArmorArmor extends Elementsdimensional_dungeon.ModElement {
	@GameRegistry.ObjectHolder("dimensional_dungeon:cursed_armorarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("dimensional_dungeon:cursed_armorarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("dimensional_dungeon:cursed_armorarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("dimensional_dungeon:cursed_armorarmorboots")
	public static final Item boots = null;

	public MCreatorCursed_ArmorArmor(Elementsdimensional_dungeon instance) {
		super(instance, 74);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("CURSED_ARMORARMOR", "dimensional_dungeon:cursed_armor", 15,
				new int[]{2, 6, 5, 2}, 9, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")),
				0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("cursed_armorarmorhelmet")
				.setRegistryName("cursed_armorarmorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("cursed_armorarmorbody")
				.setRegistryName("cursed_armorarmorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("cursed_armorarmorlegs")
				.setRegistryName("cursed_armorarmorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("cursed_armorarmorboots")
				.setRegistryName("cursed_armorarmorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("dimensional_dungeon:cursed_armorarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("dimensional_dungeon:cursed_armorarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("dimensional_dungeon:cursed_armorarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("dimensional_dungeon:cursed_armorarmorboots", "inventory"));
	}
}
