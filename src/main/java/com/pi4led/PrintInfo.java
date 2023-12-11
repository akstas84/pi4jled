package com.pi4led;

import com.pi4j.context.Context;
import com.pi4j.platform.Platform;
import com.pi4j.platform.Platforms;
import com.pi4j.provider.Providers;
import com.pi4j.registry.Registry;
import com.pi4j.util.Console;

public class PrintInfo {

    public static void printLoadedPlatforms(Console console, Context pi4j) {
        Platforms platforms = pi4j.platforms();

        console.box("Pi4J PLATFORMS");
        console.println();
        platforms.describe().print(System.out);
        console.println();
    }

    public static void printDefaultPlatform(Console console, Context pi4j) {
        Platform platform = pi4j.platform();

        console.box("Pi4J DEFAULT PLATFORM");
        console.println();
        platform.describe().print(System.out);
        console.println();
    }

    public static void printProviders(Console console, Context pi4j) {
        Providers providers = pi4j.providers();

        console.box("Pi4J PROVIDERS");
        console.println();
        providers.describe().print(System.out);
        console.println();
    }

    public static void printRegistry(Console console, Context pi4j) {
        Registry registry = pi4j.registry();

        console.box("Pi4J REGISTRY");
        console.println();
        registry.describe().print(System.out);
        console.println();
    }
}