package net.swetowit.dyedbricks;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.WallBlock;

public class RedBrickWall extends WallBlock {

    public RedBrickWall() {
        super(FabricBlockSettings.copy(Blocks.SANDSTONE_WALL).build());
    }

}
