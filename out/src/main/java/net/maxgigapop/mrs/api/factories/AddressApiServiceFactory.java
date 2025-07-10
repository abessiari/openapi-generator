package net.maxgigapop.mrs.api.factories;

import net.maxgigapop.mrs.api.AddressApiService;
import net.maxgigapop.mrs.api.impl.AddressApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2025-07-10T09:14:01.648708-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public class AddressApiServiceFactory {
    private static final AddressApiService service = new AddressApiServiceImpl();

    public static AddressApiService getAddressApi() {
        return service;
    }
}
