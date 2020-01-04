package com.bookuu.service.Impl;

import com.bookuu.entity.Type;
import com.bookuu.mapper.TypeMapper;
import com.bookuu.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    TypeMapper type;
    @Override
    public List<Type> types() {
        return type.types();
    }
}
