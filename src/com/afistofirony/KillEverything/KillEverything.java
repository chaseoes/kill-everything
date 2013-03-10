package com.afistofirony.KillEverything;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.PluginManager;

public class KillEverything extends JavaPlugin{
    PluginManager EventManager;
    // This is all pseudo-code, don't take it seriously.
    public void onEnable(){
        EventManager.registerEvents(this, this)
    }

    @EventHandler
    public boolean onPlayerChatEvent(PlayerChatEvent event){
        if(event.getMessage().toUpperCase().contains("KK") && !event.getMessage().toUpperCase().contains("BUKKIT")){
            for(Player p : Bukkit.getOnlinePlayers()){
                 p.setHealth(0);
                 }
            getServer().broadcastMessage("That phrase is not allowed.");
        }
        return false;
    }

}
