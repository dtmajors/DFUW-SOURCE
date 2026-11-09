/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.io;

import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public interface HierarchicalStreamDriver {
    public HierarchicalStreamReader createReader(Reader var1);

    public HierarchicalStreamReader createReader(InputStream var1);

    public HierarchicalStreamWriter createWriter(Writer var1);

    public HierarchicalStreamWriter createWriter(OutputStream var1);
}

