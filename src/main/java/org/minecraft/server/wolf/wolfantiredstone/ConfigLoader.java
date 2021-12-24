package org.minecraft.server.wolf.wolfantiredstone;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public class ConfigLoader {

    public static List<String> validWorld;
    public static List<String> cleanBlock;

    public static void loadConfig(JavaPlugin instance)
    {
        validWorld = instance.getConfig().getStringList("ValidWorld");
        cleanBlock = instance.getConfig().getStringList("CleanBlock");
    }
}
