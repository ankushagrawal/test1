package com.quizzo.core.repository;

import com.quizzo.core.datatypes.exception.ServiceException;
import com.quizzo.core.domain.ApiRequest;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ApiRequestRepository extends CrudRepository<ApiRequest, Long> {
    List<ApiRequest> findByRequestIdAndRequestName(String requestId, String requestName) throws ServiceException;
}
