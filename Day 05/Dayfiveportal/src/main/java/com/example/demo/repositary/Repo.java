package com.example.demo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modal.Modal;

public interface Repo  extends JpaRepository<Modal, Integer>{

}
