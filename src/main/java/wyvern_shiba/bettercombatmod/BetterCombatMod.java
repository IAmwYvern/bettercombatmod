package wyvern_shiba.bettercombatmod;


import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import wyvern_shiba.bettercombatmod.moditems.dagger;

@EventBusSubscriber
@Mod(modid = BetterCombatMod.MOD_ID, name = BetterCombatMod.NAME, version = BetterCombatMod.VERSION)
public class BetterCombatMod {

    public static final String MOD_ID = "bettercombatmod";
    public static final String NAME = "Better combat mod";
    public static final String VERSION = "1.0.0";
    

    final static Item wooden_dagger = new dagger("wooden_dagger", ToolMaterial.WOOD);

    @SubscribeEvent
    public static void RegisterItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
            wooden_dagger

            );
    }

    @SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(wooden_dagger);
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}
    

}
