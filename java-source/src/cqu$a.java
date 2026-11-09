import java.util.Arrays;
import lmx.a;

public class cqu$a extends a {
   public static final lnu.a eVH = new lnu.a(0, 2000, 1);
   public static final lnu.a eVI = new lnu.a(0, 2000, 1);
   public static final lnu.a eVJ = new lnu.a(150, 2000, 1);
   public static final lnq.a eVK = new lnq.a(10.0F, 400.0F);
   public static final lnq.a eVL = new lnq.a(20.0F, 1000.0F);
   public static final lnq.a eVM = new lnq.a(1.0F, 100.0F);
   public static final lnq.a eVN = new lnq.a(0.0F, 10.0F);
   public static final lnq.a eVO = new lnq.a(0.0F, 1.0F);
   public static final lnu.a eVP = new lnu.a(50, 200, 1);
   public static final lnu.a eVQ = new lnu.a(10000, 100000, 1);
   public static final lnu.a eVR = new lnu.a(2, 16, 1);
   public static final lnq.a eVS = new lnq.a(0.5F, 2.0F);
   public static final lnm.a eVT = new lnm.a<>(css$a.class);
   public static final lnm.a eVU = new lnm.a<>(css$b.class);
   public static final lnm.a eVV = new lnm.a<>(csr$a.class);
   public static final lnm.a eVW = new lnm.a<>(cst$c.class);
   public static final lnm.a eVX = new lnm.a<>(cst$b.class);
   public static final lnm.a eVY = new lnm.a<>(cst$a.class);
   public static final lnu.a eVZ = new lnu.a(15, 120, 1);
   public static final cqu$a eWa = new cqu$a();

   public cqu$a() {
      super(
         cqu.class,
         Arrays.asList(
            new lmx.a.a(lne.a.rFu, "MEMBER_ENABLE_DYNAMIC_LIGHTING", new lne(true)),
            new lmx.a.a(lne.a.rFu, "MEMBER_REFLECTION_QUALITY", new lne(true)),
            new lmx.a.a(lne.a.rFu, "MEMBER_ENABLE_DEFERRED", new lne(true)),
            new lmx.a.a(lne.a.rFu, "MEMBER_ENABLE_VOXEL_LIGHTING", new lne(false)),
            new lmx.a.a(eVH, "MEMBER_MAXNUMDYNAMICLIGHTS", new lnu(1000)),
            new lmx.a.a(eVI, "MEMBER_MAXNUMBLOODSTAINS", new lnu(1000)),
            new lmx.a.a(eVJ, "MEMBER_MAXNUMPARTICLES", new lnu(1000)),
            new lmx.a.a(lne.a.rFu, "MEMBER_OBJECT_CLIPPING", new lne(true)),
            new lmx.a.a(eVK, "MEMBER_OBJECT_CLIPPING_MAX_SIZE_TO_CLIP", new lnq(100.0F)),
            new lmx.a.a(eVL, "MEMBER_OBJECT_CLIPPING_MAX_FUNCTION_VALUE", new lnq(200.0F)),
            new lmx.a.a(eVM, "MEMBER_OBJECT_MIN_DISTANCE_TO_CLIP", new lnq(10.0F)),
            new lmx.a.a(lne.a.rFu, "MEMBER_ENABLE_DISTANCE_ANIMATION_REDUCTION", new lne(false)),
            new lmx.a.a(eVN, "MEMBER_ANIMATION_DISTANCE_REDUCTION_START", new lnq(10.0F)),
            new lmx.a.a(eVO, "MEMBER_ANIMATION_REDUCTION_PER_METER", new lnq(0.1F)),
            new lmx.a.a(eVP, "MEMBER_VEGETATION_AREA_SIZE", new lnu(50)),
            new lmx.a.a(eVQ, "MEMBER_VEGETATION_DENSITY", new lnu(30000)),
            new lmx.a.a(lne.a.rFu, "MEMBER_ENABLE_TRIPLE_BUFFERING", new lne(false)),
            new lmx.a.a(lne.a.rFu, "MEMBER_WAIT_FOR_VSYNC", new lne(false)),
            new lmx.a.a(lne.a.rFu, "MEMBER_ENABLE_ANTIALIASING", new lne(false)),
            new lmx.a.a(eVR, "MEMBER_ANTIALIASING_QUALITY", new lnu(2)),
            new lmx.a.a(eVS, "MEMBER_GAMMA_CORRECTION", new lnq(1.0F)),
            new lmx.a.a(lne.a.rFu, "MEMBER_ENABLE_SHADOWS", new lne(true)),
            new lmx.a.a(lne.a.rFu, "MEMBER_ENABLE_SCENERY_SHADOWS", new lne(true)),
            new lmx.a.a(lne.a.rFu, "MEMBER_ENABLE_CHARACTER_SHADOWS", new lne(true)),
            new lmx.a.a(eVT, "MEMBER_SHADOW_QUALITY", new lnm<>(eVT, css.fdb)),
            new lmx.a.a(eVU, "MEMBER_SHADOW_SMOOTHING", new lnm<>(eVU, css.fdd)),
            new lmx.a.a(eVV, "MEMBER_SHADER_VERSION", new lnm<>(eVV, csr.fcP)),
            new lmx.a.a(eVW, "MEMBER_TEXTURE_QUALITY", new lnm<>(eVW, cst.fdq)),
            new lmx.a.a(eVX, "MEMBER_TEXTURE_FILTERING", new lnm<>(eVX, cst.fds)),
            new lmx.a.a(eVY, "MEMBER_TEXTURE_ANISOTROPY_LEVEL", new lnm<>(eVY, cst.fdu)),
            new lmx.a.a(lod.a.rGh, "MEMBER_VIDEO_RESOLUTION", new lod(csq.fcI)),
            new lmx.a.a(lod.a.rGh, "MEMBER_VIDEO_RESOLUTION_DISPLAY_LIST", new lod(csq.fcK)),
            new lmx.a.a(lne.a.rFu, "MEMBER_VIDEO_FULLSCREEN", new lne(false)),
            new lmx.a.a(lne.a.rFu, "MEMBER_ENABLE_POST_PROCESS_EFFECT", new lne(false)),
            new lmx.a.a(eVZ, "MEMBER_AUTO_OPTIMIZE_TARGET_FPS", new lnu(30)),
            new lmx.a.a(lne.a.rFu, "MEMBER_AUTO_OPTIMIZE", new lne(true))
         )
      );
   }
}
