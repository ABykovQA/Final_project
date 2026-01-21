package api;

import io.restassured.response.Response;
import stepdefinitions.BaseHttpClient;

import java.util.Map;

public class UserAPI extends BaseHttpClient {

    public final String createUser = "api/signup";

    public Response createrUser(Map<String, String> user){
        Response response = doPostRequest(createUser, user);
        return response;
    }


}
