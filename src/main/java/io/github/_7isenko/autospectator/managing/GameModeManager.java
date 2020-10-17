package io.github._7isenko.autospectator.managing;

import io.github._7isenko.autospectator.AutoSpectator;
import io.github._7isenko.autospectator.listeners.RespawnListener;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class GameModeManager {
    private boolean started;

    public GameModeManager() {
        this.started = false;
        RespawnListener listener = new RespawnListener(this);
        AutoSpectator.getPlugin().getServer().getPluginManager().registerEvents(listener, AutoSpectator.getPlugin());
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public void setSpectator(Player player) {
        if (player.getGameMode() != GameMode.SPECTATOR) {
            new BukkitRunnable() {
                @Override
                public void run() {
                    player.setGameMode(GameMode.SPECTATOR);
                }
            }.runTask(AutoSpectator.getPlugin());
        }
    }

}
