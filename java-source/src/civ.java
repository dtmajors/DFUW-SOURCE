/*
 * Decompiled with CFR.
 */
import java.util.List;

public class civ {
    private int ResourceType;
    private int Cost;
    private boolean eDc;
    private int eDd;
    private List<cip> eDe = null;
    private int asi = 0;
    private boolean avz = true;
    private boolean eDf = false;
    private boolean eDg = false;
    private boolean eDh = false;
    private boolean eDi = false;
    private boolean eDj = false;

    public civ(int n, int n2, boolean bl, int n3, List<cip> list, int n4) {
        this.ResourceType = n;
        this.Cost = n2;
        this.eDc = bl;
        this.eDd = n3;
        this.eDe = list;
        this.asi = n4;
    }

    public final int cl() {
        return this.Cost;
    }

    public final boolean aPC() {
        return this.Cost > 0;
    }

    public final boolean aPD() {
        return this.eDc;
    }

    public final int aPE() {
        return this.eDd;
    }

    public final int az() {
        return this.ResourceType;
    }

    public List<cip> aPF() {
        return this.eDe;
    }

    public final int vf() {
        return this.asi;
    }

    public boolean isEnabled() {
        return this.avz;
    }

    public void setEnabled(boolean bl) {
        this.avz = bl;
    }

    public boolean aPG() {
        return this.eDf;
    }

    public void gb(boolean bl) {
        this.eDf = bl;
    }

    public boolean aPH() {
        return this.eDg;
    }

    public void gc(boolean bl) {
        this.eDg = bl;
    }

    public boolean aPI() {
        return this.eDh;
    }

    public void gd(boolean bl) {
        this.eDh = bl;
    }

    public boolean aPJ() {
        return this.eDi;
    }

    public void ge(boolean bl) {
        this.eDi = bl;
    }

    public boolean aPK() {
        return this.eDj;
    }

    public void gf(boolean bl) {
        this.eDj = bl;
    }
}

