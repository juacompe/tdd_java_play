/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package funtional;

import org.junit.Test;
import play.mvc.Http.Response;
import play.test.FunctionalTest;

/**
 *
 * @author juacompe
 */
public class TestGetDealDetails extends FunctionalTest {
    @Test
    public void testGetDetailDetails() {
        Response response = GET("/deal/1");
        assertIsOk(response);
        assertContentType("text/html", response);
    }
}
