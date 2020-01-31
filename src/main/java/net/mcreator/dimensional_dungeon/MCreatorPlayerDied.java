package net.mcreator.dimensional_dungeon;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.Entity;

@Elementsdimensional_dungeon.ModElement.Tag
public class MCreatorPlayerDied extends Elementsdimensional_dungeon.ModElement {
	public MCreatorPlayerDied(Elementsdimensional_dungeon instance) {
		super(instance, 37);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		String deathText = "";
		deathText = (String) "because Dark Dimensions took over his mind! ";
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new TextComponentString("because Dark Dimensions took over his mind! "));
		}
		System.out.println((deathText));
	}

	@SubscribeEvent
	public void onPlayerLoggedIn(net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent event) {
		Entity entity = event.player;
		java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
		dependencies.put("x", (int) entity.posX);
		dependencies.put("y", (int) entity.posY);
		dependencies.put("z", (int) entity.posZ);
		dependencies.put("world", entity.world);
		dependencies.put("entity", entity);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
