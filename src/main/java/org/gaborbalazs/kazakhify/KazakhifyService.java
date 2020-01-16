package org.gaborbalazs.kazakhify;

import org.gaborbalazs.kipchakify.KipchakifyException;
import org.gaborbalazs.kipchakify.KipchakifyService;

public class KazakhifyService implements KipchakifyService {

    @Override
    public String kipchakify(String s) throws KipchakifyException {
        if (s == null || s.length() < 1) {
            throw new KipchakifyException("Cön nöt köpchököfy!");
        }
        return s.replaceAll("[aáeéiíoóőuúüű]", "ö").replaceAll("[AÁEÉIÍOÓŐUÚÜŰ]", "Ö");
    }
}
