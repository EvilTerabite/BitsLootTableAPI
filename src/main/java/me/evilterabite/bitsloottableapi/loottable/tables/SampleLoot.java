package me.evilterabite.bitsloottableapi.loottable.tables;

import me.evilterabite.bitsloottableapi.loottable.Entry;
import me.evilterabite.bitsloottableapi.loottable.LootTable;
import me.evilterabite.bitsloottableapi.loottable.Pool;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SampleLoot extends LootTable {

    @Override
    public List<Pool> pools() {
        List<Entry> entries = new ArrayList<>();
        Entry diaPick = new Entry.EntryBuilder()
                .setEnchantmentList(new ArrayList<>(Arrays.asList(Enchantment.MENDING, Enchantment.DAMAGE_ALL)))
                .setExplosionDecay(false)
                .setFortune(false)
                .setItem(new ItemStack(Material.DIAMOND_PICKAXE))
                .setMaxCount(2)
                .setMinCount(1)
                .setMaxLevel(5)
                .setMinLevel(2)
                .setSilkTouch(false)
                .setType(Entry.EntryType.ITEM)
                .setWeight(30)
                .build();

        Entry cobble = new Entry.EntryBuilder()
                .setEnchantmentList(new ArrayList<>(Arrays.asList(Enchantment.MENDING, Enchantment.DAMAGE_ALL)))
                .setExplosionDecay(false)
                .setFortune(false)
                .setItem(new ItemStack(Material.COBBLESTONE))
                .setMaxCount(2)
                .setMinCount(1)
                .setMaxLevel(5)
                .setMinLevel(2)
                .setSilkTouch(false)
                .setType(Entry.EntryType.ITEM)
                .setWeight(60)
                .build();

        entries.add(diaPick);
        entries.add(cobble);
        Pool pool = new Pool(entries, 1, 5, 0);
        return new ArrayList<>(Arrays.asList(pool));
    }
}
