package io.github._7isenko.autospectator.cui;

import io.github._7isenko.autospectator.gui.MenuHandler;
import io.github._7isenko.autospectator.managing.GameModeManager;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AutoSpectatorCommand implements CommandExecutor {

    private final GameModeManager manager;
    private final MenuHandler menuHandler;

    public AutoSpectatorCommand(GameModeManager manager, MenuHandler menuHandler) {
        this.manager = manager;
        this.menuHandler = menuHandler;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(ChatColor.RED + "You must be player to use this command with no arguments! Try " + ChatColor.GOLD + "\"as <on/off>\"");
            } else {
                Player player = (Player) sender;
                menuHandler.open(player);
            }
            return true;
        }

        if (args.length == 1) {
            if (args[0].equalsIgnoreCase("on")) {
                manager.setStarted(true, sender);
                return true;
            } else if (args[0].equalsIgnoreCase("off")) {
                manager.setStarted(false, sender);
                return true;
            }
            return false;
        }

        // if args.length > 1
        return false;
    }
}
