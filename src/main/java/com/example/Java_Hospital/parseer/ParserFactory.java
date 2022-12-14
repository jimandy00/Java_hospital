package com.example.Java_Hospital.parseer;


import com.example.Java_Hospital.dao.Hospital;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


// Ioc와 Di하는 부분(수동)
@Configuration
public class ParserFactory {

    @Bean
    public ReadLineContext<Hospital> hospitalReadLineContext() {
        return new ReadLineContext<Hospital>(new HospitalParser());
    }
}