/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.persistence.Entity;
import play.db.jpa.Model;
/**
 *
 * @author juacompe
 */
@Entity
public class Deal extends Model {

    public String title;
    public double price;
    
    Deal(String title, double price) {
        this.title = title;
        this.price = price;
    }
    
}
