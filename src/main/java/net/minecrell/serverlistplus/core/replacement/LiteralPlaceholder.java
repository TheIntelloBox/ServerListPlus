/*
 *        _____                     __    _     _   _____ _
 *       |   __|___ ___ _ _ ___ ___|  |  |_|___| |_|  _  | |_ _ ___
 *       |__   | -_|  _| | | -_|  _|  |__| |_ -|  _|   __| | | |_ -|
 *       |_____|___|_|  \_/|___|_| |_____|_|___|_| |__|  |_|___|___|
 *
 *  ServerListPlus - http://git.io/slp
 *  Copyright (c) 2014, Minecrell <https://github.com/Minecrell>
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.minecrell.serverlistplus.core.replacement;

import lombok.Getter;
import net.minecrell.serverlistplus.core.replacement.util.Literals;

import java.util.Iterator;

public abstract class LiteralPlaceholder extends AbstractDynamicReplacer implements DynamicPlaceholder {
    private final @Getter String literal;

    protected LiteralPlaceholder(String literal) {
        this.literal = literal;
    }

    @Override
    public boolean find(String s) {
        return Literals.find(literal, s);
    }

    @Override
    public String replace(String s, Object replacement) {
        return Literals.replace(s, literal, replacement);
    }

    @Override
    public String replace(String s, Iterator<?> replacements) {
        return Literals.replace(s, literal, replacements);
    }

    @Override
    public String replace(String s, Iterator<?> replacements, Object others) {
        return Literals.replace(s, literal, replacements, others);
    }
}
