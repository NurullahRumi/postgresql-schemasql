package com.example.testpostgresql.repository;

import com.example.testpostgresql.entiry.MyFriend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendRepository extends JpaRepository<MyFriend, Long> {
}
