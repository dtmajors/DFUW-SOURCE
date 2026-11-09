/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class jg
extends btk
implements bto {
    private static final int akr = 10;
    private static final double aks = 1.0;
    private static final double akt = 10.0;
    private Queue<fbc> aku = null;
    private double akv = 0.0;
    private Queue<lfs<jc, Double>> akw = null;
    private Map<jc, Integer> akx = null;
    private ldv aky = null;
    private boolean akz = false;

    public jg(int n, int n2) {
        this.aky = lcr.p((ldv)lcr.acL, (int)n, (int)n2);
        this.aku = lcn.emA();
        this.akw = lcn.emA();
        this.akx = lcn.emw();
    }

    @Override
    public void doTick(ldz ldz2) {
        Object object;
        while (!this.akw.isEmpty() && (Double)this.akw.peek().reY >= ldz2.rgz) {
            lfs<jc, Double> lfs2 = this.akw.poll();
            object = this.akx.remove(lfs2.reX);
            this.a((jc)((Object)lfs2.reX), (Integer)object);
        }
        if (this.akv + 1.0 > ldz2.rgz) {
            return;
        }
        if (this.aku.isEmpty()) {
            return;
        }
        int n = this.aku.size();
        if (n > 10) {
            n = 10;
        }
        object = new jd[n];
        je[] jeArray = new je[n];
        jb[] jbArray = new jb[n];
        ja[] jaArray = new ja[n];
        bbs[] bbsArray = new bbs[n];
        int[] nArray = new int[n];
        int[] nArray2 = new int[n];
        float[] fArray = new float[n];
        int[] nArray3 = new int[n];
        LinkedList<String> linkedList = lcn.emA();
        int[] nArray4 = new int[n];
        LinkedList<ljq> linkedList2 = lcn.emA();
        int[] nArray5 = new int[n];
        LinkedList<String> linkedList3 = lcn.emA();
        int[] nArray6 = new int[n];
        for (int i = 0; i < n; ++i) {
            int n2;
            fbc fbc2 = this.aku.poll();
            if (fbc2 == null) {
                assert (false);
                break;
            }
            object[i] = fbc2.bOc();
            jeArray[i] = fbc2.bOd();
            jbArray[i] = fbc2.bOe();
            jaArray[i] = fbc2.bOg();
            bbsArray[i] = fbc2.bOf();
            nArray[i] = fbc2.BV();
            nArray2[i] = fbc2.CD();
            fArray[i] = fbc2.uO();
            nArray4[i] = fbc2.bOi();
            if (fbc2.bOh() == null) {
                nArray3[i] = -1;
            } else {
                n2 = linkedList.indexOf(fbc2.bOh());
                if (n2 < 0) {
                    nArray3[i] = linkedList.size();
                    linkedList.add(fbc2.bOh());
                } else {
                    nArray3[i] = n2;
                }
            }
            if (fbc2.bOj() == null) {
                nArray5[i] = -1;
            } else {
                n2 = linkedList2.indexOf(fbc2.bOj());
                if (n2 < 0) {
                    nArray5[i] = linkedList2.size();
                    linkedList2.add(fbc2.bOj());
                } else {
                    nArray5[i] = n2;
                }
            }
            if (fbc2.bOk() == null) {
                nArray6[i] = -1;
                continue;
            }
            n2 = linkedList3.indexOf(fbc2.bOk());
            if (n2 < 0) {
                nArray6[i] = linkedList3.size();
                linkedList3.add(fbc2.bOk());
                continue;
            }
            nArray6[i] = n2;
        }
        this.akv = ldz2.rgz;
        this.a((jd[])object, jeArray, jbArray, jaArray, bbsArray, nArray, nArray2, fArray, linkedList.toArray(new String[linkedList.size()]), nArray3, nArray4, linkedList2.toArray(new ljq[linkedList2.size()]), nArray5, linkedList3.toArray(new String[linkedList3.size()]), nArray6);
    }

    private void a(jc jc2) {
        if (this.akx.containsKey((Object)jc2)) {
            this.akx.put(jc2, this.akx.get((Object)jc2) + 1);
        } else {
            this.akw.add(new lfs<jc, Double>(jc2, this.MessageDelegator.arc().rgz + 10.0));
            this.akx.put(jc2, 1);
        }
    }

    private void a(fbc fbc2) {
        int n = 0;
        switch (fbc2.bOc()) {
            case ajC: {
                n = bjm.dpb.ordinal();
                break;
            }
            case ajF: {
                n = bjm.dpa.ordinal();
                break;
            }
            case ajK: {
                this.akz = true;
                return;
            }
            default: {
                return;
            }
        }
        if (fbc2.bOl() == null) {
            return;
        }
        fgi fgi2 = (fgi)this.MessageDelegator.h(29453, this.GUID, this.aky);
        fgi2.N(fbc2.uO());
        if (this.akz) {
            n = bjm.dpc.ordinal();
            this.akz = false;
        }
        fgi2.setType(n);
        fgi2.setTargetObjectGUID(fbc2.bOl());
        this.MessageDelegator.E(fgi2);
    }

    private void b(fbc fbc2) {
        if (fbc2.bOe() != jb.aja) {
            return;
        }
        block0 : switch (fbc2.bOc()) {
            case ajC: {
                switch (fbc2.bOd()) {
                    case ajO: {
                        this.a(jc.aje);
                        break;
                    }
                    case ajR: {
                        this.a(jc.ajf);
                        break;
                    }
                    case ajQ: {
                        this.a(jc.ajh);
                        break;
                    }
                    case ajT: {
                        this.a(jc.ajg);
                    }
                }
                break;
            }
            case ajG: {
                switch (fbc2.bOd()) {
                    case ajO: {
                        this.a(jc.aji);
                        break;
                    }
                    case ajR: {
                        this.a(jc.ajj);
                        break;
                    }
                    case ajV: {
                        this.a(jc.ajk);
                        break;
                    }
                    case ajW: {
                        this.a(jc.ajl);
                        break;
                    }
                    case ajY: {
                        this.a(jc.ajm);
                        break;
                    }
                    case ajX: {
                        this.a(jc.ajn);
                        break;
                    }
                    case ajZ: {
                        this.a(jc.ajo);
                        break;
                    }
                    case aka: {
                        this.a(jc.ajp);
                        break;
                    }
                    case akb: {
                        this.a(jc.ajq);
                        break;
                    }
                    case ajT: 
                    case akc: 
                    case akd: {
                        this.a(jc.ajr);
                        break;
                    }
                    case ajQ: 
                    case ajP: {
                        this.a(jc.ajs);
                        break;
                    }
                    case ajS: {
                        this.a(jc.ajt);
                        break;
                    }
                    case ajU: {
                        this.a(jc.aju);
                    }
                }
                break;
            }
            case ajH: {
                switch (fbc2.bOd()) {
                    case ajO: {
                        this.a(jc.ajv);
                        break;
                    }
                    case ajQ: 
                    case ajP: {
                        this.a(jc.ajw);
                    }
                }
                break;
            }
            case ajI: {
                switch (fbc2.bOd()) {
                    case ajO: {
                        this.a(jc.ajx);
                        break block0;
                    }
                    case ajQ: 
                    case ajP: {
                        this.a(jc.ajy);
                    }
                }
            }
        }
    }

    private void a(jc jc2, int n) {
        assert (jc2 != null);
        fgj fgj2 = (fgj)this.MessageDelegator.h(29452, this.GUID, this.aky);
        fgj2.b(jc2);
        fgj2.setPlayCount(n);
        this.MessageDelegator.F(fgj2);
    }

    private void a(jd[] jdArray, je[] jeArray, jb[] jbArray, ja[] jaArray, bbs[] bbsArray, int[] nArray, int[] nArray2, float[] fArray, String[] stringArray, int[] nArray3, int[] nArray4, ljq[] ljqArray, int[] nArray5, String[] stringArray2, int[] nArray6) {
        assert (jdArray != null);
        assert (jeArray != null);
        assert (jbArray != null);
        assert (bbsArray != null);
        assert (nArray != null);
        assert (nArray2 != null);
        assert (fArray != null);
        assert (stringArray != null);
        assert (nArray3 != null);
        assert (nArray4 != null);
        assert (ljqArray != null);
        assert (nArray5 != null);
        assert (stringArray2 != null);
        assert (nArray6 != null);
        assert (jdArray.length == jeArray.length);
        assert (jeArray.length == jbArray.length);
        assert (jbArray.length == jaArray.length);
        assert (jaArray.length == bbsArray.length);
        assert (bbsArray.length == nArray.length);
        assert (nArray.length == nArray2.length);
        assert (nArray2.length == fArray.length);
        assert (fArray.length == nArray3.length);
        assert (nArray3.length == nArray4.length);
        assert (nArray4.length == nArray5.length);
        assert (nArray5.length == nArray6.length);
        assert (jdArray.length > 0);
        fgk fgk2 = (fgk)this.MessageDelegator.h(29451, this.GUID, this.aky);
        fgk2.a(jdArray);
        fgk2.a(jeArray);
        fgk2.a(jbArray);
        fgk2.a(jaArray);
        fgk2.a(bbsArray);
        fgk2.M(nArray);
        fgk2.ae(nArray2);
        fgk2.i(fArray);
        fgk2.u(stringArray);
        fgk2.af(nArray3);
        fgk2.ag(nArray4);
        fgk2.h(ljqArray);
        fgk2.ah(nArray5);
        fgk2.v(stringArray2);
        fgk2.ai(nArray6);
        this.MessageDelegator.F(fgk2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 12551: {
                this.c((fbc)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void c(fbc fbc2) {
        this.a(fbc2);
        this.b(fbc2);
        this.aku.add(fbc2);
    }
}

