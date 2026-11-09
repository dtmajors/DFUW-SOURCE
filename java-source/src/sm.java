/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;

public abstract class sm
extends qe {
    private Map<Integer, a> aRg = lcn.emw();
    private int aRh = 1;

    protected sm(md md2, me me2) {
        super(md2, me2);
    }

    @Override
    public String toString() {
        return super.toString() + " QueryCount=" + this.tZ();
    }

    protected final String c(String string, Map<String, Object> map) {
        return this.a(false, string, map);
    }

    protected final String a(String string, Map<String, Object> map, Map<String, Object> map2) {
        String string2;
        Object object;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UPDATE " + string + " SET ");
        boolean bl = true;
        for (String string3 : map.keySet()) {
            if (!bl) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(string3);
            stringBuilder.append("=");
            object = map.get(string3);
            string2 = pz.e(object);
            if (string2 == null) {
                lfn.b(5, "SFPersistenceWorkerQuery", "createInsertQuery: Could not create query, unhandled object type in data map");
                assert (false);
                return null;
            }
            stringBuilder.append(string2);
            bl = false;
        }
        if (map2 != null) {
            stringBuilder.append(" WHERE ");
            for (String string3 : map2.keySet()) {
                if (!bl) {
                    stringBuilder.append(" AND ");
                }
                stringBuilder.append(string3);
                object = map.get(string3);
                if (object == null) {
                    stringBuilder.append("is null");
                } else {
                    stringBuilder.append("=");
                    string2 = pz.e(object);
                    if (string2 == null) {
                        lfn.b(5, "SFPersistenceWorkerQuery", "createInsertQuery: Could not create query, unhandled object type in data map");
                        assert (false);
                        return null;
                    }
                    stringBuilder.append(string2);
                }
                bl = false;
            }
        }
        return stringBuilder.toString();
    }

    protected final String d(String string, Map<String, Object> map) {
        return this.a(true, string, map);
    }

    private final String a(boolean bl, String string, Map<String, Object> map) {
        StringBuilder stringBuilder = new StringBuilder();
        if (bl) {
            stringBuilder.append("REPLACE");
        } else {
            stringBuilder.append("INSERT");
        }
        stringBuilder.append(" INTO ").append(string).append("(");
        boolean bl2 = true;
        for (String object : map.keySet()) {
            if (!bl2) {
                stringBuilder.append(",");
            }
            stringBuilder.append(object);
            bl2 = false;
        }
        stringBuilder.append(") VALUES(");
        bl2 = true;
        for (Object object : map.values()) {
            String string2;
            if (!bl2) {
                stringBuilder.append(",");
            }
            if ((string2 = pz.e(object)) == null) {
                lfn.b(5, "SFPersistenceWorkerQuery", "createInsertQuery: Could not create query, unhandled object type in data map");
                assert (false);
                return null;
            }
            stringBuilder.append(string2);
            bl2 = false;
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    protected final void a(pw pw2, String string, pv pv2) {
        a a2 = new a(this, null);
        a2.aRi = pw2;
        a2.aQV = string;
        a2.aRj = pv2;
        a2.aRk = System.currentTimeMillis();
        int n = this.aRh++;
        this.aRg.put(n, a2);
        kdj kdj2 = (kdj)this.MessageDelegator.i(259, this.getGUID(), lcr.qyX);
        kdj2.wA(pw2.Identifier);
        kdj2.setContext(n);
        kdj2.wB(string);
        this.MessageDelegator.b(kdj2);
    }

    protected int tZ() {
        return this.aRg.size();
    }

    protected abstract void a(pv var1, lmn var2);

    private final void d(kdk kdk2) {
        a a2 = this.aRg.remove(kdk2.getContext());
        if (a2 == null) {
            lfn.b(5, "SFPersistenceWorkerQuery(" + this.getClass().getSimpleName() + ")", "handleMiddlewareSQLResultMessage: Could not find context for " + kdk2);
            assert (false);
            return;
        }
        if (kdk2.dVr().getErrorCode() != 0) {
            lfn.b(4, "SFPersistenceWorkerQuery(" + this.getClass().getSimpleName() + ")", "handleMiddlewareSQLResultMessage: Failed: Error=" + kdk2.dVr().getErrorCode() + ", Connection=" + a2.aRi.Identifier + ", Query=" + a2.ua());
        }
        this.a(a2.aRj, kdk2.dVr());
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        switch (kcz2.getMessageType()) {
            case 260: {
                this.d((kdk)kcz2);
                break;
            }
            default: {
                super.receiveMiddlewareMessage(kcz2);
            }
        }
    }
}

