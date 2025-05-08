package com.leo.service;

import com.leo.domain.VerificationType;
import com.leo.modal.User;

public interface UserService {

    public User findUserProfileByJwt(String jwt) throws Exception;
    public User findUserByEmail(String email) throws Exception;
    public User findUserById(Long userId) throws Exception;

    public User enableTwoFactorAuthentication(VerificationType verificationType, String sentTo, User user);

    User updatePassword(User user, String newPassword);


}
