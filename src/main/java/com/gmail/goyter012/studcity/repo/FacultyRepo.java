package com.gmail.goyter012.studcity.repo;

import com.gmail.goyter012.studcity.model.Faculty;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FacultyRepo extends CrudRepository<Faculty, Long> {
        List<Faculty> findAllByName(String facName);
}
