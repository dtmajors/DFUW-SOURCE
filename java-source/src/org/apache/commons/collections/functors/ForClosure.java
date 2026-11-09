/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections.functors;

import java.io.Serializable;
import org.apache.commons.collections.Closure;
import org.apache.commons.collections.functors.NOPClosure;

public class ForClosure
implements Closure,
Serializable {
    static final long serialVersionUID = -1190120533393621674L;
    private final int iCount;
    private final Closure iClosure;

    public static Closure getInstance(int count, Closure closure) {
        if (count <= 0 || closure == null) {
            return NOPClosure.INSTANCE;
        }
        if (count == 1) {
            return closure;
        }
        return new ForClosure(count, closure);
    }

    public ForClosure(int count, Closure closure) {
        this.iCount = count;
        this.iClosure = closure;
    }

    public void execute(Object input) {
        int i = 0;
        while (i < this.iCount) {
            this.iClosure.execute(input);
            ++i;
        }
    }

    public Closure getClosure() {
        return this.iClosure;
    }

    public int getCount() {
        return this.iCount;
    }
}

