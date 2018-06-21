package fr.Alphart.BAT.Utils.thirdparty;

import net.alpenblock.bungeeperms.platform.bungee.BungeePlugin;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Plugin;

import java.util.Collection;

/**
 * Provide a clean way to support both version of BungeePerms
 */
public class BPInterfaceFactory {
    
    public static PermissionProvider getBPInterface(final Plugin bpPlugin) {
        if (bpPlugin instanceof net.alpenblock.bungeeperms.platform.bungee.BungeePlugin) {
            return new BungeePerms((net.alpenblock.bungeeperms.platform.bungee.BungeePlugin) bpPlugin);
        }
        
        throw new RuntimeException("BungeePerms version not supported !");
    }
    
    public interface PermissionProvider {
        public Collection<String> getPermissions(final CommandSender sender);
    }
    
    static class BungeePerms implements PermissionProvider {
        
        private final net.alpenblock.bungeeperms.platform.bungee.BungeePlugin bpPlugin;
        
        public BungeePerms(BungeePlugin bpPlugin) {
            this.bpPlugin = bpPlugin;
        }
        
        @Override
        public Collection<String> getPermissions(CommandSender sender) {
            return bpPlugin.getBungeeperms().getPermissionsManager().getUser(sender.getName()).getEffectivePerms();
        }
    }
}