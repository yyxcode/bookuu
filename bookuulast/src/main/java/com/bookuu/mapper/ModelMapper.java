package com.bookuu.mapper;

import com.bookuu.entity.Model;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface ModelMapper {
    List<Model> models();
}
