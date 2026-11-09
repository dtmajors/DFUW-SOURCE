/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFChatLinkDTO")
public class SFChatLinkDTO
extends SFXMLSerializable {
    public int id = -1;
    public int position = -1;
    public int color = 0;
    public String text = "";
}

