/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  dgj
 */
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Collections;
import java.util.Map;
import java.util.Vector;

public class mrx
extends mry {
    private aux DCH = null;
    private final kbv Eom = new kbv();
    private final Vector<String> Eon = new Vector();
    private final Vector<String> Eoo = new Vector();

    public mrx() {
        this.setClosable(true);
        this.Eom.dVc();
        this.eMq();
        this.eMr();
    }

    private void eMq() {
        Map<String, Map<Integer, dgj>> map = this.Eom.dVd();
        for (String string : map.keySet()) {
            this.Eon.add(string);
        }
        Collections.sort(this.Eon);
        this.DHd.setListData(this.Eon);
        this.DHd.invalidate();
    }

    private void eMr() {
        this.DHd.addMouseListener(new MouseAdapter(this){
            final /* synthetic */ mrx Eop;
            {
                this.Eop = mrx2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                mrx.a(this.Eop);
            }
        });
        this.qtf.addMouseListener(new MouseAdapter(this){
            final /* synthetic */ mrx Eop;
            {
                this.Eop = mrx2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                String string = this.Eop.Eot.getText();
                if (string != null && !string.trim().isEmpty()) {
                    for (String string2 : mrx.b(this.Eop)) {
                        if (!string2.contains(string)) continue;
                        this.Eop.DHd.setSelectedValue(string2, true);
                        mrx.a(this.Eop);
                    }
                }
            }
        });
        this.Eos.addMouseListener(new MouseAdapter(this){
            final /* synthetic */ mrx Eop;
            {
                this.Eop = mrx2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                int n = this.Eop.DHd.getSelectedIndex();
                if (n != -1) {
                    String string = this.Eop.DHd.getSelectedValue().toString();
                    mrx.c(this.Eop).wu(string);
                    mrx.a(this.Eop);
                }
            }
        });
    }

    private void eMs() {
        int n = this.DHd.getSelectedIndex();
        if (n != -1) {
            this.Eoo.clear();
            String string = this.DHd.getSelectedValue().toString();
            Map<String, Map<Integer, dgj>> map = this.Eom.dVd();
            Map<Integer, dgj> map2 = map.get(string);
            if (!map2.isEmpty()) {
                for (dgj dgj2 : map2.values()) {
                    String string2 = dgj2.getSpecialEffectName();
                    if (!string2.contains("se_animaudio:")) continue;
                    this.Eoo.add(string2);
                }
            }
            this.Eoq.setListData(this.Eoo);
            this.Eoq.invalidate();
        }
    }

    public void w(aux aux2) {
        this.DCH = aux2;
    }

    static /* synthetic */ void a(mrx mrx2) {
        mrx2.eMs();
    }

    static /* synthetic */ Vector b(mrx mrx2) {
        return mrx2.Eon;
    }

    static /* synthetic */ kbv c(mrx mrx2) {
        return mrx2.Eom;
    }
}

