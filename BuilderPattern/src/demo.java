public class demo {
    public static void main(String[] args)
{
User user1 = new User.UserBuilder("Lokesh", "Gupta")
.Age(30)
.Phone("1234567")
.Address("Fake address 1234")
.build();
}
}
