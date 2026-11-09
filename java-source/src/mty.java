/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

class mty
extends AbstractListModel {
    private final ListModel EEQ;
    private a EER;
    private final ArrayList<Integer> EES = new ArrayList();

    public mty(ListModel listModel) {
        if (listModel == null) {
            throw new IllegalArgumentException("Source is null");
        }
        this.EEQ = listModel;
        this.EEQ.addListDataListener(new ListDataListener(this){
            final /* synthetic */ mty EET;
            {
                this.EET = mty2;
            }

            public void intervalRemoved(ListDataEvent listDataEvent) {
                mty.a(this.EET);
            }

            public void intervalAdded(ListDataEvent listDataEvent) {
                mty.a(this.EET);
            }

            public void contentsChanged(ListDataEvent listDataEvent) {
                mty.a(this.EET);
            }
        });
    }

    public void addElement(Object object) {
        ((DefaultListModel)this.EEQ).addElement(object);
    }

    public void removeAllElements() {
        ((DefaultListModel)this.EEQ).removeAllElements();
    }

    public void a(a a2) {
        this.EER = a2;
        this.ePq();
    }

    private void ePq() {
        this.EES.clear();
        if (this.EER != null) {
            for (int i = 0; i < this.EEQ.getSize(); ++i) {
                if (!this.EER.aN(this.EEQ.getElementAt(i))) continue;
                this.EES.add(i);
            }
            this.fireContentsChanged(this, 0, this.getSize() - 1);
        }
    }

    @Override
    public int getSize() {
        return this.EER != null ? this.EES.size() : this.EEQ.getSize();
    }

    @Override
    public Object getElementAt(int n) {
        return this.EER != null ? this.EEQ.getElementAt(this.EES.get(n)) : this.EEQ.getElementAt(n);
    }

    static /* synthetic */ void a(mty mty2) {
        mty2.ePq();
    }
}

