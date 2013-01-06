/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import org.junit.Test;
import play.test.UnitTest;

/**
 *
 * @author juacompe
 */
public class TestDeal extends UnitTest {
    
    @Test
    public void createNewKoreanTourDeal() {
        String title = "Korean tour";
        double price = 80000;
        Deal deal = new Deal(title, price);
        assertEquals(title, deal.title);
        assertEquals(price, deal.price, 0);
    }
    
    @Test
    public void createNewSpaDeal() {
        String title = "Aurora Spa";
        double price = 3000;
        Deal deal = new Deal(title, price);
        assertEquals(title, deal.title);
        assertEquals(price, deal.price, 0);
    }

    @Test 
    public void saveAndRetrieveDeal() {
        String title = "Korean tour";
        double price = 80000;
        Deal deal = new Deal(title, price);
        deal.save();
        
        Deal d = Deal.findById(deal.id);
        assertEquals(title, d.title);
        assertEquals(price, d.price, 0);
    }

}
