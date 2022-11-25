package com.codefarm.farmer.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "TBL_PROGRAM_FILE")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class ProgramFile extends Period{
    @Id
    @GeneratedValue
    private Long fileId;
    @Column(nullable = false)
    private String fileRealname;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PROGRAM_ID")
    private Program program;
}
