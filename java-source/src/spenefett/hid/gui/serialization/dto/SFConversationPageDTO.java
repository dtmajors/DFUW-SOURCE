/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFConversationPageDTO")
public class SFConversationPageDTO
extends SFXMLSerializable {
    public String title;
    public String iconPath;
    public String htmlContentLeft;
    public String htmlContentRight;
}

