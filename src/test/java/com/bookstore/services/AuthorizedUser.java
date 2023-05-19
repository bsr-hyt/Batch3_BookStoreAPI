package com.bookstore.services;

import com.bookstore.utilities.Globals;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Assert;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

public class AuthorizedUser extends Globals {

    public void authorizeUser(){

        Map<String,String> map = new HashMap<>();
        map.put("userName",userName);
        map.put("password",password);

        response = RestAssured
                .given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .body(map)
                .when().log().all()
                .post("/Account/v1/Authorized")
                .prettyPeek();
    }

    public void validateThatUserIsAuthorized(){
        Assert.assertEquals(response.statusCode(),200);
        Assert.assertEquals(response.asString(),"true");
    }

}
