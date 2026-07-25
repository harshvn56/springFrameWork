package org.springCore;

import java.util.List;

public class UserDetails {

//    String username;

    List<String>  usernames;

    public UserDetails(List<String> usernames) {
       this.usernames = usernames;
    }

    public List<String> getUserDetails()
    {
      return usernames;
    }
    public void init()
    {
        System.out.println("Post construct phase");
    }
    public void cleanup()
    {
        System.out.println("Pre destory phase");
    }

}
