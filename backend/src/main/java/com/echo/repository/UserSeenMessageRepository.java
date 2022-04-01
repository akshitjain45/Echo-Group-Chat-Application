package com.echo.repository;

import com.echo.entity.MessageUserEntity;
import com.echo.entity.MessageUserKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSeenMessageRepository extends JpaRepository<MessageUserEntity, MessageUserKey> {

    MessageUserEntity findAllByMessageIdAndUserId(int messageId, int userId);

}
