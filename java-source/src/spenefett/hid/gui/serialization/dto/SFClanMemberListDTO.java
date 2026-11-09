/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import spenefett.hid.gui.serialization.SFXMLSerializable;
import spenefett.hid.gui.serialization.dto.SFClanMemberInformationDTO;

@XStreamAlias(value="SFClanMemberListDTO")
public class SFClanMemberListDTO
extends SFXMLSerializable {
    public List<SFClanMemberInformationDTO> members;
}

