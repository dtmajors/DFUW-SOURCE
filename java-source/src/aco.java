/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Iterator;
import java.util.Map;

public class aco
extends btk {
    private static aco bdU = null;
    private Map<Integer, ldv> bdV = lcn.emw();
    private int Qs = 0;
    private Map<Integer, xj> bdW = lcn.emw();
    private Map<Integer, gdx> bdX = lcn.emw();
    private Map<xj, Integer> bdY = lcn.emw();

    public static aco yS() {
        if (bdU == null) {
            bdU = new aco();
        }
        return bdU;
    }

    private aco() {
    }

    public void a(int n, ljq ljq2, xj xj2) {
        this.h(n, ljq2);
        this.bdW.put(this.Qs++, xj2);
    }

    public void a(int n, xj xj2) {
        Integer n2 = this.bdY.remove(xj2);
        if (n2 == null) {
            if (this.bdW.containsValue(xj2)) {
                Iterator<Map.Entry<Integer, xj>> iterator = this.bdW.entrySet().iterator();
                while (iterator.hasNext()) {
                    Map.Entry<Integer, xj> entry = iterator.next();
                    if (entry.getValue() != xj2) continue;
                    iterator.remove();
                    break;
                }
            }
            return;
        }
        this.F(n2, n);
    }

    private void h(int n, ljq ljq2) {
        gdx gdx2 = (gdx)this.MessageDelegator.h(34823, this.GUID, lcr.qDA);
        gdx2.sk(this.Qs);
        gdx2.setType(1);
        gdx2.IZ(n);
        gdx2.cR(ljq2);
        this.MessageDelegator.F(gdx2);
        this.bdX.put(this.Qs, gdx2);
    }

    private void F(int n, int n2) {
        gea gea2 = (gea)this.MessageDelegator.h(34825, this.GUID, lcr.qDA);
        gea2.Ja(n);
        gea2.IZ(n2);
        this.MessageDelegator.F(gea2);
    }

    private void a(ldv ldv2, int n, ljq ljq2) {
        glh glh2 = (glh)this.MessageDelegator.h(13060, this.GUID, lcr.qEb);
        glh2.my(ldv2);
        glh2.setSpecialEffectType(n);
        glh2.setTargetPosition(ljq2);
        glh2.JQ(32);
        this.MessageDelegator.F(glh2);
    }

    private void cx(ldv ldv2) {
        glj glj2 = (glj)this.MessageDelegator.h(13058, this.GUID, lcr.qEb);
        glj2.aUa = ldv2;
        glj2.jkV = 1;
        this.MessageDelegator.F(glj2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 34824: {
                this.a((gdy)dxq2);
                break;
            }
            case 34826: {
                this.a((geb)dxq2);
                break;
            }
            case 34827: {
                this.a((gdz)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gdy gdy2) {
        gdx gdx2 = this.bdX.remove(gdy2.aVk());
        if (gdx2 == null) {
            this.bdW.remove(gdy2.aVk());
            assert (false) : "WTF is Happening!!!... Received Response for Request We Didn't Send!?!";
            return;
        }
        xj xj2 = this.bdW.remove(gdy2.aVk());
        if (xj2 == null) {
            if (gdy2.isError()) {
                return;
            }
            this.F(gdy2.bUc(), gdx2.xc());
            return;
        }
        if (gdy2.isError()) {
            return;
        }
        this.bdY.put(xj2, gdy2.bUc());
        if (gdy2.bUd()) {
            ldv ldv2 = this.MessageDelegator.lL(lcr.qEb);
            this.bdV.put(gdy2.bUc(), ldv2);
            switch (gdx2.getType()) {
                case 1: {
                    this.a(ldv2, gdx2.xc(), gdx2.bUb());
                }
            }
        }
    }

    private void a(geb geb2) {
        if (geb2.isError()) {
            assert (false) : "Oh Shit!!!... Memory Leak Much???";
            return;
        }
        if (geb2.bUe()) {
            ldv ldv2 = this.bdV.remove(geb2.bUc());
            if (ldv2 == null) {
                assert (false) : "Opps... Misplaced SFX GUID!!!";
                return;
            }
            this.cx(ldv2);
        }
    }

    private void a(gdz gdz2) {
        ldv ldv2 = this.bdV.remove(gdz2.bUc());
        if (ldv2 == null) {
            assert (false) : "Opps... Misplaced SFX GUID!!!";
            return;
        }
        this.cx(ldv2);
    }
}

