package frankytoast.toasterplugins;

import frankytoast.toasterplugins.commands.ToasterCommands;
import frankytoast.toasterplugins.commands.ToasterCommands;
import org.bukkit.plugin.java.JavaPlugin;

public final class ToasterPlugins extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
//        getLogger().info("Hello World");
        ToasterCommands commands = new ToasterCommands();
        getCommand("setHome").setExecutor(commands);
        getCommand("home").setExecutor(commands);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


}
