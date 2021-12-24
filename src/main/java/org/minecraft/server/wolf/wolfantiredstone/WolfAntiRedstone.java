package org.minecraft.server.wolf.wolfantiredstone;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class WolfAntiRedstone extends JavaPlugin {
    JavaPlugin instance;
    @Override
    public void onEnable()
    {
        Bukkit.getLogger().info("正在加载中...");
        instance = this;
        saveDefaultConfig();
        ConfigLoader.loadConfig(instance);
        Bukkit.getPluginManager().registerEvents(new AntiRestone(),this);
        Bukkit.getLogger().info("加载完成！");
    }

    @Override
    public void onDisable()
    {
        Bukkit.getLogger().info("插件已卸载");
    }
}
