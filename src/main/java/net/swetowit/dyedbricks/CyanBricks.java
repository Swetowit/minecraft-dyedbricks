package net.swetowit.dyedbricks;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class CyanBricks extends Block {

    public CyanBricks() {
        super(FabricBlockSettings.copy(Blocks.BRICKS).build());
    }

}
