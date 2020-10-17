package io.github._7isenko.autospectator.gui;

import io.github._7isenko.autospectator.managing.GameModeManager;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class MenuHandler {

    private final Menu menu;
    private final GameModeManager manager;

    public MenuHandler(GameModeManager manager) {
        this.menu = new Menu(this, MenuTools.generateChoiceInventory("Auto-Spectator"));
        this.manager = manager;
    }

    public void open(Player player) {
        menu.open(player);
    }

    public void handle(ItemStack itemStack, Player actor) {
        if (itemStack.getItemMeta().getDisplayName().equals("On")) {
            manager.setStarted(true, actor);
        } else if (itemStack.getItemMeta().getDisplayName().equals("Off")) {
            manager.setStarted(false, actor);

        }
        // else ignore
    }
}
