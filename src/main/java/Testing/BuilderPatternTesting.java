package Testing;

import BuilderPattern.User;
import Testing.Test.Test;

public class BuilderPatternTesting implements Test {
    @Override
    public void test() {
        System.out.println("\nBuilder Pattern Calling : ");
        User user = new User.Builder("7898337488").userAge(27).userAddress("Barwani").userName("Shivam").build();
        System.out.println(user.toString());
    }
}

/*

        It is used when we want to use customized constructor
        For Example
        If class contains lots of fields like (userName, userAge, userMobileNo, userAddress)
        and few of the fields are optional So we need to provide flexibility to the Client to create
        the object according to their choice of fields

*/

