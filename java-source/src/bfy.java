/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;

public class bfy
extends btk
implements bto {
    private static final String bzv = "xml-files/server/globalevents/globalevents.xml";
    private boolean dia;
    private final List<gr> dib = lcn.emv();
    private final Map<Integer, List<bfw>> dic = lcn.emw();
    private boolean did;
    private int die;

    public static XStream de(boolean bl) {
        XStream xStream = new XStream(new DomDriver());
        xStream.aliasType("SFGlobalEventSFX", bfz.class);
        xStream.aliasType("DayPeriod", ldz.a.class);
        xStream.registerConverter(new bfz(null));
        if (bl) {
            xStream.setMode(1001);
        } else {
            xStream.setClassLoader(r.cr);
        }
        return xStream;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (!this.did && this.MessageDelegator.bzx().bzt().dVA() == kdw.a.phY) {
            this.did = true;
            if (!lcw.enb()) {
                grh grh2 = (grh)this.MessageDelegator.h(11098, this.getGUID(), lcr.hac);
                this.MessageDelegator.F(grh2);
            } else {
                gr gr2 = new gr();
                gr2.aI("GameLogic");
                gr2.bN(300);
                gr[] grArray = new gr[]{gr2};
                gri gri2 = (gri)this.MessageDelegator.h(11099, this.getGUID(), this.getGUID());
                gri2.jqi = grArray;
                this.receiveMessage(gri2);
            }
        }
        if (this.dia) {
            return;
        }
        if (this.MessageDelegator.bzx().bzt().dVA() == kdw.a.phY && !this.dib.isEmpty()) {
            this.aoq();
            this.dia = true;
        }
    }

    public int aop() {
        int n = this.dib.get((int)this.die).di;
        this.die = ++this.die >= this.dib.size() ? 0 : this.die;
        return n;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11099: {
                this.a((gri)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public void a(bfw bfw2) {
        for (List<bfw> list : this.dic.values()) {
            if (list.remove(bfw2)) break;
        }
        this.aor();
    }

    private void aoq() {
        XStream xStream = bfy.de(false);
        String string = null;
        try {
            string = jry.ti(bzv);
            Object object = xStream.fromXML(string);
            this.dic.putAll((Map)object);
            for (List<bfw> list : this.dic.values()) {
                for (bfw bfw2 : list) {
                    bfw2.a(this);
                    bfw2.setGUID(this.MessageDelegator.bzv());
                    this.MessageDelegator.a(bfw2);
                }
            }
        }
        catch (Exception exception) {
            System.err.println("Parsing of file 'xml-files/server/globalevents/globalevents.xml' failed.");
        }
    }

    private void a(gri gri2) {
        assert (gri2.jqi != null);
        assert (gri2.jqi.length > 0);
        ArrayList<gr> arrayList = lcn.emv();
        for (gr gr2 : gri2.jqi) {
            if (!gr2.ic().equals("GameLogic")) continue;
            arrayList.add(gr2);
        }
        this.dib.addAll(arrayList);
    }

    private void aor() {
        XStream xStream = bfy.de(true);
        String string = xStream.toXML(this.dic);
        Document document = jsy.tL(string);
        jsz.a(document, new jrw(lcw.qLb + bzv));
    }
}

