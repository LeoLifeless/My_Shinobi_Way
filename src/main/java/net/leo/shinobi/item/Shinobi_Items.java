package net.leo.shinobi.item;

import net.leo.shinobi.ShinobiMod;
import net.leo.shinobi.block.Shinobi_Blocks;
import net.leo.shinobi.item.skilllearners.SkillLearnerFireReleaseItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Shinobi_Items {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ShinobiMod.MOD_ID);

    public static final RegistryObject<Item> BRONZE_RYO = ITEMS.register("bronze_ryo",
            () -> new Item(new Item.Properties().tab(Shinobi_Tab.MSW_TAB)));
    public static final RegistryObject<Item> Silver_RYO = ITEMS.register("silver_ryo",
            () -> new Item(new Item.Properties().tab(Shinobi_Tab.MSW_TAB)));
    public static final RegistryObject<Item> GOLD_RYO = ITEMS.register("gold_ryo",
            () -> new Item(new Item.Properties().tab(Shinobi_Tab.MSW_TAB)));
    public static final RegistryObject<Item> GOD_TREE_FRUIT = ITEMS.register("god_tree_fruit",
            () -> new Item(new Item.Properties().tab(Shinobi_Tab.MSW_TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(2f).build())));

    public static final RegistryObject<Item> GOD_TREE_SEED = ITEMS.register("god_tree_seed",
            () -> new ItemNameBlockItem(Shinobi_Blocks.GOD_TREE.get(),
                    new Item.Properties().tab(Shinobi_Tab.MSW_TAB)));


    public static final RegistryObject<Item> SKILLLEARNERFIRE = ITEMS.register("fire_release",
            () -> new SkillLearnerFireReleaseItem(new Item.Properties().tab(Shinobi_Tab.MSW_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
