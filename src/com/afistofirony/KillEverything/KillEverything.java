package com.afistofirony.KillEverything;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.ChatColor;

public class KillEverything extends JavaPlugin implements Listener {

    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this)
    }

    @EventHandler
    public void onPlayerChatEvent(PlayerChatEvent event) {
        String[] words = event.getMessage().split(" ");
        for (String word : words) {
            if (word.equalsIgnoreCase("kk")) {
                for (Player p : Bukkit.getOnlinePlayers()) {
                    p.setHealth(0);
                }
                getServer().broadcastMessage(ChatColor.RED + "That phrase is not allowed.");
                return;
            }
        }
    }

}
