### MvcErrorExFlow
#### ExceptionHandiling i have covered multiple ways of error handiling example:: error handiling with the help of UI page error handiling,Attribute error handiling,Json error handiling
<pre>
&#8594;  i have implemented 1)DefaultErrorAttributes
&#8594;  2)Custom Error Pages Ex: error.html,400.html,500.html with @ResponseStatus(HttpStatus.NOT_IMPLEMENTED) custom Exception
&#8594;  3)CustomErrorController
&#8594;  4)CustomErrorAttributeController(Error Response as attributes)
&#8594;  5)CustomErrorJsonController (Error Response as JSON type)
&#8594;  6)Customize ErrorAttributes (extends	DefaultErrorAttributes)
&#8594;  Rest @ControllerAdvice and @ExceptionHandler(.class)
&#8594;  SuccessFull Work Flow of MVC & REST
</pre>
<pre>
###### Example: If any client Request  to any application it will reaches to Dispatchservelet then it will goes to dodispatch(Dodispatch servelet is for handling the incoming and outgoing Request&Response to determine the appropriate response) then it will goes to HandlerMapper(HM is responsible for mapping the request and response to appropriate handler methods or controller classes based specific creteria) then it will pass to controller after dispatchservelet,now dispacther servelet go to viewresolver to find the view model to show the UI Pages
</pre>
##### M1 
<pre>
&#8594; Request 
&#8594; DispatcherServelet 
&#8594; doDispatch(Req-Resp) 
&#8594; HM 
&#8594; Controller
&#8594; DS 
&#8594; viewResolver
&#8594; view 
&#8594; Model (read) 
&#8594; DS 
&#8594; UI 
</pre>
###### M2  
<pre>
&#8594;  Request 
&#8594;  DispatcherServlet 
&#8594;  doDispatch(req,resp) 
&#8594;  HM 
&#8594;  Controller
&#8594;  DS 
&#8594;  BasicErrorController (error()/errorHtml())
&#8594;  Response
</pre>
<pre>
Spring Boot handling Errors Internally is By using ErrorController(I) which has on impl class BasicErrorController(C) and that provides 2 methods
errorHtml():ModelAndView   (call made from browser) [When we make a call from browser it will return Exception in Html-ModelAndView]   errorHtml():ModelAndView 
error():ResponseEntity(T) (call from non-browser/client app/postman tool) [When we make a call from Client it will return error in NonBrowser] like  error():ResponseEntity(T)
 </pre>
 
