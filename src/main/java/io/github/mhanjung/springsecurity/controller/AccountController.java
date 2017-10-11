package io.github.mhanjung.springsecurity.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @RequestMapping("svc/v1/public/accounts/{accountNumber}")
    public String getPublicDataLinkedTo(@PathVariable final int accountNumber){
        return "Public Account Linked to "+accountNumber;
    }

    @RequestMapping("svc/v1/private/accounts/{accountNumber}")
    public String getPrivateDataLinkedTo(@PathVariable final int accountNumber){
        return "Private Account Linked to "+accountNumber;
    }

    @RequestMapping("svc/v1/private/admin/accounts/{accountNumber}")
    public String getExtraPrivateDataLinkedTo(@PathVariable final int accountNumber){
        return "Private Extra Account Linked to "+accountNumber;
    }

}
