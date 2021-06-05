package me.evilterabite.bitsloottableapi.loottable;

import java.util.List;

public class Pool {

    private List<Entry> entries;
    private int minRolls;
    private int maxRolls;
    private int bonusRolls;

    public Pool(List<Entry> entries, int minRolls, int maxRolls, int bonusRolls) {
        this.entries = entries;
        this.minRolls = minRolls;
        this.maxRolls = maxRolls;
        this.bonusRolls = bonusRolls;
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }

    public int getMinRolls() {
        return minRolls;
    }

    public void setMinRolls(int minRolls) {
        this.minRolls = minRolls;
    }

    public int getMaxRolls() {
        return maxRolls;
    }

    public void setMaxRolls(int maxRolls) {
        this.maxRolls = maxRolls;
    }

    public int getBonusRolls() {
        return bonusRolls;
    }

    public void setBonusRolls(int bonusRolls) {
        this.bonusRolls = bonusRolls;
    }
}
