/*
 * FishLib, a Bukkit development library
 * Copyright (C) Lucky_fish0w0
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

package moe.orangemc.fishlib.inventory.control;

import moe.orangemc.fishlib.annotation.ShouldNotBeImplemented;

import org.bukkit.inventory.ItemStack;

@ShouldNotBeImplemented
public interface InventoryProgressBar extends InventoryControl {
	void update();

	ItemStack getEmptyItem();

	ItemStack getFilledItem();

	void setEmptyItem(ItemStack item);
	void setFilledItem(ItemStack item);
}
