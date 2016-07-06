//
// User.java
// WorldWiki
//
// Created by Matthew Remmel on 7/5/16.
// Copyright (c) 2016 Matthew Remmel. All rights reserved.

package com.worldwiki.model.user;

import com.worldwiki.model.world.World;
import org.springframework.data.annotation.Id;
import java.util.ArrayList;


public class User {

    @Id
    protected String userID;
    protected String userName;
    protected ArrayList<World> worlds;
}