package controllers;

import models.SupportRequest;

import play.mvc.Controller;
import play.mvc.Result;
//import play.mvc.Security;
//import views.html.dashboard.index;

import play.data.Form;

import play.db.ebean.Model;
import java.util.List;
import static play.libs.Json.toJson;
import static play.data.Form.form;

import views.html.newSupportRequest;

// for mail:
import org.apache.commons.mail.*;
import models.Technician;

/**
 * @author timhdavis
 * @since 10/23/2016
 */

public class SupportRequestController extends Controller 
{

    public Result index()
    {
        //return ok(index.render(User.findByEmail(request().username())));
        return redirect(routes.Application.index());
    }
    
    public Result addSupportRequest()
    {
        SupportRequest supportRequest = Form.form(SupportRequest.class).bindFromRequest().get();
        
        supportRequest.save();
        
        // Automatically send email to relevant technicians as soon as support request is created:
        
        try
        {
            Email email = new SimpleEmail();
            email.setHostName("smtp.googlemail.com");
            email.setSmtpPort(465);
            
            String accountEmail = "callminutetech@gmail.com";
            String accountPassword = "Printerugh!1";
            
            email.setAuthenticator(new DefaultAuthenticator(accountEmail, accountPassword));
            email.setSSLOnConnect(true);
            email.setFrom(accountEmail);
            
            // Email Title:
            
            email.setSubject("Support Request Added");
            
            // Write email message:
            
            String subjectText = "A support request has been added:\n";
            subjectText += "\t Support Request Title: " + supportRequest.title + "\n";
            subjectText += "\t Issue: \n" + "\t" + supportRequest.body + "\n";
            subjectText += "\t Difficulty Level: " + supportRequest.difficulty + "\n";
            
            email.setMsg(subjectText);
            
            // Send to all relevant technicians:
            
            List<Technician> technicians = new Model.Finder(String.class, Technician.class).all();
            
            // For each technician, send to any whose tier rank is >= the difficulty of the request:
            for (Technician technician : technicians)
            {
                if (technician.tier >= supportRequest.difficulty)
                {
                    email.addTo(technician.email);
                }
            }
            
            email.send();
        }
        catch (Exception e)
        {
            // TODO: something...
        }
        
        return redirect(routes.Application.index());
    }
    
    
    public Result getSupportRequests()
    {
        List<SupportRequest> supportRequests = new Model.Finder(String.class, SupportRequest.class).all();
        
        return ok(toJson(supportRequests));
    }
    
    
    public Result create()
    {
        //
        Form<SupportRequest> newSupportRequestForm = form(SupportRequest.class);
        return ok(newSupportRequest.render(newSupportRequestForm));
    }
}