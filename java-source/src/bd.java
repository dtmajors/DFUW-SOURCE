/*
 * Decompiled with CFR.
 */
import java.util.List;

public class bd
extends kdw {
    private loi eF = loi.exd();
    private int eG = 0;
    private String eH = "SFAudioModule";
    private kee eI = null;
    private kee eJ = null;
    private kee eK = null;

    @Override
    protected void Y() {
        this.phR = new kdz();
        this.phR.setVersion(0, 1);
        this.phR.setName(this.getClass().getName());
        this.phR.Wx(5);
        this.phR.setLevel(0);
        this.phR.fJ(1, 14);
    }

    public void a(List list, int n) {
        if (n == 1) {
            this.a(list);
        }
    }

    private void a(List list) {
        this.phS.addAll(list);
        this.eG = this.eF.Bb(this.eH);
        this.phR.setLevel(1);
        this.phQ = kdw.a.phY;
    }

    @Override
    public void e(ldz ldz2) {
    }
}

