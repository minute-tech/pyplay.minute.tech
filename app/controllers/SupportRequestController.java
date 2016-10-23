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
}