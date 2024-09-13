package net.deserto.chinaworkshop.item;

import net.deserto.chinaworkshop.ChineseWorkshopRV;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ChineseWorkshopRV.MODID);

    public static final RegistryObject<Item> BLACKCLAY = ITEMS.register("blackclay",
            () -> new Item(new Item.Properties())); //isso aqui é o mais importante nessa fase inicial
    // ele vai criar um item novo, não tem muitos itens no geral mas tendo em mente da pra copiar isso depois
    public static final RegistryObject<Item> YELLOWCLAY = ITEMS.register("yellowclay",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLACKBRICK = ITEMS.register("blackbrick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> YELLOWBRICK = ITEMS.register("yellowbrick",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
