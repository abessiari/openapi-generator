package net.maxgigapop.mrs.api.factories;

import net.maxgigapop.mrs.api.MetaApiService;
import net.maxgigapop.mrs.api.impl.MetaApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2025-07-10T09:14:01.648708-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public class MetaApiServiceFactory {
    private static final MetaApiService service = new MetaApiServiceImpl();

    public static MetaApiService getMetaApi() {
        return service;
    }
}
