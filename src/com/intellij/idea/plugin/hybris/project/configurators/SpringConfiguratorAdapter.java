/*
 * This file is part of "hybris integration" plugin for Intellij IDEA.
 * Copyright (C) 2014-2015 Alexander Bartash <AlexanderBartash@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.intellij.idea.plugin.hybris.project.configurators;

import com.intellij.idea.plugin.hybris.project.settings.HybrisModuleDescriptor;
import com.intellij.idea.plugin.hybris.project.settings.HybrisProjectDescriptor;
import com.intellij.openapi.module.ModifiableModuleModel;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Created by Martin Zdarsky (martin.zdarsky@hybris.com) on 18/08/15.
 */
public class SpringConfiguratorAdapter implements SpringConfigurator {

    @Override
    public void findSpringConfiguration(@NotNull final List<HybrisModuleDescriptor> modulesChosenForImport) {
        // Do nothing
    }

    @Override
    public void configureDependencies(@NotNull final HybrisProjectDescriptor hybrisProjectDescriptor,
                                      @NotNull final ModifiableModuleModel rootProjectModifiableModuleModel) {
        // Do nothing
    }
}