package com.kwpugh.greater_eye;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class GreaterEye implements ModInitializer {
	
	public static final String MOD_ID = "greater_eye";
	
    public static final Item GREATER_EYE = new ItemGreaterEye(new Item.Settings().group(ItemGroup.MISC));
 
    @Override
    public void onInitialize()
    {
        Registry.register(Registry.ITEM, new Identifier("greater_eye", "greater_eye"), GREATER_EYE);
    }
	
}