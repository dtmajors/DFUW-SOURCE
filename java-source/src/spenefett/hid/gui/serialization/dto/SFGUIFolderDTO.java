/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFGUIFolderDTO")
public class SFGUIFolderDTO
extends SFXMLSerializable {
    public int id = 0;
    public String name = "";
    public String titleName = "";
}

