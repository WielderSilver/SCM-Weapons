package net.silverbeam.scmweapons.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.silverbeam.scmweapons.ScmWeapons;
import net.silverbeam.scmweapons.item.custom.DaggerItem;
import net.silverbeam.scmweapons.item.custom.GreatswordItem;
import net.silverbeam.scmweapons.item.custom.RapierItem;

public class ModItems {

    public static final Item WOOD_RAPIER = registerItem("wood_rapier",
            new RapierItem(ToolMaterials.WOOD, 2.5f, -2.2f, new FabricItemSettings().group(ModItemGroup.SCM_WEAPONS)));
    public static final Item STONE_RAPIER = registerItem("stone_rapier",
            new RapierItem(ToolMaterials.STONE, 2.5f, -2.2f, new FabricItemSettings().group(ModItemGroup.SCM_WEAPONS)));
    public static final Item GOLD_RAPIER = registerItem("gold_rapier",
            new RapierItem(ToolMaterials.GOLD, 2.5f, -2.2f, new FabricItemSettings().group(ModItemGroup.SCM_WEAPONS)));
    public static final Item IRON_RAPIER = registerItem("iron_rapier",
            new RapierItem(ToolMaterials.IRON, 2.5f, -2.2f, new FabricItemSettings().group(ModItemGroup.SCM_WEAPONS)));
    public static final Item DIAMOND_RAPIER = registerItem("diamond_rapier",
            new RapierItem(ToolMaterials.DIAMOND, 2.5f, -2.2f, new FabricItemSettings().group(ModItemGroup.SCM_WEAPONS)));
    public static final Item NETHERITE_RAPIER = registerItem("netherite_rapier",
            new RapierItem(ToolMaterials.NETHERITE, 2.5f, -2.2f, new FabricItemSettings().group(ModItemGroup.SCM_WEAPONS)));


    public static final Item WOOD_DAGGER = registerItem("wood_dagger",
            new DaggerItem(ToolMaterials.WOOD, 2.5f, -2.2f, new FabricItemSettings().group(ModItemGroup.SCM_WEAPONS)));
    public static final Item STONE_DAGGER = registerItem("stone_dagger",
            new DaggerItem(ToolMaterials.STONE, 2.5f, -2.2f, new FabricItemSettings().group(ModItemGroup.SCM_WEAPONS)));
    public static final Item GOLD_DAGGER = registerItem("gold_dagger",
            new DaggerItem(ToolMaterials.GOLD, 2.5f, -2.2f, new FabricItemSettings().group(ModItemGroup.SCM_WEAPONS)));
    public static final Item IRON_DAGGER = registerItem("iron_dagger",
            new DaggerItem(ToolMaterials.IRON, 2.5f, -2.2f, new FabricItemSettings().group(ModItemGroup.SCM_WEAPONS)));
    public static final Item DIAMOND_DAGGER = registerItem("diamond_dagger",
            new DaggerItem(ToolMaterials.DIAMOND, 2.5f, -2.2f, new FabricItemSettings().group(ModItemGroup.SCM_WEAPONS)));
    public static final Item NETHERITE_DAGGER = registerItem("netherite_dagger",
            new DaggerItem(ToolMaterials.NETHERITE, 2.5f, -2.2f, new FabricItemSettings().group(ModItemGroup.SCM_WEAPONS)));
/*
    public static final Item WOOD_GREATSWORD = registerItem("wood_greatsword",
            new GreatswordItem(ToolMaterials.WOOD, 2.5f, -2.2f, new FabricItemSettings().group(ModItemGroup.SCM_WEAPONS)));
    public static final Item STONE_GREATSWORD = registerItem("stone_greatsword",
            new GreatswordItem(ToolMaterials.STONE, 2.5f, -2.2f, new FabricItemSettings().group(ModItemGroup.SCM_WEAPONS)));
    public static final Item GOLD_GREATSWORD = registerItem("gold_greatsword",
            new GreatswordItem(ToolMaterials.GOLD, 2.5f, -2.2f, new FabricItemSettings().group(ModItemGroup.SCM_WEAPONS)));
    public static final Item IRON_GREATSWORD = registerItem("iron_greatsword",
            new GreatswordItem(ToolMaterials.IRON, 2.5f, -2.2f, new FabricItemSettings().group(ModItemGroup.SCM_WEAPONS)));
    public static final Item DIAMOND_GREATSWORD = registerItem("diamond_greatsword",
            new GreatswordItem(ToolMaterials.DIAMOND, 2.5f, -2.2f, new FabricItemSettings().group(ModItemGroup.SCM_WEAPONS)));
    public static final Item NETHERITE_GREATSWORD = registerItem("netherite_greatsword",
            new GreatswordItem(ToolMaterials.NETHERITE, 2.5f, -2.2f, new FabricItemSettings().group(ModItemGroup.SCM_WEAPONS)));
*/

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(ScmWeapons.MOD_ID, name), item);
    }
    public static void registerModItems() {
        ScmWeapons.LOGGER.debug("registering Mod Items for " + ScmWeapons.MOD_ID);
    }
}
