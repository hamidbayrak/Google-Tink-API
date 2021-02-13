package com.works.usetink.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.works.usetink.entities.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {

	@Query("select u from UserInfo u where u.uid = ?1 and u.key128Bit = ?2 and u.associatedData = ?3")
	UserInfo decryptInfo( int uid, String key128Bit, String associatedData );
	
}
