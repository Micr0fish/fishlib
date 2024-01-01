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

package moe.orangemc.fishlib.inventory.control;

import moe.orangemc.fishlib.annotation.ShouldNotBeImplemented;

import org.bukkit.inventory.ItemStack;

import java.util.Map;

@ShouldNotBeImplemented
public interface InventoryPlaceableField extends InventoryControl {
	int getWidth();

	int getHeight();

	Map<Integer, ItemStack> getContent();

	/**
	 * Sets the content of the field and synchronize to inventory
	 *
	 * @param content content of the field
	 */
	void setContent(Map<Integer, ItemStack> content);

	/**
	 * Sets the content of the field
	 *
	 * @param content         content of the field
	 * @param needSynchronize true if it needs to be synchronized to inventory
	 */
	void setContent(Map<Integer, ItemStack> content, boolean needSynchronize);

	/**
	 * Clears the field.
	 */
	void clear();

	/**
	 * Checks if the slot is inside the field
	 *
	 * @param slot the slot inside the field
	 * @return true if the slot is inside the field
	 */
	boolean isSlotInsideField(int slot);

	/**
	 * Gets the relative position of the slot
	 *
	 * @param slot the absolute position
	 * @return -1 if the slot is not inside the field, otherwise the relative position
	 */
	int locateRelativeOffsetOfSlot(int slot);
}
