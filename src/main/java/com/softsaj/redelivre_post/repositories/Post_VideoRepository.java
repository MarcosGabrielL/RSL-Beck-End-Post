/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softsaj.redelivre_post.repositories;

import com.softsaj.redelivre_post.models.Post_Video;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Marcos
 */
@Repository
public interface Post_VideoRepository extends JpaRepository<Post_Video, Long> {
    
     Optional<Post_Video> findPost_VideoById(Long id);
     
      @Query("SELECT u FROM Post_Video u WHERE u.idperson = ?1")
      List<Post_Video> findAllByIdPerson(String idperson);
     
     void deletePost_VideoById(Long id);
}
