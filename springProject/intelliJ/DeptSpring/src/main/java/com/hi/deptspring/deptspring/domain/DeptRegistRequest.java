package com.hi.deptspring.deptspring.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DeptRegistRequest {

    private String dname;
    private String loc;
}
