package com.colorcc.common.security.mapper;

import com.colorcc.common.security.model.SecurityUser;

public interface SecurityUserMapper {

	public SecurityUser findUserByEmail(String email);
}
