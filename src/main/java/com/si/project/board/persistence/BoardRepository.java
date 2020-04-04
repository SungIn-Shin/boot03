package com.si.project.board.persistence;

import com.si.project.board.domain.Board;
import org.springframework.data.repository.CrudRepository;

public interface BoardRepository extends CrudRepository<Board, Long> {
//    public List<Board>  findBoardByTitle(String title);
//
//    public Collection<Board> findByWriter(String writer);
//
//    public Collection<Board> findByWriterContaining(String writer);
//
//    // and 혹은 or 조건절 처리
//    public Collection<Board> findByTitleContainingOrContentContaining(String title, String content);
//
//
//    public Page<Board> findByBnoGreaterThan(Long bno, Pageable paging);
}
