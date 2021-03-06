package eryah.usefulthings.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import eryah.usefulthings.Reference;
import eryah.usefulthings.UsefulthingsMod;

public class HerbRope extends Item {
		
public static Item herb_rope;
	
	public static void init(){
		herb_rope = new HerbRope().setUnlocalizedName("herb_rope").setCreativeTab(UsefulthingsMod.UTTab);
	}
	
	public static void register()
	{
		GameRegistry.registerItem(herb_rope, herb_rope.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(herb_rope);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
}
