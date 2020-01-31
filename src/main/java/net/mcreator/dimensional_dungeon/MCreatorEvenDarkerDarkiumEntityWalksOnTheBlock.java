package net.mcreator.dimensional_dungeon;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

@Elementsdimensional_dungeon.ModElement.Tag
public class MCreatorEvenDarkerDarkiumEntityWalksOnTheBlock extends Elementsdimensional_dungeon.ModElement {
	public MCreatorEvenDarkerDarkiumEntityWalksOnTheBlock(Elementsdimensional_dungeon instance) {
		super(instance, 27);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorEvenDarkerDarkiumEntityWalksOnTheBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, (int) 2, (int) 1));
	}
}
