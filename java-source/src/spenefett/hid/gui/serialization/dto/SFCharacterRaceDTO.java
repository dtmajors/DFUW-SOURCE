/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;
import spenefett.hid.gui.serialization.dto.SFCharacterAppearanceOptionSelectionDTO;

@XStreamAlias(value="SFCharacterRaceDTO")
public class SFCharacterRaceDTO
extends SFXMLSerializable {
    public SFCharacterAppearanceOptionSelectionDTO sex = new SFCharacterAppearanceOptionSelectionDTO();
    public String name = null;
    public String title = null;
    public String description = null;
    public String iconName = null;
}

