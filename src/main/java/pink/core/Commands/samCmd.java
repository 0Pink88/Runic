package pink.core.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class samCmd implements CommandExecutor {

    static ArrayList<String> samIAm = new ArrayList<String>();

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) return false;
        if (!cmd.getName().equalsIgnoreCase("secretagentman")) return false;

        Player player = (Player) sender;

        if (samIAm.contains(player.getName())) {
            samIAm.remove(player.getName());
            player.sendMessage("§cRunic §8| §eJarvis, §cdeactivate §eAGENTM47.....");
        } else {
            samIAm.add(player.getName());
            player.sendMessage("§cRunic §8| §eJarvis, §aactivate §eAGENTM47!!!!!");
        }

        return true;
    }

    public static ArrayList<String> getSpys() {
        return samIAm;
    }

}
