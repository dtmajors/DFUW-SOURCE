/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 *  cex
 *  dtn
 *  ha
 *  lcr
 */
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public abstract class jk
extends btk {
    private static final int akY = 1000000;
    private jl akS;
    private static mhs[] akZ = new mhs[0];
    protected cul ala = new cul();
    protected les ResourceTree = lea.enW();

    void a(jl jl2) {
        assert (this.akS == null);
        this.akS = jl2;
        this.nU();
        this.akS = null;
    }

    public abstract void nU();

    public abstract void a(jj var1);

    protected final void a(String string, hc hc2, boolean bl, mhs[] mhsArray, lox lox2) {
        if (this.akS == null) {
            lfn.b(5, "SFConsoleCommandHandler", "registerCommand(): Cannot register commands, Manager is null");
            assert (false);
            return;
        }
        this.akS.a(string, hc2, mhsArray == null ? akZ : mhsArray, bl, this.getClass(), lox2);
    }

    protected final void a(String string, boolean bl, hc hc2, lox lox2, mhs ... mhsArray) {
        this.a(string, hc2, bl, mhsArray, lox2);
    }

    protected final void a(String string, hc hc2, lox lox2, mhs ... mhsArray) {
        this.a(string, hc2, false, mhsArray, lox2);
    }

    protected final void a(String string, hc hc2, lox lox2) {
        this.a(string, hc2, false, null, lox2);
    }

    protected final boolean nV() {
        return this.aQ() != null;
    }

    protected final boolean iN() {
        return this.nW() != null;
    }

    protected final boolean b(jj jj2) {
        if (this.iN()) {
            return true;
        }
        jj2.b(lqd.rXl.bD(jj2.akV), true);
        return false;
    }

    protected final cex nW() {
        ha ha2 = this.aQ();
        if (ha2 != null) {
            return ha2.jf();
        }
        ldv ldv2 = new ldv(this.getGUID().ib(), this.getGUID().enw(), 8);
        amf amf2 = this.MessageDelegator.d(ldv2);
        if (amf2 == null || !(amf2 instanceof cex)) {
            return null;
        }
        return (cex)amf2;
    }

    protected final ldv nX() {
        ha ha2 = this.aQ();
        if (ha2 == null) {
            return null;
        }
        ldv ldv2 = ha2.aP();
        return lcr.o((ldv)ldv2, (int)ha2.jr(), (int)ldv2.enw());
    }

    protected cew nY() {
        dtn dtn2 = (dtn)this.MessageDelegator.bzx().bzt().od(lcr.qzp);
        if (dtn2 == null) {
            return null;
        }
        dsu dsu2 = dtn2.bAn();
        if (dsu2 == null) {
            return null;
        }
        cew cew2 = (cew)this.MessageDelegator.bzx().bzt().d(dsu2.gYY);
        return cew2;
    }

    protected final ha aQ() {
        ldv ldv2 = new ldv(this.getGUID().ib(), this.getGUID().enw(), 50);
        amf amf2 = this.MessageDelegator.d(ldv2);
        if (amf2 == null) {
            return null;
        }
        if (!(amf2 instanceof ha)) {
            return null;
        }
        return (ha)amf2;
    }

    protected final List<cte> ba(String string) {
        assert (string != null);
        ArrayList<cte> arrayList = lcn.emv();
        StringTokenizer stringTokenizer = new StringTokenizer(string.trim(), ";");
        String string2 = null;
        cte cte2 = null;
        while (stringTokenizer.hasMoreTokens()) {
            String string3 = stringTokenizer.nextToken().trim();
            cte2 = new cte();
            int n = string3.indexOf(58);
            if (n < 0) {
                string2 = string3;
                cte2.asi = 0;
            } else {
                string2 = string3.substring(0, n).trim();
                String string4 = string3.substring(n + 1, string3.length()).trim();
                if ((n = string4.indexOf(58)) < 0) {
                    if (string4.equalsIgnoreCase("true") || string4.equalsIgnoreCase("false")) {
                        cte2.fex = Boolean.parseBoolean(string4);
                    } else {
                        cte2.asi = this.bb(string4);
                    }
                } else {
                    String string5 = string4.substring(0, n);
                    cte2.asi = this.bb(string5);
                    String string6 = string4.substring(n + 1, string4.length());
                    cte2.fex = Boolean.parseBoolean(string6);
                }
            }
            if (string2 == null) continue;
            if (string2.startsWith("*")) {
                string2 = string2.replace("*", "");
                if (cte2.asi > 0) {
                    this.ala.a(string2, cte2.asi, arrayList);
                    continue;
                }
                this.ala.a(string2, arrayList);
                continue;
            }
            cte2.ResourceType = this.ResourceTree.getType(string2);
            if (cte2.ResourceType <= 0) {
                lfn.b(5, "SFConsoleCommandHandler", "createEquipmentItems() ResourceName '" + string2 + "' is invalid.");
                continue;
            }
            this.ala.a(cte2.ResourceType, cte2.asi, cte2.fex, arrayList);
        }
        return arrayList;
    }

    private int bb(String string) {
        try {
            int n = Integer.parseInt(string);
            if (n < 0) {
                lfn.b(5, "SFConsoleCommandHandler", "parseQuantityString() QuantityString '" + string + "' is invalid.");
                return 0;
            }
            if (n > 1000000) {
                lfn.b(5, "SFConsoleCommandHandler", "parseQuantityString() QuantityString '" + string + "' is above maximum.");
                n = 1000000;
            }
            return n;
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, "SFConsoleCommandHandler", "parseQuantityString() " + numberFormatException);
            return 0;
        }
    }

    protected lej bc(String string) {
        int n;
        int n2;
        int n3;
        int n4;
        StringTokenizer stringTokenizer = new StringTokenizer(string = string.trim().toLowerCase(), "'\"nsew ", true);
        if (!stringTokenizer.hasMoreTokens()) {
            return null;
        }
        try {
            n4 = Integer.parseInt(stringTokenizer.nextToken());
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
        if (!stringTokenizer.hasMoreTokens()) {
            return null;
        }
        stringTokenizer.nextToken();
        if (!stringTokenizer.hasMoreTokens()) {
            return null;
        }
        try {
            n3 = Integer.parseInt(stringTokenizer.nextToken());
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
        if (!stringTokenizer.hasMoreTokens()) {
            return null;
        }
        String string2 = stringTokenizer.nextToken();
        if (string2.equalsIgnoreCase("\"")) {
            if (!stringTokenizer.hasMoreTokens()) {
                return null;
            }
            string2 = stringTokenizer.nextToken();
        }
        if (!string2.equalsIgnoreCase("e")) {
            if (string2.equalsIgnoreCase("w")) {
                n3 *= -1;
                n4 *= -1;
            } else {
                return null;
            }
        }
        if (!stringTokenizer.hasMoreTokens()) {
            return null;
        }
        stringTokenizer.nextToken();
        if (!stringTokenizer.hasMoreTokens()) {
            return null;
        }
        try {
            n2 = Integer.parseInt(stringTokenizer.nextToken());
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
        if (!stringTokenizer.hasMoreTokens()) {
            return null;
        }
        stringTokenizer.nextToken();
        if (!stringTokenizer.hasMoreTokens()) {
            return null;
        }
        try {
            n = Integer.parseInt(stringTokenizer.nextToken());
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
        if (!stringTokenizer.hasMoreTokens()) {
            return null;
        }
        string2 = stringTokenizer.nextToken();
        if (string2.equalsIgnoreCase("\"")) {
            if (!stringTokenizer.hasMoreTokens()) {
                return null;
            }
            string2 = stringTokenizer.nextToken();
        }
        if (!string2.equalsIgnoreCase("s")) {
            if (string2.equalsIgnoreCase("n")) {
                n *= -1;
                n2 *= -1;
            } else {
                return null;
            }
        }
        return new lej(n4 * 60 + n3, n2 * 60 + n);
    }

    protected final void d(ldv ldv2, dxq dxq2) {
        assert (this.Initialized);
        assert (ldv2 != null);
        assert (dxq2 != null);
        grd grd2 = (grd)this.MessageDelegator.h(11078, this.GUID, ldv2);
        grd2.jpX = dxq2;
        this.MessageDelegator.E(grd2);
    }
}

