package me.evilterabite.bitsloottableapi.loottable;

import me.evilterabite.bitsloottableapi.lib.Bound;
import me.evilterabite.bitsloottableapi.lib.WeightedRandomBag;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public abstract class LootTable {

    private static final Random random = new Random();

    public abstract List<Pool> pools();

    public static ItemStack getItem(LootTable lootTable) {
        ItemStack item = null;
        List<Pool> pools = lootTable.pools();
        for(Pool pool : pools) {
            List<Entry> entries = pool.getEntries();

            //Roll the pools based on a random amount of rolls +/- bonus
            int rolls = Bound.rand(pool.getMinRolls(), pool.getMaxRolls());
            if (rollBonus()) {
                rolls += pool.getBonusRolls();
            }
            for (int x = 0; x < rolls; x++) {

                //Get a Random Entry based on Weight
                WeightedRandomBag<Entry> weightedEntryList = new WeightedRandomBag<>();
                for (Entry e : entries) {
                    weightedEntryList.addEntry(e, e.getWeight());
                }
                Entry entry = weightedEntryList.getRandom();
                if (entry.getType() == Entry.EntryType.ITEM) {
                    item = entry.getItem();

                    //Enchant Item Randomly
                    List<Enchantment> enchantmentList = entry.getEnchantmentList();
                    int enchantmentAmount = random.nextInt(enchantmentList.size());

                    for (int i = 0; i < enchantmentAmount; i++) {
                        Enchantment enchantment = enchantmentList.get(random.nextInt(enchantmentList.size()));
                        int level;
                        if(entry.getMaxLevel() > enchantment.getMaxLevel()) {
                            if(entry.getMinLevel() >= enchantment.getMaxLevel()) {
                                level = enchantment.getMaxLevel();
                            }
                            else {
                                level = Bound.rand(entry.getMinLevel(), enchantment.getMaxLevel());
                            }
                        }
                        else {
                            level = Bound.rand(entry.getMinLevel(), entry.getMaxLevel());
                        }
                        item.addUnsafeEnchantment(enchantment, random.nextInt(level));
                    }

                    //Get a random amount of the item
                    int amount = Bound.rand(entry.getMinCount(), entry.getMaxCount());
                    item.setAmount(amount);
                }
            }
        }

        return item;
    }

    private static boolean rollBonus() {
        return random.nextBoolean();
    }
}
