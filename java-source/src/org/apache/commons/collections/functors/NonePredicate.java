/*
 * Decompiled with CFR.
 */
package org.apache.commons.collections.functors;

import java.io.Serializable;
import java.util.Collection;
import org.apache.commons.collections.Predicate;
import org.apache.commons.collections.functors.FunctorUtils;
import org.apache.commons.collections.functors.PredicateDecorator;

public final class NonePredicate
implements Predicate,
PredicateDecorator,
Serializable {
    static final long serialVersionUID = 2007613066565892961L;
    private final Predicate[] iPredicates;

    public static Predicate getInstance(Predicate[] predicates) {
        FunctorUtils.validateMin2(predicates);
        predicates = FunctorUtils.copy(predicates);
        return new NonePredicate(predicates);
    }

    public static Predicate getInstance(Collection predicates) {
        Predicate[] preds = FunctorUtils.validate(predicates);
        return new NonePredicate(preds);
    }

    public NonePredicate(Predicate[] predicates) {
        this.iPredicates = predicates;
    }

    public boolean evaluate(Object object) {
        int i = 0;
        while (i < this.iPredicates.length) {
            if (this.iPredicates[i].evaluate(object)) {
                return false;
            }
            ++i;
        }
        return true;
    }

    public Predicate[] getPredicates() {
        return this.iPredicates;
    }
}

