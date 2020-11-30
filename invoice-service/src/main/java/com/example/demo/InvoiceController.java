package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.InvoiceService;
import com.example.demo.model.Invoice;

@RestController
@CrossOrigin(origins = "*")
public class InvoiceController {

	@Autowired
	private static InvoiceService service;

	
	
	@GetMapping(path="/api/v1/invoices")
	@ResponseStatus(code = HttpStatus.OK)
	public Map<Integer,Invoice> getInvoice() {
		
		return service.findAll();
		
         
	}

	@PostMapping("/api/v1/invoices")
		public Invoice addInvoice(@RequestBody Invoice inv) {
		
		Invoice invAdded =service.add(inv);
        return invAdded;		
         
	}
	
	
	@GetMapping("/api/v1/invoices/{id}")
	public Invoice getInvoiceById(@PathVariable("id") int key)  {
		
				
		Invoice inv = service.findById(key);
		
		return inv;
		
	}
	
	
	
	
}
