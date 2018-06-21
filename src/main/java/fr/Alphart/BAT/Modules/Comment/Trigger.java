package fr.Alphart.BAT.Modules.Comment;

import fr.Alphart.BAT.BAT;
import net.cubespace.Yamler.Config.Config;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.PluginManager;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Trigger extends Config {
    
    private int triggerNumber = 3;
    private List<String> pattern = Arrays.asList("");
    private List<String> commands = Arrays.asList("alert {player} sparks a trigger. Reason: {reason}", "gtempmute {player} 30m");
    
    public Trigger() {
        this(0, Arrays.asList(), Arrays.asList());
    }
    
    public Trigger(int triggerNumber, List<String> pattern, List<String> commands) {
        this.triggerNumber = triggerNumber;
        this.pattern = pattern;
        this.commands = commands;
    }
    
    public void onTrigger(final String pName, final String reason) {
        final PluginManager pm = ProxyServer.getInstance().getPluginManager();
        final CommandSender console = ProxyServer.getInstance().getConsole();
        long delay = 100;
        for (final String command : commands) {
            ProxyServer.getInstance().getScheduler().schedule(BAT.getInstance(), new Runnable() {
                @Override
                public void run() {
                    pm.dispatchCommand(console, command.replace("{player}", pName).replace("{reason}", reason));
                }
            }, delay, TimeUnit.MILLISECONDS);
            delay += 500;
        }
    }
    
    public int getTriggerNumber() {
        return triggerNumber;
    }
    
    public List<String> getPattern() {
        return pattern;
    }
}