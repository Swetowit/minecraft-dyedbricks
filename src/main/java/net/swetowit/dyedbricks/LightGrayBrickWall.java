package net.swetowit.dyedbricks;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.WallBlock;

public class LightGrayBrickWall extends WallBlock {

    public LightGrayBrickWall() {
        super(FabricBlockSettings.copy(Blocks.SANDSTONE_WALL).build());
    }

}
