package frankytoast.toasterplugins.commands;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import java.util.HashMap;

public class ToasterCommands implements CommandExecutor {
    HashMap<Player, Location> homes = new HashMap<>();

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String label, @NotNull String[] args) {
        if(!(sender instanceof Player)){return true;}

        Player player = (Player)sender;

        if (cmd.getName().equalsIgnoreCase("setHome")){
            homes.put(player,player.getLocation());
        }

        if (cmd.getName().equalsIgnoreCase("home")){
            if (homes.get(player) == null){
                player.sendMessage("Have not set a home");
            }
            player.teleport(homes.get(player));
        }


        return true;
    }
}
