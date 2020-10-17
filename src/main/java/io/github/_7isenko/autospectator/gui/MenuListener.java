package io.github._7isenko.autospectator.gui;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.ItemStack;

public class MenuListener implements Listener {

    private final Menu menu;

    public MenuListener(Menu menu) {
        this.menu = menu;
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onClick(InventoryClickEvent event) {
        if (!event.getInventory().equals(menu.getInventory())) {
            return;
        }
        event.setCancelled(true);
        if (event.getClickedInventory() != null && !event.getClickedInventory().equals(menu.getInventory()))
            return;
        final ItemStack clickedItem = event.getCurrentItem();
        if (clickedItem == null) {
            event.getWhoClicked().closeInventory();
            return;
        }

        menu.getHandler().handle(clickedItem, (Player) event.getWhoClicked());
        event.getWhoClicked().closeInventory();
    }

    @EventHandler
    public void onInventoryClick(final InventoryDragEvent e) {
        if (e.getInventory().equals(menu.getInventory())) {
            e.setCancelled(true);
        }
    }
}
