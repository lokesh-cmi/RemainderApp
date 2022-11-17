package com.remainder.CheckRemainder.controller;

import com.remainder.CheckRemainder.service.RemainderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RemainderController {

    @Autowired
    RemainderService remainderService;

    @GetMapping("/remainderCheck")
    public void remainderCheck() {
        remainderService.pushRemainder();
    }
}
