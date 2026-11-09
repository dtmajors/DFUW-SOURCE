/*
 * Decompiled with CFR.
 */
import spenefett.hid.gui.serialization.dto.SFTooltipBaseDTO;

public class iah {
    public static String d(SFTooltipBaseDTO sFTooltipBaseDTO) {
        boolean bl;
        if (sFTooltipBaseDTO == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(sFTooltipBaseDTO.header);
        stringBuilder.append(";;");
        stringBuilder.append(sFTooltipBaseDTO.table);
        stringBuilder.append(";;");
        stringBuilder.append(sFTooltipBaseDTO.footer);
        stringBuilder.append(";;");
        stringBuilder.append(sFTooltipBaseDTO.autoSizeColumns);
        stringBuilder.append(";;");
        stringBuilder.append(sFTooltipBaseDTO.cellPaddingX);
        stringBuilder.append(";;");
        stringBuilder.append(sFTooltipBaseDTO.cellPaddingY);
        stringBuilder.append(";;");
        stringBuilder.append(sFTooltipBaseDTO.columnCount);
        stringBuilder.append(";;");
        stringBuilder.append(sFTooltipBaseDTO.rowCount);
        stringBuilder.append(";;");
        stringBuilder.append(sFTooltipBaseDTO.width);
        stringBuilder.append(";;");
        if (sFTooltipBaseDTO.headerHTMLText != null) {
            stringBuilder.append(sFTooltipBaseDTO.headerHTMLText);
        } else {
            stringBuilder.append(" ");
        }
        stringBuilder.append(";;");
        if (sFTooltipBaseDTO.tableCellsHTMLText != null) {
            bl = false;
            for (String object : sFTooltipBaseDTO.tableCellsHTMLText) {
                if (bl) {
                    stringBuilder.append("--");
                }
                stringBuilder.append(object);
                bl = true;
            }
        } else {
            stringBuilder.append(" ");
        }
        stringBuilder.append(";;");
        if (sFTooltipBaseDTO.columnWidths != null) {
            bl = false;
            for (Integer n : sFTooltipBaseDTO.columnWidths) {
                if (bl) {
                    stringBuilder.append("--");
                }
                stringBuilder.append(n);
                bl = true;
            }
        } else {
            stringBuilder.append(" ");
        }
        stringBuilder.append(";;");
        if (sFTooltipBaseDTO.footerHTMLText != null) {
            stringBuilder.append(sFTooltipBaseDTO.footerHTMLText);
        }
        return stringBuilder.toString();
    }

    public static String oM(String string) {
        return string != null ? "<FONT size = \"12\" COLOR = \"#FFFFFFFF\">" + string.toUpperCase() + "</FONT>" : null;
    }
}

