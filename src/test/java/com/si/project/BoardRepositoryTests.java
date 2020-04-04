package com.si.project;

import com.si.project.board.persistence.BoardRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BoardRepositoryTests {

    @Autowired
    private BoardRepository boardRepository;

    @Test
    public void insert200() {
//        for(int i = 1; i <= 200; i++) {
//            Board b = new Board();
//            b.setTitle("title_" + i);
//            b.setContent("content_" + i);
//            b.setWriter("Writer_" + i);
//
//            boardRepository.save(b);
//        }
    }
//
//    @Test
//    public  void testByTitle() {
//        boardRepository.findBoardByTitle("title_1")
//        .forEach(board -> System.out.println(board));
//    }
//
//    @Test
//    public void testByWriter() {
//        Collection<Board> result = boardRepository.findByWriter("Writer_2");
//
//        result.forEach(
//                board -> System.out.println(board)
//        );
//    }
//
//    // like '%키워드%'
//    @Test
//    public void testByWriterContaining() {
//        Collection<Board> result = boardRepository.findByWriterContaining("05");
//        result.forEach(
//                board -> System.out.println(board)
//        );
//    }
//
//    // Page 처리
//    @Test
//    public void testBnoPagingSort() {
//        Pageable paging = PageRequest.of(0, 10, Sort.Direction.DESC, "updatedate");
//
//        Page<Board> result = boardRepository.findByBnoGreaterThan(1L, paging);
//
//        System.out.println("PAGE SIZE : " + result.getSize());
//        System.out.println("TOTAL PAGES : " + result.getTotalPages());
//        System.out.println("TOTAL COUNT : " + result.getTotalElements());
//        System.out.println("NEXT : " + result.nextPageable());
//
//        List<Board> list = result.getContent();
//
//        list.forEach(board -> System.out.println(board));
//    }

}
