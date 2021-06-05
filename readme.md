# Loot Table API

## Introduction

> This API allows developers to create loot tables in classes easily, all you have to do is extend the LootTable class.

## Code Samples

> Sample Loot Table

```java
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
```

> Getting the loot from the table

```java
LootTable sampleLoot = new SampleLoot();
ItemStack item = LootTable.getLoot(sampleLoot);
```

## Installation

>Current version: 0.1a

maven
```
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```

```
	<dependency>
	    <groupId>com.github.EvilTerabite</groupId>
	    <artifactId>BitsLootTableAPI</artifactId>
	    <version>VERSION</version>
	</dependency>
```

gradle
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

```
	dependencies {
	        implementation 'com.github.EvilTerabite:BitsLootTableAPI:<VERSION>'
	}
```



