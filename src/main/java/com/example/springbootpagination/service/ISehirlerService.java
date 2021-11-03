package com.example.springbootpagination.service;

import com.example.springbootpagination.model.Sehirler;

import java.util.List;

public interface ISehirlerService {
    List<Sehirler> getSehirlerList(int no, int size);
}
