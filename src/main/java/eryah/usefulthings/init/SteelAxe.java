package eryah.usefulthings.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.fml.common.registry.GameRegistry;
import eryah.usefulthings.Reference;
import eryah.usefulthings.UsefulthingsMod;

public class SteelAxe extends ItemAxe {
	
public static Item SteelAxe ;
	
	public SteelAxe(ToolMaterial material) {
		super(material);
	}

	public static void init(){
		SteelAxe = new SteelAxe(UsefulthingsMod.steelMat).setUnlocalizedName("steelaxe").setCreativeTab(UsefulthingsMod.UTTab);
	}
	
	public static void register()
	{
		GameRegistry.registerItem(SteelAxe, SteelAxe.getUnlocalizedName().substring(5));

	}
	
	public static void registerRenders()
	{
		registerRender(SteelAxe);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}




}
