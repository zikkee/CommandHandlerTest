package me.nikke.commandhandlertest.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TestCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("test")) {
            Player player = (Player) sender;
            player.sendMessage("§aToimii!");
        }
        return false;
    }
}
