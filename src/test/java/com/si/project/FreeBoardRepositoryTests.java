package com.si.project;

import com.si.project.freeboard.domain.FreeBoard;
import com.si.project.freeboard.domain.FreeBoardReply;
import com.si.project.freeboard.persistence.FreeBoardReplyRepository;
import com.si.project.freeboard.persistence.FreeBoardRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

@SpringBootTest
public class FreeBoardRepositoryTests {

    @Autowired
    private FreeBoardRepository freeBoardRepository;

    @Autowired
    private FreeBoardReplyRepository freeBoardReplyRepository;


    @Test
    public void insert200() {
        IntStream.range(1, 201).forEach(i -> {
            FreeBoard fb = new FreeBoard();
            fb.setTitle("Title_"+ i);
            fb.setContent("Content_" + i);
            fb.setWriter("Writer_" + i);

            freeBoardRepository.save(fb);
        });
    }

    @Test
    public void insertReply2Way() {
        Optional<FreeBoard> op = freeBoardRepository.findById(200L);

        op.ifPresent(board -> {
            List<FreeBoardReply> replies = board.getFreeBoardReplies();

            FreeBoardReply fbr = new FreeBoardReply();
            fbr.setReply("REply 1");
            fbr.setReplier("replier 00");
            fbr.setFreeBoard(board);

            freeBoardReplyRepository.save(fbr);
        });
    }
}
