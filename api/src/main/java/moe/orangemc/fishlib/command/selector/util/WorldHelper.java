/*
 * FishLib, a Bukkit development library
 * Copyright (C) Astro angelfish
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package moe.orangemc.fishlib.command.selector.util;

import moe.orangemc.fishlib.annotation.ShouldNotBeImplemented;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;

@ShouldNotBeImplemented
public final class WorldHelper {
	public static Location getLocation(CommandSender sender) {
		CommandSender executor = SenderHelper.getExecutedSender(sender);

		if (executor instanceof Entity e) {
			return e.getLocation();
		}
		if (executor instanceof BlockCommandSender b) {
			return b.getBlock().getLocation();
		}
		return new Location(Bukkit.getWorlds().get(0), 0, 0, 0);
	}
}
