package org.stonecipher;

import org.bukkit.plugin.java.JavaPlugin;
import org.stonecipher.event.PistonPlaceEvent;

public class IHatePistonPlacers extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PistonPlaceEvent(this), this);
    }
}
