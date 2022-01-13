package deal.bazaar.dealsbazzar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import deal.bazaar.dealsbazzar.models.User;
import deal.bazaar.dealsbazzar.repositories.UserRepo;


@Service
public class UserService 
{
	@Autowired
	private UserRepo userRepository;
	
	public User get(String id)
    {
        try{
            return userRepository.findById(id).get();
        }catch(Exception e)
        {
            return null;
        }
    }

    public List<User> loadUsers()
    {
        try{
            List<User> u= userRepository.findAll();
            return u;
        }catch(Exception e)
        {
            return null;
        }
    }
}