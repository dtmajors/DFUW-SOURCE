/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.dto.SFCharacterAppearanceOptionDTO;
import spenefett.hid.gui.serialization.dto.SFColorRangeListDTO;

@XStreamAlias(value="SFCharacterAppearanceOptionColorDTO")
public class SFCharacterAppearanceOptionColorDTO
extends SFCharacterAppearanceOptionDTO {
    public SFColorRangeListDTO colorRanges = null;
}

