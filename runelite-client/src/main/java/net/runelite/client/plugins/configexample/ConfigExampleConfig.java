package net.runelite.client.plugins.configexample;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

import java.awt.*;

@ConfigGroup("configexample")
public interface ConfigExamplesConfig extends Config
{
    @ConfigItem
    (
        position = 1,
        keyName = "booleanConfig",
        name = "I AM CHECKBOX",
        description = "HOVER TEXT IN ALL CAPS XD"
    )
default boolean booleanConfig() {return false;}


    @ConfigItem
    (
        position = 2,
        keyName = "Intbox",
        name = "Integerbox",
        description = "hovertext version 2.0"
    )
default int Intbox() {return 69;}

    @ConfigItem
    (
        position = 3,
        keyName = "colorbox",
        name = "pretty colours",
        description = "XD"
    )
default Color colorbox() {return Color.CYAN;}
}