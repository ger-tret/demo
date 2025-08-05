package com.userCRUDservice.service.mapper;

public interface Mapper <F, T> {
    T map(F from);
}