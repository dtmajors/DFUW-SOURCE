/*
 * Decompiled with CFR.
 */
import java.util.List;

public class mli
extends mom {
    private List fu = null;
    private final String[] DIf = new String[]{"SFAS SFFile Table. Drag&Drop Files here to use when converting animation."};
    private final int DIg = this.DIf.length;

    public mli() {
    }

    public mli(List list) {
        this.fu = list;
    }

    public void clear() {
        this.fu.clear();
    }

    public Class getColumnClass(int n) {
        switch (n) {
            default: 
        }
        return String.class;
    }

    @Override
    public boolean isCellEditable(int n, int n2) {
        switch (n2) {
            default: 
        }
        return false;
    }

    @Override
    public int getRowCount() {
        if (this.fu != null) {
            return this.fu.size();
        }
        return 0;
    }

    @Override
    public int getColumnCount() {
        return this.DIg;
    }

    public void Cs(String string) {
        this.fu.add(string);
        this.fireTableDataChanged();
    }

    public String aeM(int n) {
        int n2 = n;
        if (this.DSM != null && n < this.DSM.length) {
            n2 = this.DSM[n];
        }
        if (n2 < this.fu.size()) {
            return (String)this.fu.get(n2);
        }
        return null;
    }

    public boolean aeL(int n) {
        String string = this.aeM(n);
        if (string != null) {
            this.fu.remove(string);
            this.fireTableDataChanged();
            return true;
        }
        return false;
    }

    @Override
    public Object getValueAt(int n, int n2) {
        String string = this.aeM(n);
        if (string != null) {
            switch (n2) {
                case 0: {
                    return string;
                }
            }
            lfn.b(4, this.getClass().getName(), "Default case for Type[" + n2 + "] called. Ops?");
            return null;
        }
        return "[null]";
    }

    @Override
    public String getColumnName(int n) {
        return this.DIf[n];
    }
}

