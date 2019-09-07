package net.swetowit.dyedbricks;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.StairsBlock;

public class OrangeBrickStairs extends StairsBlock {

    public OrangeBrickStairs() {
        super(Blocks.BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.BRICKS).build());
    }

}
