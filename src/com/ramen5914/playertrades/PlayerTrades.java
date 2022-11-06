package com.ramen5914.playertrades;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import com.ramen5914.playertrades.events.PlayerRightClickEvent;

public class PlayerTrades extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerRightClickEvent(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[PlayerTrades]: Plugin is enabled");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[PlayerTrades]: Plugin is disabled");
    }
}
