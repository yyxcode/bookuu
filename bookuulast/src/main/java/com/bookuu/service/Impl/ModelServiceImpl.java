package com.bookuu.service.Impl;

import com.bookuu.entity.Model;
import com.bookuu.mapper.ModelMapper;
import com.bookuu.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ModelServiceImpl implements ModelService {
    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<Model> models() {
        return modelMapper.models();
    }
}
