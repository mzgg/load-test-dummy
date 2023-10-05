package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public class GreetingResource {

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    @GET
    @Path("/customer")
    @Produces(MediaType.APPLICATION_JSON)
    public String getcustomer() {
        return "{\n" +
                "    \"id\": \"test\",\n" +
                "    \"name\": \"User_2205 O'Realm_0\",\n" +
                "    \"walletId\": \"0x0d4a2a2test555519c7a74fa11692\",\n" +
                "    \"balance\": {\n" +
                "        \"avaxBalance\": {\n" +
                "            \"totalAmount\": \"0\",\n" +
                "            \"availableAmount\": \"0\",\n" +
                "            \"reservedAmount\": \"0\",\n" +
                "            \"quarantinedAmount\": \"0\"\n" +
                "        },\n" +
                "        \"balance\": {\n" +
                "            \"totalAmount\": \"0\",\n" +
                "            \"availableAmount\": \"0\",\n" +
                "            \"reservedAmount\": \"0\",\n" +
                "            \"quarantinedAmount\": \"0\"\n" +
                "        }\n" +
                "    },\n" +
                "    \"affiliate\": false,\n" +
                "    \"showWhitelisting\": true,\n" +
                "    \"showConditions\": true,\n" +
                "    \"creationDate\": \"2023-08-10T08:02:08.359Z\",\n" +
                "    \"modificationDate\": \"2023-08-10T08:42:49.333Z\",\n" +
                "    \"kycVerificationLevel\": \"UNSPECIFIED\",\n" +
                "    \"kycExpirationDate\": \"2023-08-20T08:02:08.243Z\",\n" +
                "    \"locale\": \"TR\",\n" +
                "    \"whitelisting\": \"NOT_WHITELISTED\",\n" +
                "    \"customerBalance\": {\n" +
                "        \"accountId\": \"c35a5405-testf3d7cfe04\",\n" +
                "        \"tokenBalances\": [\n" +
                "            {\n" +
                "                \"amount\": 0,\n" +
                "                \"name\": \"Avalanche\",\n" +
                "                \"symbol\": \"AVAX\",\n" +
                "                \"address\": \"0x0000000000000000000000000000000000000000\",\n" +
                "                \"date\": \"2023-08-10T10:45:18.344Z\"\n" +
                "            }\n" +
                "        ]\n" +
                "    }\n" +
                "}";
    }
}
