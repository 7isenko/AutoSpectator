package io.github._7isenko.autospectator;

import io.github._7isenko.autospectator.managing.GameModeManager;
import io.github._7isenko.autospectator.managing.InterfaceManager;
import org.bukkit.entity.Player;

public class AutoSpectatorAPI {
    private final InterfaceManager interfaceManager;
    private final GameModeManager gameModeManager;

    public AutoSpectatorAPI(InterfaceManager interfaceManager, GameModeManager gameModeManager) {
        this.interfaceManager = interfaceManager;
        this.gameModeManager = gameModeManager;
    }

    public boolean setStarted(boolean start) {
        return false;
    }

    public boolean isStarted(){
        return false;
    }

    public boolean openMenu(Player player) {
        return false;
    }
}
