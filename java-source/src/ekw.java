/*
 * Decompiled with CFR.
 */
import java.util.EnumSet;

public class ekw
extends emr {
    private ldv isO = null;
    private String aDF = null;
    private String aDG = null;
    private ldv itz = null;
    private int[] cAg = null;
    private boolean itA = false;
    private int cAi = 0;
    private int itB = -1;

    public ldv bHL() {
        return this.isO;
    }

    public void oS(ldv ldv2) {
        this.isO = ldv2;
    }

    public String ZK() {
        return this.aDF;
    }

    public void eN(String string) {
        this.aDF = string;
    }

    public String ZL() {
        return this.aDG;
    }

    public void eO(String string) {
        this.aDG = string;
    }

    public ldv bIn() {
        return this.itz;
    }

    public void oV(ldv ldv2) {
        this.itz = ldv2;
    }

    public int[] bIo() {
        return this.cAg;
    }

    public void l(int[] nArray) {
        this.cAg = nArray;
    }

    public boolean bIp() {
        return this.itA;
    }

    public void cn(boolean bl) {
        this.itA = bl;
    }

    public EnumSet<ayw> ZO() {
        return ayw.getEnumSet(this.cAi);
    }

    public void a(EnumSet<ayw> enumSet) {
        this.cAi = ayw.getTags(enumSet);
    }

    public int bIq() {
        return this.itB;
    }

    public void Eo(int n) {
        this.itB = n;
    }

    ekw() {
        super(13888);
    }
}

