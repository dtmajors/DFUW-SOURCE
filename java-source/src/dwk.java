/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class dwk
extends dwi {
    private boolean hka = true;

    public boolean bCP() {
        return this.hka;
    }

    dwk() {
        super(dwg.hiU);
    }

    @Override
    public void a(dwn dwn2, dwn dwn3, ljq ljq2) {
        if (dwn2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "calculatePoints() : Killer is Null!");
            assert (false);
            return;
        }
        if (dwn3 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "calculatePoints() : Victim is Null!");
            assert (false);
            return;
        }
        if (ljq2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "calculatePoints() : Kill Position is Null!");
            assert (false);
            return;
        }
        float f2 = 0.5f;
        if (Math.abs(dwn2.bCW()) > Float.MIN_VALUE || Math.abs(dwn3.bCW()) > Float.MIN_VALUE) {
            f2 = 1.0f - (Math.abs(dwn2.bCW()) / Math.abs(dwn2.bCW()) + Math.abs(dwn3.bCW()));
        }
        float f3 = this.a(dwn2, dwn3);
        float f4 = this.b(dwn2, dwn3) * this.cC(ljq2);
        float f5 = this.bCL() * f3 * f4;
        float f6 = this.bCL() * (this.hka ? f3 : 1.0f) * this.bCM() * f4;
        if (!this.bCN() && dwn3.bCW() < f6) {
            f6 = dwn3.bCW();
        }
        dwn2.iE(f5);
        dwn2.CG(dwn3.qe());
        dwn3.iE(0.0f - f6);
        dwn3.bDk();
    }

    @Override
    void n(Element element) {
        if (element == null) {
            lfn.b(5, this.getClass().getSimpleName(), "loadConfiguration() : Root Element is Null!!!");
            assert (false);
            throw new bg("Root Element is Null!!!");
        }
        NodeList nodeList = element.getElementsByTagName("basic_values");
        if (nodeList == null || nodeList.getLength() != 1) {
            lfn.b(5, this.getClass().getSimpleName(), "loadConfiguration() : Invalid Basic Value Nodes Count!!!... Expected 1, Found " + (nodeList == null ? "0" : Integer.valueOf(nodeList.getLength())));
            assert (false);
            throw new bg("Invalid Basic Value Nodes Count!!!");
        }
        Element element2 = (Element)nodeList.item(0);
        this.o(element2);
        this.hka = Boolean.parseBoolean(element2.getAttribute("include_rank_difference_for_loss"));
        this.a(element.getElementsByTagName("diminishing_returns"));
        this.c(element.getElementsByTagName("rank_differences"));
        this.b(element.getElementsByTagName("danger_levels"));
    }
}

