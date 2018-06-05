package com.quizzo.core.repository;


import com.quizzo.core.domain.CustomLockEntity;
import com.quizzo.core.domain.enums.CustomLockNameEnum;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomLockEntityRepository extends CrudRepository<CustomLockEntity,Long>, CustomLockEntityRepositoryCustom {

    CustomLockEntity findByEntityNameAndEntityId(CustomLockNameEnum entityName, String entityId);

    List<CustomLockEntity> findByEntityNameAndEntityIdIn(CustomLockNameEnum entityName, List<String> entityIds);
}
