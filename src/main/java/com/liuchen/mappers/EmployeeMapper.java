package com.liuchen.mappers;

import com.liuchen.models.Employee;

/**
 * ClassName:
 * Package: com.liuchen.mappers
 * Description:
 *
 * @Author: Liu-Chen-CS
 * @Create: 3/4/2024 - 4:17 PM
 * @Version: v1.0
 */
public interface EmployeeMapper {

    Employee queryById(Integer id);

}
