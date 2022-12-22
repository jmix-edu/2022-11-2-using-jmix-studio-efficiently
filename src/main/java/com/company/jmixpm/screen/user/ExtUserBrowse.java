package com.company.jmixpm.screen.user;

import io.jmix.ui.screen.*;
import com.company.jmixpm.entity.User;

@UiController("ExtUser.browse")
@UiDescriptor("ext-user-browse.xml")
@LookupComponent("usersTable")
public class ExtUserBrowse extends StandardLookup<User> {
}