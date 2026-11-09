/*
 * Decompiled with CFR.
 */
import spenefett.hid.gui.serialization.dto.SFTooltipBaseDTO;

public class iae
extends iai {
    SFTooltipBaseDTO lzR = null;

    public iae(SFTooltipBaseDTO sFTooltipBaseDTO, int n, int n2, int n3, int n4) {
        super("Simple Text Tooltip", "TooltipGenericWindow.swf", n, n2, n3, n4);
        this.lzR = sFTooltipBaseDTO;
    }

    public iae(SFTooltipBaseDTO sFTooltipBaseDTO, int n, int n2) {
        this(sFTooltipBaseDTO, n, n2, 100, 100);
    }

    public iae(String string, int n, int n2, int n3, int n4) {
        this(iae.os(string), n, n2, n3, n4);
    }

    public iae(String string, String string2, int n, int n2, int n3, int n4) {
        this(iae.H(string, string2), n, n2, n3, n4);
    }

    public iae(String string, int n, int n2) {
        this(string, n, n2, 100, 100);
    }

    public static SFTooltipBaseDTO a(String string, String string2, int n, int n2, int n3, int n4, String ... stringArray) {
        SFTooltipBaseDTO sFTooltipBaseDTO = new SFTooltipBaseDTO();
        sFTooltipBaseDTO.header = string != null;
        sFTooltipBaseDTO.headerHTMLText = string;
        sFTooltipBaseDTO.footer = string2 != null;
        sFTooltipBaseDTO.footerHTMLText = string2;
        sFTooltipBaseDTO.table = n > 0 && n2 > 0 && stringArray.length > 0;
        sFTooltipBaseDTO.autoSizeColumns = true;
        sFTooltipBaseDTO.columnCount = n2;
        sFTooltipBaseDTO.rowCount = n;
        sFTooltipBaseDTO.cellPaddingX = n3;
        sFTooltipBaseDTO.cellPaddingY = n4;
        sFTooltipBaseDTO.tableCellsHTMLText = lcn.emv();
        if (stringArray != null) {
            for (String string3 : stringArray) {
                sFTooltipBaseDTO.tableCellsHTMLText.add(string3);
            }
        }
        sFTooltipBaseDTO.width = 0;
        return sFTooltipBaseDTO;
    }

    public static SFTooltipBaseDTO os(String string) {
        return iae.a("<font size=\"12\">" + string.toUpperCase() + "</font>", null, 0, 0, 0, 0, new String[0]);
    }

    public static SFTooltipBaseDTO H(String string, String string2) {
        return iae.a(isg.b(isf.mwO, 14, 12357465, string), isg.b(isf.mwN, 12, 0xABABAB, string2), 0, 0, 0, 0, new String[0]);
    }

    public static iae oJ(String string) {
        return new iae(string, hso.cxK().cxP().bpb(), hso.cxK().cxP().bpc(), 0, 0);
    }

    public static iae k(String string, int n, int n2) {
        return new iae(string, n, n2, 0, 0);
    }

    public static iae I(String string, String string2) {
        return new iae(string, string2, hso.cxK().cxP().bpb(), hso.cxK().cxP().bpc(), 0, 0);
    }

    public static iae b(SFTooltipBaseDTO sFTooltipBaseDTO) {
        return new iae(sFTooltipBaseDTO, hso.cxK().cxP().bpb(), hso.cxK().cxP().bpc(), 0, 0);
    }

    @Override
    protected void cJU() {
        if (!this.cDj()) {
            return;
        }
        this.a("setData", new Object[]{iah.d(this.lzR)});
    }

    public void c(SFTooltipBaseDTO sFTooltipBaseDTO) {
        this.lzR = sFTooltipBaseDTO;
        this.cJU();
    }
}

