package com.leka.teashop.service;


import com.leka.teashop.model.User;

public interface EmailService {

    void sendVerificationEmail(User user, String confirmationUrl, String locale);
}
