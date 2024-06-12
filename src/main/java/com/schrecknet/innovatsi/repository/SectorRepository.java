package com.schrecknet.innovatsi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.schrecknet.innovatsi.domain.Sector;

@Repository
public interface SectorRepository extends MongoRepository<Sector, String> {

}
