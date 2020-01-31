package net.mcreator.dimensional_dungeon;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.util.ResourceLocation;

@Elementsdimensional_dungeon.ModElement.Tag
public class MCreatorGutLoot extends Elementsdimensional_dungeon.ModElement {
	public MCreatorGutLoot(Elementsdimensional_dungeon instance) {
		super(instance, 35);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		LootTableList.register(new ResourceLocation("dimensional_dungeon", "chests/struktur"));
	}
}
