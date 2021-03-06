package eryah.usefulthings.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import eryah.usefulthings.Reference;
import eryah.usefulthings.UsefulthingsMod;

public class Clinker extends Block {

	 protected Clinker(Material mat) {
	        super(Material.rock);
	        this.setHarvestLevel("pickaxe", 1);
	        this.setHardness(10.0f);
	        this.setResistance(15.0f);
	    }
	
	 public static Block clinker;
	 
	 public static void init()
		{
		 clinker = new Clinker(Material.rock).setUnlocalizedName("clinker").setCreativeTab(UsefulthingsMod.UTTab);
		}
		
		public static void register()
		{
			GameRegistry.registerBlock(clinker, clinker.getUnlocalizedName().substring(5));
		}
		
		public static void registerRenders()
		{
			registerRender(clinker);
		}
		
		public static void registerRender(Block block)
		{
			Item item = Item.getItemFromBlock(block);
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		}

}

