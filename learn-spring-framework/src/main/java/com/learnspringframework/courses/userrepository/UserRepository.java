package com.learnspringframework.courses.userrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnspringframework.courses.bean.Course;

//This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
//CRUD refers Create, Read, Update, Delete

public interface UserRepository extends JpaRepository<Course, Long> {

}
