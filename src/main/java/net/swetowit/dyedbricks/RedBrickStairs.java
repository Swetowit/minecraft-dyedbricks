package net.swetowit.dyedbricks;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.StairsBlock;

public class RedBrickStairs extends StairsBlock {

    public RedBrickStairs() {
        super(Blocks.BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.BRICKS).build());
    }

}
