package com.restful.booker.crudtest;

import com.restful.booker.model.BookingPojo;
import com.restful.booker.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class UserBookingPatchTest extends TestBase {

    @Test
    public void patchRecord() {
        BookingPojo bookingpojo = new BookingPojo();
        bookingpojo.setFirstName("Prime");
        bookingpojo.setLastName("Testing");
        bookingpojo.setTotalprice(111);
        bookingpojo.setDepositpaid(true);
        bookingpojo.getBookingdates();


       /* Response response = given()
                .basePath("/booking")
                .pathParam("price", 111)
                .when()
                .patch("/{price},110");
        response.then().statusCode(200);
        response.prettyPrint();*/
    }

    }
