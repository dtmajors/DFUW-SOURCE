/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqk
 */
import java.util.List;

public class dsj
extends btk {
    private List<dsi> gXr = lcn.emv();
    private String gXs = "road_path_stone_tiles_01.dds";
    private String gXt = "";
    private String gXu = "";
    private String gXv = "road_path_stone_tiles_01_end.dds";
    private float gXw = 10.0f;
    private float gXx = 10.0f;
    private boolean gXy = true;
    private boolean gXz = true;
    private boolean gXA = false;
    private ldv gXB = null;
    private boolean gXC = false;
    private ldv gXD = null;
    private boolean gXE = false;
    private int gXF = 15;
    private List<ljq> gXG = lcn.emv();
    private List<Float> gXH = lcn.emv();
    private boolean gXI = false;

    public List<Float> bxM() {
        return this.gXH;
    }

    public void aK(List<Float> list) {
        this.gXH = list;
    }

    public dsj() {
        this.ObjectType = 141;
        this.ObjectDescriptionFilename = "Untitled Road";
    }

    @Override
    public void initialize() {
        int n;
        super.initialize();
        if (this.gXH.size() == 0) {
            for (n = 0; n < this.gXG.size(); ++n) {
                this.gXH.add(Float.valueOf(1.0f));
            }
        }
        for (n = 0; n < this.gXG.size(); ++n) {
            dsi dsi2 = this.c(this.gXG.get(n), -1);
            dsi2.iq(this.gXH.get(n).floatValue());
        }
        this.gXG.clear();
        this.gXH.clear();
        this.bxN();
    }

    public dsi c(ljq ljq2, int n) {
        dsi dsi2 = new dsi(this);
        dsi2.setGUID(this.MessageDelegator.bzv());
        dsi2.c(ljq2);
        if (n != -1) {
            this.gXr.add(n, dsi2);
        } else {
            this.gXr.add(dsi2);
        }
        this.MessageDelegator.a((amf)((Object)dsi2));
        return dsi2;
    }

    public void BN(int n) {
        this.MessageDelegator.hd(this.gXr.get(n).getGUID());
        this.gXr.remove(n);
    }

    public void bxN() {
        if (this.gXr.size() < 2) {
            return;
        }
        klf klf2 = (klf)this.MessageDelegator.h(1043);
        klf2.pIx = this.bxS();
        klf2.ec = this.GUID;
        klf2.gXs = this.gXs;
        klf2.pIC = this.gXs.replace(".dds", "_end.dds");
        if (this.gXy) {
            klf2.pIA = klf2.pIx;
        }
        if (this.gXz) {
            klf2.pIB = klf2.pIx;
        }
        klf2.gXC = this.gXC;
        if (this.gXD != null) {
            klf2.pIy = this.gXD;
        }
        if (klf2.gXC) {
            Object object;
            amf amf2;
            klf2.gXC = false;
            if (this.gXD != null && (amf2 = this.MessageDelegator.bzx().bzt().d(this.gXD)) != null && amf2 instanceof dqk && (object = (dqk)amf2).aLt()) {
                klf2.gXC = true;
            }
        }
        if (this.gXB == null) {
            if (this.gXI) {
                return;
            }
            klf2.iBr = true;
            klf2.Rs = this.GUID;
            klf2.pIv = 1;
            this.gXI = true;
        } else {
            klf2.Rs = this.gXB;
            klf2.iBr = false;
            klf2.pIv = 2;
        }
        klf2.pIw = new ljq[this.byb().size()];
        klf2.pID = new float[this.byb().size()];
        int n = 0;
        for (dsi dsi2 : this.byb()) {
            ljq ljq2 = dsi2.av().esF();
            if (ljq2.esJ()) {
                lfn.b(4, this.getClass().getName(), "updateRoad() : points with uninitialized position found , aborting." + this.bxX());
                return;
            }
            if (this.gXE) {
                ljq2.y = 215.0f;
            }
            if (n == 0) {
                klf2.Position = ljq2.esF();
            }
            klf2.pIw[n] = ljq2.esF();
            klf2.pIw[n].et(klf2.Position);
            klf2.pID[n] = dsi2.bxK();
            ++n;
        }
        klf2.dBL = "shaderroad.xml";
        klf2.gXF = this.gXF;
        if (this.gXE) {
            klf2.dBL = "shaderwaterwaves.xml";
            klf2.pIz = true;
        }
        this.MessageDelegator.a(klf2);
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        if (ktv2.ew != -1) {
            this.gXB = ktv2.axa();
            this.gXI = false;
        }
    }

    public String bxO() {
        return this.gXs;
    }

    public void jm(String string) {
        this.gXs = string;
    }

    public String bxP() {
        return this.gXt;
    }

    public void jn(String string) {
        this.gXt = string;
    }

    public String bxQ() {
        return this.gXu;
    }

    public void jo(String string) {
        this.gXu = string;
    }

    public String bxR() {
        return this.gXv;
    }

    public void jp(String string) {
        this.gXv = string;
    }

    public float bxS() {
        return this.gXw;
    }

    public void ir(float f2) {
        this.gXw = f2;
    }

    public float bxT() {
        return this.gXx;
    }

    public void is(float f2) {
        this.gXx = f2;
    }

    public boolean bxU() {
        return this.gXy;
    }

    public void jn(boolean bl) {
        this.gXy = bl;
    }

    public boolean bxV() {
        return this.gXz;
    }

    public void jo(boolean bl) {
        this.gXz = bl;
    }

    public boolean bxW() {
        return this.gXA;
    }

    public void jp(boolean bl) {
        this.gXA = bl;
    }

    public String bxX() {
        return this.ObjectDescriptionFilename;
    }

    public void jq(String string) {
        this.ObjectDescriptionFilename = string;
    }

    public boolean bxY() {
        return this.gXC;
    }

    public void jq(boolean bl) {
        this.gXC = bl;
    }

    public List<ljq> bxZ() {
        return this.gXG;
    }

    public ldv bya() {
        return this.gXB;
    }

    public List<dsi> byb() {
        return this.gXr;
    }

    public ldv byc() {
        return this.gXD;
    }

    public void nL(ldv ldv2) {
        this.gXD = ldv2;
    }

    @Override
    public void cleanUp() {
        for (dsi dsi2 : this.gXr) {
            this.MessageDelegator.hd(((amf)((Object)dsi2)).getGUID());
        }
        this.byd();
        super.cleanUp();
    }

    public void byd() {
        if (this.gXB != null) {
            klb klb2 = (klb)this.MessageDelegator.h(1026);
            klb2.ts(this.GUID);
            klb2.hC(this.gXB);
            klb2.HX(klb.iHB);
            this.MessageDelegator.a(klb2);
            this.gXB = null;
        }
    }

    public boolean bye() {
        return this.gXE;
    }

    public void jr(boolean bl) {
        this.gXE = bl;
    }

    public int byf() {
        return this.gXF;
    }

    public void BO(int n) {
        this.gXF = n;
    }

    public void aL(List<ljq> list) {
        this.gXG = list;
    }
}

