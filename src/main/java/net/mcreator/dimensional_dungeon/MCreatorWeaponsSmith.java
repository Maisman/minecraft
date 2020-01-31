package net.mcreator.dimensional_dungeon;

import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

@Elementsdimensional_dungeon.ModElement.Tag
public class MCreatorWeaponsSmith extends Elementsdimensional_dungeon.ModElement {
	public MCreatorWeaponsSmith(Elementsdimensional_dungeon instance) {
		super(instance, 8);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorWeaponsSmith!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorWeaponsSmith!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorWeaponsSmith!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorWeaponsSmith!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorWeaponsSmith!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (!world.isRemote && world.getMinecraftServer() != null) {
			world.getMinecraftServer()
					.getCommandManager()
					.executeCommand(
							new ICommandSender() {
								@Override
								public String getName() {
									return "";
								}

								@Override
								public boolean canUseCommand(int permission, String command) {
									return true;
								}

								@Override
								public World getEntityWorld() {
									return world;
								}

								@Override
								public MinecraftServer getServer() {
									return world.getMinecraftServer();
								}

								@Override
								public boolean sendCommandFeedback() {
									return false;
								}

								@Override
								public BlockPos getPosition() {
									return new BlockPos((int) x, (int) y, (int) z);
								}

								@Override
								public Vec3d getPositionVector() {
									return new Vec3d(x, y, z);
								}
							},
							"/summon villager ~ ~1 ~ {CustomName:Smith,ActiveEffects:[{Id:10,Amplifier:1,Duration:999999},{Id:11,Amplifier:0,Duration:999999},{Id:12,Amplifier:0,Duration:999999},{Id:13,Amplifier:0,Duration:999999},{Id:21,Amplifier:0,Duration:999999},{Id:22,Amplifier:0,Duration:999999},{Id:23,Amplifier:0,Duration:999999}],Offers:{Recipes:[{buy:{id:emerald,Count:3},sell:{id:iron_sword,Count:1,tag:{display:{Name:\"Iron Slayer lvl1\",Lore:[\"This sword is for Loot farming!\"]},ench:[{id:16,lvl:2},{id:19,lvl:1},{id:21,lvl:1},{id:22,lvl:1},{id:34,lvl:2},{id:70,lvl:1}]}},maxUses:9999999},{buy:{id:emerald,Count:4},sell:{id:iron_sword,Count:1,tag:{display:{Name:\"Iron Slayer lvl2\",Lore:[\"This sword is for Loot farming!\"]},ench:[{id:16,lvl:2},{id:19,lvl:1},{id:21,lvl:2},{id:22,lvl:2},{id:34,lvl:2},{id:70,lvl:1}]}},maxUses:9999999},{buy:{id:emerald,Count:5},sell:{id:iron_sword,Count:1,tag:{display:{Name:\"Iron Slayer lvl3\",Lore:[\"This sword is for Loot farming!\"]},ench:[{id:16,lvl:3},{id:19,lvl:1},{id:20,lvl:1},{id:21,lvl:3},{id:22,lvl:3},{id:34,lvl:3},{id:70,lvl:1}]}},maxUses:9999999}]},Profession:3,Career:2,CareerLevel:2}");
		}
		if (entity instanceof EntityPlayer && !world.isRemote) {
			((EntityPlayer) entity).sendStatusMessage(new TextComponentString("Smith Summoned!"), (false));
		}
	}
}
