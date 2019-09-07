package net.swetowit.dyedbricks;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.StairsBlock;

public class GreenBrickStairs extends StairsBlock {

    public GreenBrickStairs() {
        super(Blocks.BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.SANDSTONE).build());
    }

}
