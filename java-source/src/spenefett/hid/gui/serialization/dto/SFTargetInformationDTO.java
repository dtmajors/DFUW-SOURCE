/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFTargetInformationDTO")
public class SFTargetInformationDTO
extends SFXMLSerializable {
    public String primaryText = "";
    public String secondaryText = "";
    public String secondaryText2 = "";
    public String secondaryText3 = "";
    public int primaryColor = 0xFFFFFF;
    public int secondaryColor = 0xFFFFFF;
    public int secondaryColor2 = 0xFFFFFF;
    public int secondaryColor3 = 0xFFFFFF;
    public String iconName = "";
}

