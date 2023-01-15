package mmcwarps2.mandomc.commands;

import mmcwarps2.mandomc.handlers.ISC;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class Warp implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){

            Player player = (Player) sender;

            Inventory warps = Bukkit.createInventory(player,54, ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "MandoMC Warps");

            warps.setItem(10, ISC.createItem(Material.MANGROVE_WOOD, ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Morak"));
            warps.setItem(16, ISC.createItem(Material.RED_GLAZED_TERRACOTTA, ChatColor.DARK_RED + "" + ChatColor.BOLD + "Dathomir"));
            warps.setItem(24, ISC.createItem(Material.WARPED_HYPHAE, ChatColor.BLUE + "" + ChatColor.BOLD + "Umbara"));
            warps.setItem(31, ISC.createItem(Material.GREEN_CONCRETE_POWDER, ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Alderaan"));
            warps.setItem(38, ISC.createItem(Material.SNOW_BLOCK, ChatColor.WHITE + "" + ChatColor.BOLD + "Hoth"));
            warps.setItem(42, ISC.createItem(Material.MUD_BRICKS, ChatColor.GOLD + "" + ChatColor.BOLD + "Concordia"));
            warps.setItem(43, ISC.createItem(Material.SANDSTONE, ChatColor.GOLD + "" + ChatColor.BOLD + "Tatooine"));
            warps.setItem(50, ISC.createItem(Material.MAGMA_BLOCK, ChatColor.DARK_RED + "" + ChatColor.BOLD + "Mustafar"));
            warps.setItem(52, ISC.createItem(Material.SMOOTH_RED_SANDSTONE, ChatColor.GOLD + "" + ChatColor.BOLD + "Geonosis"));

            if(args.length == 1){
                if(args[0].equalsIgnoreCase("morak")){
                    Location morak = new Location(Bukkit.getWorld("Morak2"), -342, 117, -292, -52.1f, -3.4f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWARPS" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to " + ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Morak" + ChatColor.GRAY + "!");
                    player.teleport(morak);
                }else if(args[0].equalsIgnoreCase("dathomir")){
                    Location dathomir = new Location(Bukkit.getWorld("Dathomir2"), 21, 66, -58, -34.3f, 2.7f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWARPS" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to " + ChatColor.DARK_RED + "" + ChatColor.BOLD + "Dathomir" + ChatColor.GRAY + "!");
                    player.teleport(dathomir);
                }else if(args[0].equalsIgnoreCase("umbara")){
                    Location umbara = new Location(Bukkit.getWorld("Umbara2"), -23, 73, -21, 44.1f, -2.1f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWARPS" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to " + ChatColor.BLUE + "" + ChatColor.BOLD + "Umbara" + ChatColor.GRAY + "!");
                    player.teleport(umbara);
                }else if(args[0].equalsIgnoreCase("alderaan")){
                    Location alderaan = new Location(Bukkit.getWorld("Alderaan2"), -169, 42, 184, -161.8f, -6.8f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWARPS" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to " + ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Alderaan" + ChatColor.GRAY + "!");
                    player.teleport(alderaan);
                }else if(args[0].equalsIgnoreCase("hoth")){
                    Location hoth = new Location(Bukkit.getWorld("Hoth2"), -38, 98, -140, -25.5f, 8.6f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWARPS" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to " + ChatColor.WHITE + "" + ChatColor.BOLD + "Hoth" + ChatColor.GRAY + "!");
                    player.teleport(hoth);
                }else if(args[0].equalsIgnoreCase("tatooine")){
                    Location spawn = new Location(Bukkit.getWorld("Tatooine2"),1883, 60, 161, 98.00916f, 5.051999f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWARPS" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to " + ChatColor.GOLD + "" + ChatColor.BOLD + "Mos Eisley" + ChatColor.GRAY + "!");
                    player.teleport(spawn);
                }else if(args[0].equalsIgnoreCase("mustafar")){
                    Location mustafar = new Location(Bukkit.getWorld("Mustafar2"), -3, 62, -43, 51.9f, -17.8f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWARPS" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to " + ChatColor.DARK_RED + "" + ChatColor.BOLD + "Mustafar" + ChatColor.GRAY + "!");
                    player.teleport(mustafar);
                }else if(args[0].equalsIgnoreCase("geonosis")){
                    Location geonosis = new Location(Bukkit.getWorld("Geonosis2"), 59, 66, -152, 110.8f, 0.4f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWARPS" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to " + ChatColor.GOLD + "" + ChatColor.BOLD + "Geonosis" + ChatColor.GRAY + "!");
                    player.teleport(geonosis);
                }else if(args[0].equalsIgnoreCase("moseisley")){
                    Location spawn = new Location(Bukkit.getWorld("Tatooine2"),1883, 60, 161, 98.00916f, 5.051999f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWARPS" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to " + ChatColor.GOLD + "" + ChatColor.BOLD + "Mos Eisley" + ChatColor.GRAY + "!");
                    player.teleport(spawn);
                }else if(args[0].equalsIgnoreCase("blackmarket")){
                    Location blackMarket = new Location(Bukkit.getWorld("Tatooine2"),1682, 51, 181, 179.0379f, 4.9510083f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWARPS" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to the " + ChatColor.DARK_GRAY + "" + ChatColor.BOLD + "Black Market" + ChatColor.GRAY + "!");
                    player.teleport(blackMarket);
                }else if(args[0].equalsIgnoreCase("jabba")){
                    Location jabba = new Location(Bukkit.getWorld("JabbasPalace"),-122, -50, 142, 180f, 0f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWARPS" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to " + ChatColor.DARK_GREEN + "" + ChatColor.BOLD + "Jabba's Palace" + ChatColor.GRAY + "!");
                    player.teleport(jabba);
                }else if(args[0].equalsIgnoreCase("mines")){
                    Location mines = new Location(Bukkit.getWorld("Concordia"),15424, 44, -2061, 83.05f, -3.2f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWARPS" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to the " + ChatColor.AQUA + "" + ChatColor.BOLD + "Concordian Mines" + ChatColor.GRAY + "!");
                    player.teleport(mines);
                }else if(args[0].equalsIgnoreCase("arena")){
                    Location arena = new Location(Bukkit.getWorld("Concordia"),16093, 34, -3176, 151.46f, -2.23f);
                    player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "MMCWARPS" + ChatColor.DARK_GRAY + " » " + ChatColor.GRAY + "Traveling to the " + ChatColor.BLUE + "" + ChatColor.BOLD + "Death Watch Arena" + ChatColor.GRAY + "!");
                    player.teleport(arena);
                }else{
                    player.openInventory(warps);
                }
            }else{
                player.openInventory(warps);
            }


        }else{
            return true;
        }

        return true;
    }
}
