package net.mcreator.dimensional_dungeon;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsdimensional_dungeon.ModElement.Tag
public class MCreatorDarkIronMelting extends Elementsdimensional_dungeon.ModElement {
	public MCreatorDarkIronMelting(Elementsdimensional_dungeon instance) {
		super(instance, 40);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorDarkIronDrop.block, (int) (1)), new ItemStack(MCreatorDarkIronIngot.block, (int) (1)), 4F);
	}
}
