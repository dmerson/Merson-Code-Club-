/***
 * Excerpted from "Learn to Program with Minecraft Plugins",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/ahmine for more book information.
***/
package helloworld; //(1)
import java.util.logging.Logger;//(2)
import org.bukkit.ChatColor; 
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
public class HelloWorld extends JavaPlugin { //(3)
  public static Logger log = Logger.getLogger("Minecraft");
  public void onLoad() {
    log.info("[HelloWorld] Loaded, assuming no cats have sabotaged files.");
  }
  public void onEnable() {
    log.info("[HelloWorld] Starting up. Barnes says hi...");
  }
  public void onDisable() {
    log.info("[HelloWorld] Stopping. idk");
  }
  public boolean onCommand(CommandSender sender, Command command, 
		     String commandLabel, String[] args) {   
    if (commandLabel.equalsIgnoreCase("hello")) {
      String msg = "[Server] This is our plugin. There are many like it, but THIS ONE IS OURS!!!";
      getServer().broadcastMessage(msg);
      return true;
    }
	
	if (commandLabel.equalsIgnoreCase("snowball")) {
      String msg = "[Server] Mrrow? This is Snowball.";
      getServer().broadcastMessage(msg);
      return true;
    }
	
    return false;
  }
}

