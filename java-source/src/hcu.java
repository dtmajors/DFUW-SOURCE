/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hcu
extends hog {
    private final hdc jIU;
    private final hqu jIV;
    private final hqu jIW;
    private final hqu jIX;
    private final hqn jIY;
    private final hqu jIZ;
    private final hqu jJa;
    private final hqu jJb;
    private final lbn jJc = new lbn(this){
        final /* synthetic */ hcu jJd;
        {
            this.jJd = hcu2;
        }

        public final void W() {
            this.jJd.refresh();
        }
    };
    private boolean Initialized;

    public hcu(hdm hdm2, String string, lgg lgg2, int n, hdc hdc2) {
        this(hdm2, string, lgg2, n, hdm2.kKl, hdc2);
    }

    private hcu(hdm hdm2, String string, lgg lgg2, int n, hog.a a2, hdc hdc2) {
        super((hnc)hdm2, string, lgg2, new lhf(n, 1000), a2);
        this.jIU = hdc2;
        int n2 = a2.kRX.cf;
        int n3 = a2.kRX.cg;
        int n4 = 22;
        int n5 = 10;
        int n6 = 140;
        int n7 = this.getWidth() - (a2.kRX.cf * 2 + n6 + a2.kRY.cf);
        this.jIV = new hqu(this.kLu, null, new lgg(a2.kRX.cf + n6 - hdm2.kJI.kpT.kLY.rmN, n3), new lhf(hdm2.kJI.kpT.kLY.rmN + hdm2.kJI.kZx + n7, n4), hdm2.kJI, hdc2.ccC(), "Catch Exceptions");
        this.j(this.jIV);
        this.jIW = new hqu(this.kLu, null, new lgg(a2.kRX.cf + n6 - hdm2.kJI.kpT.kLY.rmN, n3 += this.jIV.getHeight() + n5), new lhf(hdm2.kJI.kpT.kLY.rmN + hdm2.kJI.kZx + n7, n4), hdm2.kJI, hdc2.ccD(), "Full Gui Debug");
        this.j(this.jIW);
        this.jIX = new hqu(this.kLu, null, new lgg(a2.kRX.cf + n6 - hdm2.kJI.kpT.kLY.rmN, n3 += this.jIW.getHeight() + n5), new lhf(hdm2.kJI.kpT.kLY.rmN + hdm2.kJI.kZx + n7, n4), hdm2.kJI, hdc2.ccE(), "Yield Enabled");
        this.j(this.jIX);
        this.jIY = new hqn(this.kLu, null, new lgg(n2 + n6 / 2, n3 += this.jIX.getHeight() + n5), new lhf(n6 / 2, n4), hdm2.kKw, hdc2.ccG(), 0, 1.0);
        this.j(this.jIY);
        hpe hpe2 = new hpe(this.kLu, null, new lgg(n2 += n6 + a2.kRY.cf, n3), new lhf(n7, n4), hdm2.kIT, "Yield Milliseconds");
        this.j(hpe2);
        n2 = a2.kRX.cf;
        this.jIZ = new hqu(this.kLu, null, new lgg(a2.kRX.cf + n6 - hdm2.kJI.kpT.kLY.rmN, n3 += this.jIY.getHeight() + n5), new lhf(hdm2.kJI.kpT.kLY.rmN + hdm2.kJI.kZx + n7, n4), hdm2.kJI, hdc2.ccH(), "Dump 2D Requests");
        this.j(this.jIZ);
        n2 = a2.kRX.cf;
        this.jJa = new hqu(this.kLu, null, new lgg(a2.kRX.cf + n6 - hdm2.kJI.kpT.kLY.rmN, n3 += this.jIZ.getHeight() + n5), new lhf(hdm2.kJI.kpT.kLY.rmN + hdm2.kJI.kZx + n7, n4), hdm2.kJI, hdc2.ccI(), "Precreate Browsers");
        this.j(this.jJa);
        n2 = a2.kRX.cf;
        this.jJb = new hqu(this.kLu, null, new lgg(a2.kRX.cf + n6 - hdm2.kJI.kpT.kLY.rmN, n3 += this.jJa.getHeight() + n5), new lhf(hdm2.kJI.kpT.kLY.rmN + hdm2.kJI.kZx + n7, n4), hdm2.kJI, hdc2.ccF(), "Display Bandwidth");
        this.j(this.jJb);
        n2 = a2.kRX.cf;
        hqq hqq2 = new hqq(this.kLu, "test", new lgg(a2.kRX.cf + n6 - hdm2.kJI.kpT.kLY.rmN, n3 += this.jJb.getHeight() + n5), new lhf(hdm2.kJI.kpT.kLY.rmN + hdm2.kJI.kZx + n7, n4 * 4), hdm2.kKb, 1000);
        this.j(hqq2);
        n2 = a2.kRX.cf;
        hqq2.chj().mN("When the ancient Greeks had questions or problems that were worrying them, they would often turn to one of their gods for answers by consulting an oracle.\r\n\r\nThe word \"oracle\" has several meanings. It can refer to the god's answer, to the shrine the worshippers went to when seeking advice, or to a person through whom the god communicated, usually in the form of cryptic verse. (The words \"oracular\" and \"oracle\" trace back to the Latin verb \"orare,\" which means \"to speak.\")\r\nToday, \"oracle\" can simply mean an authoritative pronouncement or a person who makes such pronouncements (\"a designer who is an oracle of fashion\"). The related adjective \"oracular\" is used in similar contexts (\"a designer who is the oracular voice of fashion\").");
        this.cC(n, n3 += hqq2.getHeight() + n5);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.mU(true);
        this.ccu();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void ccd() {
        super.ccd();
        this.ccu();
    }

    private void ccu() {
        boolean bl = this.jIU.ccE().getValue();
        this.jIY.og(!bl);
    }

    private void mU(boolean bl) {
        this.jIU.cec().a(bl, this.jJc);
    }
}

