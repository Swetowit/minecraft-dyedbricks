package net.swetowit.dyedbricks;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.StairsBlock;

public class MagentaBrickStairs extends StairsBlock {

    public MagentaBrickStairs() {
        super(Blocks.BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.BRICKS).build());
    }

}
