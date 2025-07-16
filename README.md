- mvn generate-sources
- ls ./out/src/gen/java/net/maxgigapop/mrs/model

Useful commands:

# list generators.
- java -jar /Users/AEssiari/ESNET/OPENAPI/openapi-generator-cli.jar help 
- java -jar /Users/AEssiari/ESNET/OPENAPI/openapi-generator-cli.jar list

# validate.
- java -jar /Users/AEssiari/ESNET/OPENAPI/openapi-generator-cli.jar validate -i StackV-web/src//main/webapp/api/openapi.yaml 

HTML
- java -jar /Users/AEssiari/ESNET/OPENAPI/openapi-generator-cli.jar generate -g html  -i openapi-stackv-webapp-api-valid.yaml -o HTML

MARKDOWN 
- java -jar /Users/AEssiari/ESNET/OPENAPI/openapi-generator-cli.jar generate -g markdown  -i openapi-stackv-webapp-api-valid.yaml -o MDOWN

JAXRS-SPEC:
- java -jar /Users/AEssiari/ESNET/OPENAPI/openapi-generator-cli.jar config-help -g jaxrs-spec
