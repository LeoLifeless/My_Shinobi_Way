package net.leo.shinobi.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class Shinobi_Tab {
    public static final CreativeModeTab MSW_TAB = new CreativeModeTab("msw_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Shinobi_Items.BRONZE_RYO.get());
        }
    };
}