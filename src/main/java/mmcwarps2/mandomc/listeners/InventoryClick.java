package mmcwarps2.mandomc.listeners;

import mmcwarps2.mandomc.handlers.ISC;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

import static org.bukkit.Material.SMOOTH_RED_SANDSTONE;

public class InventoryClick implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent event) {

        Player player = (Player) event.getWhoClicked();

        if (event.getCurrentItem() == null) {
            return;
        }

        Inventory warps = Bukkit.createInventory(player, 54, ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "MandoMC Warps");

        warps.setItem(10, ISC.createItem(Material.MANGROVE_WOOD, ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Morak"));
        warps.setItem(16, ISC.createItem(Material.RED_GLAZED_TERRACOTTA, ChatColor.DARK_RED + "" + ChatColor.BOLD + "Dathomir"));
        warps.setItem(24, ISC.createItem(Material.WARPED_HYPHAE, ChatColor.BLUE + "" + ChatColor.BOLD + "Umbara"));
        warps.setItem(31, ISC.createItem(Material.GREEN_CONCRETE_POWDER, ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Alderaan"));
        warps.setItem(38, ISC.createItem(Material.SNOW_BLOCK, ChatColor.WHITE + "" + ChatColor.BOLD + "Hoth"));
        warps.setItem(43, ISC.createItem(Material.SANDSTONE, ChatColor.GOLD + "" + ChatColor.BOLD + "Tatooine"));
        warps.setItem(50, ISC.createItem(Material.MAGMA_BLOCK, ChatColor.DARK_RED + "" + ChatColor.BOLD + "Mustafar"));
        warps.setItem(52, ISC.createItem(SMOOTH_RED_SANDSTONE, ChatColor.GOLD + "" + ChatColor.BOLD + "Geonosis"));

        Inventory tatooine = Bukkit.createInventory(player, 54, ChatColor.GOLD + "" + ChatColor.BOLD + "Tatooine");

        tatooine.setItem(24, ISC.createItem(Material.CHISELED_SANDSTONE, ChatColor.GOLD + "" + ChatColor.BOLD + "Mos Eisley"));
        tatooine.setItem(34, ISC.createItem(Material.TINTED_GLASS, ChatColor.DARK_GRAY + "" + ChatColor.BOLD + "Black Market"));
        tatooine.setItem(37, ISC.createItem(Material.GREEN_TERRACOTTA, ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Jabba's Palace"));

        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "MandoMC Warps")) {
            switch (event.getCurrentItem().getType()) {
                case MANGROVE_WOOD:
                    Location morak = new Location(Bukkit.getWorld("Morak2"), -342, 117, -292, -52.1f, -3.4f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWARPS" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to " + ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Morak" + ChatColor.GRAY + "!");
                    player.teleport(morak);
                    break;
                case RED_GLAZED_TERRACOTTA:
                    Location dathomir = new Location(Bukkit.getWorld("Dathomir2"), 21, 66, -58, -34.3f, 2.7f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWARPS" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to " + ChatColor.DARK_RED + "" + ChatColor.BOLD + "Dathomir" + ChatColor.GRAY + "!");
                    player.teleport(dathomir);
                    break;
                case WARPED_HYPHAE:
                    Location umbara = new Location(Bukkit.getWorld("Umbara2"), -23, 73, -21, 44.1f, -2.1f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWARPS" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to " + ChatColor.BLUE + "" + ChatColor.BOLD + "Umbara" + ChatColor.GRAY + "!");
                    player.teleport(umbara);
                    break;
                case GREEN_CONCRETE_POWDER:
                    Location alderaan = new Location(Bukkit.getWorld("Alderaan2"), -169, 42, 184, -161.8f, -6.8f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWARPS" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to " + ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Alderaan" + ChatColor.GRAY + "!");
                    player.teleport(alderaan);
                    break;
                case SNOW_BLOCK:
                    Location hoth = new Location(Bukkit.getWorld("Hoth2"), -38, 98, -140, -25.5f, 8.6f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWARPS" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to " + ChatColor.WHITE + "" + ChatColor.BOLD + "Hoth" + ChatColor.GRAY + "!");
                    player.teleport(hoth);
                    break;
                case SANDSTONE:
                    player.openInventory(tatooine);
                    break;
                case MAGMA_BLOCK:
                    Location mustafar = new Location(Bukkit.getWorld("Mustafar2"), -3, 62, -43, 51.9f, -17.8f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWARPS" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to " + ChatColor.DARK_RED + "" + ChatColor.BOLD + "Mustafar" + ChatColor.GRAY + "!");
                    player.teleport(mustafar);
                    break;
                case SMOOTH_RED_SANDSTONE:
                    Location geonosis = new Location(Bukkit.getWorld("Geonosis2"), 59, 66, -152, 110.8f, 0.4f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWARPS" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to " + ChatColor.GOLD + "" + ChatColor.BOLD + "Geonosis" + ChatColor.GRAY + "!");
                    player.teleport(geonosis);
                    break;
            }
            event.setCancelled(true);
        }
        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.GOLD + "" + ChatColor.BOLD + "Tatooine")) {
            switch (event.getCurrentItem().getType()) {
                case CHISELED_SANDSTONE:
                    Location spawn = new Location(Bukkit.getWorld("Tatooine2"),1883, 60, 161, 98.00916f, 5.051999f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWARPS" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to " + ChatColor.GOLD + "" + ChatColor.BOLD + "Mos Eisley" + ChatColor.GRAY + "!");
                    player.teleport(spawn);
                    break;
                case TINTED_GLASS:
                    Location blackMarket = new Location(Bukkit.getWorld("Tatooine2"),1682, 51, 181, 179.0379f, 4.9510083f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWARPS" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to the " + ChatColor.DARK_GRAY + "" + ChatColor.BOLD + "Black Market" + ChatColor.GRAY + "!");
                    player.teleport(blackMarket);
                    break;
                case GREEN_TERRACOTTA:
                    Location jabba = new Location(Bukkit.getWorld("BuildWorld"),-77, -41, 102, 38.9057f, 4.445789f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWARPS" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to " + ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Jabba's Palace" + ChatColor.GRAY + "!");
                    player.teleport(jabba);
                    break;
            }
            event.setCancelled(true);
        }
    }

}
