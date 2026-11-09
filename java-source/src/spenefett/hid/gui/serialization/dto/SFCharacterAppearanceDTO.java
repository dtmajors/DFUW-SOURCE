/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;
import spenefett.hid.gui.serialization.dto.SFCharacterAppearanceOptionColorDTO;
import spenefett.hid.gui.serialization.dto.SFCharacterAppearanceOptionSelectionDTO;

@XStreamAlias(value="SFCharacterAppearanceDTO")
public class SFCharacterAppearanceDTO
extends SFXMLSerializable {
    public SFCharacterAppearanceOptionColorDTO skinColor = null;
    public SFCharacterAppearanceOptionColorDTO hairColor = null;
    public SFCharacterAppearanceOptionSelectionDTO face = null;
    public SFCharacterAppearanceOptionSelectionDTO hair = null;
    public SFCharacterAppearanceOptionSelectionDTO beard = null;
    public SFCharacterAppearanceOptionSelectionDTO beardBraids = null;
    public SFCharacterAppearanceOptionSelectionDTO braids = null;
    public SFCharacterAppearanceOptionSelectionDTO mustache = null;
    public SFCharacterAppearanceOptionSelectionDTO sideburns = null;
    public SFCharacterAppearanceOptionSelectionDTO forehead = null;
    public SFCharacterAppearanceOptionSelectionDTO tusks = null;
    public SFCharacterAppearanceOptionSelectionDTO noseAccessory = null;
    public SFCharacterAppearanceOptionSelectionDTO earAccessory = null;
    public SFCharacterAppearanceOptionSelectionDTO extraAccessory = null;

    public static SFCharacterAppearanceDTO cDC() {
        SFCharacterAppearanceDTO sFCharacterAppearanceDTO = new SFCharacterAppearanceDTO();
        sFCharacterAppearanceDTO.skinColor = new SFCharacterAppearanceOptionColorDTO();
        sFCharacterAppearanceDTO.hairColor = new SFCharacterAppearanceOptionColorDTO();
        sFCharacterAppearanceDTO.face = new SFCharacterAppearanceOptionSelectionDTO();
        sFCharacterAppearanceDTO.hair = new SFCharacterAppearanceOptionSelectionDTO();
        sFCharacterAppearanceDTO.beard = new SFCharacterAppearanceOptionSelectionDTO();
        sFCharacterAppearanceDTO.beardBraids = new SFCharacterAppearanceOptionSelectionDTO();
        sFCharacterAppearanceDTO.braids = new SFCharacterAppearanceOptionSelectionDTO();
        sFCharacterAppearanceDTO.mustache = new SFCharacterAppearanceOptionSelectionDTO();
        sFCharacterAppearanceDTO.sideburns = new SFCharacterAppearanceOptionSelectionDTO();
        sFCharacterAppearanceDTO.forehead = new SFCharacterAppearanceOptionSelectionDTO();
        sFCharacterAppearanceDTO.tusks = new SFCharacterAppearanceOptionSelectionDTO();
        sFCharacterAppearanceDTO.noseAccessory = new SFCharacterAppearanceOptionSelectionDTO();
        sFCharacterAppearanceDTO.earAccessory = new SFCharacterAppearanceOptionSelectionDTO();
        sFCharacterAppearanceDTO.extraAccessory = new SFCharacterAppearanceOptionSelectionDTO();
        return sFCharacterAppearanceDTO;
    }
}

