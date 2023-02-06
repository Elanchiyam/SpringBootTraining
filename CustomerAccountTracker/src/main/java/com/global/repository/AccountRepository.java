package com.global.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.global.beans.AccountBean;

@Repository
public interface AccountRepository extends CrudRepository<AccountBean, Integer> {
	Optional<AccountBean> findByAccountNumber(Long accountNumber );
}
