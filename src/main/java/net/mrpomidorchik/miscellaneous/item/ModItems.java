package net.mrpomidorchik.miscellaneous.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.mrpomidorchik.miscellaneous.MiscellaneousMod;
import net.mrpomidorchik.miscellaneous.item.custom.ModPickaxeItem;

public class ModItems {

    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item KOBOLDITE_DUST = registerItem("koboldite_dust",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item KOBOLDITE_NUGGET = registerItem("koboldite_nugget",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item KOBOLDITE_INGOT = registerItem("koboldite_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item SKY_FRAGMENT = registerItem("sky_fragment",
            new Item(new FabricItemSettings().group(ItemGroup.MISC).rarity(Rarity.UNCOMMON)));

    public static final Item KOBOLDITE_PICKAXE = registerItem("koboldite_pickaxe",
            new ModPickaxeItem(ModToolMaterials.KOBOLDIT, 1, -2.8f, new FabricItemSettings().group(ItemGroup.TOOLS)));





    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MiscellaneousMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MiscellaneousMod.LOGGER.info("Registering Mod Items for " + MiscellaneousMod.MOD_ID);

    }
}
