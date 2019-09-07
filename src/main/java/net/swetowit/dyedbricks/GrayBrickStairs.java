package net.swetowit.dyedbricks;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.StairsBlock;

public class GrayBrickStairs extends StairsBlock {

    public GrayBrickStairs() {
        super(Blocks.BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.SANDSTONE).build());
    }

}
