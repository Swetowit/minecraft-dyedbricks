package net.swetowit.dyedbricks;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;

public class BlackBrickSlab extends SlabBlock {

    public BlackBrickSlab() {
        super(FabricBlockSettings.copy(Blocks.BRICK_SLAB).build());
    }

}
