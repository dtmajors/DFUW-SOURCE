/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 *  lcw
 */
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import spenefett.hid.gui.serialization.dto.SFTooltipBaseDTO;

public class hyp
extends hzk
implements bto,
hvx {
    SimpleDateFormat lph = new SimpleDateFormat("HH:mm");
    TimeZone[] lpi = new TimeZone[]{TimeZone.getTimeZone("CST6CDT"), TimeZone.getTimeZone("EST5EDT"), TimeZone.getTimeZone("GMT")};
    int lpj = 0;
    int aEf = 0;
    int aFH = 0;
    int lpk = -1;
    int lpl = -1;
    protected boolean lpm = true;
    protected boolean lpn = true;
    protected String lpo = "";
    protected String lpp = "";
    int lpq = -1;
    double lW = 0.0;
    int lpr = 0;

    public hyp() {
        super("ClockWindow", "clock.swf");
        this.OQ(jnz.nGe | jnz.nGi | jnz.nGk | jnz.nGm | jnz.nGf | jnz.nGy);
        this.a(hyb.lmC);
        this.a(hya.lmp, true);
        this.a("TimeZone", hsu.ldg, this.lpj);
    }

    public void initialize() {
        super.initialize();
        hso.cxK().cxP().cyZ().a((hvx)this);
    }

    public void cleanUp() {
        hso.cxK().cxP().cyZ().b((hvx)this);
        super.cleanUp();
    }

    public void cBa() {
        super.cBa();
        this.lpj = this.nh("TimeZone");
        this.lpq = -1;
        this.cGc();
    }

    @Override
    public void doTick(ldz ldz2) {
        ++this.lpr;
        boolean bl = false;
        long l = System.currentTimeMillis();
        int n = (int)(l / 60000L);
        if (n != this.lpq) {
            this.lpo = ldz.b(l, false);
            this.lpq = n;
            bl = true;
        }
        if (ldz2.rgz - this.lW > 1.0) {
            lcw.pht = (int)((double)this.lpr / (ldz2.rgz - this.lW));
            this.lW = ldz2.rgz;
            this.lpr = 0;
            int n2 = this.lpp.length();
            this.lpp = "";
            if (this.lpm) {
                this.lpp = this.lpp + lvn.sXF.bD(new Object[0]).exA() + ":" + lcw.pht;
            }
            if (this.lpn) {
                this.lpp = this.lpp + " " + lvn.sXG.bD(new Object[0]).exA() + ":" + lcw.qGg;
            }
            if (this.lpp.length() > 0 || n2 > 0) {
                bl = true;
            }
            this.lpk = lcw.pht;
            this.lpl = lcw.qGg;
        }
        if (bl && this.cDj()) {
            this.a("setClockText", new Object[]{this.lpp + " " + this.lpo});
        }
    }

    @Override
    public void a(bsh bsh2, cxc cxc2) {
    }

    @Override
    public void czV() {
    }

    @Override
    public void q(ej ej2) {
        if (ej2.getType() == 11872) {
            et et2 = (et)ej2;
            this.aEf = (int)et2.fN();
            this.cGc();
        } else if (ej2.getType() == 12048) {
            et et3 = (et)ej2;
            this.aFH = (int)et3.fN();
            this.cGc();
        }
    }

    protected void g(int n, int n2, String string) {
        ++this.lpj;
        if (this.lpj == this.lpi.length) {
            this.lpj = 0;
        }
        this.lpq = -1;
        this.w("TimeZone", this.lpj);
    }

    public void oc(String string) {
        this.a("setDescriptionText", new Object[]{string});
    }

    private void cGc() {
        String string = "" + this.aEf;
        String string2 = jny.dB(this.aFH);
        this.a("setPlayerPointText", new Object[]{string + " (" + string2 + ")"});
    }

    public boolean cGd() {
        return this.lpm;
    }

    public void pg(boolean bl) {
        this.lpm = bl;
        this.lpk = -1;
    }

    public boolean cGe() {
        return this.lpn;
    }

    public void ph(boolean bl) {
        this.lpn = bl;
        this.lpl = -1;
    }

    public hyn s(int n, int n2, String string) {
        hwk hwk2 = new hwk(string);
        if (hwk2.getPrefix().equals("player-points")) {
            SFTooltipBaseDTO sFTooltipBaseDTO = iae.a(null, null, 2, 2, 0, 0, "<p align=\"left\"><font size=\"12\">" + lwp.sYh.bD(new Object[0]).exA().toUpperCase() + "</font></p>", "<p align=\"right\"><font size=\"12\">" + this.aEf + "</font></p>", "<p align=\"left\"><font size=\"12\">" + lwp.tfU.bD(new Object[0]).exA().toUpperCase() + "</font></p>", "<p align=\"right\"><font size=\"12\">" + this.aFH + "</font>" + "</p>");
            iae iae2 = new iae(sFTooltipBaseDTO, (int)((double)this.cEE() + hwk2.cBe() + hwk2.getX() / 2.0), (int)((double)this.cEF() + hwk2.cBf() - 45.0));
            return iae2;
        }
        return null;
    }
}

