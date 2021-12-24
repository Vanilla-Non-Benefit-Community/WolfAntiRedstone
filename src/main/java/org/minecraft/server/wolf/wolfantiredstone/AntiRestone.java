package org.minecraft.server.wolf.wolfantiredstone;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPistonExtendEvent;
import org.bukkit.event.block.BlockRedstoneEvent;

public class AntiRestone implements Listener {
    @EventHandler
    public void redstoneEvent(BlockRedstoneEvent e)
    {
        if(ConfigLoader.validWorld.contains(e.getBlock().getWorld().getName()))
        {
            if(e.getBlock().isBlockPowered() || e.getBlock().isBlockIndirectlyPowered())
            {
                if(ConfigLoader.cleanBlock.contains(e.getBlock().getType().toString()))
                {
                    e.getBlock().setType(Material.AIR);
                }

            }
            e.setNewCurrent(0);
        }


    }
    @EventHandler
    public void pistonEvent(BlockPistonExtendEvent e)
    {
        if(ConfigLoader.validWorld.contains(e.getBlock().getWorld().getName()))
        e.setCancelled(true);
    }
}
