package system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.dao.UserDAO;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;
    public List getALLUsers(){
        return userDAO.getAllUsers();
    }
}
