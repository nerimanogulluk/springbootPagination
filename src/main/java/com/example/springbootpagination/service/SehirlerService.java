package com.example.springbootpagination.service;

import com.example.springbootpagination.model.Sehirler;
import com.example.springbootpagination.repository.SehirlerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SehirlerService implements ISehirlerService {
    @Autowired
    private SehirlerRepository sehirlerRepository;

    @Override
    public List<Sehirler> getSehirlerList(int no, int size) {
        Pageable pageable = PageRequest.of(no, size);
        Page<Sehirler> sehirlerPage = sehirlerRepository.findAll(pageable);

        return sehirlerPage.toList();
    }
}
