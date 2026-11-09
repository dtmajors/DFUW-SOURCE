/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  axx
 *  lcr
 */
import java.util.Map;
import java.util.Set;

public class axv
extends axt
implements bto {
    private Map<ldv, axk> ctr = lcn.emw();
    private boolean cts = false;
    private Set<String> ctt = lcn.emx();

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 18689: {
                this.a((eix)dxq2);
                break;
            }
            case 18714: {
                this.a((ehz)dxq2);
                break;
            }
            case 18719: {
                this.a((ejf)dxq2);
                break;
            }
            case 18721: {
                this.a((ejd)dxq2);
                break;
            }
            case 24326: {
                this.a((gbp)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
    }

    public Set<ldv> YM() {
        Set<ldv> set = lcn.emx();
        set.addAll(this.ctr.keySet());
        return set;
    }

    private void a(eix eix2) {
        if (eix2.bHh() == null) {
            assert (eix2.bHh() != null);
            return;
        }
        if (!eix2.bHh().YI()) {
            assert (false);
            return;
        }
        if (this.ctt.contains(eix2.bHh().getID())) {
            lfn.b(5, "SFCityManagerServer", "handleCityCreateMessage() City already exists: " + eix2.bHh().getID());
            return;
        }
        this.a(eix2.bHh(), null);
    }

    private void a(ehz ehz2) {
        eia eia2 = (eia)this.MessageDelegator.h(18715, this.getGUID(), ehz2.aO());
        this.MessageDelegator.b(ehz2, eia2);
        eia2.eo = false;
        if (!this.ctt.contains(ehz2.bhD)) {
            this.MessageDelegator.F(eia2);
            return;
        }
        axk axk2 = null;
        for (axk axk3 : this.ctr.values()) {
            if (axk3 == null || !axk3.Xt().equals(ehz2.bhD)) continue;
            axk2 = axk3;
            break;
        }
        if (axk2 == null) {
            assert (false);
            lfn.b(5, "SFCityManagerServer", "handleCityAdminModifyMessage() Could not find the city");
            this.MessageDelegator.F(eia2);
            return;
        }
        if (ehz2.ilu == 1) {
            axx axx2 = (axx)axk2;
            axx2.YZ();
            eia2.eo = true;
        }
        this.MessageDelegator.F(eia2);
    }

    private void a(ejf ejf2) {
        ejg ejg2 = (ejg)this.MessageDelegator.h(18720, this.getGUID(), ejf2.aO());
        ejg2.aqs = ejf2.aqs;
        if (ejf2.bhD == null) {
            lfn.b(5, "SFCityManagerServer", "handleCityLocateMessage(): Message.CityID == null");
            this.MessageDelegator.E(ejg2);
            return;
        }
        axk axk2 = null;
        for (axk axk3 : this.ctr.values()) {
            if (axk3 == null || !axk3.Xt().equalsIgnoreCase(ejf2.bhD)) continue;
            axk2 = axk3;
            break;
        }
        if (axk2 == null) {
            this.MessageDelegator.E(ejg2);
            return;
        }
        if (!(axk2 instanceof axx)) {
            this.MessageDelegator.E(ejg2);
            return;
        }
        axx axx2 = (axx)axk2;
        if (axx2.Zs() == null) {
            this.MessageDelegator.E(ejg2);
            return;
        }
        if (axx2.Zs().XL() == null) {
            this.MessageDelegator.E(ejg2);
            return;
        }
        ejg2.Position = axx2.Zs().XL().av();
        ejg2.bhD = axk2.Xt();
        this.MessageDelegator.E(ejg2);
    }

    private void a(ejd ejd2) {
        eje eje2 = (eje)this.MessageDelegator.h(18722, this.getGUID(), ejd2.aO());
        this.MessageDelegator.b(ejd2, eje2);
        if (!this.ctr.isEmpty()) {
            int[] nArray = new int[this.ctr.size()];
            String[] stringArray = new String[this.ctr.size()];
            ldv[] ldvArray = new ldv[this.ctr.size()];
            ljq[] ljqArray = new ljq[this.ctr.size()];
            float[] fArray = new float[this.ctr.size()];
            String[] stringArray2 = new String[this.ctr.size()];
            ldv[] ldvArray2 = new ldv[this.ctr.size()];
            int n = 0;
            for (Map.Entry<ldv, axk> entry : this.ctr.entrySet()) {
                axk axk2 = entry.getValue();
                int n2 = axk2.bhH.ordinal();
                String string = axk2.bhD;
                ldv ldv2 = entry.getKey();
                ljq ljq2 = axk2.bhF;
                float f = axk2.bhG;
                ldv ldv3 = axk2.crY;
                String string2 = axk2.crX;
                nArray[n] = n2;
                stringArray[n] = string;
                ldvArray[n] = ldv2;
                ljqArray[n] = ljq2;
                fArray[n] = f;
                ldvArray2[n] = ldv3 != null ? ldv3 : lcr.qAC;
                stringArray2[n] = string2 != null ? string2 : "";
                ++n;
            }
            eje2.ise = ldvArray2;
            eje2.isd = stringArray2;
            eje2.isc = ldvArray;
            eje2.isb = stringArray;
            eje2.ilP = ljqArray;
            eje2.ilj = fArray;
            eje2.ioG = nArray;
        }
        this.MessageDelegator.F(eje2);
    }

    public void a(axs axs2, ni ni2) {
        ldv ldv2 = null;
        if (ni2 == null) {
            ldv2 = this.MessageDelegator.bzw();
        } else {
            ldv2 = ni2.aDk;
            this.MessageDelegator.nZ(ldv2);
        }
        axx axx2 = new axx();
        axx2.a(this);
        axx2.setGUID(ldv2);
        this.ctr.put(axx2.getGUID(), (axk)axx2);
        this.MessageDelegator.a((amf)axx2);
        axx2.a(axs2, ni2);
        this.ctt.add(axx2.Xt());
    }

    @Override
    public void doTick(ldz ldz2) {
        if (!this.cts) {
            if (this.MessageDelegator.bzx().bzt().dVA() != kdw.a.phY) {
                return;
            }
            if (this.ctr.isEmpty()) {
                this.cts = true;
                return;
            }
            gbo gbo2 = (gbo)this.MessageDelegator.h(24325, this.GUID, lcr.hac);
            this.MessageDelegator.F(gbo2);
            this.cts = true;
        }
    }

    private void a(gbp gbp2) {
        for (axk axk2 : this.ctr.values()) {
            if (!(axk2 instanceof axx)) continue;
            ((axx)axk2).a(gbp2.jcW, gbp2.aoY);
        }
    }
}

