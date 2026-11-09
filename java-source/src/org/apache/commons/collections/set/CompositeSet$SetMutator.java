package org.apache.commons.collections.set;

import java.util.Collection;
import java.util.Set;
import org.apache.commons.collections.collection.CompositeCollection$CollectionMutator;

public interface CompositeSet$SetMutator extends CompositeCollection$CollectionMutator {
   void resolveCollision(CompositeSet var1, Set var2, Set var3, Collection var4);
}
