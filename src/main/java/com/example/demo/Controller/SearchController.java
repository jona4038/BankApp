package com.example.demo.Controller;

import com.example.demo.Model.AjaxResponseBody;
import com.example.demo.Model.GoldenCow;
import com.example.demo.Model.SearchCriteria;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class SearchController {

    @Autowired
    private UserService userService;

    @PostMapping("/api/search")
    public ResponseEntity<?> getSearchResult(@Valid @RequestBody SearchCriteria s, Errors errors){
        System.out.println("getSearch kaldt");
        AjaxResponseBody ajaxResponseBody = new AjaxResponseBody();

        if(errors.hasErrors()){
            ajaxResponseBody.setMessage(errors.getAllErrors().get(0).getDefaultMessage());
            return ResponseEntity.badRequest().body(ajaxResponseBody);
        }

        List<GoldenCow> searchResult = userService.findCows(s.getUsername());
        if(searchResult.size() == 0){
            ajaxResponseBody.setMessage("User not found");
        } else {
            ajaxResponseBody.setMessage("User's found");
            ajaxResponseBody.setResult(searchResult);
        }

//        GoldenCow cow = userService.findCow(s.getUsername());
//        if(cow == null){
//            ajaxResponseBody.setMessage("User not found");
//        }else{
//            ajaxResponseBody.setMessage("User found");
//            ajaxResponseBody.setCow(cow);
//        }
//        if(s.getUsername().length() == 0){
//            ajaxResponseBody.setMessage("Enter at least one char");
//            return ResponseEntity.badRequest().body(ajaxResponseBody);
//        }
        return ResponseEntity.ok(ajaxResponseBody);
    }
}
