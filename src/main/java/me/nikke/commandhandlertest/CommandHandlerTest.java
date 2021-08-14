package me.nikke.commandhandlertest;

import me.nikke.commandhandlertest.commands.TestCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class CommandHandlerTest extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("test").setExecutor(new TestCommand());
    }

    @Override
    public void onDisable() {

    }
}
