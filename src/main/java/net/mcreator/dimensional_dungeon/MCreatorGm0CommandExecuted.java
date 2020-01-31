package net.mcreator.dimensional_dungeon;

import net.minecraft.world.World;
import net.minecraft.world.GameType;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

@Elementsdimensional_dungeon.ModElement.Tag
public class MCreatorGm0CommandExecuted extends Elementsdimensional_dungeon.ModElement {
	public MCreatorGm0CommandExecuted(Elementsdimensional_dungeon instance) {
		super(instance, 6);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorGm0CommandExecuted!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorGm0CommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		if ((((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).capabilities.isCreativeMode : false) == (true))) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).setGameType(GameType.SURVIVAL);
			if (entity instanceof EntityPlayer && !world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString("Changed to Survival Mode!"), (false));
			}
		} else {
			if (entity instanceof EntityPlayer && !world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString("You are already in Survivalmode!"), (false));
			}
		}
	}
}
