package net.mcreator.dimensional_dungeon;

import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.ICommand;
import net.minecraft.command.CommandHandler;

import java.util.List;
import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;

@Elementsdimensional_dungeon.ModElement.Tag
public class MCreatorGm1 extends Elementsdimensional_dungeon.ModElement {
	public MCreatorGm1(Elementsdimensional_dungeon instance) {
		super(instance, 5);
	}

	@Override
	public void serverLoad(FMLServerStartingEvent event) {
		event.registerServerCommand(new CommandHandler());
	}

	public static class CommandHandler implements ICommand {
		@Override
		public int compareTo(ICommand c) {
			return getName().compareTo(c.getName());
		}

		@Override
		public boolean checkPermission(MinecraftServer server, ICommandSender var1) {
			return true;
		}

		@Override
		public List getAliases() {
			return new ArrayList();
		}

		@Override
		public List getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args, BlockPos pos) {
			return new ArrayList();
		}

		@Override
		public boolean isUsernameIndex(String[] string, int index) {
			return true;
		}

		@Override
		public String getName() {
			return "gm 1";
		}

		@Override
		public String getUsage(ICommandSender var1) {
			return "/gm 1 [<arguments>]";
		}

		@Override
		public void execute(MinecraftServer server, ICommandSender sender, String[] cmd) {
			int x = sender.getPosition().getX();
			int y = sender.getPosition().getY();
			int z = sender.getPosition().getZ();
			Entity entity = sender.getCommandSenderEntity();
			if (entity != null) {
				World world = entity.world;
				HashMap<String, String> cmdparams = new HashMap<>();
				int[] index = {0};
				Arrays.stream(cmd).forEach(param -> {
					cmdparams.put(Integer.toString(index[0]), param);
					index[0]++;
				});
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					MCreatorGm1CommandExecuted.executeProcedure($_dependencies);
				}
			}
		}
	}
}