package frankytoast.toasterplugins;

import org.bukkit.plugin.java.JavaPlugin;

public final class ToasterPlugins extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Hello World");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
