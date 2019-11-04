package com.example.videofitnessjournal.data;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;

import com.example.videofitnessjournal.data.model.JournalProvider;
import com.example.videofitnessjournal.data.model.LoggedInUser;

import java.io.IOException;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {

    private Cursor myCursor;

    public Result<LoggedInUser> login(String username, String password, Context context) {

        try {

            // TODO: handle loggedInUser authentication
            // Query the JournalDB and load all data for user into a new LoggedInUser
            // If user does not exist, we will create one
            LoggedInUser fakeUser =
                    new LoggedInUser(
                            java.util.UUID.randomUUID().toString(),
                            "Jane Doe");
            return new Result.Success<>(fakeUser);
        } catch (Exception e) {
            return new Result.Error(new IOException("Error logging in", e));
        }
    }

    public void logout() {
        // TODO: revoke authentication
    }
}
