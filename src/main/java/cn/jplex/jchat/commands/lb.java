package cn.jplex.jchat.commands;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
//import cn.jplex.jchat.BungeeListener;
import gyurix.api.BungeeAPI;


public class lb implements CommandExecutor {
    //private BungeeListener bungeeListener = new BungeeListener();
    private BungeeAPI bungeeAPI = new BungeeAPI();
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player)
        {
            Player player = (Player) sender;
            String[] strings = {"alter hello world"};
            //bungeeListener.sendBungeeMeesage(player,"ALL","HelloWorld");
            //bungeeAPI.sendMessage("HelloWorld","ALL");
            if(bungeeAPI.executeBungeeCommands(strings,"ALL"))
            {
                return true;
            }
            else
            {
                player.sendMessage(ChatColor.RED+"[JChat]Error While Executing command lb...Please Contact us.(Err.JP1)");
            }
        }
        else
        {
            System.out.println(ChatColor.RED +"请由一名玩家执行");
        }
        return false;
    }
}
