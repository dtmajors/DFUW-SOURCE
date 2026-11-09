/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.dto.SFCharacterAppearanceOptionDTO;

@XStreamAlias(value="SFCharacterAppearanceOptionSelectionDTO")
public class SFCharacterAppearanceOptionSelectionDTO
extends SFCharacterAppearanceOptionDTO {
    public int availableChoices = 0;
    public boolean allowEmptyChoice = false;
}

