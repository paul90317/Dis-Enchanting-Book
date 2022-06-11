package com.paul90317.dis_enchanting_book;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MainMod implements ModInitializer {
    // an instance of our new item
    public static final Item CUSTOM_ITEM = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("dis_enchanting_book", "dis_enchanting_book"), CUSTOM_ITEM);
    }
}