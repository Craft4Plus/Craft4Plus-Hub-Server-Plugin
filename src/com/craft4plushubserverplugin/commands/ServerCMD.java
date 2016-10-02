package com.craft4plushubserverplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class ServerCMD implements Listener, CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("servers")) {
		if (!(sender instanceof Player)) {
		   sender.sendMessage(ChatColor.RED + "You must be in-game to use this command!");
		   return false;
		}
		
		     Player player = (Player) sender;
		     player.sendMessage(ChatColor.GREEN + "Select one of our servers!");
		     return true;
			
		}
		return false;
	}

}
