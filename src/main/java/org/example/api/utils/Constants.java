package org.example.api.utils;

public class Constants {

    private Constants() {
        throw new IllegalStateException("Constants class should not be instantiated");
    }

    public static final String UNAUTHORIZED = "{\"error\":\"Unauthorized\"}";
    public static final String USERNAME_PASSWORD_REQUIRED = "{\"error\":\"Username and password are required\"}";
    public static final String USER_ALREADY = "{\"error\":\"User with this username or email already exists\"}";
    public static final String USER_NOT_FOUND = "{\"error\":\"User not found.\"}";
    public static final String ADD_USER_ID = "addUser";
    public static final String ADD_USER_SCOPE = "add-user";
    public static final String BEARER = "Bearer";
    public static final String GET_USERS_ID = "getUsers";
    public static final String GET_USERS_SCOPE = "get-users";
}
