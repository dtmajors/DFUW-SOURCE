/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 *  dtc
 *  lcr
 *  lcw
 */
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class buv
extends btk
implements bto {
    private static final String TC = "SFTrainerTaskManagerClient";
    private static final double dPj = 0.3;
    private static final Map<Integer, lfs<Integer, String>> dPk = lea.epr().aQj();
    private static final List<bsx> dPl = lcn.emv();
    private static final List<bsx> dPm = lcn.emv();
    private static final Map<Integer, cjr> dPn = lea.epr().aQi();
    private Map<Integer, a> dPo = lcn.emw();
    private double dPp = 0.0;
    private ldv dPq = null;
    private cew crm = null;
    private int dPr = -1;
    private int dPs = 0;
    private Map<Integer, List<ldv>> dPt = lcn.emw();

    public void mZ(int n) {
        List list;
        Object object;
        Map<Integer, List<bsx>> map = fy.TN.get(fy.a.TR.ordinal());
        if (map != null && !map.isEmpty() && (object = map.get(n)) != null && !object.isEmpty()) {
            dPl.addAll((Collection<bsx>)object);
        }
        if ((object = fy.TN.get(fy.a.TT.ordinal())) != null && !object.isEmpty() && (list = (List)object.get(n)) != null && !list.isEmpty()) {
            dPm.addAll(list);
        }
    }

    public void na(int n) {
        List list;
        Object object;
        Map<Integer, List<bsx>> map = fy.TN.get(fy.a.TR.ordinal());
        if (map != null && !map.isEmpty() && (object = map.get(n)) != null && !object.isEmpty()) {
            dPl.removeAll((Collection<?>)object);
        }
        if ((object = fy.TN.get(fy.a.TT.ordinal())) != null && !object.isEmpty() && (list = (List)object.get(n)) != null && !list.isEmpty()) {
            dPm.removeAll(list);
        }
    }

    private ljq nb(int n) {
        for (bsx bsx2 : dPl) {
            int n2 = Integer.parseInt(bsx2.getValue("SensorID").toString());
            if (n2 != n) continue;
            return (ljq)bsx2.getValue("Position");
        }
        return null;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        if (!lcw.qOR) {
            return;
        }
        switch (dxq2.bEz()) {
            case 29185: {
                gxu gxu2 = (gxu)dxq2;
                int n = gxu2.gOd;
                switch (n) {
                    case 1: {
                        this.dPq = dxq2.aO();
                        break;
                    }
                    case 2: {
                        break;
                    }
                    case 3: {
                        this.a(gxu2);
                        break;
                    }
                    case 4: {
                        this.b(gxu2);
                    }
                }
                gxu2.f(this.GUID);
                gxu2.on(lcr.acL);
                this.MessageDelegator.F(gxu2);
                break;
            }
            case 29187: {
                this.a((gxp)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gxu gxu2) {
        Object object;
        Object object2;
        int n;
        cjr cjr2;
        if (this.dPr != -1) {
            // empty if block
        }
        if ((cjr2 = dPn.get(n = gxu2.jtD)) == null) {
            lfn.b(5, TC, "handleTrainerTaskActivatedMessage() TaskIndex : " + n + " is invalid!!");
            assert (false);
            return;
        }
        this.dPr = n;
        for (Map.Entry<Integer, lfs<Integer, String>> object3 : dPk.entrySet()) {
            int n2 = object3.getKey();
            if (this.dPr >= n2) {
                if (this.dPo.isEmpty() || (object2 = this.dPo.remove(n2)) == null) continue;
                this.jX(((a)object2).aUa);
                continue;
            }
            if (this.dPo.containsKey(n2)) continue;
            object2 = new a(this);
            ((a)object2).Position = this.nb((Integer)object3.getValue().reX);
            ((a)object2).dPv = n2;
            ((a)object2).dPu = (Integer)object3.getValue().reX;
            ((a)object2).aUa = this.MessageDelegator.bzv();
            object = (String)object3.getValue().reY;
            int n3 = del.dr((String)object);
            this.b(n3, ((a)object2).aUa, ((a)object2).Position);
            this.dPo.put(n2, (a)object2);
        }
        for (bsx bsx2 : dPm) {
            Integer n4 = (Integer)bsx2.axn().get("TaskID");
            if (n4 != this.dPr) continue;
            object2 = (String)bsx2.axn().get("MeshName");
            object = (ljq)bsx2.axn().get("Position");
            ljq ljq2 = (ljq)bsx2.axn().get("Rotation");
            dfm dfm2 = (dfm)new dez().Af(11);
            dfm2.setGUID(this.MessageDelegator.bzv());
            dfm2.setMeshXML((String)object2);
            dfm2.c((ljq)object);
            dfm2.a(new lgl(ljq2));
            this.MessageDelegator.a(dfm2);
            List<ldv> list = this.dPt.get(n4);
            if (list == null) {
                list = lcn.emv();
                this.dPt.put(n4, list);
            }
            list.add(dfm2.getGUID());
        }
    }

    private void b(gxu gxu2) {
        int n;
        cjr cjr2;
        if (this.dPr == -1) {
            lfn.b(5, TC, "handleTrainerTaskCompletedMessage() There no task active.");
            this.dPr = gxu2.jtD;
        }
        if ((cjr2 = dPn.get(n = gxu2.jtD)) == null) {
            lfn.b(5, TC, "handleTrainerTaskActivatedMessage() TaskIndex : " + n + " is invalid!!");
            assert (false);
            return;
        }
        if (n != this.dPr) {
            lfn.b(5, TC, "handleTrainerTaskActivatedMessage() TaskIndex : " + n + " and active TaskIndex : " + this.dPr);
            assert (false);
            return;
        }
        List<ldv> list = this.dPt.get(this.dPr);
        if (list != null) {
            for (ldv ldv2 : list) {
                this.MessageDelegator.hd(ldv2);
            }
        }
        gxu gxu3 = (gxu)this.MessageDelegator.h(29185, this.getGUID(), gxu2.aO());
        gxu3.gOd = 6;
        gxu3.jtD = this.dPr;
        this.MessageDelegator.F(gxu3);
    }

    private void nc(int n) {
        if (this.crm == null) {
            return;
        }
        if (this.crm.aAG() == null) {
            return;
        }
        if (this.crm.aAG().av() == null) {
            return;
        }
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.getGUID(), lcr.qEa);
        glh2.SpecialEffectType = n;
        glh2.aZD = this.crm.aAG().av();
        this.MessageDelegator.F(glh2);
    }

    private void b(int n, ldv ldv2, ljq ljq2) {
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.getGUID(), lcr.qEa);
        glh2.SpecialEffectType = n;
        glh2.aUa = ldv2;
        glh2.aZD = ljq2;
        this.MessageDelegator.F(glh2);
    }

    private void jX(ldv ldv2) {
        glj glj2 = (glj)this.MessageDelegator.h(13058, this.getGUID(), lcr.qEa);
        glj2.aUa = ldv2;
        glj2.jkV = 1;
        this.MessageDelegator.F(glj2);
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.crm == null) {
            dtc dtc2 = this.MessageDelegator.bzx().bzt();
            dtp dtp2 = (dtp)dtc2.od(lcr.qzp);
            dsu dsu2 = dtp2.bAn();
            if (dsu2 != null && dsu2.gYY != null) {
                this.crm = (cew)dtc2.d(dsu2.gYY);
            }
            return;
        }
        this.K(ldz2);
    }

    public void K(ldz ldz2) {
        if (this.crm.aAG() == null) {
            return;
        }
        ljq ljq2 = this.crm.aAG().azb();
        if (ljq2 == null) {
            return;
        }
        if (ldz2.rgz <= this.dPp + 0.3) {
            return;
        }
        this.dPp = ldz2.rgz;
        if (dPl == null || dPl.isEmpty()) {
            return;
        }
        for (bsx bsx2 : dPl) {
            double d2;
            ljq ljq3;
            int n = Integer.parseInt(bsx2.getValue("SensorID").toString());
            cjr cjr2 = lea.epq().get(this.dPr);
            if (cjr2 == null) {
                return;
            }
            if (cjr2.eDE.aPY() != cjo.LOCATION) {
                return;
            }
            cjl cjl2 = (cjl)cjr2.eDE;
            if (cjl2.dPu != n || !this.a(ljq2, ljq3 = (ljq)bsx2.getValue("Position"), d2 = Double.valueOf(bsx2.getValue("Radius").toString()).doubleValue())) continue;
            this.dPs = n;
            gxt gxt2 = (gxt)this.MessageDelegator.h(29186, this.getGUID(), this.dPq);
            gxt2.dPu = n;
            this.MessageDelegator.F(gxt2);
        }
    }

    private boolean a(ljq ljq2, ljq ljq3, double d2) {
        return ljq.b(ljq3, (float)d2, ljq2);
    }

    public final int ayL() {
        return this.dPr;
    }

    private void a(gxp gxp2) {
        lox lox2 = lpd.rHs.BE("Trainer.ContainerName_" + gxp2.bYo());
        String string = lox2 == null ? gxp2.bYo() : lox2.bD(new Object[0]).exA();
        gxq gxq2 = (gxq)this.MessageDelegator.h(29188, this.GUID, this.dPq);
        this.MessageDelegator.b(gxp2, gxq2);
        gxq2.lm(string);
        this.MessageDelegator.F(gxq2);
    }
}

