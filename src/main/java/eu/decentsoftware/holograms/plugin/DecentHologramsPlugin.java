package eu.decentsoftware.holograms.plugin;

import eu.decentsoftware.holograms.api.DecentHolograms;
import eu.decentsoftware.holograms.api.DecentHologramsAPI;
import eu.decentsoftware.holograms.plugin.features.DamageDisplayFeature;
import eu.decentsoftware.holograms.plugin.features.HealingDisplayFeature;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
public class DecentHologramsPlugin extends JavaPlugin {

	@Override
	public void onLoad() {
		DecentHologramsAPI.onLoad(this);
	}

	@Override
	public void onEnable() {
		DecentHologramsAPI.onEnable();

		DecentHolograms decentHolograms = DecentHologramsAPI.get();
		decentHolograms.getFeatureManager().registerFeature(new DamageDisplayFeature());
		decentHolograms.getFeatureManager().registerFeature(new HealingDisplayFeature());
	}

	@Override
	public void onDisable() {
		DecentHologramsAPI.onDisable();
	}

}
