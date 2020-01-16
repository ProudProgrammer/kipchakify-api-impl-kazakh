package org.gaborbalazs.kazakhify;

import org.gaborbalazs.kipchakify.KipchakifyService;
import org.gaborbalazs.kipchakify.KipchakifyServiceFactory;

public class KazakhifyServiceFactory implements KipchakifyServiceFactory {

    @Override
    public KipchakifyService createKipchakifyService() {
        return new KazakhifyService();
    }
}
