package org.gaborbalazs.kipchakify;

public class Kazakhify implements Kipchakify {

    @Override
    public String kipchakify(String s) throws KipchakifyException {
        if (s == null || s.length() < 1) {
            throw new KipchakifyException("Cön nöt köpchököfy!");
        }
        return s.replaceAll("[aáeéiíoóőuúüű]", "ö").replaceAll("[AÁEÉIÍOÓŐUÚÜŰ]", "Ö");
    }
}
