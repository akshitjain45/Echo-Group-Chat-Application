package com.echo.utils;

import com.echo.entity.UserEntity;
import com.echo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 * Class used to fill the database on startup if no data detected
 */
@Service
public class DbInit implements CommandLineRunner {

    static Logger log = LoggerFactory.getLogger(DbInit.class);

    private final UserService userService;

    private final PasswordEncoder passwordEncoder;

    public DbInit(UserService userService, PasswordEncoder passwordEncoder) {
        this.userService = userService;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) {
        log.info("Initiated DB");
    }
}
