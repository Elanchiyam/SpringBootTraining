package com.global.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.global.beans.TransactionBean;

@Repository
public interface TransactionRepository extends CrudRepository<TransactionBean, Integer> {

}
