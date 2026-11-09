/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.core.util;

import com.thoughtworks.xstream.core.util.Pool;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class ThreadSafeSimpleDateFormat {
    private final String formatString;
    private final Pool pool;

    public ThreadSafeSimpleDateFormat(String format, int initialPoolSize, int maxPoolSize) {
        this.formatString = format;
        this.pool = new Pool(initialPoolSize, maxPoolSize, new Pool.Factory(this){
            private final /* synthetic */ ThreadSafeSimpleDateFormat this$0;
            {
                this.this$0 = threadSafeSimpleDateFormat;
            }

            public Object newInstance() {
                return new SimpleDateFormat(ThreadSafeSimpleDateFormat.access$000(this.this$0), Locale.ENGLISH);
            }
        });
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String format(Date date) {
        DateFormat format = this.fetchFromPool();
        try {
            String string = format.format(date);
            return string;
        }
        finally {
            this.pool.putInPool(format);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Date parse(String date) throws ParseException {
        DateFormat format = this.fetchFromPool();
        try {
            Date date2 = format.parse(date);
            return date2;
        }
        finally {
            this.pool.putInPool(format);
        }
    }

    private DateFormat fetchFromPool() {
        DateFormat format;
        TimeZone tz = TimeZone.getDefault();
        if (!tz.equals((format = (DateFormat)this.pool.fetchFromPool()).getTimeZone())) {
            format.setTimeZone(tz);
        }
        return format;
    }

    static /* synthetic */ String access$000(ThreadSafeSimpleDateFormat x0) {
        return x0.formatString;
    }
}

