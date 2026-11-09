/*
 * Decompiled with CFR.
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class bjz {
    private String dpn;
    private String dqk;
    private List<bjw> dql = lcn.emv();
    private double dpK = 0.0;
    private int dqm = 60;
    private int dqn = 0;

    public void a(bjw bjw2) {
        this.dql.add(bjw2);
    }

    public List<lfs<Integer, Integer>> cR(float f) {
        ArrayList<lfs<Integer, Integer>> arrayList = lcn.emv();
        for (bjw bjw2 : this.dql) {
            lfs<Integer, Integer> lfs2 = bjw2.cP(f);
            if (lfs2 == null) continue;
            arrayList.add(lfs2);
        }
        return arrayList;
    }

    public final void ah(List<bjw> list) {
        this.dql = list;
    }

    public final String aqd() {
        return this.dpn;
    }

    public final void fL(String string) {
        this.dpn = string;
    }

    public final String aqX() {
        return this.dqk;
    }

    public final void fO(String string) {
        this.dqk = string;
    }

    public final double aqY() {
        return this.dpK;
    }

    public final void aW(double d2) {
        this.dpK = d2;
    }

    public final Calendar aqZ() {
        if (this.dqk == null) {
            return null;
        }
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
            Date date = simpleDateFormat.parse(this.dqk);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.set(11, calendar.get(11));
            calendar2.set(12, calendar.get(12));
            calendar2.set(13, calendar.get(13));
            return calendar2;
        }
        catch (ParseException parseException) {
            return null;
        }
    }

    public int ara() {
        return this.dqm;
    }

    public void kT(int n) {
        this.dqm = n;
    }

    public int arb() {
        return this.dqn;
    }

    public void kU(int n) {
        this.dqn = n;
    }
}

