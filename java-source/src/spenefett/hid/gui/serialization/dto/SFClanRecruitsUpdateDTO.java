/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFClanRecruitsUpdateDTO")
public class SFClanRecruitsUpdateDTO
extends SFXMLSerializable {
    public List<Integer> acceptedRecruits;
    public List<Integer> rejectedRecruits;
}

