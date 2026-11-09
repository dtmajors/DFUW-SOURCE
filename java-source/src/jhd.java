/*
 * Decompiled with CFR.
 */
import java.text.NumberFormat;

public class jhd
extends ipz {
    private static final int ndT = 0x2F2F2F;
    private static final int ndU = 0x313131;
    private static final int ndV = 12357465;
    private static final int ncK = 18;
    private static final int ncN = 16;
    private static final int ncL = 15;
    private static final int ndW = 1;
    private static final int ndX = 16;
    private static final int ndY = 1;
    private static final int ndZ = 65;
    private static final String nea = "IconCities";
    private static final String neb = "IconHamlets";
    private static final String nec = "IconVillages";
    private static final String ned = "IconFortresses";
    private static final String nee = "IconArea";
    private static final String nef = "IconClanLeading";
    private static final int ncq = 10;
    private static final int neg = 14;
    private static final int neh = 11;
    private static final int ncr = 11;
    private static final int nei = 8;
    private static final int nej = 2;
    private static final int ncu = 1;
    private static final int nek = 34;
    private static final int nel = 24;
    private static final int nem = 5;
    private ist ndp = null;
    private ist ndv = null;
    private ist ndx = null;
    private ist ndz = null;
    private ist ndB = null;
    private isi nen = null;
    private dmn les = null;
    private bcp ndG = null;

    public bcp dFr() {
        return this.ndG;
    }

    public void x(bcp bcp2) {
        this.ndG = bcp2;
        this.dFq();
    }

    public jhd(dmn dmn2) {
        this.les = dmn2;
        this.a(iqo.dmS());
        ipx ipx2 = ipx.j(new ipf[0]);
        this.W(ipx.a(10, 1, new ipf[0]));
        this.W(ipx.c(new ipf[]{ipx2}));
        this.W(ipx.a(14, 1, new ipf[0]));
        ipx ipx3 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(1, 11, new ipf[0]));
        ipx2.W(ipx.c(new ipf[]{ipx3}));
        ipx2.W(ipx.a(1, 11, new ipf[0]));
        ipx ipx4 = ipx.j(new ipf[0]);
        ipx3.W(ipx.c(new ipf[]{ipx4}));
        ipx ipx5 = ipx.l(new ipf[0]);
        ipx4.W(ipx.c(new ipf[]{ipx.d(ipx5)}));
        this.ndp = new ist();
        this.ndp.setText("[Clan Name]");
        this.ndp.Rk(12357465);
        this.ndp.zY(18);
        ipx5.W(ipx.d(this.ndp));
        ipx ipx6 = ipx.l(new ipf[0]);
        ipx4.W(ipx6);
        ipx6.W(ipx.c(new ipf[0]));
        this.ndv = new ist();
        this.ndv.setText("0");
        this.ndv.Rk(12357465);
        this.ndv.zY(16);
        iwv iwv2 = new iwv(nea, lyw.tLE.bD(new Object[0]));
        ipx6.W(ipx.l(ipx.d(this.ndv), ipx.a(2, 1, new ipf[0]), iwv2));
        ipk ipk2 = new ipk();
        ipk2.setColor(0x313131);
        ipk2.a((iqz)null);
        ipk2.setSize(1, 16);
        ipx6.W(ipx.l(ipx.a(8, 1, new ipf[0]), ipx.d(ipk2), ipx.a(8, 1, new ipf[0])));
        this.ndx = new ist();
        this.ndx.setText("0");
        this.ndx.Rk(12357465);
        this.ndx.zY(16);
        iwv iwv3 = new iwv(neb, lyw.tLF.bD(new Object[0]));
        ipx6.W(ipx.l(ipx.d(this.ndx), ipx.a(2, 1, new ipf[0]), iwv3));
        ipk ipk3 = new ipk();
        ipk3.setColor(0x313131);
        ipk3.a((iqz)null);
        ipk3.setSize(1, 16);
        ipx6.W(ipx.l(ipx.a(8, 1, new ipf[0]), ipx.d(ipk3), ipx.a(8, 1, new ipf[0])));
        this.ndz = new ist();
        this.ndz.setText("0");
        this.ndz.Rk(12357465);
        this.ndz.zY(16);
        iwv iwv4 = new iwv(nec, lyw.tLG.bD(new Object[0]));
        ipx6.W(ipx.l(ipx.d(this.ndz), ipx.a(2, 1, new ipf[0]), iwv4));
        ipk ipk4 = new ipk();
        ipk4.setColor(0x313131);
        ipk4.a((iqz)null);
        ipk4.setSize(1, 16);
        ipx6.W(ipx.l(ipx.a(8, 1, new ipf[0]), ipx.d(ipk4), ipx.a(8, 1, new ipf[0])));
        this.ndB = new ist();
        this.ndB.setText("0");
        this.ndB.Rk(12357465);
        this.ndB.zY(16);
        iwv iwv5 = new iwv(ned, lyw.tLH.bD(new Object[0]));
        ipx6.W(ipx.l(ipx.d(this.ndB), ipx.a(2, 1, new ipf[0]), iwv5));
        ipx6.W(ipx.c(new ipf[0]));
        ipk ipk5 = new ipk();
        ipk5.setColor(0x2F2F2F);
        ipk5.a((iqz)null);
        ipk5.setSize(1, 65);
        ipx3.W(ipk5);
        ipx ipx7 = ipx.j(new ipf[0]);
        ipx3.W(ipx.a(34, 1, new ipf[0]));
        ipx3.W(ipx7);
        ipx3.W(ipx.a(24, 1, new ipf[0]));
        ipx7.W(new iwv(nef, lyw.tLI.bD(new Object[0])));
        ipx7.W(ipx.a(1, 5, new ipf[0]));
        this.nen = new isi();
        this.nen.setText(isg.b(isf.mwO, 15, 12357465, "0 km&#x00B2;"));
        ipx7.W(ipx.l(ipx.d(this.nen)));
        this.dFq();
    }

    private void dFq() {
        if (this.ndG == null) {
            this.ndp.setText("[Clan Name]");
            this.ndv.setText("0");
            this.ndx.setText("0");
            this.ndz.setText("0");
            this.ndB.setText("0");
            this.nen.setText(isg.b(isf.mwO, 15, 12357465, "0 km&#x00B2;"));
        } else {
            NumberFormat numberFormat = NumberFormat.getNumberInstance();
            numberFormat.setMaximumFractionDigits(1);
            numberFormat.setMinimumFractionDigits(0);
            this.ndp.setText(this.ndG.iV());
            this.ndv.setText(Integer.toString(this.les.a(this.ndG, ayb.cvj)));
            this.ndx.setText(Integer.toString(this.les.a(this.ndG, ayb.cvk)));
            this.ndz.setText(Integer.toString(this.les.h(this.ndG)));
            this.ndB.setText(Integer.toString(this.les.k(this.ndG)));
            this.nen.setText(isg.b(isf.mwO, 15, 12357465, numberFormat.format(this.les.c(this.ndG)) + " km&#x00B2;"));
        }
    }
}

