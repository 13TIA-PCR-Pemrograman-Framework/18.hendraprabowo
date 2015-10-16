package Controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import Service.HelloService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import Service.HelloService;
import org.springframework.web.servlet.mvc.SimpleFormController;

/**
 *
 * @author LabGSG-27
 */
public class HelloController extends SimpleFormController {
    private HelloService helloService;
    
    
    public HelloController() {
        setCommandClass(Name.class);
        setCommandName("name");
        setSuccessView("HelloView");
        setFormView("NameView");
    }
    
    
     protected ModelAndView onSubmit(HttpServletRequest request,HttpServletResponse response,Object command,BindException errors) throws Exception {
         Name name = (Name) command;
         ModelAndView mv = new ModelAndView(getSuccessView());
         mv.addObject("helloMessage",helloService.sayHello(name.getValue()));
         return mv;
     }
     public void setHelloService(HelloService a){
         helloService = a;
     }
}
