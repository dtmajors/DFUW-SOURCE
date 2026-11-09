/*
 * Decompiled with CFR.
 */
import spenefett.hid.gui.serialization.dto.SFTooltipBaseDTO;

public class hzx
extends iai
implements ipu {
    private SFTooltipBaseDTO lzR = null;
    private double lzS = 0.0;

    public hzx(double d2, int n, int n2) {
        this(hzx.os(lyu.tJU.bD(d2).exA()), n, n2, 100, 100);
    }

    private hzx(SFTooltipBaseDTO sFTooltipBaseDTO, int n, int n2, int n3, int n4) {
        super("Simple Text Tooltip", "TooltipGenericWindow.swf", n, n2, n3, n4);
        this.lzR = sFTooltipBaseDTO;
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
        return hzx.a("<font size=\"12\">" + string.toUpperCase() + "</font>", null, 0, 0, 0, 0, new String[0]);
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.lzS < 0.0) {
            hso.cxK().cxP().czh();
            return;
        }
        this.lzR = hzx.os(lyu.tJU.bD(this.lzS).exA());
        this.cJU();
    }

    @Override
    protected void cJU() {
        if (!this.cDj()) {
            return;
        }
        this.a("setData", new Object[]{iah.d(this.lzR)});
    }
}

