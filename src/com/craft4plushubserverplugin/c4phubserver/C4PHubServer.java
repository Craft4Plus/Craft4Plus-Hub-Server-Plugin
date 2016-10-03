package com.craft4plushubserverplugin.c4phubserver;

import org.bukkit.plugin.java.JavaPlugin;

import com.craft4plushubserverplugin.commands.ServerCMD;

public class C4PHubServer extends JavaPlugin{
	
	@Override
	public void onEnable() {
		
		System.out.println("Server plugin 'C4PHubServer' has been enabled!");
		
		getCommand("servers").setExecutor(new ServerCMD());
		
	}
	
	@Override
	public void onDisable() {
		
		System.out.println("Server plugin 'C4PHubServer' has been disabled!");
		
	}
	
	

}
