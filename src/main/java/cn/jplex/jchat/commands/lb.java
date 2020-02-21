package cn.jplex.jchat.commands;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import cn.jplex.jchat.BungeeListener;


public class lb implements CommandExecutor {
    private BungeeListener bungeeListener = new BungeeListener();
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player)
        {
            Player player = (Player) sender;
            bungeeListener.sendBungeeMeesage(player,"ALL","HelloWorld");
        }
        else
        {
            System.out.println(ChatColor.RED +"请由一名玩家执行");
        }
        return false;
    }
}
