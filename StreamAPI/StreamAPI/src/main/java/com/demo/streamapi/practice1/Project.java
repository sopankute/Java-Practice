package com.demo.streamapi.practice1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Project {

    private String projectCode;
    private String name;
    private String client;
    private String busLeadName;
}
