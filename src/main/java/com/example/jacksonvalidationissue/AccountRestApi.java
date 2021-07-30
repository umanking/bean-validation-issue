package com.example.jacksonvalidationissue;

import com.example.jacksonvalidationissue.model.Account;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/account")
public class AccountRestApi {

    @PostMapping
    public ResponseEntity<?> createAccount(@RequestBody @Valid Account account) {
        return ResponseEntity.ok(account);
    }

}
