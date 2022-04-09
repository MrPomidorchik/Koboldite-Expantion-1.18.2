package net.mrpomidorchik.miscellaneous.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.mrpomidorchik.miscellaneous.MiscellaneousMod;

public class ModItems {

    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MiscellaneousMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MiscellaneousMod.LOGGER.info("Registering Mod Items for " + MiscellaneousMod.MOD_ID);

    }
}
