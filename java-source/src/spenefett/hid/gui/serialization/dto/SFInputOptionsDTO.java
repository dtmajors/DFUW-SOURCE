/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFInputOptionsDTO")
public class SFInputOptionsDTO
extends SFXMLSerializable {
    public float mouseXSensitivity = 0.0017f;
    public float mouseYSensitivity = 0.0017f;
    public boolean mouseInvertYAxis = false;
    public boolean mouseSmoothingEnabled = false;
    public float mouseSmoothingAmount = 0.0f;
}

