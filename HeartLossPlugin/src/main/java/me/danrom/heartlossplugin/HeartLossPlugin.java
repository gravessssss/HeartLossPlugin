package me.danrom.heartlossplugin;

import org.bukkit.GameMode;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class HeartLossPlugin extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(this, this);

    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {

        Player player = event.getPlayer();

        if (player.getGameMode() == GameMode.CREATIVE) { return; }

        player.damage(1.0);

        player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_HURT, 1.0f, 1.0f);

    }
}
