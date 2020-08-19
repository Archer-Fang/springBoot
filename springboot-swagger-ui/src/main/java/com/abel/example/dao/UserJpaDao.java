package com.abel.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abel.example.bean.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * The Interface UserJpaDao.
 *
 * @author abel
 */
public interface UserJpaDao extends JpaRepository<User, Integer> {

    /**
     * Find by name.
     *
     * @param username the name
     * @return the user
     */
//    User findByName(String name);

//    User getOne(Long id);

    List<User> findByUsernameContaining(String username);

    User getByUsernameIs(String username);

    @Query("select s from User s where s.username like CONCAT('%',:username,'%')")
    List<User> findByNameLike(@Param("username") String username);
}