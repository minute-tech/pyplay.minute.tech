
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/timhdavis/GitHub/Play! framework/PlayStartApp/conf/routes
// @DATE:Sun Oct 23 10:48:34 PDT 2016

package controllers.account;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.account.ReverseSignup Signup = new controllers.account.ReverseSignup(RoutesPrefix.byNamePrefix());
  public static final controllers.account.ReverseReset Reset = new controllers.account.ReverseReset(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.account.javascript.ReverseSignup Signup = new controllers.account.javascript.ReverseSignup(RoutesPrefix.byNamePrefix());
    public static final controllers.account.javascript.ReverseReset Reset = new controllers.account.javascript.ReverseReset(RoutesPrefix.byNamePrefix());
  }

}
