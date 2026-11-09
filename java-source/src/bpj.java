/*
 * Decompiled with CFR.
 */
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class bpj
implements Comparable {
    public static final Comparator<bpj> dzB = new Comparator<bpj>(){

        public int a(bpj bpj2, bpj bpj3) {
            return bpj.a(bpj2).h(bpj.a(bpj3));
        }

        public /* synthetic */ int compare(Object object, Object object2) {
            return this.a((bpj)object, (bpj)object2);
        }
    };
    public static final int dzC = 2;
    public static final int dzD = 1;
    public static final int dzE = 65535;
    private int Type = 0;
    private ldv GUID = null;
    private int dzF = 0;
    private String dzG = null;
    private lip dzH;
    private lip dzI;
    private lip dzJ;
    private int dzK;
    private int[] dzL;
    private int[] dzM;
    private lhu dzN;
    private List<bpl> bhg;

    public int getType() {
        return this.Type;
    }

    public void setType(int n) {
        this.Type = n;
    }

    public ldv getGUID() {
        return this.GUID;
    }

    public void setGUID(ldv ldv2) {
        this.GUID = ldv2;
    }

    public lip ats() {
        return this.dzH;
    }

    public void a(lip lip2) {
        this.dzH = lip2;
    }

    public lip att() {
        return this.dzI;
    }

    public void b(lip lip2) {
        this.dzI = lip2;
    }

    public int atu() {
        return this.dzF;
    }

    public void lF(int n) {
        this.dzF = n;
    }

    public lip atv() {
        return this.dzJ;
    }

    public void c(lip lip2) {
        this.dzJ = lip2;
    }

    public lhu atw() {
        return this.dzN;
    }

    public void a(lhu lhu2) {
        this.dzN = lhu2;
    }

    public List<bpl> Al() {
        return this.bhg;
    }

    public void ak(List<bpl> list) {
        this.bhg = Collections.unmodifiableList(list);
    }

    public int atx() {
        return this.dzK;
    }

    public void lG(int n) {
        this.dzK = n;
    }

    public int[] aty() {
        return this.dzL;
    }

    public void s(int[] nArray) {
        this.dzL = nArray;
    }

    public int[] atz() {
        return this.dzM;
    }

    public void t(int[] nArray) {
        this.dzM = nArray;
    }

    public int compareTo(Object object) {
        if (!(object instanceof bpj)) {
            lfn.b(5, this.getClass().getSimpleName(), "compareTo() : Other Object is not same class. Returning 0");
            return 0;
        }
        bpj bpj2 = (bpj)object;
        if (this.dzF == bpj2.dzF) {
            return 0;
        }
        if (this.dzF < bpj2.dzF) {
            return -1;
        }
        return 1;
    }

    public String atA() {
        return this.dzG;
    }

    public void fV(String string) {
        this.dzG = string;
    }

    static /* synthetic */ lip a(bpj bpj2) {
        return bpj2.dzH;
    }
}

