package net.swetowit.dyedbricks;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class BlueBricks extends Block {

    public BlueBricks() {
        super(FabricBlockSettings.copy(Blocks.BRICKS).build());
    }

}
