/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFTooltipBaseDTO")
public class SFTooltipBaseDTO
extends SFXMLSerializable {
    public boolean header = true;
    public boolean table = false;
    public boolean footer = false;
    public boolean autoSizeColumns = false;
    public int cellPaddingX = 5;
    public int cellPaddingY = 5;
    public int columnCount = 0;
    public int rowCount = 0;
    public int width = 200;
    public String headerHTMLText;
    public List<String> tableCellsHTMLText;
    public List<Integer> columnWidths;
    public String footerHTMLText;
}

