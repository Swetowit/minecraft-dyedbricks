package net.swetowit.dyedbricks;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.WallBlock;

public class YellowBrickWall extends WallBlock {

    public YellowBrickWall() {
        super(FabricBlockSettings.copy(Blocks.BRICK_WALL).build());
    }

}
