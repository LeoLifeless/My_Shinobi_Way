package net.leo.shinobi.block;

import net.leo.shinobi.ShinobiMod;
import net.leo.shinobi.block.plants.GodTreeCropBlock;
import net.leo.shinobi.item.Shinobi_Items;
import net.leo.shinobi.item.Shinobi_Tab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class Shinobi_Blocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ShinobiMod.MOD_ID);

    public static final RegistryObject<Block> UCHIHA_WOOD = registerBlock("uchiha_wood",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(6f).requiresCorrectToolForDrops()), Shinobi_Tab.MSW_TAB);

    public static final RegistryObject<Block> GOD_TREE = BLOCKS.register("god_tree",
            () -> new GodTreeCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)
                    .strength(6f).requiresCorrectToolForDrops()));




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return Shinobi_Items.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}

