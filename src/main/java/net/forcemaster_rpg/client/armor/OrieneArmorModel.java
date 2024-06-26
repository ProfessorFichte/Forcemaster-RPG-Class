package net.forcemaster_rpg.client.armor;

import mod.azure.azurelibarmor.model.GeoModel;
import net.minecraft.util.Identifier;
import net.forcemaster_rpg.ForcemasterClassMod;
import net.forcemaster_rpg.item.armor.OrieneArmor;

public class OrieneArmorModel extends GeoModel<OrieneArmor> {
    @Override
    public Identifier getModelResource(OrieneArmor object) {
        return new Identifier(ForcemasterClassMod.MOD_ID, "geo/oriene_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(OrieneArmor armor) {
        return new Identifier(ForcemasterClassMod.MOD_ID, "textures/armor/oriene_armor.png");
    }

    @Override
    public Identifier getAnimationResource(OrieneArmor animatable) {
        return null;
    }
}