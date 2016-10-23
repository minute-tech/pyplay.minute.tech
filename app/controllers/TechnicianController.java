package controllers;

import models.Technician;

import play.mvc.Controller;
import play.mvc.Result;
//import play.mvc.Security;
//import views.html.dashboard.index;

import play.data.Form;

import play.db.ebean.Model;
import java.util.List;
import static play.libs.Json.toJson;

public class TechnicianController extends Controller 
{

    public Result index()
    {
        //return ok(index.render(User.findByEmail(request().username())));
        return redirect(routes.Application.index());
    }
    
    public Result addTechnician()
    {
        Technician technician = Form.form(Technician.class).bindFromRequest().get();
        
        technician.save();
        
        return redirect(routes.Application.index());
    }
    
    
    public Result getTechnicians()
    {
        List<Technician> technicians = new Model.Finder(String.class, Technician.class).all();
        
        return ok(toJson(technicians));
    }
}