/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections.functors;

import java.io.Serializable;
import org.apache.commons.collections.Transformer;
import org.apache.commons.collections.functors.PrototypeFactory;

public class CloneTransformer
implements Transformer,
Serializable {
    static final long serialVersionUID = -8188742709499652567L;
    public static final Transformer INSTANCE = new CloneTransformer();

    public static Transformer getInstance() {
        return INSTANCE;
    }

    private CloneTransformer() {
    }

    public Object transform(Object input) {
        if (input == null) {
            return null;
        }
        return PrototypeFactory.getInstance(input).create();
    }
}

