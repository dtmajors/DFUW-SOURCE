/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFChatMessageListDTO")
public class SFChatMessageListDTO
extends SFXMLSerializable {
    public List<String> list = lcn.emv();
}

