package tests.api;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.classic.methods.HttpUriRequest;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.http.HttpStatus;
import org.openqa.selenium.remote.http.HttpResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HttpClientTest {
    @Test
    public void simpleApiTest() {
        String result = "https://regres.in";
        // Create Object and pass the url
        HttpUriRequest request = new HttpGet();
        // send the request
        HttpResponse httpResponse = HttpClientBuilder
                .create()
                .build()
                .execute(request);

        Assert.assertEquals(httpResponse.getStatus().getStatusCode(), HttpStatus.SC_OK);

        System.out.println();
    }
}
