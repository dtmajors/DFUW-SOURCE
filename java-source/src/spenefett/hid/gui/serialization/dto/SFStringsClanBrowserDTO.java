/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFStringsClanBrowserDTO")
public class SFStringsClanBrowserDTO
extends SFXMLSerializable {
    public String pageTitle;
    public String clanNameHeader;
    public String clanSizeHeader;
    public String filtersTitle;
    public String recruitingFilterText;
    public String textFilterDefaultText;
}

