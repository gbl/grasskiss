package net.grass.kiss.config;


import io.github.prospector.modmenu.api.ConfigScreenFactory;
import io.github.prospector.modmenu.api.ModMenuApi;

@SuppressWarnings("unused")
public class GrassKissModMenuCompat implements ModMenuApi {

    @Override
    public ConfigScreenFactory getModConfigScreenFactory() {
        return GrassKissConfig::createConfigScreen;
    }
}