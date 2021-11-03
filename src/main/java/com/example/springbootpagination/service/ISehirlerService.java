package com.example.springbootpagination.service;

import com.example.springbootpagination.model.Sehirler;

import java.util.List;

//Verileri getirecek servis katmanımızın arayüz interface kısmını oluşturalım. Bu interface’de
//veritabanımıza ulaşacak olan metot tanımlamalarımızı yapıyoruz.
public interface ISehirlerService {
    List<Sehirler> getSehirlerList(int no, int size);

    //no değeri sayfa sayısı,
    //size ise o sayfada bulunan kayıt sayısını ifade etmektedir.
}
