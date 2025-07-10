package net.maxgigapop.mrs.api;

import io.swagger.jaxrs.config.SwaggerContextService;
import io.swagger.models.*;

import io.swagger.models.auth.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

public class Bootstrap extends HttpServlet {
  @Override
  public void init(ServletConfig config) throws ServletException {
    Info info = new Info()
      .title("OpenAPI Server")
      .description("Documentation for the client-accessible endpoints of the StackV orchestrator.")
      .termsOfService("")
      .contact(new Contact()
        .email("alberto.est.jimenez@gmail.com"))
      .license(new License()
        .name("")
        .url("http://unlicense.org"));

    ServletContext context = config.getServletContext();
    Swagger swagger = new Swagger().info(info);

    new SwaggerContextService().withServletConfig(config).updateSwagger(swagger);
  }
}
