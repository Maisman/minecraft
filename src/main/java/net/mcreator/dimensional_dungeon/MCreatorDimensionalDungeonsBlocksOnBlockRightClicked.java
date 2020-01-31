package net.mcreator.dimensional_dungeon;

import net.minecraft.world.World;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.Entity;

@Elementsdimensional_dungeon.ModElement.Tag
public class MCreatorDimensionalDungeonsBlocksOnBlockRightClicked extends Elementsdimensional_dungeon.ModElement {
	public MCreatorDimensionalDungeonsBlocksOnBlockRightClicked(Elementsdimensional_dungeon instance) {
		super(instance, 26);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorDimensionalDungeonsBlocksOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorDimensionalDungeonsBlocksOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorDimensionalDungeonsBlocksOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorDimensionalDungeonsBlocksOnBlockRightClicked!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (!world.isRemote) {
			Entity entityToSpawn = new EntityLightningBolt(world);
			if (entityToSpawn != null) {
				entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
				world.spawnEntity(entityToSpawn);
			}
		}
	}
}
