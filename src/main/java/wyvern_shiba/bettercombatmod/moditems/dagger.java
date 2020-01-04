package wyvern_shiba.bettercombatmod.moditems;

import net.minecraft.item.ItemSword;

public class dagger extends ItemSword {
    
    public dagger(String name, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
    }
}
