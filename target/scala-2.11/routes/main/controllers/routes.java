
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/timhdavis/GitHub/Play! framework/PlayStartApp/conf/routes
// @DATE:Sun Oct 23 16:24:21 PDT 2016

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseTechnicianController TechnicianController = new controllers.ReverseTechnicianController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseSupportRequestController SupportRequestController = new controllers.ReverseSupportRequestController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseDashboard Dashboard = new controllers.ReverseDashboard(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseTechnicianController TechnicianController = new controllers.javascript.ReverseTechnicianController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseSupportRequestController SupportRequestController = new controllers.javascript.ReverseSupportRequestController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseDashboard Dashboard = new controllers.javascript.ReverseDashboard(RoutesPrefix.byNamePrefix());
  }

}
