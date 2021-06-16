package com.exapmle.twit.repos;

import com.exapmle.twit.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message, Long> {

}