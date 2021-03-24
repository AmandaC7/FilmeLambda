package com.example.aws.lambda.persistence;

import com.example.aws.lambda.domain.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
}
