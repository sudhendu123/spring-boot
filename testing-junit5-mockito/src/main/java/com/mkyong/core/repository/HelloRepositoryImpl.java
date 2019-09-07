package com.mkyong.core.repository;

import org.springframework.stereotype.Repository;

@Repository
public class HelloRepositoryImpl implements HelloRepository {
    
	@Override
    public String getString(int a,int b) {
    	
        return "Repo"+a+b;
    }
}
