package me.evilterabite.bitsloottableapi.loottable;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Random;

public class Entry {

    private ItemStack item;
    private int weight;
    private int minCount;
    private int maxCount;
    private boolean fortune;
    private boolean explosionDecay;
    private boolean silkTouch;
    private List<Enchantment> enchantmentList;
    private int minLevel;
    private int maxLevel;
    private EntryType type;
    private static final Random random = new Random();

    public static class EntryBuilder {

        private ItemStack item;
        private int weight;
        private int minCount;
        private int maxCount;
        private boolean fortune;
        private boolean explosionDecay;
        private boolean silkTouch;
        private List<Enchantment> enchantmentList;
        private int minLevel;
        private int maxLevel;
        private EntryType type;

        public EntryBuilder setItem(ItemStack item) {
            this.item = item;
            return this;
        }

        public EntryBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public EntryBuilder setMinCount(int minCount) {
            this.minCount = minCount;
            return this;
        }

        public EntryBuilder setMaxCount(int maxCount) {
            this.maxCount = maxCount;
            return this;
        }

        public EntryBuilder setFortune(boolean fortune) {
            this.fortune = fortune;
            return this;
        }

        public EntryBuilder setExplosionDecay(boolean explosionDecay) {
            this.explosionDecay = explosionDecay;
            return this;
        }

        public EntryBuilder setSilkTouch(boolean silkTouch) {
            this.silkTouch = silkTouch;
            return this;
        }

        public EntryBuilder setEnchantmentList(List<Enchantment> enchantmentList) {
            this.enchantmentList = enchantmentList;
            return this;
        }

        public EntryBuilder setMaxLevel(int maxLevel) {
            this.maxLevel = maxLevel;
            return this;
        }

        public EntryBuilder setMinLevel(int minLevel) {
            this.minLevel = minLevel;
            return this;
        }

        public EntryBuilder setType(EntryType type) {
            this.type = type;
            return this;
        }

        public Entry build() {
            return new Entry(this);
        }
    }

    public enum EntryType {
        ITEM,
        BLOCK;
    }

    public Entry(EntryBuilder builder) {
        this.item = builder.item;
        this.weight = builder.weight;
        this.minCount = builder.minCount;
        this.maxCount = builder.maxCount;
        this.fortune = builder.fortune;
        this.explosionDecay = builder.explosionDecay;
        this.silkTouch = builder.silkTouch;
        this.enchantmentList = builder.enchantmentList;
        this.minLevel = builder.minLevel;
        this.maxLevel = builder.maxLevel;
        this.type = builder.type;
    }

    public ItemStack getItem() {
        return item;
    }

    public void setItem(ItemStack item) {
        this.item = item;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMinCount() {
        return minCount;
    }

    public void setMinCount(int minCount) {
        this.minCount = minCount;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }

    public boolean isFortune() {
        return fortune;
    }

    public void setFortune(boolean fortune) {
        this.fortune = fortune;
    }

    public boolean isExplosionDecay() {
        return explosionDecay;
    }

    public void setExplosionDecay(boolean explosionDecay) {
        this.explosionDecay = explosionDecay;
    }

    public boolean isSilkTouch() {
        return silkTouch;
    }

    public void setSilkTouch(boolean silkTouch) {
        this.silkTouch = silkTouch;
    }

    public List<Enchantment> getEnchantmentList() {
        return enchantmentList;
    }

    public void setEnchantmentList(List<Enchantment> enchantmentList) {
        this.enchantmentList = enchantmentList;
    }

    public int getMinLevel() {
        return minLevel;
    }

    public void setMinLevel(int minLevel) {
        this.minLevel = minLevel;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(int maxLevel) {
        this.maxLevel = maxLevel;
    }

    public EntryType getType() {
        return type;
    }

    public void setType(EntryType type) {
        this.type = type;
    }

}
