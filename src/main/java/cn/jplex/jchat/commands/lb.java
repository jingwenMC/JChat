package cn.jplex.jchat.commands;

import com.google.common.collect.Iterables;
import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
//import gyurix.api.BungeeAPI;


public class lb implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        //if (sender instanceof Player)
        //{
            //Player player = (Player) sender;
        ByteArrayDataOutput out = ByteStreams.newDataOutput();
        out.writeUTF("Message");
        out.writeUTF("ALL");
        out.writeUTF("HelloWorld");

        // If you don't care about the player
        Player player = Iterables.getFirst(Bukkit.getOnlinePlayers(), null);
        // Else, specify them
        //Player player = Bukkit.getPlayerExact("Example");

        player.sendPluginMessage((Plugin) this, "BungeeCord", out.toByteArray());
            //command here
            //gyurix.api.BungeeAPI.sendMessage("HelloWorld",gyurix.api.BungeeAPI.totalPlayerList());
        //}
        //else
       // {
           // System.out.println(ChatColor.RED +"请由一名玩家执行");
       // }
        return false;
    }
}
