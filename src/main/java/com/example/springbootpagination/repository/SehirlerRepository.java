package com.example.springbootpagination.repository;

import com.example.springbootpagination.model.Sehirler;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SehirlerRepository extends PagingAndSortingRepository<Sehirler, Long> {

}
