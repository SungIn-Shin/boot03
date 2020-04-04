package com.si.project.board.controller;

import com.si.project.board.domain.Board;
import com.si.project.board.persistence.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/demo")
public class BoardController {

    @Autowired
    private BoardRepository boardRepository;

    @GetMapping(path = "/add") // Map ONLY POST Requests
    public @ResponseBody
    Board addNewUser(@RequestParam String name
            , @RequestParam String email) {
        // @ResponseBody means the returned String is the response, not a view name


        return null;
    }
}
