package net.mcreator.dimensional_dungeon;

import net.minecraft.world.World;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

@Elementsdimensional_dungeon.ModElement.Tag
public class MCreatorDarkIronBlockDestroyedByPlayerDrop extends Elementsdimensional_dungeon.ModElement {
	public MCreatorDarkIronBlockDestroyedByPlayerDrop(Elementsdimensional_dungeon instance) {
		super(instance, 39);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorDarkIronBlockDestroyedByPlayerDrop!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorDarkIronBlockDestroyedByPlayerDrop!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		dimensional_dungeonVariables.MapVariables.get(world).DestroyedDarkIron = (double) ((dimensional_dungeonVariables.MapVariables.get(world).DestroyedDarkIron) + 1);
		dimensional_dungeonVariables.MapVariables.get(world).syncData(world);
		if (((dimensional_dungeonVariables.MapVariables.get(world).DestroyedDarkIron) >= 10)) {
			if (((dimensional_dungeonVariables.MapVariables.get(world).damage) <= 15)) {
				dimensional_dungeonVariables.MapVariables.get(world).damage = (double) ((dimensional_dungeonVariables.MapVariables.get(world).DestroyedDarkIron) + 1);
				dimensional_dungeonVariables.MapVariables.get(world).syncData(world);
				entity.attackEntityFrom(DamageSource.GENERIC, (float) (dimensional_dungeonVariables.MapVariables.get(world).DestroyedDarkIron));
			}
		}
	}
}
