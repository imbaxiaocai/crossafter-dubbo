package com.user.dao;

import com.user.bean.User;
import java.util.List;

public interface UserDao {
    List<User> getUserInform(String userId);
}
