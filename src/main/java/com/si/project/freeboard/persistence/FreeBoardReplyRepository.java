package com.si.project.freeboard.persistence;

import com.si.project.freeboard.domain.FreeBoardReply;
import org.springframework.data.repository.CrudRepository;

public interface FreeBoardReplyRepository extends CrudRepository<FreeBoardReply, Long> {
}
