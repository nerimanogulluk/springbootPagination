package com.example.springbootpagination.controller;

import com.example.springbootpagination.service.ISehirlerService;
import com.example.springbootpagination.model.Sehirler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SehirlerController {
    @Autowired
    private ISehirlerService iSehirlerService;

    @GetMapping("/sehir/{no}/{size}")
    public List<Sehirler> getSehirler(@PathVariable int no,
                                      @PathVariable int size) {

        return iSehirlerService.getSehirlerList(no, size);
    }
}
