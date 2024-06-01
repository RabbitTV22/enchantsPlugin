package net.rabbitnetwork.buybooks;

import io.papermc.paper.event.player.AsyncChatCommandDecorateEvent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class BuyBooks extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    List<String> one = new ArrayList<>();
    List<String> two = new ArrayList<>();
    List<String> three = new ArrayList<>();
    List<String> four = new ArrayList<>();
    List<String> five = new ArrayList<>();
    List<String> six = new ArrayList<>();
    List<String> seven = new ArrayList<>();
    List<String> eight = new ArrayList<>();
    List<String> nine = new ArrayList<>();
    List<String> ten = new ArrayList<>();
    List<String> eleven = new ArrayList<>();
    List<String> twelve = new ArrayList<>();
    List<String> thirteen = new ArrayList<>();
    List<String> fourteen = new ArrayList<>();
    List<String> multi = new ArrayList<>();
    List<String> sixteen = new ArrayList<>();
    List<String> seventeen = new ArrayList<>();
    List<String> eighteen = new ArrayList<>();
    List<String> nineteen = new ArrayList<>();
    List<String> twenty = new ArrayList<>();

    //skipped 21 cuz i cant count 😭😭😭😭
    List<String> not21 = new ArrayList<>();
    List<String> twentytwo = new ArrayList<>();
    List<String> twentythree = new ArrayList<>();
    List<String> twentyfour = new ArrayList<>();
    List<String> twentyfive = new ArrayList<>();
    List<String> twentysix = new ArrayList<>();
    List<String> twentyseven = new ArrayList<>();
    List<String> twentyeight = new ArrayList<>();
    List<String> twentynine = new ArrayList<>();
    List<String> thirty = new ArrayList<>();
    List<String> thirtyone = new ArrayList<>();
    List<String> thirtytwo = new ArrayList<>();
    List<String> thirtythree = new ArrayList<>();
    List<String> thirtyfour = new ArrayList<>();
    List<String> thirtyfive = new ArrayList<>();
    List<String> thirtysix = new ArrayList<>();
    List<String> thirtyseven = new ArrayList<>();





    @EventHandler
    public void onCommand(PlayerCommandPreprocessEvent event) {
        if (event.getMessage().startsWith("/buy")) {
            event.setCancelled(true);
            openGUI(event.getPlayer());
        }
    }

    private void openGUI(Player player) {
        one.clear();
        two.clear();
        three.clear();
        four.clear();
        five.clear();
        six.clear();
        seven.clear();
        eight.clear();
        nine.clear();
        ten.clear();
        eleven.clear();
        twelve.clear();
        thirteen.clear();
        fourteen.clear();
        multi.clear();
        sixteen.clear();
        seventeen.clear();
        eighteen.clear();
        nineteen.clear();
        twenty.clear();
        not21.clear();
        twentytwo.clear();
        twentythree.clear();
        twentyfour.clear();
        twentyfive.clear();
        twentysix.clear();
        twentyseven.clear();
        twentyeight.clear();
        twentynine.clear();
        thirty.clear();
        thirtyone.clear();
        thirtytwo.clear();
        thirtythree.clear();
        thirtyfour.clear();
        thirtyfive.clear();
        thirtysix.clear();
        thirtyseven.clear();
        Inventory gui = Bukkit.createInventory(null, 45, "Buy Menu");


        //  Aqua affinity
        ItemStack aquaAfinity = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta aquaAfinityItemMeta = (EnchantmentStorageMeta) aquaAfinity.getItemMeta();
        aquaAfinityItemMeta.addStoredEnchant(Enchantment.WATER_WORKER, 1, true);
        one.add(ChatColor.GREEN + "Price:");
        one.add(ChatColor.BLUE + "30 Emeralds and 3 Levels of XP");
        aquaAfinityItemMeta.setLore(one);
        aquaAfinity.setItemMeta(aquaAfinityItemMeta);
        gui.setItem(0, aquaAfinity);

        // Bane of Arthropods
        ItemStack arthopods = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta baneOfArthopodsItemMeta = (EnchantmentStorageMeta) arthopods.getItemMeta();
        baneOfArthopodsItemMeta.addStoredEnchant(Enchantment.DAMAGE_ARTHROPODS, 5, true);
        two.add(ChatColor.GREEN + "Price:");
        two.add(ChatColor.BLUE + "25 Emeralds and 3 Levels of XP");
        baneOfArthopodsItemMeta.setLore(two);
        arthopods.setItemMeta(baneOfArthopodsItemMeta);
        gui.setItem(1, arthopods);

        // Blast Prot
        ItemStack blastProt = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta blastProtectionItemMeta = (EnchantmentStorageMeta) blastProt.getItemMeta();
        blastProtectionItemMeta.addStoredEnchant(Enchantment.PROTECTION_EXPLOSIONS, 5, true);
        three.add(ChatColor.GREEN + "Price:");
        three.add(ChatColor.BLUE + "30 Emeralds and 3 Levels of XP");
        blastProtectionItemMeta.setLore(three);
        blastProt.setItemMeta(blastProtectionItemMeta);
        gui.setItem(2, blastProt);

        // Channeling
        ItemStack channeling = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta channelingItemMeta = (EnchantmentStorageMeta) channeling.getItemMeta();
        channelingItemMeta.addStoredEnchant(Enchantment.CHANNELING, 1, true);
        four.add(ChatColor.GREEN + "Price:");
        four.add(ChatColor.BLUE + "35 Emeralds and 3 Levels of XP");
        channelingItemMeta.setLore(four);
        channeling.setItemMeta(channelingItemMeta);
        gui.setItem(3, channeling);

        // Dept Strider
        ItemStack deptStrider = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta deptStriderItemMeta = (EnchantmentStorageMeta) deptStrider.getItemMeta();
        deptStriderItemMeta.addStoredEnchant(Enchantment.DEPTH_STRIDER, 3, true);
        five.add(ChatColor.GREEN + "Price:");
        five.add(ChatColor.BLUE + "30 Emeralds and 3 Levels of XP");
        deptStriderItemMeta.setLore(five);
        deptStrider.setItemMeta(deptStriderItemMeta);
        gui.setItem(4, deptStrider);

        // Efficency
        ItemStack efficency = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta efficencyItemMeta = (EnchantmentStorageMeta) efficency.getItemMeta();
        efficencyItemMeta.addStoredEnchant(Enchantment.DIG_SPEED, 5, true);
        six.add(ChatColor.GREEN + "Price:");
        six.add(ChatColor.BLUE + "40 Emeralds and 3 Levels of XP");
        efficencyItemMeta.setLore(six);
        efficency.setItemMeta(efficencyItemMeta);
        gui.setItem(5, efficency);

        // Feather Falling
        ItemStack featherFalling = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta featherFallingItemMeta = (EnchantmentStorageMeta) featherFalling.getItemMeta();
        featherFallingItemMeta.addStoredEnchant(Enchantment.PROTECTION_FALL, 4, true);
        seven.add(ChatColor.GREEN + "Price:");
        seven.add(ChatColor.BLUE + "30 Emeralds and 3 Levels of XP");
        featherFallingItemMeta.setLore(seven);
        featherFalling.setItemMeta(featherFallingItemMeta);
        gui.setItem(6, featherFalling);

        // Fire Aspect
        ItemStack fireAspect = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta fireAspectItemMeta = (EnchantmentStorageMeta) fireAspect.getItemMeta();
        fireAspectItemMeta.addStoredEnchant(Enchantment.FIRE_ASPECT, 2, true);
        channelingItemMeta.addStoredEnchant(Enchantment.CHANNELING, 1, true);
        eight.add(ChatColor.GREEN + "Price:");
        eight.add(ChatColor.BLUE + "35 Emeralds and 3 Levels of XP");
        fireAspectItemMeta.setLore(eight);
        fireAspect.setItemMeta(fireAspectItemMeta);
        gui.setItem(7, fireAspect);

        // Fire Protection
        ItemStack fireProt = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta fireProtectionItemMeta = (EnchantmentStorageMeta) fireProt.getItemMeta();
        fireProtectionItemMeta.addStoredEnchant(Enchantment.PROTECTION_FIRE, 4, true);
        nine.add(ChatColor.GREEN + "Price:");
        nine.add(ChatColor.BLUE + "30 Emeralds and 3 Levels of XP");
        fireProtectionItemMeta.setLore(nine);
        fireProt.setItemMeta(fireProtectionItemMeta);
        gui.setItem(8, fireProt);

        // Flame
        ItemStack flame = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta flameItemMeta = (EnchantmentStorageMeta) flame.getItemMeta();
        flameItemMeta.addStoredEnchant(Enchantment.ARROW_FIRE, 1, true);
        ten.add(ChatColor.GREEN + "Price:");
        ten.add(ChatColor.BLUE + "40 Emeralds and 3 Levels of XP");
        flameItemMeta.setLore(ten);
        flame.setItemMeta(flameItemMeta);
        gui.setItem(9, flame);

        // Fortune
        ItemStack fortune = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta fortuneItemMeta = (EnchantmentStorageMeta) fortune.getItemMeta();
        fortuneItemMeta.addStoredEnchant(Enchantment.LOOT_BONUS_BLOCKS, 3, true);
        not21.add(ChatColor.GREEN + "Price:");
        not21.add(ChatColor.BLUE + "40 Emeralds and 3 Levels of XP");
        fortuneItemMeta.setLore(not21);
        fortune.setItemMeta(fortuneItemMeta);
        gui.setItem(10, fortune);

        // Frost Walker
        ItemStack frostWalker = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta frostWalkerItemMeta = (EnchantmentStorageMeta) frostWalker.getItemMeta();
        frostWalkerItemMeta.addStoredEnchant(Enchantment.FROST_WALKER, 2, true);
        twelve.add(ChatColor.GREEN + "Price:");
        twelve.add(ChatColor.BLUE + "35 Emeralds and 3 Levels of XP");
        frostWalkerItemMeta.setLore(twelve);
        frostWalker.setItemMeta(frostWalkerItemMeta);
        gui.setItem(11, frostWalker);

        // Impaling
        ItemStack impaling = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta impalingItemMeta = (EnchantmentStorageMeta) impaling.getItemMeta();
        impalingItemMeta.addStoredEnchant(Enchantment.IMPALING, 5, true);
        eleven.add(ChatColor.GREEN + "Price:");
        eleven.add(ChatColor.BLUE + "35 Emeralds and 3 Levels of XP");
        impalingItemMeta.setLore(eleven);
        impaling.setItemMeta(impalingItemMeta);
        gui.setItem(12, impaling);

        // Infinity
        ItemStack infinity = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta infintyItemMeta = (EnchantmentStorageMeta) infinity.getItemMeta();
        infintyItemMeta.addStoredEnchant(Enchantment.ARROW_INFINITE, 1, true);
        thirteen.add(ChatColor.GREEN + "Price:");
        thirteen.add(ChatColor.BLUE + "40 Emeralds and 3 Levels of XP");
        infintyItemMeta.setLore(thirteen);
        infinity.setItemMeta(infintyItemMeta);
        gui.setItem(13, infinity);

        // Knockback
        ItemStack knockback = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta knockbackItemMeta = (EnchantmentStorageMeta) knockback.getItemMeta();
        knockbackItemMeta.addStoredEnchant(Enchantment.KNOCKBACK, 2, true);
        fourteen.add(ChatColor.GREEN + "Price:");
        fourteen.add(ChatColor.BLUE + "35 Emeralds and 3 Levels of XP");
        knockbackItemMeta.setLore(fourteen);
        knockback.setItemMeta(knockbackItemMeta);
        gui.setItem(14, knockback);

        // Looting
        ItemStack looting = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta lootingItemMeta = (EnchantmentStorageMeta) looting.getItemMeta();
        lootingItemMeta.addStoredEnchant(Enchantment.LOOT_BONUS_MOBS, 3, true);
        sixteen.add(ChatColor.GREEN + "Price:");
        sixteen.add(ChatColor.BLUE + "40 Emeralds and 3 Levels of XP");
        lootingItemMeta.setLore(sixteen);
        looting.setItemMeta(lootingItemMeta);
        gui.setItem(15, looting);

        // Loyalty
        ItemStack loyalty = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta loyaltyItemMeta = (EnchantmentStorageMeta) loyalty.getItemMeta();
        loyaltyItemMeta.addStoredEnchant(Enchantment.LOYALTY, 3, true);
        seventeen.add(ChatColor.GREEN + "Price:");
        seventeen.add(ChatColor.BLUE + "35 Emeralds and 3 Levels of XP");
        loyaltyItemMeta.setLore(seventeen);
        loyalty.setItemMeta(loyaltyItemMeta);
        gui.setItem(16, loyalty);

        // Luck of the sea
        ItemStack luckOfTheSea = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta luckOfTheSeaItemMeta = (EnchantmentStorageMeta) luckOfTheSea.getItemMeta();
        luckOfTheSeaItemMeta.addStoredEnchant(Enchantment.LUCK, 3, true);
        eighteen.add(ChatColor.GREEN + "Price:");
        eighteen.add(ChatColor.BLUE + "30 Emeralds and 3 Levels of XP");
        luckOfTheSeaItemMeta.setLore(eighteen);
        luckOfTheSea.setItemMeta(luckOfTheSeaItemMeta);
        gui.setItem(17, luckOfTheSea);

        // Lure
        ItemStack lure = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta lureItemMeta = (EnchantmentStorageMeta) lure.getItemMeta();
        lureItemMeta.addStoredEnchant(Enchantment.LURE, 3, true);
        nineteen.add(ChatColor.GREEN + "Price:");
        nineteen.add(ChatColor.BLUE + "30 Emeralds and 3 Levels of XP");
        lureItemMeta.setLore(nineteen);
        lure.setItemMeta(lureItemMeta);
        gui.setItem(18, lure);

        // Mending book item
        ItemStack mendingBook = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta mendingMeta = (EnchantmentStorageMeta) mendingBook.getItemMeta();
        mendingMeta.addStoredEnchant(Enchantment.MENDING, 1, true);
        twenty.add(ChatColor.GREEN + "Price:");
        twenty.add(ChatColor.BLUE + "40 Emeralds and 3 Levels of XP");
        mendingMeta.setLore(twenty);
        mendingBook.setItemMeta(mendingMeta);
        gui.setItem(19, mendingBook);

        // Multi-shot
        ItemStack multiShot = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta MultiShotItemMeta = (EnchantmentStorageMeta) multiShot.getItemMeta();
        MultiShotItemMeta.addStoredEnchant(Enchantment.MULTISHOT, 1, true);
        multi.add(ChatColor.GREEN + "Price:");
        multi.add(ChatColor.BLUE + "35 Emeralds and 3 Levels of XP");
        MultiShotItemMeta.setLore(multi);
        multiShot.setItemMeta(MultiShotItemMeta);
        gui.setItem(20, multiShot);

        // Piercing
        ItemStack piercing = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta piercingItemMeta = (EnchantmentStorageMeta) piercing.getItemMeta();
        piercingItemMeta.addStoredEnchant(Enchantment.PIERCING, 4, true);
        twentytwo.add(ChatColor.GREEN + "Price:");
        twentytwo.add(ChatColor.BLUE + "25 Emeralds and 3 Levels of XP");
        piercingItemMeta.setLore(twentytwo);
        piercing.setItemMeta(piercingItemMeta);
        gui.setItem(21, piercing);

        // Power
        ItemStack power = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta powerItemMeta = (EnchantmentStorageMeta) power.getItemMeta();
        powerItemMeta.addStoredEnchant(Enchantment.ARROW_DAMAGE, 5, true);
        twentythree.add(ChatColor.GREEN + "Price:");
        twentythree.add(ChatColor.BLUE + "40 Emeralds and 3 Levels of XP");
        powerItemMeta.setLore(twentythree);
        power.setItemMeta(powerItemMeta);
        gui.setItem(22, power);

        // Projectile Protection
        ItemStack projectileProtection = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta projectileProtectionItemMeta = (EnchantmentStorageMeta) projectileProtection.getItemMeta();
        projectileProtectionItemMeta.addStoredEnchant(Enchantment.PROTECTION_PROJECTILE, 4, true);
        twentyfour.add(ChatColor.GREEN + "Price:");
        twentyfour.add(ChatColor.BLUE + "30 Emeralds and 3 Levels of XP");
        projectileProtectionItemMeta.setLore(twentyfour);
        projectileProtection.setItemMeta(projectileProtectionItemMeta);
        gui.setItem(23, projectileProtection);

        // Protection
        ItemStack protection = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta protectionItemMeta = (EnchantmentStorageMeta) protection.getItemMeta();
        protectionItemMeta.addStoredEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
        twentyfive.add(ChatColor.GREEN + "Price:");
        twentyfive.add(ChatColor.BLUE + "40 Emeralds and 3 Levels of XP");
        protectionItemMeta.setLore(twentyfive);
        protection.setItemMeta(protectionItemMeta);
        gui.setItem(24, protection);

        // Punch
        ItemStack punch = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta punchItemMeta = (EnchantmentStorageMeta) punch.getItemMeta();
        punchItemMeta.addStoredEnchant(Enchantment.ARROW_KNOCKBACK, 2, true);
        twentysix.add(ChatColor.GREEN + "Price:");
        twentysix.add(ChatColor.BLUE + "40 Emeralds and 3 Levels of XP");
        punchItemMeta.setLore(twentysix);
        punch.setItemMeta(punchItemMeta);
        gui.setItem(25, punch);

        // Quick Charge
        ItemStack quickCharge = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta quickChargeItemMeta = (EnchantmentStorageMeta) quickCharge.getItemMeta();
        quickChargeItemMeta.addStoredEnchant(Enchantment.QUICK_CHARGE, 3, true);
        twentyseven.add(ChatColor.GREEN + "Price:");
        twentyseven.add(ChatColor.BLUE + "35 Emeralds and 3 Levels of XP");
        quickChargeItemMeta.setLore(twentyseven);
        quickCharge.setItemMeta(quickChargeItemMeta);
        gui.setItem(26, quickCharge);

        // Respiration
        ItemStack respiration = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta respirationItemMeta = (EnchantmentStorageMeta) respiration.getItemMeta();
        respirationItemMeta.addStoredEnchant(Enchantment.OXYGEN, 3, true);
        twentyeight.add(ChatColor.GREEN + "Price:");
        twentyeight.add(ChatColor.BLUE + "35 Emeralds and 3 Levels of XP");
        respirationItemMeta.setLore(twentyeight);
        respiration.setItemMeta(respirationItemMeta);
        gui.setItem(27, respiration);

        // Riptide
        ItemStack riptide = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta riptideItemMeta = (EnchantmentStorageMeta) riptide.getItemMeta();
        riptideItemMeta.addStoredEnchant(Enchantment.RIPTIDE, 3, true);
        twentynine.add(ChatColor.GREEN + "Price:");
        twentynine.add(ChatColor.BLUE + "40 Emeralds and 3 Levels of XP");
        riptideItemMeta.setLore(twentynine);
        riptide.setItemMeta(riptideItemMeta);
        gui.setItem(28, riptide);

        // Sharpness
        ItemStack sharpness = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta sharpnessItemMeta = (EnchantmentStorageMeta) sharpness.getItemMeta();
        sharpnessItemMeta.addStoredEnchant(Enchantment.DAMAGE_ALL, 5, true);
        thirty.add(ChatColor.GREEN + "Price:");
        thirty.add(ChatColor.BLUE + "40 Emeralds and 3 Levels of XP");
        sharpnessItemMeta.setLore(thirty);
        sharpness.setItemMeta(sharpnessItemMeta);
        gui.setItem(29, sharpness);

        // Silk Touch
        ItemStack silkTouch = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta silkTouchItemMeta = (EnchantmentStorageMeta) silkTouch.getItemMeta();
        silkTouchItemMeta.addStoredEnchant(Enchantment.SILK_TOUCH, 1, true);
        thirtyone.add(ChatColor.GREEN + "Price:");
        thirtyone.add(ChatColor.BLUE + "40 Emeralds and 3 Levels of XP");
        silkTouchItemMeta.setLore(thirtyone);
        silkTouch.setItemMeta(silkTouchItemMeta);
        gui.setItem(30, silkTouch);

        // Smite
        ItemStack smite = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta smiteItemMeta = (EnchantmentStorageMeta) smite.getItemMeta();
        smiteItemMeta.addStoredEnchant(Enchantment.DAMAGE_UNDEAD, 5, true);
        thirtytwo.add(ChatColor.GREEN + "Price:");
        thirtytwo.add(ChatColor.BLUE + "25 Emeralds and 3 Levels of XP");
        smiteItemMeta.setLore(thirtytwo);
        smite.setItemMeta(smiteItemMeta);
        gui.setItem(31, smite);

        // Soul Speed
        ItemStack soulSpeed = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta soulSpeedItemMeta = (EnchantmentStorageMeta) soulSpeed.getItemMeta();
        soulSpeedItemMeta.addStoredEnchant(Enchantment.SOUL_SPEED, 3, true);
        thirtythree.add(ChatColor.GREEN + "Price:");
        thirtythree.add(ChatColor.BLUE + "30 Emeralds and 3 Levels of XP");
        soulSpeedItemMeta.setLore(thirtythree);
        soulSpeed.setItemMeta(soulSpeedItemMeta);
        gui.setItem(32, soulSpeed);

        // Sweeping Edge
        ItemStack sweepingEdge = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta sweepingEdgeItemMeta = (EnchantmentStorageMeta) sweepingEdge.getItemMeta();
        sweepingEdgeItemMeta.addStoredEnchant(Enchantment.SWEEPING_EDGE, 3, true);
        thirtyfour.add(ChatColor.GREEN + "Price:");
        thirtyfour.add(ChatColor.BLUE + "35 Emeralds and 3 Levels of XP");
        sweepingEdgeItemMeta.setLore(thirtyfour);
        sweepingEdge.setItemMeta(sweepingEdgeItemMeta);
        gui.setItem(33, sweepingEdge);

        // Swift Sneak
        ItemStack swiftSneak = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta swiftSneakItemMeta = (EnchantmentStorageMeta) swiftSneak.getItemMeta();
        swiftSneakItemMeta.addStoredEnchant(Enchantment.SWIFT_SNEAK, 3, true);
        thirtyfive.add(ChatColor.GREEN + "Price:");
        thirtyfive.add(ChatColor.BLUE + "35 Emeralds and 3 Levels of XP");
        swiftSneakItemMeta.setLore(thirtyfive);
        swiftSneak.setItemMeta(swiftSneakItemMeta);
        gui.setItem(34, swiftSneak);

        // Thorns
        ItemStack thorns = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta ThornsItemMeta = (EnchantmentStorageMeta) thorns.getItemMeta();
        ThornsItemMeta.addStoredEnchant(Enchantment.THORNS, 3, true);
        thirtysix.add(ChatColor.GREEN + "Price:");
        thirtysix.add(ChatColor.BLUE + "40 Emeralds and 3 Levels of XP");
        ThornsItemMeta.setLore(thirtysix);
        thorns.setItemMeta(ThornsItemMeta);
        gui.setItem(35, thorns);

        // Unbreaking
        ItemStack unbreaking = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta unbreakingItemMeta = (EnchantmentStorageMeta) unbreaking.getItemMeta();
        unbreakingItemMeta.addStoredEnchant(Enchantment.DURABILITY, 3, true);
        thirtyseven.add(ChatColor.GREEN + "Price:");
        thirtyseven.add(ChatColor.BLUE + "40 Emeralds and 3 Levels of XP");
        unbreakingItemMeta.setLore(thirtyseven);
        unbreaking.setItemMeta(unbreakingItemMeta);
        gui.setItem(36, unbreaking);


        player.openInventory(gui);
    }


    private ItemStack removeLore(ItemStack item) {
        ItemStack newItem = new ItemStack(item);
        ItemMeta meta = newItem.getItemMeta();
        if (meta != null) {
            meta.setLore(new ArrayList<>());
            newItem.setItemMeta(meta);
        }
        return newItem;
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        Inventory gui = event.getInventory();
        if (gui.getSize() == 45) {
            event.setCancelled(true);
            Player player = (Player) event.getWhoClicked();
            int slot = event.getSlot();

            if (slot == 0 && gui.getItem(0) != null) {
                processTransaction(player, gui.getItem(0), 30, 3, "Aqua Affinity");
            } else if (slot == 1 && gui.getItem(1) != null) {
                processTransaction(player, gui.getItem(1), 25, 3, "Bane of Arthropods");
            } else if (slot == 2 && gui.getItem(2) != null) {
                processTransaction(player, gui.getItem(2), 30, 3, "Blast Protection");
            } else if (slot == 3 && gui.getItem(3) != null) {
                processTransaction(player, gui.getItem(3), 35, 3, "Channeling");
            } else if (slot == 4 && gui.getItem(4) != null) {
                processTransaction(player, gui.getItem(4), 30, 3, "Depth Strider");
            } else if (slot == 5 && gui.getItem(5) != null) {
                processTransaction(player, gui.getItem(5), 40, 3, "Efficiency");
            } else if (slot == 6 && gui.getItem(6) != null) {
                processTransaction(player, gui.getItem(6), 30, 3, "Feather Falling");
            } else if (slot == 7 && gui.getItem(7) != null) {
                processTransaction(player, gui.getItem(7), 35, 3, "Fire Aspect");
            } else if (slot == 8 && gui.getItem(8) != null) {
                processTransaction(player, gui.getItem(8), 30, 3, "Fire Protection");
            } else if (slot == 9 && gui.getItem(9) != null) {
                processTransaction(player, gui.getItem(9), 40, 3, "Flame");
            } else if (slot == 10 && gui.getItem(10) != null) {
                processTransaction(player, gui.getItem(10), 40, 3, "Fortune");
            } else if (slot == 11 && gui.getItem(11) != null) {
                processTransaction(player, gui.getItem(11), 35, 3, "Frost Walker");
            } else if (slot == 12 && gui.getItem(12) != null) {
                processTransaction(player, gui.getItem(12), 35, 3, "Impaling");
            } else if (slot == 13 && gui.getItem(13) != null) {
                processTransaction(player, gui.getItem(13), 40, 3, "Infinity");
            } else if (slot == 14 && gui.getItem(14) != null) {
                processTransaction(player, gui.getItem(14), 35, 3, "Knockback");
            } else if (slot == 15 && gui.getItem(15) != null) {
                processTransaction(player, gui.getItem(15), 40, 3, "Looting");
            } else if (slot == 16 && gui.getItem(16) != null) {
                processTransaction(player, gui.getItem(16), 35, 3, "Loyalty");
            } else if (slot == 17 && gui.getItem(17) != null) {
                processTransaction(player, gui.getItem(17), 30, 3, "Luck of the Sea");
            } else if (slot == 18 && gui.getItem(18) != null) {
                processTransaction(player, gui.getItem(18), 30, 3, "Lure");
            } else if (slot == 19 && gui.getItem(19) != null) {
                processTransaction(player, gui.getItem(19), 40, 3, "Mending");
            } else if (slot == 20 && gui.getItem(20) != null) {
                processTransaction(player, gui.getItem(20), 35, 3, "Multishot");
            } else if (slot == 21 && gui.getItem(21) != null) {
                processTransaction(player, gui.getItem(21), 25, 3, "Piercing");
            } else if (slot == 22 && gui.getItem(22) != null) {
                processTransaction(player, gui.getItem(22), 40, 3, "Power");
            } else if (slot == 23 && gui.getItem(23) != null) {
                processTransaction(player, gui.getItem(23), 30, 3, "Projectile Protection");
            } else if (slot == 24 && gui.getItem(24) != null) {
                processTransaction(player, gui.getItem(24), 40, 3, "Protection");
            } else if (slot == 25 && gui.getItem(25) != null) {
                processTransaction(player, gui.getItem(25), 40, 3, "Punch");
            } else if (slot == 26 && gui.getItem(26) != null) {
                processTransaction(player, gui.getItem(26), 35, 3, "Quick Charge");
            } else if (slot == 27 && gui.getItem(27) != null) {
                processTransaction(player, gui.getItem(27), 35, 3, "Respiration");
            } else if (slot == 28 && gui.getItem(28) != null) {
                processTransaction(player, gui.getItem(28), 40, 3, "Riptide");
            } else if (slot == 29 && gui.getItem(29) != null) {
                processTransaction(player, gui.getItem(29), 40, 3, "Sharpness");
            } else if (slot == 30 && gui.getItem(30) != null) {
                processTransaction(player, gui.getItem(30), 40, 3, "Silk Touch");
            } else if (slot == 31 && gui.getItem(31) != null) {
                processTransaction(player, gui.getItem(31), 25, 3, "Smite");
            } else if (slot == 32 && gui.getItem(32) != null) {
                processTransaction(player, gui.getItem(32), 30, 3, "Soul Speed");
            } else if (slot == 33 && gui.getItem(33) != null) {
                processTransaction(player, gui.getItem(33), 30, 3, "Sweeping Edge");
            } else if (slot == 34 && gui.getItem(34) != null) {
                processTransaction(player, gui.getItem(34), 35, 3, "Swift Sneak");
            } else if (slot == 35 && gui.getItem(35) != null) {
                processTransaction(player, gui.getItem(35), 40, 3, "Thorns");
            } else if (slot == 36 && gui.getItem(36) != null) {
                processTransaction(player, gui.getItem(36), 40, 3, "Unbreaking");
            }
        }
    }

    private void processTransaction(@NotNull Player player, ItemStack item, int emeraldsCost, int xpCost, String bookName) {
        if (player.getInventory().containsAtLeast(new ItemStack(Material.EMERALD), emeraldsCost)) {
            if (player.getLevel() >= xpCost) {
                player.getInventory().removeItem(new ItemStack(Material.EMERALD, emeraldsCost));
                player.getInventory().addItem(removeLore(item));
                player.setLevel(player.getLevel() - xpCost);
                player.sendMessage("You bought a " + bookName + " book for " + emeraldsCost + " emeralds and " + xpCost + " levels of XP!");
            } else {
                player.sendMessage("You don't have enough experience levels!");
            }
        } else {
            player.sendMessage("You don't have enough emeralds!");
        }
    }
}