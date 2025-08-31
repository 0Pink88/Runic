package pink.core.Events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import pink.core.Commands.samCmd;

public class commandListener implements Listener {

    @EventHandler
    public void onPlayerCommand(PlayerCommandPreprocessEvent event) {
        for (Player player : Bukkit.getServer().getOnlinePlayers()) {
            if (samCmd.getSpys().contains(player.getName())) {
                player.sendMessage("§b| §f" + event.getPlayer().getName() + "§7: §b" + event.getMessage());
            }
        }
    }

}
