package com.patterns.NullObject.goodCode;

import com.patterns.NullObject.goodCode.service.UserService;

/**
 * Created by Sahatov Batyr on 22.03.2019.
 */
public class Runner {

    public static void main( String[] args ) {
        UserService userService = new UserService();
        System.out.println( userService.getOneById(2L) );
        System.out.println( userService.getOneById(4L) );

    }
}
