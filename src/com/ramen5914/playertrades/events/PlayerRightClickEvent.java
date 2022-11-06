package com.ramen5914.playertrades.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

public class PlayerRightClickEvent implements Listener {
    @EventHandler
    public static void onEntityRightClick(PlayerInteractAtEntityEvent event) {
        Player player = event.getPlayer();
        String clickedEntity = event.getRightClicked().getName();

        player.sendMessage(ChatColor.AQUA + "You clicked: " + clickedEntity);
    }
}
