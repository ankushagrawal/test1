package com.quizzo.core.service.impl;

import com.quizzo.core.domain.ApiRequest;
import com.quizzo.core.repository.ApiRequestRepository;
import com.quizzo.core.service.api.ApiRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ApiRequestServiceImpl implements ApiRequestService {
    @Autowired
    private ApiRequestRepository apiRequestRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public ApiRequest saveApiRequest(ApiRequest apiRequest) {
        return apiRequestRepository.save(apiRequest);
    }
}
