/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections.functors;

import java.io.Serializable;
import java.util.Collection;
import org.apache.commons.collections.Predicate;
import org.apache.commons.collections.functors.FunctorUtils;
import org.apache.commons.collections.functors.PredicateDecorator;

public final class AnyPredicate
implements Predicate,
PredicateDecorator,
Serializable {
    static final long serialVersionUID = 7429999530934647542L;
    private final Predicate[] iPredicates;

    public static Predicate getInstance(Predicate[] predicates) {
        FunctorUtils.validateMin2(predicates);
        predicates = FunctorUtils.copy(predicates);
        return new AnyPredicate(predicates);
    }

    public static Predicate getInstance(Collection predicates) {
        Predicate[] preds = FunctorUtils.validate(predicates);
        return new AnyPredicate(preds);
    }

    public AnyPredicate(Predicate[] predicates) {
        this.iPredicates = predicates;
    }

    public boolean evaluate(Object object) {
        int i = 0;
        while (i < this.iPredicates.length) {
            if (this.iPredicates[i].evaluate(object)) {
                return true;
            }
            ++i;
        }
        return false;
    }

    public Predicate[] getPredicates() {
        return this.iPredicates;
    }
}

