package com.testTask.repository;

import com.testTask.model.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository <EmailModel, Long> {
}
