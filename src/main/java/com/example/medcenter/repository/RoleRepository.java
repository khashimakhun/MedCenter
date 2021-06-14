package com.example.medcenter.repository;

import com.example.medcenter.entity.RoleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<RoleEntity , Integer> {
    RoleEntity getRoleEntityByRole(String roleName);
    RoleEntity getRoleEntityById(int id);



//    List<RoleEntity> findRoleEntitiesBy
}

