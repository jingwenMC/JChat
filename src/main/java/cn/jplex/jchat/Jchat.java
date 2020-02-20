package cn.jplex.jchat;

import org.bukkit.plugin.java.JavaPlugin;
import gyurix.api.BungeeAPI;
import gyurix.mysql.*;

public final class Jchat extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("=====JChat By JPlex Develop Team=====");
        System.out.println("=====Developed for JPlex Network=====");
        System.out.println("=====License:Open-Source,MIT    =====");
        System.out.println("=====Now Enabled.  (c)JPlex 2020=====");
        // Plugin startup logic
        //MySQLDatabase conn = new MySQLDatabase();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("=====JChat By JPlex Develop Team=====");
        System.out.println("=====Developed for JPlex Network=====");
        System.out.println("=====License:Open-Source,MIT    =====");
        System.out.println("=====Now Disabled. (c)JPlex 2020=====");
        System.out.println("=====Goodbye!                   =====");
    }
}
