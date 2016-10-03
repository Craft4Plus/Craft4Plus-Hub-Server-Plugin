package com.craft4plushubserverplugin.inventory;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.CommandExecutor;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ServersMenu implements CommandExecutor{
	
	Inventory inv = Bukkit.createInventory(null, 18, "Servers Menu");
	ItemStack spawnItem = nameItem(new ItemStack(Material.COMPASS), ChatColor.GREEN + "Clans")
			
    return true;
    }
	
	private ItemStack nameItem(ItemStack item, String name) {
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(name);
		item.setItemMeta(meta);
		return item;
		
	}

	private ItemStack nameItem(Material item, String name) {
		return nameItem(new ItemStack(item), name);
	
     }
}