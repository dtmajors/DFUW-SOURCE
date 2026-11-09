/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections.functors;

import java.io.Serializable;
import java.util.Collection;
import org.apache.commons.collections.Predicate;
import org.apache.commons.collections.functors.FunctorUtils;
import org.apache.commons.collections.functors.PredicateDecorator;

public final class OnePredicate
implements Predicate,
PredicateDecorator,
Serializable {
    static final long serialVersionUID = -8125389089924745785L;
    private final Predicate[] iPredicates;

    public static Predicate getInstance(Predicate[] predicates) {
        FunctorUtils.validateMin2(predicates);
        predicates = FunctorUtils.copy(predicates);
        return new OnePredicate(predicates);
    }

    public static Predicate getInstance(Collection predicates) {
        Predicate[] preds = FunctorUtils.validate(predicates);
        return new OnePredicate(preds);
    }

    public OnePredicate(Predicate[] predicates) {
        this.iPredicates = predicates;
    }

    public boolean evaluate(Object object) {
        boolean match = false;
        int i = 0;
        while (i < this.iPredicates.length) {
            if (this.iPredicates[i].evaluate(object)) {
                if (match) {
                    return false;
                }
                match = true;
            }
            ++i;
        }
        return match;
    }

    public Predicate[] getPredicates() {
        return this.iPredicates;
    }
}

