package entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-08-24T15:10:45")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> accountId;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, Integer> balance;
    public static volatile SingularAttribute<User, String> accountPin;
    public static volatile SingularAttribute<User, String> name;
    public static volatile SingularAttribute<User, Integer> id;

}