/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream;

import com.thoughtworks.xstream.MarshallingStrategy;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.alias.ClassMapper;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.ConverterLookup;
import com.thoughtworks.xstream.converters.DataHolder;
import com.thoughtworks.xstream.converters.SingleValueConverter;
import com.thoughtworks.xstream.converters.SingleValueConverterWrapper;
import com.thoughtworks.xstream.converters.basic.BigDecimalConverter;
import com.thoughtworks.xstream.converters.basic.BigIntegerConverter;
import com.thoughtworks.xstream.converters.basic.BooleanConverter;
import com.thoughtworks.xstream.converters.basic.ByteConverter;
import com.thoughtworks.xstream.converters.basic.CharConverter;
import com.thoughtworks.xstream.converters.basic.DateConverter;
import com.thoughtworks.xstream.converters.basic.DoubleConverter;
import com.thoughtworks.xstream.converters.basic.FloatConverter;
import com.thoughtworks.xstream.converters.basic.IntConverter;
import com.thoughtworks.xstream.converters.basic.LongConverter;
import com.thoughtworks.xstream.converters.basic.NullConverter;
import com.thoughtworks.xstream.converters.basic.ShortConverter;
import com.thoughtworks.xstream.converters.basic.StringBufferConverter;
import com.thoughtworks.xstream.converters.basic.StringConverter;
import com.thoughtworks.xstream.converters.basic.URLConverter;
import com.thoughtworks.xstream.converters.collections.ArrayConverter;
import com.thoughtworks.xstream.converters.collections.BitSetConverter;
import com.thoughtworks.xstream.converters.collections.CharArrayConverter;
import com.thoughtworks.xstream.converters.collections.CollectionConverter;
import com.thoughtworks.xstream.converters.collections.MapConverter;
import com.thoughtworks.xstream.converters.collections.PropertiesConverter;
import com.thoughtworks.xstream.converters.collections.TreeMapConverter;
import com.thoughtworks.xstream.converters.collections.TreeSetConverter;
import com.thoughtworks.xstream.converters.extended.ColorConverter;
import com.thoughtworks.xstream.converters.extended.DynamicProxyConverter;
import com.thoughtworks.xstream.converters.extended.EncodedByteArrayConverter;
import com.thoughtworks.xstream.converters.extended.FileConverter;
import com.thoughtworks.xstream.converters.extended.FontConverter;
import com.thoughtworks.xstream.converters.extended.GregorianCalendarConverter;
import com.thoughtworks.xstream.converters.extended.JavaClassConverter;
import com.thoughtworks.xstream.converters.extended.JavaMethodConverter;
import com.thoughtworks.xstream.converters.extended.LocaleConverter;
import com.thoughtworks.xstream.converters.extended.SqlDateConverter;
import com.thoughtworks.xstream.converters.extended.SqlTimeConverter;
import com.thoughtworks.xstream.converters.extended.SqlTimestampConverter;
import com.thoughtworks.xstream.converters.extended.TextAttributeConverter;
import com.thoughtworks.xstream.converters.reflection.ExternalizableConverter;
import com.thoughtworks.xstream.converters.reflection.ReflectionConverter;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.converters.reflection.SelfStreamingInstanceChecker;
import com.thoughtworks.xstream.converters.reflection.SerializableConverter;
import com.thoughtworks.xstream.core.DefaultConverterLookup;
import com.thoughtworks.xstream.core.JVM;
import com.thoughtworks.xstream.core.MapBackedDataHolder;
import com.thoughtworks.xstream.core.ReferenceByIdMarshallingStrategy;
import com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy;
import com.thoughtworks.xstream.core.TreeMarshallingStrategy;
import com.thoughtworks.xstream.core.util.ClassLoaderReference;
import com.thoughtworks.xstream.core.util.CompositeClassLoader;
import com.thoughtworks.xstream.core.util.CustomObjectInputStream;
import com.thoughtworks.xstream.core.util.CustomObjectOutputStream;
import com.thoughtworks.xstream.io.HierarchicalStreamDriver;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.StatefulWriter;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XppDriver;
import com.thoughtworks.xstream.mapper.ArrayMapper;
import com.thoughtworks.xstream.mapper.AttributeAliasingMapper;
import com.thoughtworks.xstream.mapper.AttributeMapper;
import com.thoughtworks.xstream.mapper.CachingMapper;
import com.thoughtworks.xstream.mapper.ClassAliasingMapper;
import com.thoughtworks.xstream.mapper.DefaultImplementationsMapper;
import com.thoughtworks.xstream.mapper.DefaultMapper;
import com.thoughtworks.xstream.mapper.DynamicProxyMapper;
import com.thoughtworks.xstream.mapper.EnumMapper;
import com.thoughtworks.xstream.mapper.FieldAliasingMapper;
import com.thoughtworks.xstream.mapper.ImmutableTypesMapper;
import com.thoughtworks.xstream.mapper.ImplicitCollectionMapper;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.mapper.MapperWrapper;
import com.thoughtworks.xstream.mapper.OuterClassMapper;
import com.thoughtworks.xstream.mapper.XStream11XmlFriendlyMapper;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.NotActiveException;
import java.io.ObjectInputStream;
import java.io.ObjectInputValidation;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

public class XStream {
    private ReflectionProvider reflectionProvider;
    private HierarchicalStreamDriver hierarchicalStreamDriver;
    private ClassLoaderReference classLoaderReference;
    private MarshallingStrategy marshallingStrategy;
    private Mapper mapper;
    private DefaultConverterLookup converterLookup;
    private ClassAliasingMapper classAliasingMapper;
    private FieldAliasingMapper fieldAliasingMapper;
    private AttributeAliasingMapper attributeAliasingMapper;
    private AttributeMapper attributeMapper;
    private DefaultImplementationsMapper defaultImplementationsMapper;
    private ImmutableTypesMapper immutableTypesMapper;
    private ImplicitCollectionMapper implicitCollectionMapper;
    private transient JVM jvm = new JVM();
    public static final int NO_REFERENCES = 1001;
    public static final int ID_REFERENCES = 1002;
    public static final int XPATH_RELATIVE_REFERENCES = 1003;
    public static final int XPATH_ABSOLUTE_REFERENCES = 1004;
    public static final int XPATH_REFERENCES = 1003;
    public static final int PRIORITY_VERY_HIGH = 10000;
    public static final int PRIORITY_NORMAL = 0;
    public static final int PRIORITY_LOW = -10;
    public static final int PRIORITY_VERY_LOW = -20;
    static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$Mapper;
    static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$ClassAliasingMapper;
    static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$FieldAliasingMapper;
    static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$AttributeMapper;
    static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$AttributeAliasingMapper;
    static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$ImplicitCollectionMapper;
    static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$DefaultImplementationsMapper;
    static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$ImmutableTypesMapper;
    static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$Mapper$Null;
    static /* synthetic */ Class class$java$lang$Integer;
    static /* synthetic */ Class class$java$lang$Float;
    static /* synthetic */ Class class$java$lang$Double;
    static /* synthetic */ Class class$java$lang$Long;
    static /* synthetic */ Class class$java$lang$Short;
    static /* synthetic */ Class class$java$lang$Character;
    static /* synthetic */ Class class$java$lang$Byte;
    static /* synthetic */ Class class$java$lang$Boolean;
    static /* synthetic */ Class class$java$lang$Number;
    static /* synthetic */ Class class$java$lang$Object;
    static /* synthetic */ Class class$java$math$BigInteger;
    static /* synthetic */ Class class$java$math$BigDecimal;
    static /* synthetic */ Class class$java$lang$StringBuffer;
    static /* synthetic */ Class class$java$lang$String;
    static /* synthetic */ Class class$java$lang$Class;
    static /* synthetic */ Class class$java$lang$reflect$Method;
    static /* synthetic */ Class class$java$lang$reflect$Constructor;
    static /* synthetic */ Class class$java$util$Date;
    static /* synthetic */ Class class$java$net$URL;
    static /* synthetic */ Class class$java$util$BitSet;
    static /* synthetic */ Class class$java$util$Map;
    static /* synthetic */ Class class$java$util$Map$Entry;
    static /* synthetic */ Class class$java$util$Properties;
    static /* synthetic */ Class class$java$util$List;
    static /* synthetic */ Class class$java$util$Set;
    static /* synthetic */ Class class$java$util$LinkedList;
    static /* synthetic */ Class class$java$util$Vector;
    static /* synthetic */ Class class$java$util$TreeMap;
    static /* synthetic */ Class class$java$util$TreeSet;
    static /* synthetic */ Class class$java$util$Hashtable;
    static /* synthetic */ Class class$java$awt$font$TextAttribute;
    static /* synthetic */ Class class$java$sql$Timestamp;
    static /* synthetic */ Class class$java$sql$Time;
    static /* synthetic */ Class class$java$sql$Date;
    static /* synthetic */ Class class$java$io$File;
    static /* synthetic */ Class class$java$util$Locale;
    static /* synthetic */ Class class$java$util$Calendar;
    static /* synthetic */ Class class$java$util$HashMap;
    static /* synthetic */ Class class$java$util$ArrayList;
    static /* synthetic */ Class class$java$util$HashSet;
    static /* synthetic */ Class class$java$util$GregorianCalendar;
    static /* synthetic */ Class class$com$thoughtworks$xstream$converters$reflection$ReflectionProvider;
    static /* synthetic */ Class class$com$thoughtworks$xstream$converters$Converter;
    static /* synthetic */ Class class$com$thoughtworks$xstream$alias$ClassMapper;

    public XStream() {
        this(null, (Mapper)null, (HierarchicalStreamDriver)new XppDriver());
    }

    public XStream(ReflectionProvider reflectionProvider) {
        this(reflectionProvider, (Mapper)null, (HierarchicalStreamDriver)new XppDriver());
    }

    public XStream(HierarchicalStreamDriver hierarchicalStreamDriver) {
        this(null, (Mapper)null, hierarchicalStreamDriver);
    }

    public XStream(ReflectionProvider reflectionProvider, HierarchicalStreamDriver hierarchicalStreamDriver) {
        this(reflectionProvider, (Mapper)null, hierarchicalStreamDriver);
    }

    public XStream(ReflectionProvider reflectionProvider, ClassMapper classMapper, HierarchicalStreamDriver driver) {
        this(reflectionProvider, (Mapper)classMapper, driver);
    }

    public XStream(ReflectionProvider reflectionProvider, ClassMapper classMapper, HierarchicalStreamDriver driver, String classAttributeIdentifier) {
        this(reflectionProvider, (Mapper)classMapper, driver);
        this.aliasAttribute(classAttributeIdentifier, "class");
    }

    public XStream(ReflectionProvider reflectionProvider, Mapper mapper, HierarchicalStreamDriver driver) {
        if (reflectionProvider == null) {
            reflectionProvider = this.jvm.bestReflectionProvider();
        }
        this.reflectionProvider = reflectionProvider;
        this.hierarchicalStreamDriver = driver;
        this.classLoaderReference = new ClassLoaderReference(new CompositeClassLoader());
        this.mapper = mapper == null ? this.buildMapper() : mapper;
        this.converterLookup = new DefaultConverterLookup(this.mapper);
        this.setupMappers();
        this.setupAliases();
        this.setupDefaultImplementations();
        this.setupConverters();
        this.setupImmutableTypes();
        this.setMode(1003);
    }

    private Mapper buildMapper() {
        Mapper mapper = new DefaultMapper(this.classLoaderReference);
        if (this.useXStream11XmlFriendlyMapper()) {
            mapper = new XStream11XmlFriendlyMapper(mapper);
        }
        mapper = new ClassAliasingMapper(mapper);
        mapper = new FieldAliasingMapper(mapper);
        mapper = new AttributeAliasingMapper(mapper);
        mapper = new AttributeMapper(mapper);
        mapper = new ImplicitCollectionMapper(mapper);
        if (this.jvm.loadClass("net.sf.cglib.proxy.Enhancer") != null) {
            mapper = this.buildMapperDynamically("com.thoughtworks.xstream.mapper.CGLIBMapper", new Class[]{class$com$thoughtworks$xstream$mapper$Mapper == null ? (class$com$thoughtworks$xstream$mapper$Mapper = XStream.class$("com.thoughtworks.xstream.mapper.Mapper")) : class$com$thoughtworks$xstream$mapper$Mapper}, new Object[]{mapper});
        }
        mapper = new DynamicProxyMapper(mapper);
        if (JVM.is15()) {
            mapper = new EnumMapper(mapper);
        }
        mapper = new OuterClassMapper(mapper);
        mapper = new ArrayMapper(mapper);
        mapper = new DefaultImplementationsMapper(mapper);
        mapper = new ImmutableTypesMapper(mapper);
        mapper = this.wrapMapper((MapperWrapper)mapper);
        mapper = new CachingMapper(mapper);
        return mapper;
    }

    private Mapper buildMapperDynamically(String className, Class[] constructorParamTypes, Object[] constructorParamValues) {
        try {
            Class<?> type = Class.forName(className, false, this.classLoaderReference.getReference());
            Constructor<?> constructor = type.getConstructor(constructorParamTypes);
            return (Mapper)constructor.newInstance(constructorParamValues);
        }
        catch (Exception e) {
            throw new InitializationException("Could not instatiate mapper : " + className, e);
        }
    }

    protected MapperWrapper wrapMapper(MapperWrapper next) {
        return next;
    }

    protected boolean useXStream11XmlFriendlyMapper() {
        return false;
    }

    private void setupMappers() {
        this.classAliasingMapper = (ClassAliasingMapper)this.mapper.lookupMapperOfType(class$com$thoughtworks$xstream$mapper$ClassAliasingMapper == null ? (class$com$thoughtworks$xstream$mapper$ClassAliasingMapper = XStream.class$("com.thoughtworks.xstream.mapper.ClassAliasingMapper")) : class$com$thoughtworks$xstream$mapper$ClassAliasingMapper);
        this.fieldAliasingMapper = (FieldAliasingMapper)this.mapper.lookupMapperOfType(class$com$thoughtworks$xstream$mapper$FieldAliasingMapper == null ? (class$com$thoughtworks$xstream$mapper$FieldAliasingMapper = XStream.class$("com.thoughtworks.xstream.mapper.FieldAliasingMapper")) : class$com$thoughtworks$xstream$mapper$FieldAliasingMapper);
        this.attributeMapper = (AttributeMapper)this.mapper.lookupMapperOfType(class$com$thoughtworks$xstream$mapper$AttributeMapper == null ? (class$com$thoughtworks$xstream$mapper$AttributeMapper = XStream.class$("com.thoughtworks.xstream.mapper.AttributeMapper")) : class$com$thoughtworks$xstream$mapper$AttributeMapper);
        this.attributeAliasingMapper = (AttributeAliasingMapper)this.mapper.lookupMapperOfType(class$com$thoughtworks$xstream$mapper$AttributeAliasingMapper == null ? (class$com$thoughtworks$xstream$mapper$AttributeAliasingMapper = XStream.class$("com.thoughtworks.xstream.mapper.AttributeAliasingMapper")) : class$com$thoughtworks$xstream$mapper$AttributeAliasingMapper);
        this.implicitCollectionMapper = (ImplicitCollectionMapper)this.mapper.lookupMapperOfType(class$com$thoughtworks$xstream$mapper$ImplicitCollectionMapper == null ? (class$com$thoughtworks$xstream$mapper$ImplicitCollectionMapper = XStream.class$("com.thoughtworks.xstream.mapper.ImplicitCollectionMapper")) : class$com$thoughtworks$xstream$mapper$ImplicitCollectionMapper);
        this.defaultImplementationsMapper = (DefaultImplementationsMapper)this.mapper.lookupMapperOfType(class$com$thoughtworks$xstream$mapper$DefaultImplementationsMapper == null ? (class$com$thoughtworks$xstream$mapper$DefaultImplementationsMapper = XStream.class$("com.thoughtworks.xstream.mapper.DefaultImplementationsMapper")) : class$com$thoughtworks$xstream$mapper$DefaultImplementationsMapper);
        this.immutableTypesMapper = (ImmutableTypesMapper)this.mapper.lookupMapperOfType(class$com$thoughtworks$xstream$mapper$ImmutableTypesMapper == null ? (class$com$thoughtworks$xstream$mapper$ImmutableTypesMapper = XStream.class$("com.thoughtworks.xstream.mapper.ImmutableTypesMapper")) : class$com$thoughtworks$xstream$mapper$ImmutableTypesMapper);
        if (this.attributeMapper != null) {
            this.attributeMapper.setConverterLookup(this.converterLookup);
        }
    }

    protected void setupAliases() {
        if (this.classAliasingMapper == null) {
            return;
        }
        this.alias("null", class$com$thoughtworks$xstream$mapper$Mapper$Null == null ? (class$com$thoughtworks$xstream$mapper$Mapper$Null = XStream.class$("com.thoughtworks.xstream.mapper.Mapper$Null")) : class$com$thoughtworks$xstream$mapper$Mapper$Null);
        this.alias("int", class$java$lang$Integer == null ? (class$java$lang$Integer = XStream.class$("java.lang.Integer")) : class$java$lang$Integer);
        this.alias("float", class$java$lang$Float == null ? (class$java$lang$Float = XStream.class$("java.lang.Float")) : class$java$lang$Float);
        this.alias("double", class$java$lang$Double == null ? (class$java$lang$Double = XStream.class$("java.lang.Double")) : class$java$lang$Double);
        this.alias("long", class$java$lang$Long == null ? (class$java$lang$Long = XStream.class$("java.lang.Long")) : class$java$lang$Long);
        this.alias("short", class$java$lang$Short == null ? (class$java$lang$Short = XStream.class$("java.lang.Short")) : class$java$lang$Short);
        this.alias("char", class$java$lang$Character == null ? (class$java$lang$Character = XStream.class$("java.lang.Character")) : class$java$lang$Character);
        this.alias("byte", class$java$lang$Byte == null ? (class$java$lang$Byte = XStream.class$("java.lang.Byte")) : class$java$lang$Byte);
        this.alias("boolean", class$java$lang$Boolean == null ? (class$java$lang$Boolean = XStream.class$("java.lang.Boolean")) : class$java$lang$Boolean);
        this.alias("number", class$java$lang$Number == null ? (class$java$lang$Number = XStream.class$("java.lang.Number")) : class$java$lang$Number);
        this.alias("object", class$java$lang$Object == null ? (class$java$lang$Object = XStream.class$("java.lang.Object")) : class$java$lang$Object);
        this.alias("big-int", class$java$math$BigInteger == null ? (class$java$math$BigInteger = XStream.class$("java.math.BigInteger")) : class$java$math$BigInteger);
        this.alias("big-decimal", class$java$math$BigDecimal == null ? (class$java$math$BigDecimal = XStream.class$("java.math.BigDecimal")) : class$java$math$BigDecimal);
        this.alias("string-buffer", class$java$lang$StringBuffer == null ? (class$java$lang$StringBuffer = XStream.class$("java.lang.StringBuffer")) : class$java$lang$StringBuffer);
        this.alias("string", class$java$lang$String == null ? (class$java$lang$String = XStream.class$("java.lang.String")) : class$java$lang$String);
        this.alias("java-class", class$java$lang$Class == null ? (class$java$lang$Class = XStream.class$("java.lang.Class")) : class$java$lang$Class);
        this.alias("method", class$java$lang$reflect$Method == null ? (class$java$lang$reflect$Method = XStream.class$("java.lang.reflect.Method")) : class$java$lang$reflect$Method);
        this.alias("constructor", class$java$lang$reflect$Constructor == null ? (class$java$lang$reflect$Constructor = XStream.class$("java.lang.reflect.Constructor")) : class$java$lang$reflect$Constructor);
        this.alias("date", class$java$util$Date == null ? (class$java$util$Date = XStream.class$("java.util.Date")) : class$java$util$Date);
        this.alias("url", class$java$net$URL == null ? (class$java$net$URL = XStream.class$("java.net.URL")) : class$java$net$URL);
        this.alias("bit-set", class$java$util$BitSet == null ? (class$java$util$BitSet = XStream.class$("java.util.BitSet")) : class$java$util$BitSet);
        this.alias("map", class$java$util$Map == null ? (class$java$util$Map = XStream.class$("java.util.Map")) : class$java$util$Map);
        this.alias("entry", class$java$util$Map$Entry == null ? (class$java$util$Map$Entry = XStream.class$("java.util.Map$Entry")) : class$java$util$Map$Entry);
        this.alias("properties", class$java$util$Properties == null ? (class$java$util$Properties = XStream.class$("java.util.Properties")) : class$java$util$Properties);
        this.alias("list", class$java$util$List == null ? (class$java$util$List = XStream.class$("java.util.List")) : class$java$util$List);
        this.alias("set", class$java$util$Set == null ? (class$java$util$Set = XStream.class$("java.util.Set")) : class$java$util$Set);
        this.alias("linked-list", class$java$util$LinkedList == null ? (class$java$util$LinkedList = XStream.class$("java.util.LinkedList")) : class$java$util$LinkedList);
        this.alias("vector", class$java$util$Vector == null ? (class$java$util$Vector = XStream.class$("java.util.Vector")) : class$java$util$Vector);
        this.alias("tree-map", class$java$util$TreeMap == null ? (class$java$util$TreeMap = XStream.class$("java.util.TreeMap")) : class$java$util$TreeMap);
        this.alias("tree-set", class$java$util$TreeSet == null ? (class$java$util$TreeSet = XStream.class$("java.util.TreeSet")) : class$java$util$TreeSet);
        this.alias("hashtable", class$java$util$Hashtable == null ? (class$java$util$Hashtable = XStream.class$("java.util.Hashtable")) : class$java$util$Hashtable);
        if (this.jvm.supportsAWT()) {
            this.alias("awt-color", this.jvm.loadClass("java.awt.Color"));
            this.alias("awt-font", this.jvm.loadClass("java.awt.Font"));
            this.alias("awt-text-attribute", class$java$awt$font$TextAttribute == null ? (class$java$awt$font$TextAttribute = XStream.class$("java.awt.font.TextAttribute")) : class$java$awt$font$TextAttribute);
        }
        if (this.jvm.supportsSQL()) {
            this.alias("sql-timestamp", class$java$sql$Timestamp == null ? (class$java$sql$Timestamp = XStream.class$("java.sql.Timestamp")) : class$java$sql$Timestamp);
            this.alias("sql-time", class$java$sql$Time == null ? (class$java$sql$Time = XStream.class$("java.sql.Time")) : class$java$sql$Time);
            this.alias("sql-date", class$java$sql$Date == null ? (class$java$sql$Date = XStream.class$("java.sql.Date")) : class$java$sql$Date);
        }
        this.alias("file", class$java$io$File == null ? (class$java$io$File = XStream.class$("java.io.File")) : class$java$io$File);
        this.alias("locale", class$java$util$Locale == null ? (class$java$util$Locale = XStream.class$("java.util.Locale")) : class$java$util$Locale);
        this.alias("gregorian-calendar", class$java$util$Calendar == null ? (class$java$util$Calendar = XStream.class$("java.util.Calendar")) : class$java$util$Calendar);
        Class type = this.jvm.loadClass("javax.security.auth.Subject");
        if (type != null) {
            this.alias("auth-subject", type);
        }
        if (JVM.is14()) {
            this.alias("linked-hash-map", this.jvm.loadClass("java.util.LinkedHashMap"));
            this.alias("linked-hash-set", this.jvm.loadClass("java.util.LinkedHashSet"));
            this.alias("trace", this.jvm.loadClass("java.lang.StackTraceElement"));
            this.alias("currency", this.jvm.loadClass("java.util.Currency"));
            this.aliasType("charset", this.jvm.loadClass("java.nio.charset.Charset"));
        }
        if (JVM.is15()) {
            this.alias("enum-set", this.jvm.loadClass("java.util.EnumSet"));
            this.alias("enum-map", this.jvm.loadClass("java.util.EnumMap"));
        }
    }

    protected void setupDefaultImplementations() {
        if (this.defaultImplementationsMapper == null) {
            return;
        }
        this.addDefaultImplementation(class$java$util$HashMap == null ? (class$java$util$HashMap = XStream.class$("java.util.HashMap")) : class$java$util$HashMap, class$java$util$Map == null ? (class$java$util$Map = XStream.class$("java.util.Map")) : class$java$util$Map);
        this.addDefaultImplementation(class$java$util$ArrayList == null ? (class$java$util$ArrayList = XStream.class$("java.util.ArrayList")) : class$java$util$ArrayList, class$java$util$List == null ? (class$java$util$List = XStream.class$("java.util.List")) : class$java$util$List);
        this.addDefaultImplementation(class$java$util$HashSet == null ? (class$java$util$HashSet = XStream.class$("java.util.HashSet")) : class$java$util$HashSet, class$java$util$Set == null ? (class$java$util$Set = XStream.class$("java.util.Set")) : class$java$util$Set);
        this.addDefaultImplementation(class$java$util$GregorianCalendar == null ? (class$java$util$GregorianCalendar = XStream.class$("java.util.GregorianCalendar")) : class$java$util$GregorianCalendar, class$java$util$Calendar == null ? (class$java$util$Calendar = XStream.class$("java.util.Calendar")) : class$java$util$Calendar);
    }

    protected void setupConverters() {
        ReflectionConverter reflectionConverter;
        if (JVM.is15()) {
            Class annotationProvider = this.jvm.loadClass("com.thoughtworks.xstream.annotations.AnnotationProvider");
            this.dynamicallyRegisterConverter("com.thoughtworks.xstream.annotations.AnnotationReflectionConverter", -20, new Class[]{class$com$thoughtworks$xstream$mapper$Mapper == null ? (class$com$thoughtworks$xstream$mapper$Mapper = XStream.class$("com.thoughtworks.xstream.mapper.Mapper")) : class$com$thoughtworks$xstream$mapper$Mapper, class$com$thoughtworks$xstream$converters$reflection$ReflectionProvider == null ? (class$com$thoughtworks$xstream$converters$reflection$ReflectionProvider = XStream.class$("com.thoughtworks.xstream.converters.reflection.ReflectionProvider")) : class$com$thoughtworks$xstream$converters$reflection$ReflectionProvider, annotationProvider}, new Object[]{this.mapper, this.reflectionProvider, this.reflectionProvider.newInstance(annotationProvider)});
            reflectionConverter = (ReflectionConverter)this.converterLookup.lookupConverterForType(class$java$lang$Object == null ? (class$java$lang$Object = XStream.class$("java.lang.Object")) : class$java$lang$Object);
        } else {
            reflectionConverter = new ReflectionConverter(this.mapper, this.reflectionProvider);
            this.registerConverter(reflectionConverter, -20);
        }
        this.registerConverter(new SerializableConverter(this.mapper, this.reflectionProvider), -10);
        this.registerConverter(new ExternalizableConverter(this.mapper), -10);
        this.registerConverter(new NullConverter(), 10000);
        this.registerConverter(new IntConverter(), 0);
        this.registerConverter(new FloatConverter(), 0);
        this.registerConverter(new DoubleConverter(), 0);
        this.registerConverter(new LongConverter(), 0);
        this.registerConverter(new ShortConverter(), 0);
        this.registerConverter(new CharConverter(), 0);
        this.registerConverter(new BooleanConverter(), 0);
        this.registerConverter(new ByteConverter(), 0);
        this.registerConverter(new StringConverter(), 0);
        this.registerConverter(new StringBufferConverter(), 0);
        this.registerConverter(new DateConverter(), 0);
        this.registerConverter(new BitSetConverter(), 0);
        this.registerConverter(new URLConverter(), 0);
        this.registerConverter(new BigIntegerConverter(), 0);
        this.registerConverter(new BigDecimalConverter(), 0);
        this.registerConverter(new ArrayConverter(this.mapper), 0);
        this.registerConverter(new CharArrayConverter(), 0);
        this.registerConverter(new CollectionConverter(this.mapper), 0);
        this.registerConverter(new MapConverter(this.mapper), 0);
        this.registerConverter(new TreeMapConverter(this.mapper), 0);
        this.registerConverter(new TreeSetConverter(this.mapper), 0);
        this.registerConverter(new PropertiesConverter(), 0);
        this.registerConverter(new EncodedByteArrayConverter(), 0);
        this.registerConverter(new FileConverter(), 0);
        if (this.jvm.supportsSQL()) {
            this.registerConverter(new SqlTimestampConverter(), 0);
            this.registerConverter(new SqlTimeConverter(), 0);
            this.registerConverter(new SqlDateConverter(), 0);
        }
        this.registerConverter(new DynamicProxyConverter(this.mapper, this.classLoaderReference), 0);
        this.registerConverter(new JavaClassConverter(this.classLoaderReference), 0);
        this.registerConverter(new JavaMethodConverter(this.classLoaderReference), 0);
        if (this.jvm.supportsAWT()) {
            this.registerConverter(new FontConverter(), 0);
            this.registerConverter(new ColorConverter(), 0);
            this.registerConverter(new TextAttributeConverter(), 0);
        }
        this.registerConverter(new LocaleConverter(), 0);
        this.registerConverter(new GregorianCalendarConverter(), 0);
        if (this.jvm.loadClass("javax.security.auth.Subject") != null) {
            this.dynamicallyRegisterConverter("com.thoughtworks.xstream.converters.extended.SubjectConverter", 0, new Class[]{class$com$thoughtworks$xstream$mapper$Mapper == null ? (class$com$thoughtworks$xstream$mapper$Mapper = XStream.class$("com.thoughtworks.xstream.mapper.Mapper")) : class$com$thoughtworks$xstream$mapper$Mapper}, new Object[]{this.mapper});
        }
        if (JVM.is14()) {
            this.dynamicallyRegisterConverter("com.thoughtworks.xstream.converters.extended.ThrowableConverter", 0, new Class[]{class$com$thoughtworks$xstream$converters$Converter == null ? (class$com$thoughtworks$xstream$converters$Converter = XStream.class$("com.thoughtworks.xstream.converters.Converter")) : class$com$thoughtworks$xstream$converters$Converter}, new Object[]{reflectionConverter});
            this.dynamicallyRegisterConverter("com.thoughtworks.xstream.converters.extended.StackTraceElementConverter", 0, null, null);
            this.dynamicallyRegisterConverter("com.thoughtworks.xstream.converters.extended.CurrencyConverter", 0, null, null);
            this.dynamicallyRegisterConverter("com.thoughtworks.xstream.converters.extended.RegexPatternConverter", 0, new Class[]{class$com$thoughtworks$xstream$converters$Converter == null ? (class$com$thoughtworks$xstream$converters$Converter = XStream.class$("com.thoughtworks.xstream.converters.Converter")) : class$com$thoughtworks$xstream$converters$Converter}, new Object[]{reflectionConverter});
            this.dynamicallyRegisterConverter("com.thoughtworks.xstream.converters.extended.CharsetConverter", 0, null, null);
        }
        if (JVM.is15()) {
            this.dynamicallyRegisterConverter("com.thoughtworks.xstream.converters.enums.EnumConverter", 0, null, null);
            this.dynamicallyRegisterConverter("com.thoughtworks.xstream.converters.enums.EnumSetConverter", 0, new Class[]{class$com$thoughtworks$xstream$mapper$Mapper == null ? (class$com$thoughtworks$xstream$mapper$Mapper = XStream.class$("com.thoughtworks.xstream.mapper.Mapper")) : class$com$thoughtworks$xstream$mapper$Mapper}, new Object[]{this.mapper});
            this.dynamicallyRegisterConverter("com.thoughtworks.xstream.converters.enums.EnumMapConverter", 0, new Class[]{class$com$thoughtworks$xstream$mapper$Mapper == null ? (class$com$thoughtworks$xstream$mapper$Mapper = XStream.class$("com.thoughtworks.xstream.mapper.Mapper")) : class$com$thoughtworks$xstream$mapper$Mapper}, new Object[]{this.mapper});
        }
        if (this.jvm.loadClass("net.sf.cglib.proxy.Enhancer") != null) {
            this.dynamicallyRegisterConverter("com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter", 0, new Class[]{class$com$thoughtworks$xstream$mapper$Mapper == null ? (class$com$thoughtworks$xstream$mapper$Mapper = XStream.class$("com.thoughtworks.xstream.mapper.Mapper")) : class$com$thoughtworks$xstream$mapper$Mapper, class$com$thoughtworks$xstream$converters$reflection$ReflectionProvider == null ? (class$com$thoughtworks$xstream$converters$reflection$ReflectionProvider = XStream.class$("com.thoughtworks.xstream.converters.reflection.ReflectionProvider")) : class$com$thoughtworks$xstream$converters$reflection$ReflectionProvider}, new Object[]{this.mapper, this.reflectionProvider});
        }
        this.registerConverter(new SelfStreamingInstanceChecker(reflectionConverter, this), 0);
    }

    private void dynamicallyRegisterConverter(String className, int priority, Class[] constructorParamTypes, Object[] constructorParamValues) {
        try {
            Class<?> type = Class.forName(className, false, this.classLoaderReference.getReference());
            Constructor<?> constructor = type.getConstructor(constructorParamTypes);
            Object instance = constructor.newInstance(constructorParamValues);
            if (instance instanceof Converter) {
                this.registerConverter((Converter)instance, priority);
            } else if (instance instanceof SingleValueConverter) {
                this.registerConverter((SingleValueConverter)instance, priority);
            }
        }
        catch (Exception e) {
            throw new InitializationException("Could not instatiate converter : " + className, e);
        }
    }

    protected void setupImmutableTypes() {
        if (this.immutableTypesMapper == null) {
            return;
        }
        this.addImmutableType(Boolean.TYPE);
        this.addImmutableType(class$java$lang$Boolean == null ? (class$java$lang$Boolean = XStream.class$("java.lang.Boolean")) : class$java$lang$Boolean);
        this.addImmutableType(Byte.TYPE);
        this.addImmutableType(class$java$lang$Byte == null ? (class$java$lang$Byte = XStream.class$("java.lang.Byte")) : class$java$lang$Byte);
        this.addImmutableType(Character.TYPE);
        this.addImmutableType(class$java$lang$Character == null ? (class$java$lang$Character = XStream.class$("java.lang.Character")) : class$java$lang$Character);
        this.addImmutableType(Double.TYPE);
        this.addImmutableType(class$java$lang$Double == null ? (class$java$lang$Double = XStream.class$("java.lang.Double")) : class$java$lang$Double);
        this.addImmutableType(Float.TYPE);
        this.addImmutableType(class$java$lang$Float == null ? (class$java$lang$Float = XStream.class$("java.lang.Float")) : class$java$lang$Float);
        this.addImmutableType(Integer.TYPE);
        this.addImmutableType(class$java$lang$Integer == null ? (class$java$lang$Integer = XStream.class$("java.lang.Integer")) : class$java$lang$Integer);
        this.addImmutableType(Long.TYPE);
        this.addImmutableType(class$java$lang$Long == null ? (class$java$lang$Long = XStream.class$("java.lang.Long")) : class$java$lang$Long);
        this.addImmutableType(Short.TYPE);
        this.addImmutableType(class$java$lang$Short == null ? (class$java$lang$Short = XStream.class$("java.lang.Short")) : class$java$lang$Short);
        this.addImmutableType(class$com$thoughtworks$xstream$mapper$Mapper$Null == null ? (class$com$thoughtworks$xstream$mapper$Mapper$Null = XStream.class$("com.thoughtworks.xstream.mapper.Mapper$Null")) : class$com$thoughtworks$xstream$mapper$Mapper$Null);
        this.addImmutableType(class$java$math$BigDecimal == null ? (class$java$math$BigDecimal = XStream.class$("java.math.BigDecimal")) : class$java$math$BigDecimal);
        this.addImmutableType(class$java$math$BigInteger == null ? (class$java$math$BigInteger = XStream.class$("java.math.BigInteger")) : class$java$math$BigInteger);
        this.addImmutableType(class$java$lang$String == null ? (class$java$lang$String = XStream.class$("java.lang.String")) : class$java$lang$String);
        this.addImmutableType(class$java$net$URL == null ? (class$java$net$URL = XStream.class$("java.net.URL")) : class$java$net$URL);
        this.addImmutableType(class$java$io$File == null ? (class$java$io$File = XStream.class$("java.io.File")) : class$java$io$File);
        this.addImmutableType(class$java$lang$Class == null ? (class$java$lang$Class = XStream.class$("java.lang.Class")) : class$java$lang$Class);
        if (this.jvm.supportsAWT()) {
            this.addImmutableType(class$java$awt$font$TextAttribute == null ? (class$java$awt$font$TextAttribute = XStream.class$("java.awt.font.TextAttribute")) : class$java$awt$font$TextAttribute);
        }
        if (JVM.is14()) {
            Class type = this.jvm.loadClass("com.thoughtworks.xstream.converters.extended.CharsetConverter");
            this.addImmutableType(type);
        }
    }

    public void setMarshallingStrategy(MarshallingStrategy marshallingStrategy) {
        this.marshallingStrategy = marshallingStrategy;
    }

    public String toXML(Object obj) {
        StringWriter writer = new StringWriter();
        this.toXML(obj, writer);
        return ((Object)writer).toString();
    }

    public void toXML(Object obj, Writer out) {
        HierarchicalStreamWriter writer = this.hierarchicalStreamDriver.createWriter(out);
        this.marshal(obj, writer);
        writer.flush();
    }

    public void toXML(Object obj, OutputStream out) {
        HierarchicalStreamWriter writer = this.hierarchicalStreamDriver.createWriter(out);
        this.marshal(obj, writer);
        writer.flush();
    }

    public void marshal(Object obj, HierarchicalStreamWriter writer) {
        this.marshal(obj, writer, null);
    }

    public void marshal(Object obj, HierarchicalStreamWriter writer, DataHolder dataHolder) {
        this.marshallingStrategy.marshal(writer, obj, (ConverterLookup)this.converterLookup, this.mapper, dataHolder);
    }

    public Object fromXML(String xml) {
        return this.fromXML(new StringReader(xml));
    }

    public Object fromXML(Reader xml) {
        return this.unmarshal(this.hierarchicalStreamDriver.createReader(xml), null);
    }

    public Object fromXML(InputStream input) {
        return this.unmarshal(this.hierarchicalStreamDriver.createReader(input), null);
    }

    public Object fromXML(String xml, Object root) {
        return this.fromXML(new StringReader(xml), root);
    }

    public Object fromXML(Reader xml, Object root) {
        return this.unmarshal(this.hierarchicalStreamDriver.createReader(xml), root);
    }

    public Object fromXML(InputStream xml, Object root) {
        return this.unmarshal(this.hierarchicalStreamDriver.createReader(xml), root);
    }

    public Object unmarshal(HierarchicalStreamReader reader) {
        return this.unmarshal(reader, null, null);
    }

    public Object unmarshal(HierarchicalStreamReader reader, Object root) {
        return this.unmarshal(reader, root, null);
    }

    public Object unmarshal(HierarchicalStreamReader reader, Object root, DataHolder dataHolder) {
        return this.marshallingStrategy.unmarshal(root, reader, dataHolder, (ConverterLookup)this.converterLookup, this.mapper);
    }

    public void alias(String name, Class type) {
        if (this.classAliasingMapper == null) {
            throw new InitializationException("No " + (class$com$thoughtworks$xstream$mapper$ClassAliasingMapper == null ? (class$com$thoughtworks$xstream$mapper$ClassAliasingMapper = XStream.class$("com.thoughtworks.xstream.mapper.ClassAliasingMapper")) : class$com$thoughtworks$xstream$mapper$ClassAliasingMapper).getName() + " available");
        }
        this.classAliasingMapper.addClassAlias(name, type);
    }

    public void aliasType(String name, Class type) {
        if (this.classAliasingMapper == null) {
            throw new InitializationException("No " + (class$com$thoughtworks$xstream$mapper$ClassAliasingMapper == null ? (class$com$thoughtworks$xstream$mapper$ClassAliasingMapper = XStream.class$("com.thoughtworks.xstream.mapper.ClassAliasingMapper")) : class$com$thoughtworks$xstream$mapper$ClassAliasingMapper).getName() + " available");
        }
        this.classAliasingMapper.addTypeAlias(name, type);
    }

    public void alias(String name, Class type, Class defaultImplementation) {
        this.alias(name, type);
        this.addDefaultImplementation(defaultImplementation, type);
    }

    public void aliasField(String alias, Class type, String fieldName) {
        if (this.fieldAliasingMapper == null) {
            throw new InitializationException("No " + (class$com$thoughtworks$xstream$mapper$FieldAliasingMapper == null ? (class$com$thoughtworks$xstream$mapper$FieldAliasingMapper = XStream.class$("com.thoughtworks.xstream.mapper.FieldAliasingMapper")) : class$com$thoughtworks$xstream$mapper$FieldAliasingMapper).getName() + " available");
        }
        this.fieldAliasingMapper.addFieldAlias(alias, type, fieldName);
    }

    public void aliasAttribute(String alias, String attributeName) {
        if (this.attributeAliasingMapper == null) {
            throw new InitializationException("No " + (class$com$thoughtworks$xstream$mapper$AttributeAliasingMapper == null ? (class$com$thoughtworks$xstream$mapper$AttributeAliasingMapper = XStream.class$("com.thoughtworks.xstream.mapper.AttributeAliasingMapper")) : class$com$thoughtworks$xstream$mapper$AttributeAliasingMapper).getName() + " available");
        }
        this.attributeAliasingMapper.addAliasFor(attributeName, alias);
    }

    public void aliasAttribute(Class configurableClass, String attributeName, String alias) {
        if (this.attributeAliasingMapper == null) {
            throw new InitializationException("No " + (class$com$thoughtworks$xstream$mapper$AttributeAliasingMapper == null ? (class$com$thoughtworks$xstream$mapper$AttributeAliasingMapper = XStream.class$("com.thoughtworks.xstream.mapper.AttributeAliasingMapper")) : class$com$thoughtworks$xstream$mapper$AttributeAliasingMapper).getName() + " available");
        }
        this.attributeAliasingMapper.addAliasFor(configurableClass, attributeName, alias);
    }

    public void useAttributeFor(String fieldName, Class type) {
        if (this.attributeMapper == null) {
            throw new InitializationException("No " + (class$com$thoughtworks$xstream$mapper$AttributeMapper == null ? (class$com$thoughtworks$xstream$mapper$AttributeMapper = XStream.class$("com.thoughtworks.xstream.mapper.AttributeMapper")) : class$com$thoughtworks$xstream$mapper$AttributeMapper).getName() + " available");
        }
        this.attributeMapper.addAttributeFor(fieldName, type);
    }

    public void useAttributeFor(Class definedIn, String fieldName) {
        if (this.attributeMapper == null) {
            throw new InitializationException("No " + (class$com$thoughtworks$xstream$mapper$AttributeMapper == null ? (class$com$thoughtworks$xstream$mapper$AttributeMapper = XStream.class$("com.thoughtworks.xstream.mapper.AttributeMapper")) : class$com$thoughtworks$xstream$mapper$AttributeMapper).getName() + " available");
        }
        try {
            Field field = definedIn.getDeclaredField(fieldName);
            this.attributeMapper.addAttributeFor(field);
        }
        catch (SecurityException e) {
            throw new InitializationException("Unable to access field " + fieldName + "@" + definedIn.getName());
        }
        catch (NoSuchFieldException e) {
            throw new InitializationException("Unable to find field " + fieldName + "@" + definedIn.getName());
        }
    }

    public void useAttributeFor(Class type) {
        if (this.attributeMapper == null) {
            throw new InitializationException("No " + (class$com$thoughtworks$xstream$mapper$AttributeMapper == null ? (class$com$thoughtworks$xstream$mapper$AttributeMapper = XStream.class$("com.thoughtworks.xstream.mapper.AttributeMapper")) : class$com$thoughtworks$xstream$mapper$AttributeMapper).getName() + " available");
        }
        this.attributeMapper.addAttributeFor(type);
    }

    public void addDefaultImplementation(Class defaultImplementation, Class ofType) {
        if (this.defaultImplementationsMapper == null) {
            throw new InitializationException("No " + (class$com$thoughtworks$xstream$mapper$DefaultImplementationsMapper == null ? (class$com$thoughtworks$xstream$mapper$DefaultImplementationsMapper = XStream.class$("com.thoughtworks.xstream.mapper.DefaultImplementationsMapper")) : class$com$thoughtworks$xstream$mapper$DefaultImplementationsMapper).getName() + " available");
        }
        this.defaultImplementationsMapper.addDefaultImplementation(defaultImplementation, ofType);
    }

    public void addImmutableType(Class type) {
        if (this.immutableTypesMapper == null) {
            throw new InitializationException("No " + (class$com$thoughtworks$xstream$mapper$ImmutableTypesMapper == null ? (class$com$thoughtworks$xstream$mapper$ImmutableTypesMapper = XStream.class$("com.thoughtworks.xstream.mapper.ImmutableTypesMapper")) : class$com$thoughtworks$xstream$mapper$ImmutableTypesMapper).getName() + " available");
        }
        this.immutableTypesMapper.addImmutableType(type);
    }

    public void registerConverter(Converter converter) {
        this.registerConverter(converter, 0);
    }

    public void registerConverter(Converter converter, int priority) {
        this.converterLookup.registerConverter(converter, priority);
    }

    public void registerConverter(SingleValueConverter converter) {
        this.registerConverter(converter, 0);
    }

    public void registerConverter(SingleValueConverter converter, int priority) {
        this.converterLookup.registerConverter(new SingleValueConverterWrapper(converter), priority);
    }

    public ClassMapper getClassMapper() {
        if (this.mapper instanceof ClassMapper) {
            return (ClassMapper)this.mapper;
        }
        return (ClassMapper)Proxy.newProxyInstance(this.getClassLoader(), new Class[]{class$com$thoughtworks$xstream$alias$ClassMapper == null ? (class$com$thoughtworks$xstream$alias$ClassMapper = XStream.class$("com.thoughtworks.xstream.alias.ClassMapper")) : class$com$thoughtworks$xstream$alias$ClassMapper}, new InvocationHandler(this){
            private final /* synthetic */ XStream this$0;
            {
                this.this$0 = xStream;
            }

            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return method.invoke(XStream.access$000(this.this$0), args);
            }
        });
    }

    public Mapper getMapper() {
        return this.mapper;
    }

    public ReflectionProvider getReflectionProvider() {
        return this.reflectionProvider;
    }

    public ConverterLookup getConverterLookup() {
        return this.converterLookup;
    }

    public void setMode(int mode) {
        switch (mode) {
            case 1001: {
                this.setMarshallingStrategy(new TreeMarshallingStrategy());
                break;
            }
            case 1002: {
                this.setMarshallingStrategy(new ReferenceByIdMarshallingStrategy());
                break;
            }
            case 1003: {
                this.setMarshallingStrategy(new ReferenceByXPathMarshallingStrategy(ReferenceByXPathMarshallingStrategy.RELATIVE));
                break;
            }
            case 1004: {
                this.setMarshallingStrategy(new ReferenceByXPathMarshallingStrategy(ReferenceByXPathMarshallingStrategy.ABSOLUTE));
                break;
            }
            default: {
                throw new IllegalArgumentException("Unknown mode : " + mode);
            }
        }
    }

    public void addImplicitCollection(Class ownerType, String fieldName) {
        if (this.implicitCollectionMapper == null) {
            throw new InitializationException("No " + (class$com$thoughtworks$xstream$mapper$ImplicitCollectionMapper == null ? (class$com$thoughtworks$xstream$mapper$ImplicitCollectionMapper = XStream.class$("com.thoughtworks.xstream.mapper.ImplicitCollectionMapper")) : class$com$thoughtworks$xstream$mapper$ImplicitCollectionMapper).getName() + " available");
        }
        this.implicitCollectionMapper.add(ownerType, fieldName, null, class$java$lang$Object == null ? (class$java$lang$Object = XStream.class$("java.lang.Object")) : class$java$lang$Object);
    }

    public void addImplicitCollection(Class ownerType, String fieldName, Class itemType) {
        if (this.implicitCollectionMapper == null) {
            throw new InitializationException("No " + (class$com$thoughtworks$xstream$mapper$ImplicitCollectionMapper == null ? (class$com$thoughtworks$xstream$mapper$ImplicitCollectionMapper = XStream.class$("com.thoughtworks.xstream.mapper.ImplicitCollectionMapper")) : class$com$thoughtworks$xstream$mapper$ImplicitCollectionMapper).getName() + " available");
        }
        this.implicitCollectionMapper.add(ownerType, fieldName, null, itemType);
    }

    public void addImplicitCollection(Class ownerType, String fieldName, String itemFieldName, Class itemType) {
        if (this.implicitCollectionMapper == null) {
            throw new InitializationException("No " + (class$com$thoughtworks$xstream$mapper$ImplicitCollectionMapper == null ? (class$com$thoughtworks$xstream$mapper$ImplicitCollectionMapper = XStream.class$("com.thoughtworks.xstream.mapper.ImplicitCollectionMapper")) : class$com$thoughtworks$xstream$mapper$ImplicitCollectionMapper).getName() + " available");
        }
        this.implicitCollectionMapper.add(ownerType, fieldName, itemFieldName, itemType);
    }

    public DataHolder newDataHolder() {
        return new MapBackedDataHolder();
    }

    public ObjectOutputStream createObjectOutputStream(Writer writer) throws IOException {
        return this.createObjectOutputStream(new PrettyPrintWriter(writer), "object-stream");
    }

    public ObjectOutputStream createObjectOutputStream(HierarchicalStreamWriter writer) throws IOException {
        return this.createObjectOutputStream(writer, "object-stream");
    }

    public ObjectOutputStream createObjectOutputStream(Writer writer, String rootNodeName) throws IOException {
        return this.createObjectOutputStream(new PrettyPrintWriter(writer), rootNodeName);
    }

    public ObjectOutputStream createObjectOutputStream(HierarchicalStreamWriter writer, String rootNodeName) throws IOException {
        StatefulWriter statefulWriter = new StatefulWriter(writer);
        statefulWriter.startNode(rootNodeName, null);
        return new CustomObjectOutputStream(new CustomObjectOutputStream.StreamCallback(this, statefulWriter){
            private final /* synthetic */ StatefulWriter val$statefulWriter;
            private final /* synthetic */ XStream this$0;
            {
                this.this$0 = xStream;
                this.val$statefulWriter = statefulWriter;
            }

            public void writeToStream(Object object) {
                this.this$0.marshal(object, this.val$statefulWriter);
            }

            public void writeFieldsToStream(Map fields) throws NotActiveException {
                throw new NotActiveException("not in call to writeObject");
            }

            public void defaultWriteObject() throws NotActiveException {
                throw new NotActiveException("not in call to writeObject");
            }

            public void flush() {
                this.val$statefulWriter.flush();
            }

            public void close() {
                if (this.val$statefulWriter.state() != StatefulWriter.STATE_CLOSED) {
                    this.val$statefulWriter.endNode();
                    this.val$statefulWriter.close();
                }
            }
        });
    }

    public ObjectInputStream createObjectInputStream(Reader xmlReader) throws IOException {
        return this.createObjectInputStream(this.hierarchicalStreamDriver.createReader(xmlReader));
    }

    public ObjectInputStream createObjectInputStream(HierarchicalStreamReader reader) throws IOException {
        return new CustomObjectInputStream(new CustomObjectInputStream.StreamCallback(this, reader){
            private final /* synthetic */ HierarchicalStreamReader val$reader;
            private final /* synthetic */ XStream this$0;
            {
                this.this$0 = xStream;
                this.val$reader = hierarchicalStreamReader;
            }

            public Object readFromStream() throws EOFException {
                if (!this.val$reader.hasMoreChildren()) {
                    throw new EOFException();
                }
                this.val$reader.moveDown();
                Object result = this.this$0.unmarshal(this.val$reader);
                this.val$reader.moveUp();
                return result;
            }

            public Map readFieldsFromStream() throws IOException {
                throw new NotActiveException("not in call to readObject");
            }

            public void defaultReadObject() throws NotActiveException {
                throw new NotActiveException("not in call to readObject");
            }

            public void registerValidation(ObjectInputValidation validation, int priority) throws NotActiveException {
                throw new NotActiveException("stream inactive");
            }

            public void close() {
                this.val$reader.close();
            }
        });
    }

    public void setClassLoader(ClassLoader classLoader) {
        this.classLoaderReference.setReference(classLoader);
    }

    public ClassLoader getClassLoader() {
        return this.classLoaderReference.getReference();
    }

    public void omitField(Class type, String fieldName) {
        if (this.fieldAliasingMapper == null) {
            throw new InitializationException("No " + (class$com$thoughtworks$xstream$mapper$FieldAliasingMapper == null ? (class$com$thoughtworks$xstream$mapper$FieldAliasingMapper = XStream.class$("com.thoughtworks.xstream.mapper.FieldAliasingMapper")) : class$com$thoughtworks$xstream$mapper$FieldAliasingMapper).getName() + " available");
        }
        this.fieldAliasingMapper.omitField(type, fieldName);
    }

    private Object readResolve() {
        this.jvm = new JVM();
        return this;
    }

    static /* synthetic */ Class class$(String x0) {
        try {
            return Class.forName(x0);
        }
        catch (ClassNotFoundException x1) {
            throw new NoClassDefFoundError(x1.getMessage());
        }
    }

    static /* synthetic */ Mapper access$000(XStream x0) {
        return x0.mapper;
    }
}

