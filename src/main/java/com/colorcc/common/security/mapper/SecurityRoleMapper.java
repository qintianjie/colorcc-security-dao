package com.colorcc.common.security.mapper;

import java.util.List;

import com.colorcc.common.security.model.SecurityRole;

public interface SecurityRoleMapper {

	public SecurityRole selectOne(int id);

	public SecurityRole getRoleByName(String roleName);

	public List<SecurityRole> getRolesForUser(int userId);

}
