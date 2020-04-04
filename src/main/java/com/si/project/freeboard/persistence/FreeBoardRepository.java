package com.si.project.freeboard.persistence;

import com.si.project.freeboard.domain.FreeBoard;
import org.springframework.data.repository.CrudRepository;

public interface FreeBoardRepository extends CrudRepository<FreeBoard, Long> {
}
