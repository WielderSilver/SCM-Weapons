package net.silverbeam.scmweapons.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.silverbeam.scmweapons.ScmWeapons;

public class ModItemGroup {

    public static final ItemGroup SCM_WEAPONS = FabricItemGroupBuilder.build(new Identifier(ScmWeapons.MOD_ID, "scmweapons"), () -> new ItemStack(ModItems.IRON_RAPIER));

}
