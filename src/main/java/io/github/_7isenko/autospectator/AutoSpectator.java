package io.github._7isenko.autospectator;

import io.github._7isenko.autospectator.cui.SpigotPluginCommand;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class AutoSpectator extends JavaPlugin {
    // How to build: Maven/SpigotPlugin/Lifecycle/package
    private static Plugin plugin;
    private static AutoSpectatorAPI API;

    @Override
    public void onEnable() {
        plugin = this;
        this.getCommand("as").setExecutor(new SpigotPluginCommand());
    }

    @Override
    public void onDisable() {

    }

    public static Plugin getPlugin() {
        return plugin;
    }

    public static AutoSpectatorAPI getAPI() {
        return API;
    }
}