package com.paul90317.dis_enchanting_book;

import com.paul90317.dis_enchanting_book.core.init.ModItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MainMod implements ModInitializer {
    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("dis_enchanting_book", "dis_enchanting_book"), ModItems.DisEnchantingBook);
    }
}