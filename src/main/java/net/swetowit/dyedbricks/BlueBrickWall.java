package net.swetowit.dyedbricks;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.WallBlock;

public class BlueBrickWall extends WallBlock {

    public BlueBrickWall() {
        super(FabricBlockSettings.copy(Blocks.BRICK_WALL).build());
    }

}
