package net.swetowit.dyedbricks;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class GrayBricks extends Block {

    public GrayBricks() {
        super(FabricBlockSettings.copy(Blocks.BRICKS).build());
    }

}
