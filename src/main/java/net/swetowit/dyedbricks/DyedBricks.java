package net.swetowit.dyedbricks;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DyedBricks implements ModInitializer {

    //Brick Items
    public static final Item WHITE_BRICK = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item LIGHT_GRAY_BRICK = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item GRAY_BRICK = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item BLACK_BRICK = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item BROWN_BRICK = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item RED_BRICK = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item ORANGE_BRICK = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item YELLOW_BRICK = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item BLUE_BRICK = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item LIGHT_BLUE_BRICK = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item CYAN_BRICK = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item LIME_BRICK = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item GREEN_BRICK = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item PURPLE_BRICK = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item MAGENTA_BRICK = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item PINK_BRICK = new Item(new Item.Settings().group(ItemGroup.MISC));

    //Bricks Blocks
    public static final Block WHITE_BRICKS = new WhiteBricks();
    public static final Block LIGHT_GRAY_BRICKS = new LightGrayBricks();
    public static final Block GRAY_BRICKS = new GrayBricks();
    public static final Block BLACK_BRICKS = new BlackBricks();
    public static final Block BROWN_BRICKS = new BrownBricks();
    public static final Block RED_BRICKS = new RedBricks();
    public static final Block ORANGE_BRICKS = new OrangeBricks();
    public static final Block YELLOW_BRICKS = new YellowBricks();
    public static final Block BLUE_BRICKS = new BlueBricks();
    public static final Block LIGHT_BLUE_BRICKS = new LightBlueBricks();
    public static final Block CYAN_BRICKS = new CyanBricks();
    public static final Block LIME_BRICKS = new LimeBricks();
    public static final Block GREEN_BRICKS = new GreenBricks();
    public static final Block PURPLE_BRICKS = new PurpleBricks();
    public static final Block MAGENTA_BRICKS = new MagentaBricks();
    public static final Block PINK_BRICKS = new PinkBricks();

    //BrickStairs Blocks
    public static final Block WHITE_BRICK_STAIRS = new WhiteBrickStairs();
    public static final Block LIGHTGRAY_BRICK_STAIRS = new LightGrayBrickStairs();
    public static final Block GRAY_BRICK_STAIRS = new GrayBrickStairs();
    public static final Block BLACK_BRICK_STAIRS = new BlackBrickStairs();
    public static final Block BLUE_BRICK_STAIRS = new BlueBrickStairs();
    public static final Block LIGHTBLUE_BRICK_STAIRS = new LightBlueBrickStairs();
    public static final Block CYAN_BRICK_STAIRS = new CyanBrickStairs();
    public static final Block GREEN_BRICK_STAIRS = new GreenBrickStairs();
    public static final Block LIME_BRICK_STAIRS = new LimeBrickStairs();
    public static final Block BROWN_BRICK_STAIRS = new BrownBrickStairs();
    public static final Block MAGENTA_BRICK_STAIRS = new MagentaBrickStairs();
    public static final Block PINK_BRICK_STAIRS = new PinkBrickStairs();
    public static final Block PURPLE_BRICK_STAIRS = new PurpleBrickStairs();
    public static final Block ORANGE_BRICK_STAIRS = new OrangeBrickStairs();
    public static final Block RED_BRICK_STAIRS = new RedBrickStairs();
    public static final Block YELLOW_BRICK_STAIRS = new YellowBrickStairs();

    //BrickWall Blocks
    public static final Block WHITE_BRICK_WALL = new WhiteBrickWall();
    public static final Block LIGHTGRAY_BRICK_WALL = new LightGrayBrickWall();
    public static final Block GRAY_BRICK_WALL = new GrayBrickWall();
    public static final Block BLACK_BRICK_WALL = new BlackBrickWall();
    public static final Block BLUE_BRICK_WALL = new BlueBrickWall();
    public static final Block LIGHTBLUE_BRICK_WALL = new LightBlueBrickWall();
    public static final Block CYAN_BRICK_WALL = new CyanBrickWall();
    public static final Block GREEN_BRICK_WALL = new GreenBrickWall();
    public static final Block LIME_BRICK_WALL = new LimeBrickWall();
    public static final Block BROWN_BRICK_WALL = new BrownBrickWall();
    public static final Block MAGENTA_BRICK_WALL = new MagentaBrickWall();
    public static final Block PINK_BRICK_WALL = new PinkBrickWall();
    public static final Block PURPLE_BRICK_WALL = new PurpleBrickWall();
    public static final Block ORANGE_BRICK_WALL = new OrangeBrickWall();
    public static final Block RED_BRICK_WALL = new RedBrickWall();
    public static final Block YELLOW_BRICK_WALL = new YellowBrickWall();

    //BrickSlab Blocks
    public static final Block WHITE_BRICK_SLAB = new WhiteBrickSlab();
    public static final Block LIGHTGRAY_BRICK_SLAB = new LightGrayBrickSlab();
    public static final Block GRAY_BRICK_SLAB = new GrayBrickSlab();
    public static final Block BLACK_BRICK_SLAB = new BlackBrickSlab();
    public static final Block BLUE_BRICK_SLAB = new BlueBrickSlab();
    public static final Block LIGHTBLUE_BRICK_SLAB = new LightBlueBrickSlab();
    public static final Block CYAN_BRICK_SLAB = new CyanBrickSlab();
    public static final Block GREEN_BRICK_SLAB = new GreenBrickSlab();
    public static final Block LIME_BRICK_SLAB = new LimeBrickSlab();
    public static final Block BROWN_BRICK_SLAB = new BrownBrickSlab();
    public static final Block MAGENTA_BRICK_SLAB = new MagentaBrickSlab();
    public static final Block PINK_BRICK_SLAB = new PinkBrickSlab();
    public static final Block PURPLE_BRICK_SLAB = new PurpleBrickSlab();
    public static final Block ORANGE_BRICK_SLAB = new OrangeBrickSlab();
    public static final Block RED_BRICK_SLAB = new RedBrickSlab();
    public static final Block YELLOW_BRICK_SLAB = new YellowBrickSlab();

    @Override
    public void onInitialize() {
        //Brick Items
        Registry.register(Registry.ITEM, new Identifier("dyedbricks", "white_brick"), WHITE_BRICK);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks", "light_gray_brick"), LIGHT_GRAY_BRICK);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks", "gray_brick"), GRAY_BRICK);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks", "black_brick"), BLACK_BRICK);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks", "brown_brick"), BROWN_BRICK);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks", "red_brick"), RED_BRICK);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks", "orange_brick"), ORANGE_BRICK);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks", "yellow_brick"), YELLOW_BRICK);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks", "blue_brick"), BLUE_BRICK);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks", "light_blue_brick"), LIGHT_BLUE_BRICK);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks", "cyan_brick"), CYAN_BRICK);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks", "lime_brick"), LIME_BRICK);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks", "green_brick"), GREEN_BRICK);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks", "purple_brick"), PURPLE_BRICK);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks", "magenta_brick"), MAGENTA_BRICK);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks", "pink_brick"), PINK_BRICK);

        //Bricks Blocks
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","white_bricks"), WHITE_BRICKS);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","white_bricks"), new BlockItem(WHITE_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","light_gray_bricks"), LIGHT_GRAY_BRICKS);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","light_gray_bricks"), new BlockItem(LIGHT_GRAY_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","gray_bricks"), GRAY_BRICKS);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","gray_bricks"), new BlockItem(GRAY_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","black_bricks"), BLACK_BRICKS);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","black_bricks"), new BlockItem(BLACK_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","brown_bricks"), BROWN_BRICKS);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","brown_bricks"), new BlockItem(BROWN_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","red_bricks"), RED_BRICKS);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","red_bricks"), new BlockItem(RED_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","orange_bricks"), ORANGE_BRICKS);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","orange_bricks"), new BlockItem(ORANGE_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","yellow_bricks"), YELLOW_BRICKS);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","yellow_bricks"), new BlockItem(YELLOW_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","blue_bricks"), BLUE_BRICKS);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","blue_bricks"), new BlockItem(BLUE_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","light_blue_bricks"), LIGHT_BLUE_BRICKS);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","light_blue_bricks"), new BlockItem(LIGHT_BLUE_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","cyan_bricks"), CYAN_BRICKS);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","cyan_bricks"), new BlockItem(CYAN_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","lime_bricks"), LIME_BRICKS);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","lime_bricks"), new BlockItem(LIME_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","green_bricks"), GREEN_BRICKS);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","green_bricks"), new BlockItem(GREEN_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","purple_bricks"), PURPLE_BRICKS);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","purple_bricks"), new BlockItem(PURPLE_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","magenta_bricks"), MAGENTA_BRICKS);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","magenta_bricks"), new BlockItem(MAGENTA_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","pink_bricks"), PINK_BRICKS);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","pink_bricks"), new BlockItem(PINK_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );

        //BrickStairs Blocks
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","white_brick_stairs"), WHITE_BRICK_STAIRS);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","white_brick_stairs"), new BlockItem(WHITE_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","light_gray_brick_stairs"), LIGHTGRAY_BRICK_STAIRS);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","light_gray_brick_stairs"), new BlockItem(LIGHTGRAY_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","gray_brick_stairs"), GRAY_BRICK_STAIRS);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","gray_brick_stairs"), new BlockItem(GRAY_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","black_brick_stairs"), BLACK_BRICK_STAIRS);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","black_brick_stairs"), new BlockItem(BLACK_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","blue_brick_stairs"), BLUE_BRICK_STAIRS);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","blue_brick_stairs"), new BlockItem(BLUE_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","light_blue_brick_stairs"), LIGHTBLUE_BRICK_STAIRS);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","light_blue_brick_stairs"), new BlockItem(LIGHTBLUE_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","cyan_brick_stairs"), CYAN_BRICK_STAIRS);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","cyan_brick_stairs"), new BlockItem(CYAN_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","green_brick_stairs"), GREEN_BRICK_STAIRS);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","green_brick_stairs"), new BlockItem(GREEN_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","lime_brick_stairs"), LIME_BRICK_STAIRS);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","lime_brick_stairs"), new BlockItem(LIME_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","brown_brick_stairs"), BROWN_BRICK_STAIRS);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","brown_brick_stairs"), new BlockItem(BROWN_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","magenta_brick_stairs"), MAGENTA_BRICK_STAIRS);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","magenta_brick_stairs"), new BlockItem(MAGENTA_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","pink_brick_stairs"), PINK_BRICK_STAIRS);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","pink_brick_stairs"), new BlockItem(PINK_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","purple_brick_stairs"), PURPLE_BRICK_STAIRS);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","purple_brick_stairs"), new BlockItem(PURPLE_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","orange_brick_stairs"), ORANGE_BRICK_STAIRS);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","orange_brick_stairs"), new BlockItem(ORANGE_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","red_brick_stairs"), RED_BRICK_STAIRS);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","red_brick_stairs"), new BlockItem(RED_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","yellow_brick_stairs"), YELLOW_BRICK_STAIRS);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","yellow_brick_stairs"), new BlockItem(YELLOW_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );

        //BrickWall Blocks
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","white_brick_wall"), WHITE_BRICK_WALL);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","white_brick_wall"), new BlockItem(WHITE_BRICK_WALL, new Item.Settings().group(ItemGroup.DECORATIONS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","light_gray_brick_wall"), LIGHTGRAY_BRICK_WALL);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","light_gray_brick_wall"), new BlockItem(LIGHTGRAY_BRICK_WALL, new Item.Settings().group(ItemGroup.DECORATIONS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","gray_brick_wall"), GRAY_BRICK_WALL);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","gray_brick_wall"), new BlockItem(GRAY_BRICK_WALL, new Item.Settings().group(ItemGroup.DECORATIONS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","black_brick_wall"), BLACK_BRICK_WALL);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","black_brick_wall"), new BlockItem(BLACK_BRICK_WALL, new Item.Settings().group(ItemGroup.DECORATIONS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","blue_brick_wall"), BLUE_BRICK_WALL);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","blue_brick_wall"), new BlockItem(BLUE_BRICK_WALL, new Item.Settings().group(ItemGroup.DECORATIONS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","light_blue_brick_wall"), LIGHTBLUE_BRICK_WALL);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","light_blue_brick_wall"), new BlockItem(LIGHTBLUE_BRICK_WALL, new Item.Settings().group(ItemGroup.DECORATIONS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","cyan_brick_wall"), CYAN_BRICK_WALL);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","cyan_brick_wall"), new BlockItem(CYAN_BRICK_WALL, new Item.Settings().group(ItemGroup.DECORATIONS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","green_brick_wall"), GREEN_BRICK_WALL);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","green_brick_wall"), new BlockItem(GREEN_BRICK_WALL, new Item.Settings().group(ItemGroup.DECORATIONS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","lime_brick_wall"), LIME_BRICK_WALL);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","lime_brick_wall"), new BlockItem(LIME_BRICK_WALL, new Item.Settings().group(ItemGroup.DECORATIONS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","brown_brick_wall"), BROWN_BRICK_WALL);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","brown_brick_wall"), new BlockItem(BROWN_BRICK_WALL, new Item.Settings().group(ItemGroup.DECORATIONS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","magenta_brick_wall"), MAGENTA_BRICK_WALL);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","magenta_brick_wall"), new BlockItem(MAGENTA_BRICK_WALL, new Item.Settings().group(ItemGroup.DECORATIONS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","pink_brick_wall"), PINK_BRICK_WALL);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","pink_brick_wall"), new BlockItem(PINK_BRICK_WALL, new Item.Settings().group(ItemGroup.DECORATIONS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","purple_brick_wall"), PURPLE_BRICK_WALL);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","purple_brick_wall"), new BlockItem(PURPLE_BRICK_WALL, new Item.Settings().group(ItemGroup.DECORATIONS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","orange_brick_wall"), ORANGE_BRICK_WALL);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","orange_brick_wall"), new BlockItem(ORANGE_BRICK_WALL, new Item.Settings().group(ItemGroup.DECORATIONS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","red_brick_wall"), RED_BRICK_WALL);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","red_brick_wall"), new BlockItem(RED_BRICK_WALL, new Item.Settings().group(ItemGroup.DECORATIONS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","yellow_brick_wall"), YELLOW_BRICK_WALL);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","yellow_brick_wall"), new BlockItem(YELLOW_BRICK_WALL, new Item.Settings().group(ItemGroup.DECORATIONS)) );

        //BrickSlab Blocks
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","white_brick_slab"), WHITE_BRICK_SLAB);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","white_brick_slab"), new BlockItem(WHITE_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","light_gray_brick_slab"), LIGHTGRAY_BRICK_SLAB);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","light_gray_brick_slab"), new BlockItem(LIGHTGRAY_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","gray_brick_slab"), GRAY_BRICK_SLAB);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","gray_brick_slab"), new BlockItem(GRAY_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","black_brick_slab"), BLACK_BRICK_SLAB);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","black_brick_slab"), new BlockItem(BLACK_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","blue_brick_slab"), BLUE_BRICK_SLAB);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","blue_brick_slab"), new BlockItem(BLUE_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","light_blue_brick_slab"), LIGHTBLUE_BRICK_SLAB);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","light_blue_brick_slab"), new BlockItem(LIGHTBLUE_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","cyan_brick_slab"), CYAN_BRICK_SLAB);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","cyan_brick_slab"), new BlockItem(CYAN_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","green_brick_slab"), GREEN_BRICK_SLAB);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","green_brick_slab"), new BlockItem(GREEN_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","lime_brick_slab"), LIME_BRICK_SLAB);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","lime_brick_slab"), new BlockItem(LIME_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","brown_brick_slab"), BROWN_BRICK_SLAB);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","brown_brick_slab"), new BlockItem(BROWN_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","magenta_brick_slab"), MAGENTA_BRICK_SLAB);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","magenta_brick_slab"), new BlockItem(MAGENTA_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","pink_brick_slab"), PINK_BRICK_SLAB);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","pink_brick_slab"), new BlockItem(PINK_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","purple_brick_slab"), PURPLE_BRICK_SLAB);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","purple_brick_slab"), new BlockItem(PURPLE_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","orange_brick_slab"), ORANGE_BRICK_SLAB);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","orange_brick_slab"), new BlockItem(ORANGE_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","red_brick_slab"), RED_BRICK_SLAB);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","red_brick_slab"), new BlockItem(RED_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );
        Registry.register(Registry.BLOCK, new Identifier("dyedbricks","yellow_brick_slab"), YELLOW_BRICK_SLAB);
        Registry.register(Registry.ITEM, new Identifier("dyedbricks","yellow_brick_slab"), new BlockItem(YELLOW_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)) );

    }
}
