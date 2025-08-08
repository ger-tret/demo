package com.user_service.service.mapper;

public interface Mapper <F, T> {
    T map(F from);
}