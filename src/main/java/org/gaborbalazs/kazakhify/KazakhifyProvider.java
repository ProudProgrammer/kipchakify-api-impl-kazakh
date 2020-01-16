package org.gaborbalazs.kazakhify;

import org.gaborbalazs.kipchakify.KipchakifyProvider;
import org.gaborbalazs.kipchakify.KipchakifyServiceFactory;

public class KazakhifyProvider implements KipchakifyProvider {

    @Override
    public KipchakifyServiceFactory createKipchakifyServiceFactory() {
        return new KazakhifyServiceFactory();
    }
}
