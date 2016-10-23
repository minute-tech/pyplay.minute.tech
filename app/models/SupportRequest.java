package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.Model;

/**
 * @author timhdavis
 * @since 10/22/2016
 */
 
@Entity
public class SupportRequest extends Model
{
    @Id
    public Long id;
    
    public String title;
    public String body;
    public int difficulty;
}