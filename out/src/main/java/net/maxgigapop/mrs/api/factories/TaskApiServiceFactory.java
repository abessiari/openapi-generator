package net.maxgigapop.mrs.api.factories;

import net.maxgigapop.mrs.api.TaskApiService;
import net.maxgigapop.mrs.api.impl.TaskApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2025-07-10T09:14:01.648708-07:00[America/Los_Angeles]", comments = "Generator version: 7.14.0")
public class TaskApiServiceFactory {
    private static final TaskApiService service = new TaskApiServiceImpl();

    public static TaskApiService getTaskApi() {
        return service;
    }
}
