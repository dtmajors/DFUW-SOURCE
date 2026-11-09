/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcy
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class auh
extends btk {
    protected static final avz cbY = avz.crc;
    private final lde<dxq> cbZ = new lde();
    private final lbi<egh> cca = new lbi<egh>(this){
        final /* synthetic */ auh cch;
        {
            this.cch = auh2;
        }

        public void a(egh egh2) {
            auh.a(this.cch, egh2.ipj, egh2.ipt, egh2.ipu, egh2.ipv, egh2.aO());
        }

        public /* synthetic */ void m(Object object) {
            this.a((egh)object);
        }
    };
    private final lbi<ege> ccb = new lbi<ege>(this){
        final /* synthetic */ auh cch;
        {
            this.cch = auh2;
        }

        public void a(ege ege2) {
            auh.a(this.cch, ege2.aO(), ege2.ipj);
        }

        public /* synthetic */ void m(Object object) {
            this.a((ege)object);
        }
    };
    private final lbi<egq> ccc = new lbi<egq>(this){
        final /* synthetic */ auh cch;
        {
            this.cch = auh2;
        }

        public void a(egq egq2) {
            this.cch.a(egq2.ipE, egq2.dbA, egq2.ccT);
        }

        public /* synthetic */ void m(Object object) {
            this.a((egq)object);
        }
    };
    private final lbi<egr> ccd = new lbi<egr>(this){
        final /* synthetic */ auh cch;
        {
            this.cch = auh2;
        }

        public void a(egr egr2) {
            this.cch.a(egr2.ipj, egr2.ccm, egr2.ccT);
        }

        public /* synthetic */ void m(Object object) {
            this.a((egr)object);
        }
    };
    private final lbi<egn> cce = new lbi<egn>(this){
        final /* synthetic */ auh cch;
        {
            this.cch = auh2;
        }

        public void a(egn egn2) {
            auh.a(this.cch, egn2.ipt);
        }

        public /* synthetic */ void m(Object object) {
            this.a((egn)object);
        }
    };
    private final lbi<egl> ccf = new lbi<egl>(this){
        final /* synthetic */ auh cch;
        {
            this.cch = auh2;
        }

        public void a(egl egl2) {
            Set<K> set = auh.a(this.cch).keySet();
            String[] stringArray = new String[set.size()];
            set.toArray(stringArray);
            egm egm2 = (egm)auh.a(this.cch, 2320, egl2.aO());
            egm2.ipz = stringArray;
            auh.a(this.cch, egm2);
        }

        public /* synthetic */ void m(Object object) {
            this.a((egl)object);
        }
    };
    private boolean Initialized;
    private Map<String, a> ccg;

    public static lip a(egg.a a2) {
        switch (a2) {
            case ipm: {
                return lcy.ray;
            }
            case ipo: {
                return lcy.raz;
            }
            case ipp: {
                return lcy.raA;
            }
            case ipn: {
                return lcy.raB;
            }
            case ipq: {
                return lcy.raC;
            }
            case ipr: {
                return lcy.raC;
            }
        }
        assert (false);
        return null;
    }

    @Override
    public final void initialize() {
        assert (!this.Initialized);
        this.ccg = new HashMap<String, a>();
        this.Initialized = true;
        this.ca(true);
    }

    @Override
    public final void cleanUp() {
        assert (this.Initialized);
        this.ca(false);
        this.ccg = null;
        this.Initialized = false;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        assert (this.Initialized);
        assert (dxq2.amk().equals(this.GUID));
        if (this.cbZ.Y(dxq2)) {
            return;
        }
        super.receiveMessage(dxq2);
    }

    protected void a(int n, Object[] objectArray, String string) {
        assert (lda.by(objectArray));
        assert (lda.by(string));
        switch (n) {
            default: 
        }
        assert (false);
    }

    protected void a(String string, String string2, String string3) {
        b b2 = this.p(string, string2);
        if (b2 == null) {
            return;
        }
        egr egr2 = (egr)this.e(2309, b2.ccj);
        egr2.ipj = b2.cck;
        egr2.ccm = b2.ccm;
        egr2.ccT = string3;
        this.a(egr2);
    }

    private List<String> dY(String string) {
        LinkedList<String> linkedList = new LinkedList<String>();
        int n = 0;
        while (true) {
            if (n < string.length() && string.charAt(n) == ' ') {
                ++n;
                continue;
            }
            if (n >= string.length()) break;
            if (string.charAt(n) == '\"' || string.charAt(n) == '\'') {
                StringBuilder stringBuilder = new StringBuilder();
                try {
                    n = lhn.a(string, n, stringBuilder);
                }
                catch (Exception exception) {
                    return null;
                }
                linkedList.add(stringBuilder.toString());
                continue;
            }
            int n2 = n++;
            while (n < string.length() && string.charAt(n) != ' ') {
                ++n;
            }
            String string2 = string.substring(n2, n);
            linkedList.add(string2);
        }
        return linkedList;
    }

    private b p(String string, String string2) {
        List<String> list = this.dY(string);
        if (list == null) {
            this.a(string2, lcy.rab);
            return null;
        }
        if (list.size() == 0) {
            return null;
        }
        String string3 = list.remove(0);
        a a2 = this.ccg.get(string3 = string3.toLowerCase());
        if (a2 == null) {
            this.a(string2, lcy.rac.a(new ljg(string3)));
            return null;
        }
        LinkedList<Object> linkedList = new LinkedList<Object>();
        for (egg egg2 : a2.ccl) {
            if (list.isEmpty()) {
                if (egg2.bZR) break;
                this.a(string2, lcy.rap.a(new ljg(egg2.Name), auh.a(egg2.cke)));
                return null;
            }
            try {
                Object numberFormatException = this.a(egg2.cke, list);
                linkedList.add(numberFormatException);
            }
            catch (NumberFormatException numberFormatException) {
                this.a(string2, lcy.rao.a(new ljg(list.get(0)), new ljg(egg2.Name), auh.a(egg2.cke), new ljg(a2.Name)));
                return null;
            }
        }
        if (!list.isEmpty()) {
            this.a(string2, lcy.ran.a(new ljg(list.get(0))));
            return null;
        }
        b b2 = new b(null);
        b2.ccj = a2.ccj;
        b2.cck = a2.cck;
        b2.ccm = new Object[linkedList.size()];
        linkedList.toArray(b2.ccm);
        return b2;
    }

    private Object a(egg.a a2, List<String> list) {
        switch (a2) {
            case ipm: {
                String string = list.get(0);
                boolean bl = lch.yY(string);
                list.remove(0);
                return new lch(bl);
            }
            case ipo: {
                String string = list.get(0);
                double d2 = ldf.zl(string);
                list.remove(0);
                return new ldf(d2);
            }
            case ipp: {
                String string = list.get(0);
                float f2 = ldq.parseFloat(string);
                list.remove(0);
                return new ldq(f2);
            }
            case ipn: {
                String string = list.get(0);
                int n = lei.zv(string);
                list.remove(0);
                return new lei(n);
            }
            case ipq: {
                String string = list.get(0);
                list.remove(0);
                return string;
            }
            case ipr: {
                StringBuilder stringBuilder = new StringBuilder();
                boolean bl = true;
                for (String string : list) {
                    if (!bl) {
                        stringBuilder.append(' ');
                    }
                    stringBuilder.append(string);
                    bl = false;
                }
                list.clear();
                Object object = stringBuilder.toString();
                if (((String)object).length() >= 2 && ((String)object).startsWith("\"") && ((String)object).endsWith("\"")) {
                    object = ((String)object).substring(1, ((String)object).length() - 1);
                }
                return object;
            }
        }
        assert (false);
        return null;
    }

    private void a(loz loz2) {
        fgs fgs2 = (fgs)this.MessageDelegator.h(29446, this.GUID, lcr.acL);
        fgs2.r(loz2);
        this.MessageDelegator.F(fgs2);
    }

    private void a(int n, String string, lip lip2, egg[] eggArray, ldv ldv2) {
        if (string == null) {
            assert (false);
            return;
        }
        if (lip2 == null) {
            assert (false);
            return;
        }
        if (!lin.An(string)) {
            return;
        }
        a a2 = this.ccg.get(string.toLowerCase());
        if (a2 != null) {
            assert (false);
            return;
        }
        if (this.x(ldv2, n) != null) {
            assert (false);
            return;
        }
        if (eggArray == null) {
            eggArray = new egg[]{};
        }
        a2 = new a(ldv2, n, string, lip2, eggArray);
        this.ccg.put(a2.Name, a2);
    }

    private void w(ldv ldv2, int n) {
        a a2 = this.x(ldv2, n);
        if (a2 == null) {
            assert (false);
            return;
        }
        this.ccg.remove(a2.Name);
    }

    private a x(ldv ldv2, int n) {
        for (String string : this.ccg.keySet()) {
            a a2 = this.ccg.get(string);
            assert (a2 != null);
            if (a2.cck != n || !a2.ccj.equals(ldv2)) continue;
            return a2;
        }
        return null;
    }

    private final dxq e(int n, ldv ldv2) {
        dxq dxq2 = this.MessageDelegator.h(n, this.GUID, ldv2);
        assert (dxq2 != null);
        assert (dxq2.bEz() == -1 || dxq2.bEz() == 0 || dxq2.bEz() == n);
        return dxq2;
    }

    private void a(dxq dxq2) {
        assert (this.Initialized);
        assert (dxq2.aO() != null);
        assert (dxq2.amk() != null);
        this.MessageDelegator.E(dxq2);
    }

    private void dZ(String string) {
        Object object;
        String string2 = string.toUpperCase();
        LinkedList<a> linkedList = new LinkedList<a>();
        for (String string3 : this.ccg.keySet()) {
            object = this.ccg.get(string3);
            if (!((a)object).Name.toUpperCase().startsWith(string2)) continue;
            linkedList.add((a)object);
        }
        switch (linkedList.size()) {
            case 0: {
                this.a(maf.HelpCommandNotFound.bD(string));
                break;
            }
            case 1: {
                Object[] objectArray = (a)linkedList.get(0);
                this.a(maf.HelpCommandDescription.bD(objectArray.Name, objectArray.bZO));
                if (objectArray.ccl.length == 0) {
                    this.a(maf.HelpCommandNoParameters.bD(new Object[0]));
                    break;
                }
                this.a(maf.HelpCommandParametersHeader.bD(new Object[0]));
                for (int i = 0; i < objectArray.ccl.length; ++i) {
                    object = auh.a(objectArray.ccl[i].cke).esy();
                    if (objectArray.ccl[i].bZR) {
                        this.a(maf.HelpCommandParameterOptional.bD(objectArray.ccl[i].Name, object, objectArray.ccl[i].bZO.esy()));
                        continue;
                    }
                    this.a(maf.HelpCommandParameter.bD(objectArray.ccl[i].Name, object, objectArray.ccl[i].bZO.esy()));
                }
                break;
            }
            default: {
                Object[] objectArray = new a[linkedList.size()];
                linkedList.toArray(objectArray);
                Arrays.sort(objectArray);
                for (int i = 0; i < objectArray.length; ++i) {
                    object = objectArray[i];
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(((a)object).Name);
                    this.a((a)object, false, 0, stringBuilder);
                    String string4 = stringBuilder.toString();
                    this.a(maf.HelpCommandHelpLine.bD(string4));
                }
            }
        }
    }

    private void a(a a2, boolean bl, int n, StringBuilder stringBuilder) {
        if (n >= a2.ccl.length) {
            return;
        }
        stringBuilder.append(' ');
        if (a2.ccl[n].bZR) {
            bl = true;
        }
        if (bl) {
            stringBuilder.append('[');
        }
        stringBuilder.append(a2.ccl[n].Name);
        this.a(a2, bl, n + 1, stringBuilder);
        if (bl) {
            stringBuilder.append(']');
        }
    }

    private void a(String string, lip lip2) {
        if (string == null) {
            this.a(maf.ChatCommandError.bD(lip2.esy()));
        } else {
            this.a(maf.ChatCommandErrorWithContext.bD(lip2.esy(), string));
        }
    }

    private static final boolean a(egg[] eggArray) {
        boolean bl = false;
        for (int i = 0; i < eggArray.length; ++i) {
            if (eggArray[i].bZR) {
                if (!bl) {
                    bl = true;
                }
            } else assert (!bl);
            if (eggArray[i].cke == egg.a.ipr) assert (i == eggArray.length - 1);
        }
        return true;
    }

    private void ca(boolean bl) {
        lbk lbk2 = this.cbZ.rex;
        lbk2.a(bl, egh.class, this.cca);
        lbk2.a(bl, ege.class, this.ccb);
        lbk2.a(bl, egq.class, this.ccc);
        lbk2.a(bl, egr.class, this.ccd);
        lbk2.a(bl, egn.class, this.cce);
        lbk2.a(bl, egl.class, this.ccf);
    }

    static /* synthetic */ boolean b(egg[] eggArray) {
        return auh.a(eggArray);
    }

    static /* synthetic */ void a(auh auh2, int n, String string, lip lip2, egg[] eggArray, ldv ldv2) {
        auh2.a(n, string, lip2, eggArray, ldv2);
    }

    static /* synthetic */ void a(auh auh2, ldv ldv2, int n) {
        auh2.w(ldv2, n);
    }

    static /* synthetic */ void a(auh auh2, String string) {
        auh2.dZ(string);
    }

    static /* synthetic */ Map a(auh auh2) {
        return auh2.ccg;
    }

    static /* synthetic */ dxq a(auh auh2, int n, ldv ldv2) {
        return auh2.e(n, ldv2);
    }

    static /* synthetic */ void a(auh auh2, dxq dxq2) {
        auh2.a(dxq2);
    }
}

