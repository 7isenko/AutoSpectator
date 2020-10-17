package io.github._7isenko.autospectator.gui;

import io.github._7isenko.autospectator.AutoSpectator;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class Menu {
    private final Inventory inventory;
    private final MenuHandler handler;

    public Menu(MenuHandler handler, Inventory inventory) {
        this.inventory = inventory;
        this.handler = handler;
        Bukkit.getPluginManager().registerEvents(new MenuListener(this), AutoSpectator.getPlugin());
    }

    public void open(Player player) {
        player.openInventory(inventory);
    }

    public Inventory getInventory() {
        return inventory;
    }

    public MenuHandler getHandler() {
        return handler;
    }
}
