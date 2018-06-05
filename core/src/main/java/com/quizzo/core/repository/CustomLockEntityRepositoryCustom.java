package com.quizzo.core.repository;




import com.quizzo.core.domain.CustomLockEntity;
import com.quizzo.core.domain.enums.CustomLockNameEnum;

import javax.persistence.LockModeType;
import java.util.List;

public interface CustomLockEntityRepositoryCustom {

    CustomLockEntity findByEntityNameAndEntityId(CustomLockNameEnum entityName, String entityId, LockModeType lockMode);

    List<CustomLockEntity> findByEntityNameAndEntityIdIn(CustomLockNameEnum entityName, List<String> entityId, LockModeType lockMode);

}
