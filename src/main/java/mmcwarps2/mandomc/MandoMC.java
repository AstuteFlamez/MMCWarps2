package mmcwarps2.mandomc;

import mmcwarps2.mandomc.commands.Warp;
import mmcwarps2.mandomc.listeners.InventoryClick;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class MandoMC extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("warp").setExecutor(new Warp());

        getServer().getPluginManager().registerEvents(new InventoryClick(), this);

        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[MMCWarps]: Plugin is enabled!");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[MMCWarps]: Plugin is disabled!");
    }
}
