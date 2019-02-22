package net.runelite.client.plugins.configexample;


import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

import javax.inject.Inject;

@PluginDescriptor
(
        name = "Config Example",
        description = "I'm making a plugin :)",
        tags = {"config", "noob"},
        loadWhenOutdated = true,
        enabledByDefault = false
)

public class ConfigExamplePlugin extends Plugin
{
    @Inject
    private ConfigExamplesConfig config;

}