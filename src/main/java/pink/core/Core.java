package pink.core;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;

public final class Core extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);

    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!cmd.getName().equalsIgnoreCase("announce")) return false;

        if (!sender.hasPermission("pink.announce")) {
            sender.sendMessage("§cYou do not have permission to use this command.");
            return true;
        }
        if (args.length == 0) {
            sender.sendMessage("Usage: /" + label + " <message>");
            return true;
        }

        String message = String.join(" ", args);
        getServer().broadcastMessage(" ");
        getServer().broadcastMessage("§c[ALERT] §f" + message);
        getServer().broadcastMessage(" ");
        return true;
    }



    @Override
    public void onDisable() {
        getLogger().info("Plugin disabled!");
    }
}
