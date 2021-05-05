package com.docsconsole.tutorials.controller;

import com.docsconsole.tutorials.exception.ProductNotFoundException;
import com.docsconsole.tutorials.model.Company;
import com.docsconsole.tutorials.model.request.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping(path = "/api/order")
public class ProductController {

    @GetMapping(path = "/product")
    public ResponseEntity<Product> getEmployee(@Valid @RequestBody Product product) throws Exception {
        if(product.getId() != 1001) {
            throw new ProductNotFoundException(product.getId());
        }
        return new ResponseEntity(product, HttpStatus.OK);
    }
}
