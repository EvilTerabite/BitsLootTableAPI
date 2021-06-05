package me.evilterabite.bitsloottableapi;

import me.evilterabite.bitsloottableapi.loottable.LootTable;
import me.evilterabite.bitsloottableapi.loottable.tables.SampleLoot;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GetLootCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            player.getInventory().addItem(LootTable.getItem(new SampleLoot()));
        }
        return true;
    }
}
