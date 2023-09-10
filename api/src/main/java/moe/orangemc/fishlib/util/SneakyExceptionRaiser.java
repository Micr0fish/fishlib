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

package moe.orangemc.fishlib.util;

public class SneakyExceptionRaiser {
	private SneakyExceptionRaiser() {
		throw new UnsupportedOperationException();
	}

	@SuppressWarnings("unchecked")
	public static <T extends Throwable> void raise(Throwable exception) throws T {
		throw (T)exception;
	}

	public static <T> T anyCall(ThrowingCallable<T> callableAnyThrow) {
		try {
			return callableAnyThrow.call();
		} catch (Throwable e) {
			raise(e);
			throw new RuntimeException(e);
		}
	}

	public static void anyCall(ThrowingRunnable action) {
		try {
			action.run();
		} catch (Throwable e) {
			raise(e);
			throw new RuntimeException(e);
		}
	}
}