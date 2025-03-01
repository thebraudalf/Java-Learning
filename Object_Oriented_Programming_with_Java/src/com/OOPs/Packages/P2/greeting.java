package com.OOPs.Packages.P2;

/// static import in java is about simplifying access to static members and separates it
/// from broader discussion of user-defined packages
// importing method from other package via "import" keyword
import static com.OOPs.Packages.P1.greeting.message;

public class greeting {
    public static void main(String[]args){
        message("User");
    }
}
