/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class dwj
extends dwi {
    private float hjZ = 1000.0f;

    public float bCO() {
        return this.hjZ;
    }

    dwj() {
        super(dwg.hiT);
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
        this.b(dwn2, dwn3, ljq2);
        this.c(dwn2, dwn3, ljq2);
    }

    private void b(dwn dwn2, dwn dwn3, ljq ljq2) {
        if (dwn2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "calculateKillerPointsGained() : Killer is Null!");
            assert (false);
            return;
        }
        if (dwn3 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "calculateKillerPointsGained() : Victim is Null!");
            assert (false);
            return;
        }
        if (ljq2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "calculateKillerPointsGained() : Kill Position is Null!");
            assert (false);
            return;
        }
        float f2 = 0.0f;
        if (Math.abs(dwn2.bCW() - dwn3.bCW()) < Float.MIN_VALUE) {
            f2 = this.bCL();
        } else if (!(Math.abs(dwn2.bCW()) < Float.MIN_VALUE)) {
            float f3 = 1.0f;
            if (dwn3.bDc() > dwn2.bDc()) {
                f3 = this.a(dwn2, dwn3);
            }
            f2 = dwn3.bCW() / dwn2.bCW() * this.bCL() * f3;
        }
        f2 *= this.b(dwn2, dwn3) * this.cC(ljq2);
        if (f2 > this.hjZ) {
            f2 = this.hjZ;
        }
        dwn2.iE(f2);
        dwn2.CG(dwn3.qe());
    }

    private void c(dwn dwn2, dwn dwn3, ljq ljq2) {
        if (dwn2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "calulcateVictimPointsLost() : Killer is Null!");
            assert (false);
            return;
        }
        if (dwn3 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "calulcateVictimPointsLost() : Victim is Null!");
            assert (false);
            return;
        }
        if (ljq2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "calulcateVictimPointsLost() : Kill Position is Null!");
            assert (false);
            return;
        }
        float f2 = 0.0f;
        if (Math.abs(dwn2.bCW() - dwn3.bCW()) < Float.MIN_VALUE) {
            f2 = this.bCL() * this.bCM();
        } else if (!(Math.abs(dwn2.bCW()) < Float.MIN_VALUE) && (f2 = dwn3.bCW() / dwn2.bCW() * this.bCL() * this.bCM()) > this.hjZ) {
            f2 = this.hjZ;
        }
        f2 *= this.b(dwn2, dwn3) * this.cC(ljq2);
        if (!this.bCN() && dwn3.bCW() < f2) {
            f2 = dwn3.bCW();
        }
        dwn3.iE(0.0f - f2);
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
        String string = element2.getAttribute("max_points");
        try {
            this.hjZ = Float.parseFloat(string);
        }
        catch (NumberFormatException numberFormatException) {
            throw new bg("Failed to Parse Maximum Points Attribute!!!", numberFormatException);
        }
        this.a(element.getElementsByTagName("diminishing_returns"));
        this.c(element.getElementsByTagName("rank_differences"));
        this.b(element.getElementsByTagName("danger_levels"));
    }
}

