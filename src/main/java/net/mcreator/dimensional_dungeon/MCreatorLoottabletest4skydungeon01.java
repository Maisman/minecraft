package net.mcreator.dimensional_dungeon;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.util.ResourceLocation;

@Elementsdimensional_dungeon.ModElement.Tag
public class MCreatorLoottabletest4skydungeon01 extends Elementsdimensional_dungeon.ModElement {
	public MCreatorLoottabletest4skydungeon01(Elementsdimensional_dungeon instance) {
		super(instance, 30);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		LootTableList.register(new ResourceLocation("dimensional_dungeon", "loottabletest4skydungeon01"));
	}
}
