package com.quizzo.core.service.api;



import com.quizzo.core.domain.CustomLockEntity;
import com.quizzo.core.domain.enums.CustomLockNameEnum;

import java.util.List;

public interface CustomLockEntityService {

    CustomLockEntity createLockEntry(CustomLockNameEnum entityName, String entityId) throws Exception;

    List<CustomLockEntity> createLockEntry(CustomLockNameEnum entityName, List<String> entityId) throws Exception;

    void acquireLock(CustomLockNameEnum entityName, String entityId) throws Exception;

    void acquireLocks(CustomLockNameEnum entityName, List<String> entityId) throws Exception;
}
