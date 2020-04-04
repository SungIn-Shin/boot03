package com.si.project;

import com.si.project.board.domain.Board;
import com.si.project.board.domain.Comment;
import com.si.project.board.persistence.BoardRepository;
import com.si.project.board.persistence.CommentRepository;
import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Optional;

@Log
@Commit
@SpringBootTest
public class CommentRepositoryTests {

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private CommentRepository commentRepository;

//    @Test
//    public void testInsertBoard () {
////        IntStream.range(1, 101).forEach(i -> {
////            Board b = new Board();
////            b.setTitle("Title_" + i);
////            b.setContent("Content_" + i);
////            b.setWriter("Writer_" + i);
////
////            boardRepository.save(b);
////        });
//    }

    @Test
    public void testInsertComments() {
//        Board b = new Board();
//        b.setBid(1L);
//
//        for(int i = 0; i < 5; i++) {
//            Comment c = new Comment();
//            c.setContent("TestContent : " + i);
//            commentRepository.save(c);
//        }
        Board b = new Board();
        b.setTitle("Title");
        b.setContent("Content");
        b.setWriter("Writer");

        Comment c = new Comment();
        c.setContent("COmment1");

        Comment c2 = new Comment();
        c2.setContent("COmment2");

        b.setComments(Arrays.asList(c, c2));

        boardRepository.save(b);
    }
    @Transactional
    @Test
    public  void testUpdateComment() {
        Optional<Board> result = boardRepository.findById(1L);

        result.ifPresent(o -> {
            log.info("Data 가 존재함.");

            Comment target = new Comment();

            target.setContent("Modify Content");

        });
    }
}
