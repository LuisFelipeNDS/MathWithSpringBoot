package com.Math.Controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {
    
    @RequestMapping(value="/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double sum(@PathVariable("numberOne") String numberOne, 
                      @PathVariable("numberTwo") String numberTwo) throws Exception {
    	
    	if(!isNumeric(numberOne) || !isNumeric(numberTwo)) { 
    		
    		throw new Exception();
    	
    	}
    	
        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }

	private Double convertToDouble(String strNumber) {
		
		return null;
	}

	private boolean isNumeric(String numberOne) {

		return false;
	}
}