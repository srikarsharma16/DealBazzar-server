package deal.bazaar.dealsbazzar.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import deal.bazaar.dealsbazzar.models.User;

@Repository
public interface UserRepo extends MongoRepository<User, String> {
 //   public User findByEmail(String email);

}
