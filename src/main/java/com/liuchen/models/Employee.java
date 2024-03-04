package com.liuchen.models;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * ClassName:
 * Package: com.liuchen.models
 * Description:
 *
 * @Author: Liu-Chen-CS
 * @Create: 3/4/2024 - 4:13 PM
 * @Version: v1.0
 */

@Data
@AllArgsConstructor
public class Employee {

    private Integer empId;
    private String empName;
    private Double empSalary;

}
