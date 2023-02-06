package com.global.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.global.beans.CustomerBean;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerBean, Integer>{
	Optional<CustomerBean> findByAccountNumber(Long accountNumber);
    Optional<CustomerBean> deleteByAccountNumber(Long accountNumber);
}
