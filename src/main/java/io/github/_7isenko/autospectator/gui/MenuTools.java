package io.github._7isenko.autospectator.gui;

import org.bukkit.Bukkit;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MenuTools {

    public static Inventory generateChoiceInventory(String name) {
        Inventory inventory = Bukkit.createInventory(null, 45, name);

        ItemStack green = new ItemStack(Material.WOOL, 1, DyeColor.GREEN.getWoolData());
        ItemMeta greenMeta = green.getItemMeta();
        greenMeta.setDisplayName("On");
        green.setItemMeta(greenMeta);

        ItemStack red = new ItemStack(Material.WOOL, 1, DyeColor.RED.getWoolData());
        ItemMeta redMeta = red.getItemMeta();
        redMeta.setDisplayName("Off");
        red.setItemMeta(redMeta);

        int[] greenSlotNums = {1, 2, 3};
        int[] redSlotsNums = {5, 6, 7};

        for (int i = 1; i < 4; i++) {
            for (int slotNum : greenSlotNums) {
                inventory.setItem(i * 9 + slotNum, green.clone());
            }

            for (int slotNum : redSlotsNums) {
                inventory.setItem(i * 9 + slotNum, red.clone());
            }
        }

        return inventory;
    }

}
