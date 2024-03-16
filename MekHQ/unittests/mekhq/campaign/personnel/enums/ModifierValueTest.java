/*
 * Copyright (c) 2022 - The MegaMek Team. All Rights Reserved.
 *
 * This file is part of MekHQ.
 *
 * MekHQ is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * MekHQ is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with MekHQ. If not, see <http://www.gnu.org/licenses/>.
 */
package mekhq.campaign.personnel.enums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ModifierValueTest {
    //region Variable Declarations
    private static final ModifierValue[] values = ModifierValue.values();
    //endregion Variable Declarations

    //region Boolean Comparison Methods
    @Test
    public void testIsPiloting() {
        for (final ModifierValue modifierValue : values) {
            if (modifierValue == ModifierValue.PILOTING) {
                assertTrue(modifierValue.isPiloting());
            } else {
                assertFalse(modifierValue.isPiloting());
            }
        }
    }

    @Test
    public void testIsGunnery() {
        for (final ModifierValue modifierValue : values) {
            if (modifierValue == ModifierValue.GUNNERY) {
                assertTrue(modifierValue.isGunnery());
            } else {
                assertFalse(modifierValue.isGunnery());
            }
        }
    }
    //endregion Boolean Comparison Methods
}
