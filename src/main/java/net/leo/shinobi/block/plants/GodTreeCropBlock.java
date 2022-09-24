package net.leo.shinobi.block.plants;

import net.leo.shinobi.block.Shinobi_Blocks;
import net.leo.shinobi.item.Shinobi_Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class GodTreeCropBlock extends CropBlock {
    public static final IntegerProperty AGE = IntegerProperty.create("age",0,6);

    public GodTreeCropBlock(Properties properties) {
        super(properties);
    }

    protected ItemLike getBaseSeedId(){
        return Shinobi_Items.GOD_TREE_SEED.get();
    }

    public IntegerProperty getAgeProperty(){
        return AGE;
    }

    public int getMaxAge(){
        return 6;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }
}

