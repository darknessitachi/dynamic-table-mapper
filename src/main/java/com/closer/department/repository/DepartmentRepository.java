package com.closer.department.repository;

import com.closer.common.repository.BaseTenantRepository;
import com.closer.department.domain.Department;
import org.springframework.stereotype.Repository;

/**
 * Created by closer on 2016/1/20.
 */
@Repository
public interface DepartmentRepository extends BaseTenantRepository<Department, Long> {
}
