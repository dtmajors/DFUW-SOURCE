/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  dta
 *  eg
 *  lcr
 *  lcw
 */
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import spenefett.util.jni.SFJNIUtils;

public class ee
extends btk
implements bto {
    private final boolean pJ = true;
    private final float pK = 500.0f;
    private final float pL = -128.0f;
    private final float pM = 896.0f;
    private List<String> oQ = lcn.emv();
    private String oL;
    private eg oW;
    private ldv nN;
    private a pN = a.pU;
    private btg pO;
    private Map<String, jza.a> pP = lcn.emw();
    private List<String> pQ;
    private ArrayList<String> pR;
    private int pS;

    @Override
    public void initialize() {
        this.oQ = mje.DBZ;
        assert (this.oQ != null && !this.oQ.isEmpty());
        if (this.oQ.size() == 1 && this.oQ.get(0).equals("alldungeons")) {
            this.oQ.clear();
            for (String string : fy.ax.keySet()) {
                if (!string.contains("_dungeon")) continue;
                this.oQ.add(string);
            }
        } else if (this.oQ.size() >= 2 && this.oQ.get(0).equals("allcolumn")) {
            String string = this.oQ.get(1).toLowerCase();
            this.oQ.clear();
            for (int i2 = 1; i2 <= lcw.fyk.H; ++i2) {
                String string2 = string;
                if (i2 < 10) {
                    string2 = (String)string2 + "0";
                }
                if (!fy.ax.containsKey(string2 = (String)string2 + i2)) continue;
                this.oQ.add(string2);
            }
        }
        assert (!this.oQ.isEmpty());
        for (String string : this.oQ) {
        }
        this.oW = (eg)((dta)this.MessageDelegator).bzt().d(lcr.qAE);
        assert (this.oW != null);
        this.nN = this.oW.dU();
        assert (this.nN != null);
        mje.DBe = 0L;
        this.pN = a.pY;
        try {
            this.pR = jxx.dUI();
        }
        catch (bo bo2) {
            // empty catch block
        }
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
    }

    public void dJ() {
        if (this.pP.size() < 1) {
            return;
        }
        int n2 = SFJNIUtils.Instance.globalMutexOpen("MutexVoxel");
        SFJNIUtils.Instance.globalMutexLock(n2, -1);
        Map<String, jza.a> map = null;
        try {
            map = jxy.cMr();
        }
        catch (bo bo2) {
            // empty catch block
        }
        if (map == null) {
            map = this.pP;
        } else {
            map.putAll(this.pP);
        }
        jza.V(map);
        SFJNIUtils.Instance.globalMutexUnlock(n2);
        SFJNIUtils.Instance.globalMutexClose(n2);
    }

    @Override
    public void doTick(ldz ldz2) {
        switch (this.pN) {
            case pY: {
                if (this.oQ.isEmpty()) {
                    this.pN = a.pV;
                    return;
                }
                this.oL = this.oQ.remove(0);
                this.pO = fy.ax.get(this.oL);
                if (this.pO == null) {
                    return;
                }
                if (this.ac(this.oL)) {
                    this.pP.put(this.oL, this.ad(this.oL));
                    this.pN = a.pY;
                    break;
                }
                if (this.ag(this.oL) < this.ae(this.oL)) {
                    this.pN = a.pY;
                    break;
                }
                this.af(this.oL);
                this.pQ = this.ah(this.oL);
                for (String string : this.pQ) {
                    this.ai(string);
                }
                this.pS = this.pQ.size();
                this.pN = a.pW;
                break;
            }
            case pZ: {
                this.dK();
                this.dL();
                break;
            }
            case pV: {
                this.dJ();
                lfn.b(0, this.getClass().getSimpleName(), "--Completed Voxel Generation. Exiting application--");
                this.cleanUp();
                System.exit(0);
                break;
            }
        }
    }

    private void dK() {
        ljq ljq2;
        ljq ljq3;
        Object object;
        ljq ljq4 = new ljq(1.5707963267948966, 0.0, 0.0);
        if (this.oL.contains("_dungeon")) {
            object = this.pO.axy().get(0);
            assert (object != null) : "Level is null for Zone = " + this.pO.axz();
            ljq3 = ((bst)object).axh().axe();
            ljq2 = new ljq(0.0f, 500.0f, 0.0f);
        } else {
            ljq3 = lcw.zh((String)this.oL);
            ljq2 = new ljq(lcw.qGD.x / 2.0f, 500.0f, lcw.qGD.rlV / 2.0f);
        }
        assert (ljq3 != null) : "Camera position is null for Level = " + this.oL;
        ljq3.es(ljq2);
        object = (edc)this.MessageDelegator.h(2049, this.GUID, this.nN);
        ((edc)object).DH(12);
        ((edc)object).a(new lgl(ljq4));
        ((edc)object).c(ljq3);
        this.MessageDelegator.I((dxq)object);
    }

    private String X(String string) {
        String string2 = "full/" + string + "_full" + ".lvl";
        if (!new File(lcw.qLb + "level/" + string2).exists()) {
            return string + ".lvl";
        }
        return string2;
    }

    private boolean ab(String string) {
        return new File(lcw.qLb + "level/" + string + ".lvl").exists();
    }

    private boolean ac(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(lcw.qLb);
        stringBuilder.append("xml-files/objectspace/sea_tiles/");
        stringBuilder.append(string);
        jrw jrw2 = new jrw(stringBuilder.toString());
        return jrw2.exists();
    }

    private jza.a ad(String string) {
        ljq ljq2 = lcw.zh((String)string);
        jza.a a2 = new jza.a();
        a2.mZ = new ljq(ljq2.x + lcw.qGD.x / 2.0f, 384.0f, ljq2.rlV + lcw.qGD.rlV / 2.0f);
        a2.pay = new ljq(lcw.qGD.x / 2.0f, 512.0f, lcw.qGD.rlV / 2.0f);
        a2.bUC = 2.0f;
        a2.paz = false;
        a2.paB = 64.0f;
        a2.paA = true;
        return a2;
    }

    private long ae(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(lcw.qLb);
        stringBuilder.append("texture/dds/");
        stringBuilder.append("voxels");
        boolean bl = string.contains("_dungeon");
        jrw jrw2 = new jrw(stringBuilder.toString());
        assert (jrw2.exists());
        long l2 = 0L;
        for (jrw jrw3 : jrw2.dRT()) {
            long l3 = jrw3.lastModified();
            String string2 = jrw3.getName();
            if (string2.contains("_dungeon") != bl || !string2.contains(string) || l3 >= l2 && l2 != 0L) continue;
            l2 = l3;
        }
        return l2;
    }

    private void af(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(lcw.qLb);
        stringBuilder.append("texture/dds/");
        stringBuilder.append("voxels");
        boolean bl = string.contains("_dungeon");
        jrw jrw2 = new jrw(stringBuilder.toString());
        assert (jrw2.exists());
        for (jrw jrw3 : jrw2.dRT()) {
            String string2 = jrw3.getName();
            if (string2.contains("_dungeon") != bl || !string2.contains(string)) continue;
            jrw3.delete();
        }
    }

    private long ag(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(lcw.qLb);
        if (string.contains("_dungeon")) {
            stringBuilder.append("xml-files/objectspace/dungeons/");
            stringBuilder.append(string.substring(0, string.indexOf(95)));
            stringBuilder.append("/");
            stringBuilder.append(string.substring(string.indexOf(95) + 1, string.length()));
        } else {
            stringBuilder.append("xml-files/objectspace/built_tiles/");
            stringBuilder.append(string);
        }
        jrw jrw2 = new jrw(stringBuilder.toString());
        assert (jrw2.exists());
        long l2 = jrw2.lastModified();
        for (jrw jrw3 : jrw2.dRT()) {
            long l3 = jrw3.lastModified();
            if (!jrw3.getName().contains(".xml") || l3 <= l2) continue;
            l2 = l3;
        }
        return l2;
    }

    private void dL() {
        kjd kjd2 = (kjd)this.MessageDelegator.h(2828);
        kjd2.ts(this.GUID);
        kjd2.pDZ = new lcj();
        kjd2.pDZ.qwc = new ljq();
        kjd2.pDZ.qwb = new ljq();
        int[] nArray = new int[]{cug.fkq};
        kjd2.pEi = nArray;
        if (this.oL.contains("_dungeon")) {
            bst bst2 = this.pO.axy().get(0);
            assert (bst2 != null) : "Level is null for Zone = " + this.pO.axz();
            kjd2.pDZ.qwc.x = bst2.axh().dJz;
            kjd2.pDZ.qwc.y = bst2.axh().dJA;
            kjd2.pDZ.qwc.rlV = bst2.axh().dJB;
            kjd2.pDZ.qwb.x = bst2.axh().dJw;
            kjd2.pDZ.qwb.y = bst2.axh().dJx;
            kjd2.pDZ.qwb.rlV = bst2.axh().dJy;
            kjd2.pEb = false;
            kjd2.pEc = false;
            kjd2.pEd = false;
            if (this.pR.contains(this.oL)) {
                kjd2.pEe = true;
                kjd2.pEf = 2.0f;
                kjd2.pEg = 2.0f;
            } else {
                kjd2.pEe = false;
                kjd2.pEf = 0.5f;
                kjd2.pEg = 1.0f;
            }
        } else {
            ljq ljq2 = lcw.zh((String)this.oL);
            assert (ljq2 != null) : "Top left tile position is null for " + this.oL;
            kjd2.pDZ.qwc.x = ljq2.x + lcw.qGD.x;
            kjd2.pDZ.qwc.y = 896.0f;
            kjd2.pDZ.qwc.rlV = ljq2.rlV + lcw.qGD.rlV;
            kjd2.pDZ.qwb.x = ljq2.x;
            kjd2.pDZ.qwb.y = -128.0f;
            kjd2.pDZ.qwb.rlV = ljq2.rlV;
            kjd2.pEb = true;
            kjd2.pEc = true;
            kjd2.pEd = true;
            kjd2.pEe = true;
            kjd2.pEf = 2.0f;
            kjd2.pEg = 2.0f;
        }
        kjd2.FileName = this.oL;
        kjd2.pEh = lcw.qLb + "texture/dds/" + "voxels" + "/";
        this.MessageDelegator.a(kjd2);
        this.pN = a.qa;
    }

    List<String> ah(String string) {
        ArrayList<String> arrayList = lcn.emv();
        arrayList.add(this.X(string));
        if (string.contains("_dungeon")) {
            return arrayList;
        }
        lej lej2 = lcw.zf((String)string);
        String string2 = lcw.f((lej)new lej(lej2.getX(), lej2.getY() - 1)).toLowerCase();
        if (lej2.getY() > 0 && this.ab(string2)) {
            arrayList.add(this.X(string2));
        }
        string2 = lcw.f((lej)new lej(lej2.getX(), lej2.getY() + 1)).toLowerCase();
        if (lej2.getY() < lcw.fyk.H - 1 && this.ab(string2)) {
            arrayList.add(this.X(string2));
        }
        string2 = lcw.f((lej)new lej(lej2.getX() + 1, lej2.getY())).toLowerCase();
        if (lej2.getX() < lcw.fyk.rmN - 1 && this.ab(string2)) {
            arrayList.add(this.X(string2));
        }
        string2 = lcw.f((lej)new lej(lej2.getX() - 1, lej2.getY())).toLowerCase();
        if (lej2.getX() > 0 && this.ab(string2)) {
            arrayList.add(this.X(string2));
        }
        return arrayList;
    }

    private void ai(String string) {
        krw krw2 = (krw)this.MessageDelegator.j(16);
        krw2.wQ(string);
        krw2.ts(this.GUID);
        krw2.xC(true);
        this.MessageDelegator.a(krw2);
    }

    private void U(String string) {
        kku kku2 = (kku)this.MessageDelegator.h(1036);
        kku2.YF(1);
        kku2.hC(ldv.rfe);
        kku2.wQ(string);
        kku2.ts(this.GUID);
        kku2.wD(true);
        this.MessageDelegator.a(kku2);
    }

    @Override
    public void receiveResourceResponse(ktf ktf2) {
        if (ktf2.egN() == 8) {
            --this.pS;
            if (this.pS == 0) {
                this.pN = a.pZ;
            }
            return;
        }
        super.receiveResourceResponse(ktf2);
    }

    public void a(kuf kuf2) {
        if (kuf2.getResult() != 0) {
            return;
        }
        jza.a a2 = new jza.a();
        a2.mZ = kuf2.mZ.esF();
        a2.pay = kuf2.pay.esF();
        a2.bUC = kuf2.bUC;
        a2.paz = kuf2.paz;
        a2.paB = kuf2.paB;
        if (kuf2.paC != null) {
            a2.paC = (lek[])kuf2.paC.clone();
        }
        a2.paA = !this.oL.contains("_dungeon") || this.pR.contains(this.oL);
        this.pP.put(this.oL, a2);
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 1024: {
                --this.pS;
                if (this.pS != 0) break;
                this.pN = a.pY;
                break;
            }
            case 4874: {
                this.a((kuf)ktv2);
                for (String string : this.pQ) {
                    this.U(string);
                }
                this.pS = this.pQ.size();
                this.pN = a.pX;
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }
}

