package io.github._7isenko.autospectator.listeners;

import io.github._7isenko.autospectator.AutoSpectator;
import io.github._7isenko.autospectator.managing.GameModeManager;
import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class RespawnListener implements Listener {
    private GameModeManager manager;

    public RespawnListener(GameModeManager manager) {
        this.manager = manager;
    }

    @EventHandler(ignoreCancelled = true)
    public void onRespawn(PlayerRespawnEvent event) {
        if (manager.isStarted())
            manager.setSpectator(event.getPlayer());
    }
}