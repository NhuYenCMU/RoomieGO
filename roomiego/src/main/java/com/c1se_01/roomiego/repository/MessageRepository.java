package com.c1se_01.roomiego.repository;

import com.c1se_01.roomiego.model.Conversation;
import com.c1se_01.roomiego.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
    List<Message> findByConversationOrderBySentAt(Conversation conversation);
}
