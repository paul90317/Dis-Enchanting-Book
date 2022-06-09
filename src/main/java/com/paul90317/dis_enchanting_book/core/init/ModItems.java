package com.paul90317.dis_enchanting_book.core.init;

import com.paul90317.dis_enchanting_book.MainMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister<Item> Items= DeferredRegister.create(ForgeRegistries.ITEMS, MainMod.MOD_ID);
    public static <T extends Item>RegistryObject<T> register(final String name,final Supplier<T> item){
        return Items.register(name,item);
    }
    public static final RegistryObject<Item> DisEnchanting_Book=register("dis_enchanting_book",()->new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}