package pink.core;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Core extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage("§dPink §7| §aPlugin enabled!");

    }
    @EventHandler(priority = EventPriority.LOWEST)
    public void onChat(AsyncPlayerChatEvent event) {
        event.setFormat("§7[§dPink§7] §f" + event.getPlayer().getName() + " §8» §f" + event.getMessage());
    }
    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage("§dPink §7| §cPlugin disabled!");
    }
}
