package com.cydeo.service;

import com.cydeo.dto.RoleDTO;
import com.cydeo.dto.UserDTO;

import java.util.List;

public interface RoleService extends CrudService<RoleDTO,Long>{

   //RoleDTO myLogic (UserDTO,String) ; we can create unic behavior here for only role service
    //but CrudService cover all in Spring there is at least 50 methods
}
