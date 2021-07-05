package com.rktirthoh.onestore.dao;

import com.rktirthoh.onestore.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    @Modifying
    @Transactional
    @Query(value = "UPDATE user INNER JOIN token ON user.token_id = token.id SET user.active = 1 where token.token = ?1", nativeQuery = true)
    void activeUser( String token);




//    @Query("")
//    int updateTokenByToken(@Param("token") String token);
}
