/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bvf
 *  cug
 *  lcr
 *  lcw
 */
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class naa
extends btk
implements bto {
    protected List<a> EVq = lcn.emv();
    protected ljq EVr = null;
    protected ljq EVs = null;
    protected lgl Rotation = null;
    protected float EVt = 3.0f;
    List<String> EVu = lcn.emv();
    ljq CameraPos;
    ljq EVv;
    Map<ldv, a> EVw = lcn.emw();
    float EVx = 0.0f;
    boolean sS = false;

    protected void eTD() {
        if (lcw.eng()) {
            this.CameraPos = mje.DBl.esF();
            this.EVv = mje.DBm.esF();
        } else {
            dld dld2 = (dld)this.MessageDelegator.bzx().bzt().d(lcr.rg);
            this.CameraPos = dld2.av().esF();
            this.EVv = dld2.aw().eqT();
        }
    }

    public void afW(int n2) {
        for (a object2 : this.EVq) {
            this.MessageDelegator.hd(object2.eik.getGUID());
            this.MessageDelegator.hd(object2.eec.getGUID());
        }
        this.eTD();
        ljq ljq2 = this.EVv.esF();
        ljq2.x = 0.0f;
        lgl lgl2 = new lgl(ljq2);
        lgl2.Y(new lgl(0.0f, 3.14f, 0.0f));
        this.EVr = lgl2.eq(new ljq(0.0f, 0.0f, 1.0f));
        this.EVs = lgl2.eq(new ljq(1.0f, 0.0f, 0.0f));
        this.Rotation = lgl2.eqV();
        this.EVq.clear();
        this.EVx = 0.0f;
        int n3 = 20;
        int n4 = 20;
        float f = 3.8f;
        float f2 = 3.8f;
        float f3 = 3.0f;
        float f4 = 3.0f;
        float f5 = 0.6f;
        this.sS = false;
        Document document = jsy.tK("xml-files/worldbuilder/army_builder.xml");
        if (document != null) {
            Node i = document.getFirstChild();
            List<Node> j = jsy.c("SFArmy", i);
            i = j.get(n2);
            Node node = jsy.a("SFArmyPlacement", i);
            n3 = Integer.valueOf(node.getAttributes().getNamedItem("Width").getNodeValue());
            n4 = Integer.valueOf(node.getAttributes().getNamedItem("Height").getNodeValue());
            f = Float.valueOf(node.getAttributes().getNamedItem("SpacingX").getNodeValue()).floatValue();
            f2 = Float.valueOf(node.getAttributes().getNamedItem("SpacingY").getNodeValue()).floatValue();
            f3 = Float.valueOf(node.getAttributes().getNamedItem("RandomX").getNodeValue()).floatValue();
            f4 = Float.valueOf(node.getAttributes().getNamedItem("RandomY").getNodeValue()).floatValue();
            f5 = Float.valueOf(node.getAttributes().getNamedItem("Density").getNodeValue()).floatValue();
            this.EVt = Float.valueOf(node.getAttributes().getNamedItem("Advancement").getNodeValue()).floatValue();
            i = jsy.a("Armors", i);
            List<Node> list = jsy.c("Armor", i);
            for (Node node2 : list) {
                this.EVu.add(node2.getAttributes().getNamedItem("Value").getNodeValue());
            }
        }
        for (int i = -n3 / 2; i < n3 / 2; ++i) {
            for (int j = -n4 / 2; j < n4 / 2; ++j) {
                if (!(Math.random() < (double)f5)) continue;
                this.aw((float)i * f + (float)Math.random() * f3, (float)j * f2 + (float)Math.random() * f4);
            }
        }
    }

    protected void aw(float f, float f2) {
        jyg jyg2 = new jyg(false);
        bvf bvf2 = (bvf)jyg2.d("hum_m.xml", bve.a.dQu);
        if (bvf2 == null) {
            return;
        }
        bvf2.setGUID(this.MessageDelegator.bzv());
        ljq ljq2 = this.CameraPos.esF();
        ljq ljq3 = this.EVr.esF();
        ljq3.nm(f2);
        ljq2.es(ljq3);
        ljq3 = this.EVs.esF();
        ljq3.nm(f);
        ljq2.es(ljq3);
        bvf2.l(cug.fhT);
        bvf2.c(ljq2);
        bvf2.a(this.Rotation);
        this.MessageDelegator.a((amf)bvf2);
        bzt bzt2 = new bzt();
        bzt2.b(bvf2);
        bzt2.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(bzt2);
        String string = this.EVu.get((int)(Math.random() * (double)this.EVu.size()) % this.EVu.size());
        lgw lgw2 = (lgw)lea.enW().acv(lea.enW().getType(string));
        List<ler> list = lea.enW().a((ler)lgw2, false, false);
        for (ler ler2 : list) {
            lgw lgw3 = (lgw)ler2;
            bzt2.a(lgw3.getType(), lgw3.auO());
        }
        a a2 = new a(this);
        a2.eec = bvf2;
        a2.eik = bzt2;
        a2.ezX = (int)(Math.random() * 4.0) % 4;
        this.EVq.add(a2);
        a2.EVA = -1;
        if (a2.ezX == 0) {
            bzt2.t(lea.enW().getType("r_greatsword_p01_r03"), false);
        } else if (a2.ezX == 1) {
            bzt2.t(lea.enW().getType("r_polearm_p01_r03"), false);
        } else if (a2.ezX == 2) {
            bzt2.t(lea.enW().getType("r_sword_p01_r04"), false);
            bzt2.a(lea.enW().getType("r_shield_p01_r04"), cak.c.efT);
        } else if (a2.ezX == 3) {
            bzt2.t(lea.enW().getType("r_Bow_p01_r04"), false);
        }
        this.a(a2, ljq2);
    }

    protected void a(a a2, ljq ljq2) {
        kji kji2 = (kji)this.MessageDelegator.h(2818);
        kji2.getGUID();
        kji2.wS(true);
        kji2.wT(false);
        kji2.ec = this.GUID;
        kji2.pDY = 0;
        kji2.Yg(2);
        kji2.Yh(2);
        kji2.ca(ljq2);
        kji2.cq(new ljq(0.0f, -1.0f, 0.0f));
        kji2.setLength(600.0f);
        kji2.Yi(-2);
        this.MessageDelegator.a(kji2);
        this.EVw.put(kji2.getGUID(), a2);
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        if (ktv2.egT() == 4866) {
            a a2 = this.EVw.remove(ktv2.dXg());
            if (a2 == null) {
                return;
            }
            kuj kuj2 = (kuj)ktv2;
            for (int i = 0; i < kuj2.ilP.length; ++i) {
                if (kuj2.bqd[i] != cug.fkr) continue;
                a2.EVy = a2.eec.av();
                a2.EVz = kuj2.ilP[i];
                a2.kdU = (int)(this.EVx / 1.0f);
                break;
            }
        } else {
            super.receiveResponse(ktv2);
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.sS) {
            ljq ljq2;
            float f = 1.0f;
            int n2 = (int)(this.EVx / f);
            this.EVx += (float)ldz2.qwh;
            int n3 = (int)(this.EVx / f);
            if (n3 != n2) {
                for (a a2 : this.EVq) {
                    ljq2 = a2.eec.av().esF();
                    ljq ljq3 = this.EVr.esF();
                    ljq3.nm(-this.EVt);
                    ljq2.es(ljq3);
                    ljq2.y += 300.0f;
                    this.a(a2, ljq2);
                }
            }
            for (a a2 : this.EVq) {
                if (a2.EVy == null || a2.EVz == null) continue;
                ljq2 = a2.EVz.esF();
                ljq2.et(a2.EVy);
                ljq2.nm((this.EVx - (float)a2.kdU * f) / f);
                ljq2.es(a2.EVy);
                a2.eec.c(ljq2);
            }
        }
        for (a a3 : this.EVq) {
            if (ldz2.lpr <= a3.EVA || a3.EVA <= 0) continue;
            dzv dzv2 = (dzv)this.MessageDelegator.h(7425, this.GUID, this.GUID);
            dzv2.dTs = a3.ezX == 0 ? 1048632 : (a3.ezX == 1 ? 1048647 : 1048616);
            a3.eec.receiveMessage((dxq)dzv2);
            a3.EVA = -1;
        }
    }

    public void Av(boolean bl) {
        this.sS = bl;
        if (this.sS) {
            for (a a2 : this.EVq) {
                a2.EVA = this.MessageDelegator.arc().lpr + (int)(Math.random() * 100.0);
            }
        }
    }

    public void eTE() {
        for (a a2 : this.EVq) {
            if (a2.EVz == null) continue;
            ljq ljq2 = this.EVr.esF();
            ljq2.nm(50.0f);
            a2.EVz.es(ljq2);
        }
    }
}

