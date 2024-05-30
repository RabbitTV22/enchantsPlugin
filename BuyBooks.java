package net.rabbitnetwork.buybooks;

import org.bukkit.Bukkit;
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
import org.bukkit.plugin.java.JavaPlugin;

public class BuyBooks extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onCommand(PlayerCommandPreprocessEvent event) {
        if (event.getMessage().startsWith("/buy")) {
            event.setCancelled(true);
            openGUI(event.getPlayer());
        }
    }

    private void openGUI(Player player) {
        Inventory gui = Bukkit.createInventory(null, 40, "Buy Menu");




        //  Aqua affinity
        ItemStack aquaAfinity = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta aquaAfinityItemMeta = (EnchantmentStorageMeta) aquaAfinity.getItemMeta();
        aquaAfinityItemMeta.addStoredEnchant(Enchantment.WATER_WORKER, 1, true);
        aquaAfinity.setItemMeta(aquaAfinityItemMeta);
        gui.setItem(0, aquaAfinity);

// Bane of Arthropods
        ItemStack arthopods = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta baneOfArthopodsItemMeta = (EnchantmentStorageMeta) arthopods.getItemMeta();
        baneOfArthopodsItemMeta.addStoredEnchant(Enchantment.DAMAGE_ARTHROPODS, 5, true);
        arthopods.setItemMeta(baneOfArthopodsItemMeta);
        gui.setItem(1, arthopods);

        // Blast Prot
        ItemStack blastProt = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta blastProtectionItemMeta = (EnchantmentStorageMeta) blastProt.getItemMeta();
        blastProtectionItemMeta.addStoredEnchant(Enchantment.PROTECTION_EXPLOSIONS, 5, true);
        blastProt.setItemMeta(blastProtectionItemMeta);
        gui.setItem(2, blastProt);

// Channeling
        ItemStack channeling = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta channelingItemMeta = (EnchantmentStorageMeta) channeling.getItemMeta();
        channelingItemMeta.addStoredEnchant(Enchantment.CHANNELING, 1, true);
        channeling.setItemMeta(channelingItemMeta);
        gui.setItem(3, channeling);

        // Dept Strider
        ItemStack deptStrider = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta deptStriderItemMeta = (EnchantmentStorageMeta) deptStrider.getItemMeta();
        deptStriderItemMeta.addStoredEnchant(Enchantment.DEPTH_STRIDER, 3, true);
        deptStrider.setItemMeta(deptStriderItemMeta);
        gui.setItem(4, deptStrider);

        // Efficency
        ItemStack efficency = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta efficencyItemMeta = (EnchantmentStorageMeta) efficency.getItemMeta();
        efficencyItemMeta.addStoredEnchant(Enchantment.DIG_SPEED, 5, true);
        efficency.setItemMeta(efficencyItemMeta);
        gui.setItem(5, efficency);

        // Feather Falling
        ItemStack featherFalling = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta featherFallingItemMeta = (EnchantmentStorageMeta) featherFalling.getItemMeta();
        featherFallingItemMeta.addStoredEnchant(Enchantment.PROTECTION_FALL, 4, true);
        featherFalling.setItemMeta(featherFallingItemMeta);
        gui.setItem(6, featherFalling);

        // Fire Aspect
        ItemStack fireAspect = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta fireAspectItemMeta = (EnchantmentStorageMeta) fireAspect.getItemMeta();
        fireAspectItemMeta.addStoredEnchant(Enchantment.FIRE_ASPECT, 2, true);
        fireAspect.setItemMeta(fireAspectItemMeta);
        gui.setItem(7, fireAspect);

        // Fire Protection
        ItemStack fireProt = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta fireProtectionItemMeta = (EnchantmentStorageMeta) fireProt.getItemMeta();
        fireProtectionItemMeta.addStoredEnchant(Enchantment.PROTECTION_FIRE, 4, true);
        fireProt.setItemMeta(fireProtectionItemMeta);
        gui.setItem(8, fireProt);

        // Flame
        ItemStack flame = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta flameItemMeta = (EnchantmentStorageMeta) flame.getItemMeta();
        flameItemMeta.addStoredEnchant(Enchantment.ARROW_FIRE, 1, true);
        flame.setItemMeta(flameItemMeta);
        gui.setItem(9, flame);

        // Fortune
        ItemStack fortune = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta fortuneItemMeta = (EnchantmentStorageMeta) fortune.getItemMeta();
        fortuneItemMeta.addStoredEnchant(Enchantment.LOOT_BONUS_BLOCKS, 3, true);
        fortune.setItemMeta(fortuneItemMeta);
        gui.setItem(10, flame);

        // Frost Walker
        ItemStack frostWalker = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta frostWalkerItemMeta = (EnchantmentStorageMeta) frostWalker.getItemMeta();
        frostWalkerItemMeta.addStoredEnchant(Enchantment.FROST_WALKER, 2, true);
        frostWalker.setItemMeta(frostWalkerItemMeta);
        gui.setItem(11, frostWalker);

        // Impaling
        ItemStack impaling = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta impalingItemMeta = (EnchantmentStorageMeta) impaling.getItemMeta();
        impalingItemMeta.addStoredEnchant(Enchantment.IMPALING, 5, true);
        impaling.setItemMeta(impalingItemMeta);
        gui.setItem(12, impaling);

        // Infinity
        ItemStack infinity = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta infintyItemMeta = (EnchantmentStorageMeta) infinity.getItemMeta();
        infintyItemMeta.addStoredEnchant(Enchantment.ARROW_INFINITE, 1, true);
        infinity.setItemMeta(infintyItemMeta);
        gui.setItem(13, infinity);

        // Knockback
        ItemStack knockback = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta knockbackItemMeta = (EnchantmentStorageMeta) knockback.getItemMeta();
        knockbackItemMeta.addStoredEnchant(Enchantment.KNOCKBACK, 2, true);
        knockback.setItemMeta(knockbackItemMeta);
        gui.setItem(14, knockback);

        // Looting
        ItemStack looting = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta lootingItemMeta = (EnchantmentStorageMeta) looting.getItemMeta();
        lootingItemMeta.addStoredEnchant(Enchantment.LOOT_BONUS_MOBS, 3, true);
        looting.setItemMeta(lootingItemMeta);
        gui.setItem(15, looting);

        // Loyalty
        ItemStack loyalty = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta loyaltyItemMeta = (EnchantmentStorageMeta) loyalty.getItemMeta();
        loyaltyItemMeta.addStoredEnchant(Enchantment.LOYALTY, 3,  true);
        loyalty.setItemMeta(loyaltyItemMeta);
        gui.setItem(16, loyalty);

        // Luck of the sea
        ItemStack luckOfTheSea = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta luckOfTheSeaItemMeta = (EnchantmentStorageMeta) luckOfTheSea.getItemMeta();
        luckOfTheSeaItemMeta.addStoredEnchant(Enchantment.LUCK, 3, true);
        luckOfTheSea.setItemMeta(luckOfTheSeaItemMeta);
        gui.setItem(17, luckOfTheSea);

        // Lure
        ItemStack lure = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta lureItemMeta = (EnchantmentStorageMeta) lure.getItemMeta();
        lureItemMeta.addStoredEnchant(Enchantment.LURE, 3, true);
        lure.setItemMeta(lureItemMeta);
        gui.setItem(18, lure);

        // Mending book item
        ItemStack mendingBook = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta mendingMeta = (EnchantmentStorageMeta) mendingBook.getItemMeta();
        mendingMeta.addStoredEnchant(Enchantment.MENDING, 1, true);
        mendingBook.setItemMeta(mendingMeta);
        gui.setItem(19, mendingBook);

        // Multishot
        ItemStack multiShot = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta MultiShotItemMeta = (EnchantmentStorageMeta) multiShot.getItemMeta();
        MultiShotItemMeta.addStoredEnchant(Enchantment.MULTISHOT, 1, true);
        multiShot.setItemMeta(MultiShotItemMeta);
        gui.setItem(20, multiShot);

        // Piercing
        ItemStack piercing = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta piercingItemMeta = (EnchantmentStorageMeta) piercing.getItemMeta();
        piercingItemMeta.addStoredEnchant(Enchantment.PIERCING, 4, true);
        piercing.setItemMeta(piercingItemMeta);
        gui.setItem(21, piercing);

        // Power
        ItemStack power = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta powerItemMeta = (EnchantmentStorageMeta) power.getItemMeta();
        powerItemMeta.addStoredEnchant(Enchantment.ARROW_DAMAGE, 5, true);
        power.setItemMeta(powerItemMeta);
        gui.setItem(22, power);

        // Projectile Protection
        ItemStack projectileProtection = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta projectileProtectionItemMeta = (EnchantmentStorageMeta) projectileProtection.getItemMeta();
        projectileProtectionItemMeta.addStoredEnchant(Enchantment.PROTECTION_PROJECTILE, 4, true);
        projectileProtection.setItemMeta(projectileProtectionItemMeta);
        gui.setItem(23, projectileProtection);

        // Protection
        ItemStack protection = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta protectionItemMeta = (EnchantmentStorageMeta) protection.getItemMeta();
        protectionItemMeta.addStoredEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
        protection.setItemMeta(protectionItemMeta);
        gui.setItem(24, protection);

        // Punch
        ItemStack punch = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta punchItemMeta = (EnchantmentStorageMeta) punch.getItemMeta();
        punchItemMeta.addStoredEnchant(Enchantment.ARROW_KNOCKBACK, 2, true);
        punch.setItemMeta(punchItemMeta);
        gui.setItem(25, piercing);

        // Quick Charge
        ItemStack quickCharge = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta quickChargeItemMeta = (EnchantmentStorageMeta) quickCharge.getItemMeta();
        quickChargeItemMeta.addStoredEnchant(Enchantment.QUICK_CHARGE, 3, true);
        quickCharge.setItemMeta(quickChargeItemMeta);
        gui.setItem(26, quickCharge);

        // Respiration
        ItemStack respiration = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta respirationItemMeta = (EnchantmentStorageMeta) respiration.getItemMeta();
        respirationItemMeta.addStoredEnchant(Enchantment.OXYGEN, 3, true);
        respiration.setItemMeta(respirationItemMeta);
        gui.setItem(27, respiration);

        // Riptide
        ItemStack riptide = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta riptideItemMeta = (EnchantmentStorageMeta) riptide.getItemMeta();
        riptideItemMeta.addStoredEnchant(Enchantment.RIPTIDE, 3, true);
        riptide.setItemMeta(riptideItemMeta);
        gui.setItem(28, riptide);

        // Sharpness
        ItemStack sharpness = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta sharpnessItemMeta = (EnchantmentStorageMeta) sharpness.getItemMeta();
        sharpnessItemMeta.addStoredEnchant(Enchantment.DAMAGE_ALL, 5, true);
        sharpness.setItemMeta(sharpnessItemMeta);
        gui.setItem(29, sharpness);

        // Silk Touch
        ItemStack silkTouch = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta silkTouchItemMeta = (EnchantmentStorageMeta) silkTouch.getItemMeta();
        silkTouchItemMeta.addStoredEnchant(Enchantment.SILK_TOUCH, 1, true);
        silkTouch.setItemMeta(silkTouchItemMeta);
        gui.setItem(30, silkTouch);

        // Smite
        ItemStack smite = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta smiteItemMeta = (EnchantmentStorageMeta) smite.getItemMeta();
        smiteItemMeta.addStoredEnchant(Enchantment.DAMAGE_UNDEAD, 5, true);
        smite.setItemMeta(smiteItemMeta);
        gui.setItem(31, smite);

        // Soul Speed
        ItemStack soulSpeed = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta soulSpeedItemMeta = (EnchantmentStorageMeta) soulSpeed.getItemMeta();
        soulSpeedItemMeta.addStoredEnchant(Enchantment.SOUL_SPEED, 3, true);
        soulSpeed.setItemMeta(soulSpeedItemMeta);
        gui.setItem(32, soulSpeed);

        // Sweeping Edge
        ItemStack sweepingEdge = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta sweepingEdgeItemMeta = (EnchantmentStorageMeta) sweepingEdge.getItemMeta();
        sweepingEdgeItemMeta.addStoredEnchant(Enchantment.SWEEPING_EDGE, 3, true);
        sweepingEdge.setItemMeta(sweepingEdgeItemMeta);
        gui.setItem(33, sweepingEdge);

        // Swift Sneak
        ItemStack swiftSneak = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta swiftSneakItemMeta = (EnchantmentStorageMeta) swiftSneak.getItemMeta();
        swiftSneakItemMeta.addStoredEnchant(Enchantment.SWIFT_SNEAK, 3, true);
        swiftSneak.setItemMeta(swiftSneakItemMeta);
        gui.setItem(34, swiftSneak);

        // Thorns
        ItemStack thorns = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta ThornsItemMeta = (EnchantmentStorageMeta) thorns.getItemMeta();
        ThornsItemMeta.addStoredEnchant(Enchantment.THORNS, 3, true);
        thorns.setItemMeta(ThornsItemMeta);
        gui.setItem(35, thorns);

        // Unbreaking
        ItemStack unbreaking = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta unbreakingItemMeta = (EnchantmentStorageMeta) unbreaking.getItemMeta();
        unbreakingItemMeta.addStoredEnchant(Enchantment.DURABILITY, 3, true);
        unbreaking.setItemMeta(unbreakingItemMeta);
        gui.setItem(36, unbreaking);


        player.openInventory(gui);
    }


    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        Inventory gui = event.getInventory();
        if (gui.getSize() == 40) {
            event.setCancelled(true);
            Player player = (Player) event.getWhoClicked();
            int slot = event.getSlot();

                if (slot == 0 && gui.getItem(0) != null) { // Aqua Affinity
                    if (player.getInventory().containsAtLeast(new ItemStack(Material.EMERALD), 25)) {
                        if (player.getLevel() >= 3) {
                            player.getInventory().removeItem(new ItemStack(Material.EMERALD, 25));
                            player.getInventory().addItem(gui.getItem(0));
                            player.setLevel(player.getLevel() - 3);
                            player.sendMessage("You bought an Aqua Affinity  book for 25 emeralds and 3 levels of XP!");
                        } else {
                            player.sendMessage("You don't have enough experience levels!");
                        }
                    } else {
                        player.sendMessage("You don't have enough emeralds!");
                    }
                } else if (slot == 1 && gui.getItem(1) != null) { // Arthopods
                    if (player.getInventory().containsAtLeast(new ItemStack(Material.EMERALD), 20)) {
                        if (player.getLevel() >= 3) {
                            player.getInventory().removeItem(new ItemStack(Material.EMERALD, 20));
                            player.getInventory().addItem(gui.getItem(1));
                            player.setLevel(player.getLevel() - 3);
                            player.sendMessage("You bought a Bane of Arthopods  book for 20 emeralds and 3 levels of XP!");
                        } else {
                            player.sendMessage("You don't have enough experience levels!");
                        }
                    } else {
                        player.sendMessage("You don't have enough emeralds!");
                    }
                } else if (slot == 2 && gui.getItem(2) != null) { //  Blast Prot
                    if (player.getInventory().containsAtLeast(new ItemStack(Material.EMERALD), 30)) {
                        if (player.getLevel() >= 3) {
                            player.getInventory().removeItem(new ItemStack(Material.EMERALD, 30));
                            player.getInventory().addItem(gui.getItem(2));
                            player.setLevel(player.getLevel() - 3);
                            player.sendMessage("You bought a Looting III book for 30 emeralds and 3 levels of XP!");
                        } else {
                            player.sendMessage("You don't have enough experience levels!");
                        }
                    } else {
                        player.sendMessage("You don't have enough emeralds!");
                    }
                }
            }
    }

}
