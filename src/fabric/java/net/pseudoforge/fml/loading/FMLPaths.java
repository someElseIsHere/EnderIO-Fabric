/*
 * Copyright (c) Forge Development LLC and contributors
 * SPDX-License-Identifier: LGPL-2.1-only
 */

package net.pseudoforge.fml.loading;

import com.mojang.logging.LogUtils;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public enum FMLPaths
{
    GAMEDIR(FabricLoader.getInstance().getGameDir()),
    CONFIGDIR(FabricLoader.getInstance().getConfigDir());

    private final Path path;

    FMLPaths(Path path) {
        this.path = path;
    }

    public Path get() {
        return path;
    }
}
