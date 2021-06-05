package me.evilterabite.bitsloottableapi;

import org.bukkit.plugin.java.JavaPlugin;

public final class BitsLootTableAPI extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("getLoot").setExecutor(new GetLootCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
