package net.swetowit.dyedbricks;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;

public class PinkBrickSlab extends SlabBlock {

    public PinkBrickSlab() {
        super(FabricBlockSettings.copy(Blocks.BRICK_SLAB).build());
    }

}
