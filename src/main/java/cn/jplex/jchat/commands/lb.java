package cn.jplex.jchat.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import gyurix.api.BungeeAPI;


public class lb implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player)
        {
            Player player = (Player) sender;
            //command here
            gyurix.api.BungeeAPI.sendMessage("HelloWorld",gyurix.api.BungeeAPI.totalPlayerList());
        }
        else
        {
            System.out.println(ChatColor.RED +"请由一名玩家执行");
        }
        return false;
    }
}
