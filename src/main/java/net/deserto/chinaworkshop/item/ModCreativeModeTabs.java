package net.deserto.chinaworkshop.item;

import net.deserto.chinaworkshop.ChineseWorkshopRV;
import net.deserto.chinaworkshop.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ChineseWorkshopRV.MODID);

    public static final RegistryObject<CreativeModeTab> CHINESE_INGREDIENTS_TAB = CREATIVE_MODE_TABS.register("zh_ing_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BLACKBRICK.get()))
                    .title(Component.translatable("creativetab.zhwi_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.BLACKCLAY.get());
                        output.accept(ModItems.BLACKBRICK.get());
                        output.accept(ModItems.YELLOWCLAY.get());
                        output.accept(ModItems.YELLOWBRICK.get());
                    })
                    .build());
    public static final RegistryObject<CreativeModeTab> CHINESE_BB_TAB = CREATIVE_MODE_TABS.register("zh_bb_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.REDSTAINED_PLANKS.get()))
                    .title(Component.translatable("creativetab.zhwbb_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.REDSTAINED_PLANKS.get());
                        output.accept(ModBlocks.PAINTEDBLOCK_A.get());
                        output.accept(ModBlocks.PAINTEDBLOCK_B.get());
                        output.accept(ModBlocks.BLACKBRICKS.get());
                        output.accept(ModBlocks.ASH_BLOCK.get());
                        output.accept(ModBlocks.BLACKCLAY_BLOCK.get());
                        output.accept(ModBlocks.RAMMED_EARTH.get());
                        output.accept(ModBlocks.ANDESITEPAVEMENT.get());
                        output.accept(ModBlocks.REDPILLAR.get());
                        output.accept(ModBlocks.GREENPILLAR.get());
                    })
                    .build());
    public static final RegistryObject<CreativeModeTab> CHINESE_DECORATIONS_TAB = CREATIVE_MODE_TABS.register("zh_deco_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.MENDUN.get()))
                    .title(Component.translatable("creativetab.zh_deco_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.MENDUN.get());
                        output.accept(ModBlocks.DOUGONG.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
