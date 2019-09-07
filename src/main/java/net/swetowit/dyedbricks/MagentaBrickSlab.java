package net.swetowit.dyedbricks;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;

public class MagentaBrickSlab extends SlabBlock {

    public MagentaBrickSlab() {
        super(FabricBlockSettings.copy(Blocks.BRICK_SLAB).build());
    }

}
