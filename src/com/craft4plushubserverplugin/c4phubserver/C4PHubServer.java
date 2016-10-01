package com.craft4plushubserverplugin.c4phubserver;

import org.bukkit.plugin.java.JavaPlugin;

public class C4PHubServer extends JavaPlugin{
	
	@Override
	public void onEnable() {
		
		System.out.println("Server plugin 'C4PHubServer' has been enabled!");
		
	}
	public void onDisable() {
		
		System.out.println("Server plugin 'C4PHubServer' has been disabled!");
		
	}

}
