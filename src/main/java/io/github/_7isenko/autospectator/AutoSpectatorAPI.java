package io.github._7isenko.autospectator;

import io.github._7isenko.autospectator.managing.GameModeManager;
import io.github._7isenko.autospectator.gui.MenuHandler;
import org.bukkit.entity.Player;

public class AutoSpectatorAPI {
    private final MenuHandler menuHandler;
    private final GameModeManager gameModeManager;

    public AutoSpectatorAPI(MenuHandler menuHandler, GameModeManager gameModeManager) {
        this.menuHandler = menuHandler;
        this.gameModeManager = gameModeManager;
    }

    /**
     * Turn on/off the auto-spectator mode
     *
     * @param start - if true turns on and if false it turns off
     */
    public void setStarted(boolean start) {
        gameModeManager.setStarted(start);
    }

    /**
     * Check if the mode is already started
     * @return true if started and false if not
     */
    public boolean isStarted() {
        return gameModeManager.isStarted();
    }

    /**
     * Opens the plugin control menu to a player
     * @param player - menu receiver
     */
    public void openMenu(Player player) {
        menuHandler.open(player);
    }
}
