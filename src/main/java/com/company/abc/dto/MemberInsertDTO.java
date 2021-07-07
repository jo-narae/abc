package com.company.abc.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class MemberInsertDTO {

    private String name;

    private String phoneNumber;

    private String job;

    private int career;

    private Long teamId;
}
