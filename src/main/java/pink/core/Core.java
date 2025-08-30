package pink.core;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;
import pink.core.Commands.Admin;

public final class Core extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        registerEvents(this, this);

        // Register commands
        Bukkit.getPluginCommand("announce").setExecutor(new Admin());
    }


    @Override
    public void onDisable() {
        getLogger().info("Plugin disabled!");
    }

    public void registerEvents(Plugin plugin, Listener... listeners) {
        for (Listener listener : listeners) {
            Bukkit.getPluginManager().registerEvents(listener, plugin);
        }
    }

}
