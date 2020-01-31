package net.mcreator.dimensional_dungeon;

import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.util.EnumParticleTypes;

@Elementsdimensional_dungeon.ModElement.Tag
public class MCreatorDimensionalDungeonsBlocksPlayerStartsToDestroy extends Elementsdimensional_dungeon.ModElement {
	public MCreatorDimensionalDungeonsBlocksPlayerStartsToDestroy(Elementsdimensional_dungeon instance) {
		super(instance, 26);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorDimensionalDungeonsBlocksPlayerStartsToDestroy!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorDimensionalDungeonsBlocksPlayerStartsToDestroy!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorDimensionalDungeonsBlocksPlayerStartsToDestroy!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorDimensionalDungeonsBlocksPlayerStartsToDestroy!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (world instanceof WorldServer)
			((WorldServer) world).spawnParticle(EnumParticleTypes.SMOKE_LARGE, x, y, z, (int) 5, 3, 3, 3, 2, new int[0]);
	}
}
