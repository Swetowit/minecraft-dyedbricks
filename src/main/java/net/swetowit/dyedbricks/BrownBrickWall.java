package net.swetowit.dyedbricks;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.WallBlock;

public class BrownBrickWall extends WallBlock {

    public BrownBrickWall() {
        super(FabricBlockSettings.copy(Blocks.SANDSTONE_WALL).build());
    }

}
