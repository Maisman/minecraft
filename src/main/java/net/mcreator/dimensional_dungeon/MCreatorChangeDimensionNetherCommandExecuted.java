package net.mcreator.dimensional_dungeon;

import net.minecraftforge.common.DimensionManager;

import net.minecraft.world.WorldServer;
import net.minecraft.world.Teleporter;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.Entity;

@Elementsdimensional_dungeon.ModElement.Tag
public class MCreatorChangeDimensionNetherCommandExecuted extends Elementsdimensional_dungeon.ModElement {
	public MCreatorChangeDimensionNetherCommandExecuted(Elementsdimensional_dungeon instance) {
		super(instance, 53);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorChangeDimensionNetherCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (!entity.world.isRemote && !entity.isRiding() && !entity.isBeingRidden() && entity instanceof EntityPlayerMP) {
			int dimensionID = -1;
			class TeleporterDirect extends Teleporter {
				public TeleporterDirect(WorldServer worldserver) {
					super(worldserver);
				}

				@Override
				public void placeInPortal(Entity entity, float yawrotation) {
				}

				@Override
				public boolean placeInExistingPortal(Entity entity, float yawrotation) {
					return true;
				}

				@Override
				public boolean makePortal(Entity entity) {
					return true;
				}
			}
			EntityPlayerMP _player = (EntityPlayerMP) entity;
			_player.mcServer.getPlayerList().transferPlayerToDimension(_player, dimensionID, new TeleporterDirect(_player.getServerWorld()));
			_player.connection.setPlayerLocation(DimensionManager.getWorld(dimensionID).getSpawnPoint().getX(), DimensionManager
					.getWorld(dimensionID).getSpawnPoint().getY() + 1, DimensionManager.getWorld(dimensionID).getSpawnPoint().getZ(),
					_player.rotationYaw, _player.rotationPitch);
		}
	}
}
