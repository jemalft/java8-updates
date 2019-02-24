package Optional;

public class PersonRepository {

    public String findNameById(String id) {
        return id == null ? null : "userName";
    }

}