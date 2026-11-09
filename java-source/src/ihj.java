/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ihj
extends ihm {
    private Set<igp> lVc;
    private List<ihc> lWk = lcn.emv();

    public ihj(ioa ioa2, joa joa2, Set<igp> set) {
        super("TagsPopupWindow", "FeatWindowNew.swf", ioa2, joa2, 2, 3);
        this.lVc = set;
    }

    @Override
    public void cCu() {
        super.cCu();
        this.p(40, 0, 40, 70);
        this.cXE().W(ipx.a(1, 4, new ipf[0]));
        this.cXE().W(new jaa(lww.tiW));
        this.cXE().W(ipx.a(1, 2, new ipf[0]));
        for (igp igp2 : igp.values()) {
            ihc ihc2 = new ihc(igp2, this.lVc.contains((Object)igp2));
            this.lWk.add(ihc2);
            this.cXE().W(ihc2);
            this.cXE().W(ipx.a(1, 3, new ipf[0]));
        }
        this.cXE().W(ipx.a(1, 10, new ipf[0]));
        this.cXE().W(ipx.c(new ipf[0]));
        ipx ipx2 = ipx.l(new ipf[0]);
        this.cXE().W(ipx2);
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(new iur(this){
            final /* synthetic */ ihj lWl;
            {
                this.lWl = ihj2;
            }

            public void cLq() {
                this.lWl.close();
                ihj.a(this.lWl);
            }
        });
        ipx2.W(ipx.a(9, 1, new ipf[0]));
        ipx2.W(new ivc(this){
            final /* synthetic */ ihj lWl;
            {
                this.lWl = ihj2;
            }

            public void cLq() {
                this.lWl.close();
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
        iqa iqa2 = new iqa("TagsBackgroundBitmap", 40, 1, 215, 85);
        return iqa2;
    }

    protected void bh(List<igp> list) {
    }

    private void _accept() {
        ArrayList<igp> arrayList = lcn.emv();
        for (ihc ihc2 : this.lWk) {
            if (!ihc2.dir()) continue;
            arrayList.add(ihc2.cVR());
        }
        this.bh(arrayList);
    }

    static /* synthetic */ void a(ihj ihj2) {
        ihj2._accept();
    }
}

