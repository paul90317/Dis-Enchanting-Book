package com.paul90317.dis_enchanting_book;

import com.paul90317.dis_enchanting_book.core.init.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MainMod.MOD_ID)
public class MainMod {
    public static final String MOD_ID = "dis_enchanting_book";
    public MainMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.Items.register(bus);
        MinecraftForge.EVENT_BUS.register(this);
    }
}