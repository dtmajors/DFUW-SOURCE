/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import java.util.Map;
import spenefett.hid.gui.serialization.SFXMLSerializable;
import spenefett.hid.gui.serialization.dto.SFSimpleDTO;

@XStreamAlias(value="SFTestDTO")
public final class SFTestDTO
extends SFXMLSerializable {
    public String testString;
    public int testInt;
    public double testDouble;
    public boolean testBoolean;
    public SFSimpleDTO testSimpleDTO;
    public List<Integer> testIntList;
    public List<SFSimpleDTO> testObjList;
    public Map<String, Integer> testIntMap;
    public Map<String, SFSimpleDTO> testObjMap;
}

