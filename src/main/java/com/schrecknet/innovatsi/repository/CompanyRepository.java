package com.schrecknet.innovatsi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.schrecknet.innovatsi.domain.Company;

@Repository
public interface CompanyRepository extends MongoRepository<Company, String> {

}
