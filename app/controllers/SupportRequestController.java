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