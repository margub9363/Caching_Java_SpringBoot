package com.greenlearner.LibraryApplication.dao;

import com.greenlearner.LibraryApplication.Entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository <Book,Integer> {
    public Book findById(int id);
}
