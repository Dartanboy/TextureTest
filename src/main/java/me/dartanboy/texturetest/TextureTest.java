package me.dartanboy.texturetest;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class TextureTest extends JavaPlugin {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("getitem")) {
            if (sender instanceof Player player) {
                ItemStack item = new ItemStack(Material.DIAMOND_HELMET);
                ItemMeta meta = item.getItemMeta();
                assert meta != null;
                meta.setItemModel(new NamespacedKey("oni", "oni_1_helmet"));
                meta.setUnbreakable(true);
                item.setItemMeta(meta);
                player.getInventory().addItem(item);
            }
        }
        return true;
    }
}
