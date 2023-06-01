# MvcErrorExFlow
#### ExceptionHandiling i have covered multiple ways of error handiling example:: error handiling with the help of UI page error handiling,Attribute error handiling,Json error handiling
###### i have implemented 1)DefaultErrorAttributes
###### 2)Custom Error Pages Ex: error.html,400.html,500.html with @ResponseStatus(HttpStatus.NOT_IMPLEMENTED) custom Exception
###### 3)CustomErrorController
###### 4)CustomErrorAttributeController(Error Response as attributes)
###### 5)CustomErrorJsonController (Error Response as JSON type)
###### 6)Customize ErrorAttributes (extends	DefaultErrorAttributes)
###### Rest @ControllerAdvice and @ExceptionHandler(.class)
##### SuccessFull Work Flow of MVC & REST
###### Example: If any client Request  to any application it will reaches to Dispatchservelet then it will goes to dodispatch(Dodispatch servelet is for handling the incoming and outgoing Request&Response to determine the appropriate response) then it will goes to HandlerMapper(HM is responsible for mapping the request and response to appropriate handler methods or controller classes based specific creteria)

