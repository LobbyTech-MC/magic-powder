package me.framesend.magicpowder;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

public class MagicPowder extends JavaPlugin implements SlimefunAddon {

    @Override
    public void onEnable() {
        // Read something from your config.yml
        Config cfg = new Config(this);

        if (cfg.getBoolean("options.auto-update")) {
            // You could start an Auto-Updater for example
        }

 
        ItemStack categoryItem = new CustomItemStack(Material.SUGAR, "&b可可工艺", "", "&a> 点击打开");
        NamespacedKey categoryId = new NamespacedKey(this, "magic_powders");
        ItemGroup category = new ItemGroup(categoryId, categoryItem);

        SlimefunItemStack cocaLeafItem = new SlimefunItemStack("COCA_LEAF", Material.KELP, "&b古柯叶", "", "&7它看上去似乎没啥用.");
        ItemStack[] cocaLeafRecipe = {  new ItemStack(Material.ACACIA_LEAVES), new ItemStack(Material.ACACIA_LEAVES), new ItemStack(Material.ACACIA_LEAVES),
				        		new ItemStack(Material.ACACIA_LEAVES), new ItemStack(Material.ACACIA_LEAVES), new ItemStack(Material.ACACIA_LEAVES),
				        		new ItemStack(Material.ACACIA_LEAVES), new ItemStack(Material.ACACIA_LEAVES), new ItemStack(Material.ACACIA_LEAVES)};
        
        SlimefunItem cocaleaf = new CocaLeaf(category, cocaLeafItem, RecipeType.ORE_WASHER, cocaLeafRecipe);
        cocaleaf.register(this);
        
        SlimefunItemStack cocaPowderItem = new SlimefunItemStack("COCA_POWDER", Material.DEAD_BRAIN_CORAL_FAN, "&b可可粉", "", "&7这可以用作什么?");
        ItemStack[] cocaPowderRecipe = {new SlimefunItemStack("COCA_LEAF", Material.KELP, "&b古柯叶", "", "&7它看上去似乎没啥用."), new SlimefunItemStack("COCA_LEAF", Material.KELP, "&b古柯叶", "", "&7它看上去似乎没啥用."), new SlimefunItemStack("COCA_LEAF", Material.KELP, "&b古柯叶", "", "&7它看上去似乎没啥用."),
							        	new SlimefunItemStack("COCA_LEAF", Material.KELP, "&b古柯叶", "", "&7它看上去似乎没啥用."), new SlimefunItemStack("COCA_LEAF", Material.KELP, "&b古柯叶", "", "&7它看上去似乎没啥用."), new SlimefunItemStack("COCA_LEAF", Material.KELP, "&b古柯叶", "", "&7它看上去似乎没啥用."),
							        	new SlimefunItemStack("COCA_LEAF", Material.KELP, "&b古柯叶", "", "&7它看上去似乎没啥用."), new SlimefunItemStack("COCA_LEAF", Material.KELP, "&b古柯叶", "", "&7它看上去似乎没啥用."), new SlimefunItemStack("COCA_LEAF", Material.KELP, "&b古柯叶", "", "&7它看上去似乎没啥用.")};

        SlimefunItem cocapowder = new SlimefunItem(category, cocaPowderItem, RecipeType.ORE_CRUSHER, cocaPowderRecipe);
        cocapowder.register(this);
        
        SlimefunItemStack unrefinedCocaineItem = new SlimefunItemStack("UNREFINED_COCAINE", Material.SUGAR, "&bUnrefined Cocaine", "", "&7它看上去似乎没啥用.");
        ItemStack[] unrefinedCocaineRecipe = {  new SlimefunItemStack("COCA_POWDER", Material.DEAD_BRAIN_CORAL_FAN, "&b可可粉", "", "&7这可以用作什么?"), new SlimefunItemStack("COCA_POWDER", Material.DEAD_BRAIN_CORAL_FAN, "&b可可粉", "", "&7这可以用作什么?"), new SlimefunItemStack("COCA_POWDER", Material.DEAD_BRAIN_CORAL_FAN, "&b可可粉", "", "&7这可以用作什么?"),
        		new SlimefunItemStack("COCA_POWDER", Material.DEAD_BRAIN_CORAL_FAN, "&b可可粉", "", "&7这可以用作什么?"), new SlimefunItemStack("COCA_POWDER", Material.DEAD_BRAIN_CORAL_FAN, "&b可可粉", "", "&7这可以用作什么?"), new SlimefunItemStack("COCA_POWDER", Material.DEAD_BRAIN_CORAL_FAN, "&b可可粉", "", "&7这可以用作什么?"),
        		new SlimefunItemStack("COCA_POWDER", Material.DEAD_BRAIN_CORAL_FAN, "&b可可粉", "", "&7这可以用作什么?"), new SlimefunItemStack("COCA_POWDER", Material.DEAD_BRAIN_CORAL_FAN, "&b可可粉", "", "&7这可以用作什么?"), new SlimefunItemStack("COCA_POWDER", Material.DEAD_BRAIN_CORAL_FAN, "&b可可粉", "", "&7这可以用作什么?")};
        
        SlimefunItem unrefinedcocaine = new UnrefinedCocaine(category, unrefinedCocaineItem, RecipeType.PRESSURE_CHAMBER, unrefinedCocaineRecipe);
        unrefinedcocaine.register(this);
    }

    @Override
    public void onDisable() {
        // Logic for disabling the plugin...
    }

    @Override
    public String getBugTrackerURL() {
        // You can return a link to your Bug Tracker instead of null here
        return null;
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        /*
         * You will need to return a reference to your Plugin here.
         * If you are using your main class for this, simply return "this".
         */
        return this;
    }
}
