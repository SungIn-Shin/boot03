package com.si.project.freeboard.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@ToString(exclude = "freeBoard")
@Entity
@EqualsAndHashCode(of = "bno")
public class FreeBoardReply {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rno;

    private String reply;

    private String replier;

    private Timestamp regdate;

    private Timestamp modifydate;

    @ManyToOne
    private FreeBoard freeBoard;
}
