/*
 * Decompiled with CFR.
 */
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class kzj
extends kzl
implements ItemListener {
    public dui qoi = null;

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        this.iNr = !this.iNr;
    }
}

