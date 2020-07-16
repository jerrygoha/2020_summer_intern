package com.o2o.action.server.app;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class dateCall {

    private Date now;
    private String[] date = new String[68];
    private String[] t1 = new String[68];
    private String[] gen = new String[68];
    private String[] drx = new String[68];
    private String[] dwg = new String[68];
    private String[] kt = new String[68];
    private String[] af = new String[68];
    private String[] sp = new String[68];
    private String[] hle = new String[68];
    private String[] dyn = new String[68];
    private String[] sb = new String[68];
    private String strr = "[\n" +
            "   {\n" +
            "      \"DATE\":20200617,\n" +
            "      \"T1\":2,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":2,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":1,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":1\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200618,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":1,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":2,\n" +
            "      \"HLE\":2,\n" +
            "      \"DYN\":1,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200619,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":2,\n" +
            "      \"DRX\":2,\n" +
            "      \"DWG\":1,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":1\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200620,\n" +
            "      \"T1\":2,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":2,\n" +
            "      \"DWG\":1,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":1\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200621,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":1,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":2,\n" +
            "      \"KT\":1,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":2,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200622,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200623,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200624,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":2,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":1,\n" +
            "      \"HLE\":2,\n" +
            "      \"DYN\":1,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200625,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":2,\n" +
            "      \"DRX\":1,\n" +
            "      \"DWG\":2,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":1\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200626,\n" +
            "      \"T1\":1,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":1,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":2,\n" +
            "      \"DYN\":2,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200627,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":1,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":2,\n" +
            "      \"KT\":2,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":1,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200628,\n" +
            "      \"T1\":2,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":1,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":1,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":2\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200629,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200630,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200701,\n" +
            "      \"T1\":1,\n" +
            "      \"GEN\":2,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":1,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":2\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200702,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":2,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":1,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":1,\n" +
            "      \"DYN\":2,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200703,\n" +
            "      \"T1\":2,\n" +
            "      \"GEN\":2,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":1,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":1,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200704,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":1,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":1,\n" +
            "      \"DYN\":2,\n" +
            "      \"SB\":2\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200705,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":1,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":2,\n" +
            "      \"AF\":2,\n" +
            "      \"SP\":1,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200706,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200707,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200708,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":1,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":1,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":2,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":2\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200709,\n" +
            "      \"T1\":1,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":2,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":2,\n" +
            "      \"SP\":1,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200710,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":1,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":2,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":1,\n" +
            "      \"SB\":2\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200711,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":1,\n" +
            "      \"DWG\":1,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":2,\n" +
            "      \"SP\":2,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200712,\n" +
            "      \"T1\":1,\n" +
            "      \"GEN\":2,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":2,\n" +
            "      \"DYN\":1,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200713,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200714,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200715,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":1,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":2,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":1,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":2,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200716,\n" +
            "      \"T1\":1,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":1,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":2,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":2\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200717,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":1,\n" +
            "      \"DWG\":2,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":2,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":1,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200718,\n" +
            "      \"T1\":2,\n" +
            "      \"GEN\":2,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":1,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":1\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200719,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":2,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":1,\n" +
            "      \"HLE\":1,\n" +
            "      \"DYN\":2,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200720,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200721,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200722,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200723,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":2,\n" +
            "      \"DRX\":1,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":1,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":2,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200724,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":1,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":2,\n" +
            "      \"SP\":2,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":1\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200725,\n" +
            "      \"T1\":1,\n" +
            "      \"GEN\":2,\n" +
            "      \"DRX\":2,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":1,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200726,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":2,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":1,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":2,\n" +
            "      \"SB\":1\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200727,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200728,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200729,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200730,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":2,\n" +
            "      \"DWG\":2,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":1,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":1,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200731,\n" +
            "      \"T1\":1,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":1,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":2,\n" +
            "      \"SB\":2\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200801,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":1,\n" +
            "      \"DRX\":2,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":2,\n" +
            "      \"SP\":1,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200802,\n" +
            "      \"T1\":2,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":1,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":1,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":2\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200803,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200804,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200805,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200806,\n" +
            "      \"T1\":2,\n" +
            "      \"GEN\":1,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":1,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":2,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200807,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":2,\n" +
            "      \"AF\":1,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":2,\n" +
            "      \"DYN\":1,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200808,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":1,\n" +
            "      \"DWG\":2,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":2,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":1\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200809,\n" +
            "      \"T1\":1,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":1,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200810,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200811,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200812,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200813,\n" +
            "      \"T1\":2,\n" +
            "      \"GEN\":1,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":2,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":1\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200814,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":2,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":1,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":1,\n" +
            "      \"HLE\":2,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200815,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":1,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":2,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":1,\n" +
            "      \"SB\":2\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200816,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":1,\n" +
            "      \"DRX\":2,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":2,\n" +
            "      \"HLE\":1,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200817,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200818,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200819,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200820,\n" +
            "      \"T1\":1,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":1,\n" +
            "      \"KT\":2,\n" +
            "      \"AF\":2,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200821,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":2,\n" +
            "      \"HLE\":1,\n" +
            "      \"DYN\":2,\n" +
            "      \"SB\":1\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200822,\n" +
            "      \"T1\":0,\n" +
            "      \"GEN\":1,\n" +
            "      \"DRX\":0,\n" +
            "      \"DWG\":2,\n" +
            "      \"KT\":2,\n" +
            "      \"AF\":1,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":0,\n" +
            "      \"DYN\":0,\n" +
            "      \"SB\":0\n" +
            "   },\n" +
            "   {\n" +
            "      \"DATE\":20200823,\n" +
            "      \"T1\":1,\n" +
            "      \"GEN\":0,\n" +
            "      \"DRX\":1,\n" +
            "      \"DWG\":0,\n" +
            "      \"KT\":0,\n" +
            "      \"AF\":0,\n" +
            "      \"SP\":0,\n" +
            "      \"HLE\":2,\n" +
            "      \"DYN\":2,\n" +
            "      \"SB\":0\n" +
            "   }\n" +
            "]";
    public dateCall(Date current) {
        this.now = current;
    }

    public String calcDate() {
        
        String result = null;


        //현재 날짜 저장
        try {
            SimpleDateFormat nowTime = new SimpleDateFormat("yyyyMMdd");
            Date current = new Date();
            String currentDateSt = nowTime.format(now);

            Date inputDate = nowTime.parse(currentDateSt);

            //날짜 비교
            int diffday;
            int compare = current.compareTo(inputDate);
            if (compare < 0) { //미래
                diffday = (int) ((inputDate.getTime() - current.getTime()) / (24 * 60 * 60 * 1000));

                if (diffday > 5) {
                    if (diffday > 26) {
                        result = "nextmonth";
                    }
                    result = "nextweek";
                }else{
                    result = "tomorrow" + diffday;
                }

            } else if (compare > 0) { //과거
                diffday = (int) ((current.getTime() - inputDate.getTime()) / (24 * 60 * 60 * 1000));

                if (diffday < -5) {
                    if (diffday < -26) {
                        result = "lastmonth";
                    }
                    result =  "lastweek";
                }else{
                    result =  "yesterday" + diffday;
                }

            } else { //오늘
                result =  "today";
            }
        }catch (ParseException ignored){

        }
        return result;
    }

    public void serch(){

        JsonParser jsonParser = new JsonParser();
        JsonArray jsonArray = (JsonArray) jsonParser.parse(strr);

        for (int i = 0; i < jsonArray.size(); i++) {
            JsonObject object = (JsonObject) jsonArray.get(i);
            date[i] = object.get("DATE").getAsString();
            t1[i] = object.get("T1").getAsString();
            gen[i] = object.get("GEN").getAsString();
            drx[i] = object.get("DRX").getAsString();
            dwg[i] = object.get("DWG").getAsString();
            kt[i] = object.get("KT").getAsString();
            af[i] = object.get("AF").getAsString();
            sp[i] = object.get("SP").getAsString();
            hle[i] = object.get("HLE").getAsString();
            dyn[i] = object.get("DYN").getAsString();
            sb[i] = object.get("SB").getAsString();
        }
//        String[] teamName = new String[9];
//        for(int row = 0; row < 9; row++){
//            JsonObject object = (JsonObject) jsonArray.get(1);
//            Set key = object.keySet();
//            teamName[0] = object.get()
//        }
        String[] teamName = new String[9];


        int[][] schedule = new int[10][jsonArray.size()]; //[row][column]

        for(int row = 0; row < 10; row++ ){
            for(int column = 0; column < jsonArray.size(); column++){
                JsonObject object = (JsonObject) jsonArray.get(column);
                //schedule[row][column] = object.get()

            }
        }

    }


}
