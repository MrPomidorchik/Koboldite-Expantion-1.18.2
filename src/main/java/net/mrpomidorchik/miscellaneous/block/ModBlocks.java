package net.mrpomidorchik.miscellaneous.block;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.mrpomidorchik.miscellaneous.MiscellaneousMod;

public class ModBlocks {

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(5f,6f).requiresTool().sounds(BlockSoundGroup.METAL)),
            ItemGroup.BUILDING_BLOCKS);

    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f,3f).requiresTool().sounds(BlockSoundGroup.STONE)),
            ItemGroup.BUILDING_BLOCKS);

    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f,3f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)),
            ItemGroup.BUILDING_BLOCKS);

    public static final Block KOBOLDITE_BLOCK = registerBlock("koboldite_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(25f, 30f).requiresTool().sounds(BlockSoundGroup.METAL)),
            ItemGroup.BUILDING_BLOCKS);

    public static final Block DEEPSLATE_KOBOLDITE_ORE = registerBlock("deepslate_koboldite_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(15f,30f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)),
            ItemGroup.BUILDING_BLOCKS);



    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MiscellaneousMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(MiscellaneousMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        MiscellaneousMod.LOGGER.info("Registering Mod Blocks for " + MiscellaneousMod.MOD_ID);
    }
}
