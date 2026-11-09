/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFVideoOptionsDTO")
public class SFVideoOptionsDTO
extends SFXMLSerializable {
    public static final int LINEAR_TEXTURE_FILTERING = 1;
    public static final int ANISOTROPIC_TEXTURE_FILTERING_2 = 2;
    public static final int ANISOTROPIC_TEXTURE_FILTERING_4 = 3;
    public static final int ANISOTROPIC_TEXTURE_FILTERING_8 = 4;
    public static final int ANISOTROPIC_TEXTURE_FILTERING_MAX = 5;
    public static final int QUALITY_LOW = 0;
    public static final int QUALITY_MEDIUM = 1;
    public static final int QUALITY_HIGH = 2;
    public static final int QUALITY_MAX = 3;
    public static final int QUICK_STATE_LOW = 0;
    public static final int QUICK_STATE_MEDIUM = 1;
    public static final int QUICK_STATE_HIGH = 2;
    public static final int QUICK_STATE_CUSTOM = 3;
    public String Resolution = "1024x768@70";
    public boolean Reflections = true;
    public int SpecialFXQuality = 3;
    public boolean Fullscreen = false;
    public boolean PostFX = true;
    public int TextureFiltering = 2;
    public boolean EnableShadows = false;
    public int ShadowQuality = 2;
    public int ShadowSmoothingQuality = 2;
    public boolean SMAA = true;
    public boolean CharacterShadowsOnly = false;
    public int QuickState = 1;
    public float Gamma = 1.0f;
    public boolean ObjectClipping = true;
    public boolean AutoOptimization = false;
    public boolean HighResolutionMap = false;
    public boolean EnableGodRays = false;
    public boolean VSync = false;
    public boolean DepthOfField = false;
    public int TextureQuality = 1;
    public float FarPlane = 1.0f;
    public int ShaderQuality = 1;

    public SFVideoOptionsDTO() {
        this.cDH();
    }

    public void cDG() {
        this.Reflections = false;
        this.SpecialFXQuality = 0;
        this.PostFX = false;
        this.TextureFiltering = 1;
        this.EnableShadows = false;
        this.CharacterShadowsOnly = true;
        this.ShadowQuality = 0;
        this.ShadowSmoothingQuality = 1;
        this.SMAA = false;
        this.ObjectClipping = true;
        this.QuickState = 0;
        this.HighResolutionMap = false;
        this.EnableGodRays = false;
        this.VSync = false;
        this.FarPlane = 0.0f;
        this.DepthOfField = false;
        this.ShaderQuality = 0;
    }

    public void cDH() {
        this.Reflections = false;
        this.SpecialFXQuality = 1;
        this.PostFX = true;
        this.TextureFiltering = 3;
        this.EnableShadows = true;
        this.CharacterShadowsOnly = true;
        this.ShadowQuality = 1;
        this.ShadowSmoothingQuality = 1;
        this.SMAA = true;
        this.ObjectClipping = false;
        this.QuickState = 1;
        this.HighResolutionMap = false;
        this.EnableGodRays = false;
        this.VSync = false;
        this.FarPlane = 0.5f;
        this.DepthOfField = true;
        this.ShaderQuality = 1;
    }

    public void cDI() {
        this.Reflections = true;
        this.SpecialFXQuality = 2;
        this.PostFX = true;
        this.TextureFiltering = 5;
        this.EnableShadows = true;
        this.CharacterShadowsOnly = false;
        this.ShadowQuality = 2;
        this.ShadowSmoothingQuality = 3;
        this.SMAA = true;
        this.ObjectClipping = false;
        this.QuickState = 2;
        this.HighResolutionMap = true;
        this.EnableGodRays = true;
        this.VSync = false;
        this.FarPlane = 1.0f;
        this.DepthOfField = true;
        this.ShaderQuality = 1;
    }

    public void cDJ() {
        this.Reflections = true;
        this.SpecialFXQuality = 2;
        this.PostFX = false;
        this.TextureFiltering = 3;
        this.EnableShadows = false;
        this.CharacterShadowsOnly = false;
        this.ShadowQuality = 2;
        this.ShadowSmoothingQuality = 2;
        this.SMAA = true;
        this.ObjectClipping = false;
        this.QuickState = 1;
        this.HighResolutionMap = false;
        this.EnableGodRays = false;
        this.VSync = false;
        this.DepthOfField = true;
        this.TextureQuality = 1;
        this.FarPlane = 1.0f;
        this.ShaderQuality = 1;
    }

    public void cDK() {
        switch (this.QuickState) {
            case 0: {
                this.cDG();
                break;
            }
            case 1: {
                this.cDH();
                break;
            }
            case 2: {
                this.cDI();
            }
        }
    }
}

