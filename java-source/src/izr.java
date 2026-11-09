/*
 * Decompiled with CFR.
 */
public class izr<T extends Enum>
extends ihm {
    private iou<T> mDC;
    private iou<Boolean> mDD;
    private T[] mDE;
    private String mDF;
    private int mDG;
    private int mDH;
    private int mDI;
    private int mDJ;

    public izr(ioa ioa2, joa joa2, T t, boolean bl, T[] TArray, String string, int n, int n2, int n3, int n4) {
        super(ioa2.aDa + "SortingPopupWindow", ioa2.loi, ioa2, joa2, 2, 3);
        this.mDC = new iou<T>(t);
        this.mDD = new iou<Boolean>(bl);
        this.mDE = TArray;
        this.mDF = string;
        this.mDG = n;
        this.mDH = n2;
        this.mDI = n3;
        this.mDJ = n4;
    }

    @Override
    public void cCu() {
        super.cCu();
        this.p(40, 0, 40, 70);
        this.cXE().W(ipx.a(1, 4, new ipf[0]));
        this.cXE().W(new jaa(lvn.sXJ));
        this.cXE().W(ipx.a(1, 2, new ipf[0]));
        for (T t : this.mDE) {
            ioq<T> ioq2 = new ioq<T>(this.mDC, t);
            this.cXE().W(ioq2);
        }
        this.cXE().W(ipx.a(1, 8, new ipf[0]));
        this.cXE().W(ipx.l(ipx.a(4, 1, new ipf[0]), ipx.c(new iwx()), ipx.a(4, 1, new ipf[0])));
        this.cXE().W(ipx.a(1, 8, new ipf[0]));
        this.cXE().W(new iom<Boolean>(this.mDD, true, lvn.sXK.bD(new Object[0]).exA()));
        this.cXE().W(new iom<Boolean>(this.mDD, false, lvn.sXL.bD(new Object[0]).exA()));
        this.cXE().W(ipx.a(1, 10, new ipf[0]));
        this.cXE().W(ipx.c(new ipf[0]));
        ipx ipx2 = ipx.l(new ipf[0]);
        this.cXE().W(ipx2);
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(new iur(this){
            final /* synthetic */ izr mDK;
            {
                this.mDK = izr2;
            }

            public void cLq() {
                this.mDK.close();
                izr.a(this.mDK);
            }
        });
        ipx2.W(ipx.a(9, 1, new ipf[0]));
        ipx2.W(new ivc(this){
            final /* synthetic */ izr mDK;
            {
                this.mDK = izr2;
            }

            public void cLq() {
                this.mDK.close();
            }
        });
        ipx2.W(ipx.a(5, 1, new ipf[0]));
        this.cXE().W(ipx.a(1, 69, new ipf[0]));
    }

    @Override
    protected ihn cVF() {
        return null;
    }

    @Override
    protected ipf cMs() {
        iqa iqa2 = new iqa(this.mDF, this.mDG, this.mDH, this.mDI, this.mDJ);
        return iqa2;
    }

    protected void a(T t, boolean bl) {
    }

    private void _accept() {
        this.a((Enum)this.mDC.getValue(), (boolean)this.mDD.getValue());
    }

    static /* synthetic */ void a(izr izr2) {
        izr2._accept();
    }
}

