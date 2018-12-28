/**
 * 
 */
package com.tanaponjit.cloud.repository;

import org.springframework.data.repository.CrudRepository;

import com.tanaponjit.cloud.model.User;

/**
 * @author tanap
 *
 */
public interface UserRepository extends CrudRepository<User, Long> {

    User findByEmail(String email);
}
