/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package repository;

import java.util.List;
import model.Student;

/**
 *
 * @author user
 */
public interface  CrudRepo<T,K> {
    
        public  int  create(T t);
        public  int remove(T t);
        public  T findById(K id) ;
        public  List<T> findAll();
 

}